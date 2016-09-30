package controllers;

import spitter.Spittle;
import data.SpittleRepository;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class SplittleControllerTest {

    @Test
    public void shouldShowRecentSpittles () throws Exception {

        List<Spittle> exSpittleList = createSpittleList(20);
        SpittleRepository mockRepository = mock(SpittleRepository.class);
        when(mockRepository.findSpittles(Long.MAX_VALUE, 20)).thenReturn(exSpittleList);

        SpittleController spittleController = new SpittleController(mockRepository);

        MockMvc mockMvc = standaloneSetup(spittleController).setSingleView(
                new InternalResourceView("/WEB-INF/views/spittles.jsp")).build();
        mockMvc.perform(get("/spittles"))
                .andExpect(view().name("spittles"))
                .andExpect(model().attributeExists("spittleList"))
                .andExpect(model().attribute("spittleList", hasItems(exSpittleList.toArray())));
    }


    @Test
    public void pagedSpittersTest () throws Exception {
        List<Spittle> exSpittles = createSpittleList(50);
        SpittleRepository mockRepository = mock(SpittleRepository.class);
        when(mockRepository.findSpittles(238900L, 50)).thenReturn(exSpittles);

        SpittleController spittleController = new SpittleController(mockRepository);

        MockMvc mockMvc = standaloneSetup(spittleController).setSingleView(
                new InternalResourceView("/WEB-INF/views/spittles.jsp")).build();

        mockMvc.perform(get("/spittles?max=238900&count=50"))
                .andExpect(view().name("spittles"))
                .andExpect(model().attributeExists("spittleList"))
                .andExpect(model().attribute("spittleList", hasItems(exSpittles.toArray())));

    }


    private List<Spittle> createSpittleList (int elements) {
        List<Spittle> spittles = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            spittles.add(new Spittle("Spittle" + i, new Date()));
        }

        return spittles;
    }

    @Test
    public void spittleTest () throws Exception {
        // Given
        Spittle expectedSpittle = new Spittle("testSpittle", new Date());
        SpittleRepository spittleRepository = mock(SpittleRepository.class);
        when(spittleRepository.findOne(12345L)).thenReturn(expectedSpittle);
        SpittleController spittleController = new SpittleController(spittleRepository);
        MockMvc mockMvc = standaloneSetup(spittleController).build();

        // When - Then
        mockMvc.perform(get("/spittles/12345"))
                .andExpect(view().name("spittle"))
                .andExpect(model().attributeExists("spittle"))
                .andExpect(model().attribute("spittle", expectedSpittle));


    }

}

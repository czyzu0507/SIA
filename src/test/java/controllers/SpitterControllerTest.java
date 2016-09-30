package controllers;

import data.SpitterRepository;
import org.springframework.test.web.servlet.MockMvc;
import org.testng.annotations.Test;
import spitter.Spitter;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class SpitterControllerTest {


    @Test
    public void showRegistrationFormTest () throws Exception {
        // Given
        SpitterRepository spitterRepository = mock(SpitterRepository.class);
        SpitterController spitterController = new SpitterController(spitterRepository);
        MockMvc mockMvc = standaloneSetup(spitterController).build();

        // When - Then
        mockMvc.perform(get("/spitter/register")).andExpect(view().name("registerForm"));
    }

//    @Test
//    public void shouldPrecessRegistrationTest () throws Exception {
//        // Given
//        SpitterRepository spitterRepository = mock(SpitterRepository.class);
//        SpitterController spitterController = new SpitterController(spitterRepository);
//        MockMvc mockMvc = standaloneSetup(spitterController).build();
//        Spitter unsaved = new Spitter("jbauer", "24Hours", "jack", "bauer");
//        Spitter saved = new Spitter(21L, "jbauer", "24Hours", "jack", "bauer");
//
//        when(spitterRepository.save(unsaved)).thenReturn(saved);
//
//        //  When - Then
//        mockMvc.perform(post("/spitter/register").param("firstName", "jack")
//                .param("lastName", "bauer")
//                .param("userName", "jbauer")
//                .param("password", "24Hours")).andExpect(redirectedUrl("/spitter/jbauer"));
//        verify(spitterRepository, atLeastOnce()).save(unsaved);
//    }
}
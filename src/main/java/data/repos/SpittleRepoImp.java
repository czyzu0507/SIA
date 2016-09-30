package data.repos;

import spitter.Spittle;
import data.SpittleRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class SpittleRepoImp implements SpittleRepository {

    private List<Spittle> spittleList;

    @PostConstruct
    private void init () {
        spittleList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            spittleList.add(new Spittle("spittle" + i, new Date()));
        }
    }

    @Override
    public List<Spittle> findSpittles (Long max, int count) {
        return spittleList;
    }

    @Override
    public Spittle findOne (Long i) {
        Spittle spittle = new Spittle("first Spittle", new Date());
        spittle.setId(i);
        return spittle;
    }
}

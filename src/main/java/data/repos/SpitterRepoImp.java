package data.repos;

import data.SpitterRepository;
import org.springframework.stereotype.Component;
import spitter.Spitter;

@Component
public class SpitterRepoImp implements SpitterRepository {
    @Override
    public Spitter save (Spitter unsaved) {
        return null;
    }

    @Override
    public Spitter findByUserName (String userName) {
        return new Spitter(userName,"password","FirstName", "LastName");
    }

}

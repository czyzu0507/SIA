package data;

import spitter.Spitter;


public interface SpitterRepository {

    Spitter save (Spitter unsaved);

    Spitter findByUserName (String userName);
}

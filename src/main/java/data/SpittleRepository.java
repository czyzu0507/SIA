package data;

import spitter.Spittle;

import java.util.List;

public interface SpittleRepository {

    List<Spittle> findSpittles (Long max , int count);

    Spittle findOne (Long i);
}

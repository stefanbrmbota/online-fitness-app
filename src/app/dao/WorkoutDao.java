package app.dao;

import app.model.Workout;
import java.util.List;

public interface WorkoutDao {



    Workout findById(int id);

    List<Workout> findAll();

    void save(Workout workout);

    void update(Workout workout);
}
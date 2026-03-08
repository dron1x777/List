package Dao.Impl;

import Dao.MovieDao;
import DataBase.DataBase;
import Model.Actor;
import Model.Movie;
import Model.enums.Genre;

import java.time.LocalDate;
import java.util.List;

public class MovieDaoImpl implements MovieDao {
    DataBase db = new DataBase();

    @Override
    public List<Movie> getAllMovies() {
        return db.getMovies();
    }

    @Override
    public Movie findMovieByFullNameOrPartName(String name) {
        for (Movie movie : getAllMovies()) {
            if (movie.getName().equals(name) || movie.getName().contains(name)) {
                return movie;
            }
        }
        return null;
    }

    @Override
    public Movie findMovieByActorName(String actorName) {
        for (Movie movie : getAllMovies()) {
            for (Actor actor : movie.getActors()) {
                if (actor.getActorFullName().equals(actorName)) {
                    return movie;
                }
            }
        }
        return null;
    }

    @Override
    public Movie findMovieByYear(int year) {
        for (Movie movie : getAllMovies()) {
            if (movie.getYear() == year) {
                return movie;
            }
        }
        return null;
    }

    @Override
    public Movie findMovieByProducer(String producerFullName) {
        for (Movie movie : getAllMovies()) {
            if (movie.getProducer().getFirstName().contains(producerFullName) && movie.getProducer().getLastName().contains(producerFullName)) {
                return movie;
            }
        }
        return null;
    }

    @Override
    public Movie findMovieByGenre(Genre genre) {
        for (Movie movie : getAllMovies()) {
            if (movie.getGenre().equals(genre)) {
                return movie;
            }
        }
        return null;
    }

    @Override
    public Movie findMovieByRole(String role) {
        for (Movie movie : getAllMovies()) {
            for (Actor actor : movie.getActors()) {
                if (actor.getRole().equals(role)) {
                    return movie;
                }
            }
        }
        return null;
    }
}

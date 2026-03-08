package Service.Impl;

import Dao.Impl.MovieDaoImpl;
import Exceptions.MovieNotFound;
import Model.Movie;
import Model.enums.Genre;
import Service.MovieService;

import java.util.List;

public class MovieServiceImpl implements MovieService {
    private MovieDaoImpl movieDaoImpl = new MovieDaoImpl();

    @Override
    public List<Movie> getAllMovies() {
        System.out.println("getAllMovies: ");
        return movieDaoImpl.getAllMovies();
    }

    @Override
    public Movie findMovieByFullNameOrPartName(String name) throws MovieNotFound{
        if (name == null || name.isEmpty()) {
            throw new MovieNotFound("Movie name is null or empty");
        }
        return movieDaoImpl.findMovieByFullNameOrPartName(name);
    }

    @Override
    public Movie findMovieByActorName(String actorName) throws MovieNotFound{
        if (actorName == null || actorName.isEmpty()) {
            throw new MovieNotFound("Actor name is null or empty");
        }
        return movieDaoImpl.findMovieByActorName(actorName);
    }

    @Override
    public Movie findMovieByYear(int year) throws MovieNotFound{
        if (year <= 0) {
            throw new MovieNotFound("Year is less than 0");
        }
        return movieDaoImpl.findMovieByYear(year);
    }

    @Override
    public Movie findMovieByProducer(String producerFullName) throws MovieNotFound{
        if (producerFullName == null || producerFullName.isEmpty()) {
            throw new MovieNotFound("Producer name is null or empty");
        }
        return movieDaoImpl.findMovieByProducer(producerFullName);
    }

    @Override
    public Movie findMovieByGenre(Genre genre) throws MovieNotFound{
        if (genre == null) {
            throw new MovieNotFound("Genre is null or empty");
        }
        return movieDaoImpl.findMovieByGenre(genre);
    }

    @Override
    public Movie findMovieByRole(String role) throws MovieNotFound{
        if (role == null || role.isEmpty()) {
            throw new MovieNotFound("Role is null or empty");
        }
        return movieDaoImpl.findMovieByRole(role);
    }
}

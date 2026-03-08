package Service;

import Exceptions.MovieNotFound;
import Model.Movie;
import Model.enums.Genre;

import java.util.List;

public interface MovieService {
    List<Movie> getAllMovies() throws MovieNotFound;

    Movie findMovieByFullNameOrPartName(String name) throws MovieNotFound;

    Movie findMovieByActorName(String actorName)  throws MovieNotFound;

    Movie findMovieByYear(int year)  throws MovieNotFound;

    Movie findMovieByProducer(String producerFullName)   throws MovieNotFound;

    Movie findMovieByGenre(Genre genre) throws MovieNotFound ;

    Movie findMovieByRole(String role)  throws MovieNotFound;

}

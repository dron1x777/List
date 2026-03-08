package DataBase;
import Model.Actor;
import Model.Movie;
import java.util.LinkedList;
import java.util.List;

public class DataBase {
    private List<Movie> movies = new LinkedList<>();

    public void setMovies1(List<Movie> movies) {
        this.movies = movies;
    }
    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Movie movie) {
        this.movies.add(movie);
    }
    public void deletePharmacy(Movie movie) {
        this.movies.remove(movie);
    }
}

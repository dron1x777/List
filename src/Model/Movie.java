package Model;

import Model.enums.Genre;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Movie {
    private String name;
    private int year;
    private Genre genre;
    private Producer producer;
    private List<Actor> actors = new ArrayList<>();

    public Movie( Genre genre, String name, Producer producer, int year) {
        this.genre = genre;
        this.name = name;
        this.producer = producer;
        this.year = year;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actors=" + actors +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", genre=" + genre +
                ", producer=" + producer +
                '}';
    }

    public class MovieNameComparator implements Comparator<Movie> {

        @Override
        public int compare(Movie m1, Movie m2) {
            return m1.getName().compareToIgnoreCase(m2.getName());
        }
    }

    public class MovieYearComparator implements Comparator<Movie> {

        @Override
        public int compare(Movie m1, Movie m2) {
            return Integer.compare(m1.getYear(), m2.getYear());
        }
    }

    public class MovieProducerComparator implements Comparator<Movie> {

        @Override
        public int compare(Movie m1, Movie m2) {
            return m1.getProducer().getFirstName().compareToIgnoreCase(m2.getProducer().getFirstName());
        }
    }
}


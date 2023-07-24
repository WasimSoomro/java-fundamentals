package inheritance;

import java.util.ArrayList;
import java.util.List;


public class Theater {
    private String name;
    private List<String> movies;

    public Theater(String name) {
        this.name = name;
        this.movies = new ArrayList<>();
    }

    public void addMovie(String movie) {
        this.movies.add(movie);
    }

    public void removeMovie(String movie) {
        this.movies.remove(movie);
    }

    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                '}';
    }

}

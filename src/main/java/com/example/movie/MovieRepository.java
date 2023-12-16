// Write your code here
package com.example.movie;

import java.util.*;

public interface MovieRepository {

    ArrayList<Movie> getMovies();

    Movie getMovieById(int movieId);

    Movie addMovie(Movie movie);

    Movie updateMovie(int moiveId, Movie movie);

    void deleteMovie(int movieId);
}
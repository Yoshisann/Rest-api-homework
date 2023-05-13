package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.*;
@Component
public class MovieDao {
    private List<Movieid> movies;

    public MovieDao() {
        this.movies = new ArrayList<>();
    }

    public Movie createMovie(Movie movie) {
        this.movies.add(new Movieid(movie.getName(), movie.getGenre(), movie.getYear(), movie.getDirector(), new Random().nextLong()));
        return movie;
    }

    public Movie getMovie(long id) {
        for (Movieid movieid : this.movies) {
            if (movieid.getId() == id) {
                return movieid.toMovie();
            }
        }
        return null;
    }

    public boolean deleteMovies(long id)
    {
        for(int i = 0; i < this.movies.size();i++)
        {
            if(this.movies.remove(this.movies.get(i)))
            {

            }
        }
        return false;
    }

    public List<Movieid> getAll() {
        return this.movies;
    }
}

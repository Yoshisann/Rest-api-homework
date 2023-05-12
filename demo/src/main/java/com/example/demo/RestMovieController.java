package com.example.demo;


import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")



public class RestMovieController
{
    @Autowired
    private MovieDao movieDao;


    @PostMapping("/createMovie")
    public ResponseEntity<Movie> createMovie(@RequestBody Movie b)
    {
        return ResponseEntity.ok(this.movieDao.createMovie(b));
    }

    @GetMapping("/getMovie/{movieid}")
    public ResponseEntity<Movie> getMovie(@PathVariable long movieid)
    {
        return ResponseEntity.ok(this.movieDao.getMovie(movieid));
    }
    @GetMapping("/Movies")
    public ResponseEntity<List<Movieid>> getallMovies()
    {
        return ResponseEntity.ok(this.movieDao.getAll());
    }
    @PutMapping("/updateMovie")
    public ResponseEntity<String> updateMovie()
    {
        return ResponseEntity.ok("Update");
    }
    @DeleteMapping("/deleteMovie")
    public ResponseEntity<String> deleteMovie()
    {
        return ResponseEntity.ok("Deleted");
    }
}

package com.movie.service.movieService.controller;

import com.movie.service.movieService.model.Movie;
import com.movie.service.movieService.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("movie")
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    //add a movie
    @PostMapping("/add-movie")
    public String saveMovie(@RequestBody Movie movie){
        return movieService.saveMovie(movie);
    }

    //get all movies
    @GetMapping("/get-all-movies")
    public List<Movie> getMovies(){
        return movieService.getMovies();
    }
}
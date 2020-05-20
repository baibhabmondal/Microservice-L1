package com.gradecinema.moviedetailsservice.controllers;

import com.gradecinema.moviedetailsservice.dao.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/movie")
public class MovieDetails {

    @RequestMapping("/{id}")
    public Movie getData( @PathVariable("id") String id) {
        return new Movie("incp123", "A great movie", "Inception");
    }
}

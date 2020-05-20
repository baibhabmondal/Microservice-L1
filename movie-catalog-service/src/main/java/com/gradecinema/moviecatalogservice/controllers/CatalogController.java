package com.gradecinema.moviecatalogservice.controllers;

import com.gradecinema.moviecatalogservice.dao.CatalogItem;
import com.gradecinema.moviecatalogservice.dao.Movie;
import com.gradecinema.moviecatalogservice.dao.Rating;
import com.gradecinema.moviecatalogservice.dao.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/catalog")
public class CatalogController {

    // using rest client. Which is deprecated.

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    WebClient.Builder webClientBuilder;

    @RequestMapping("/{userid}")
    public List<CatalogItem> getCatalogs(@PathVariable("userid") String userId) {

        List<Rating> ratings = Arrays.asList(
                new Rating(4, "incep123"),
                new Rating(3, "papert22")
                );
        UserRating userRating = restTemplate.getForObject("http://rating-service/api/rating/" + userId, UserRating.class);

       return userRating.getUserRatings().stream().map(rating -> {
            Movie movie = restTemplate.getForObject("http://movie-info/api/movie/" + rating.getMovieid(),
                    Movie.class
                    );
            return new CatalogItem(userId, movie.getName(), movie.getDesc(), rating.getRating());
            /*
           Movie movie = webClientBuilder.build()
                   .get()
                   .uri("http://localhost:4001/api/movie/" + rating.getMovieid())
                   .retrieve()
                   .bodyToMono(Movie.class)
                   .block();
            return new CatalogItem("@baib", movie.getName(), movie.getDesc(), rating.getRating());
            */

        }).collect(Collectors.toList());

    }
}

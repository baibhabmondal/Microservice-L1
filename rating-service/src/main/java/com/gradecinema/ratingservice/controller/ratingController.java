package com.gradecinema.ratingservice.controller;


import com.gradecinema.ratingservice.dao.Rating;
import com.gradecinema.ratingservice.dao.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("api/rating")
public class ratingController {

    @RequestMapping("/{userid}")
    public UserRating getUser(@PathVariable("userid") String userid) {
          List<Rating> ratings = Arrays.asList(new Rating(4, "incep123"),
                  new Rating(3, "La la Land"),
                  new Rating(3, "Udaan"));
        UserRating userRating = new UserRating(ratings);
        return userRating;
    }

}

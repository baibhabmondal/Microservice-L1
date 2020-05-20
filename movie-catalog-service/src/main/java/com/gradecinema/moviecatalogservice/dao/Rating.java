package com.gradecinema.moviecatalogservice.dao;

public class Rating {

   private int rating;
   private String movieid;

    public Rating() {}
    public Rating(int rating, String movieid) {
        this.rating = rating;
        this.movieid = movieid;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getMovieid() {
        return movieid;
    }

    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }
}

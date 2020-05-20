package com.gradecinema.moviecatalogservice.dao;

public class CatalogItem {
    private String userid;
    private String moviename;
    private String moviedesc;
    private Integer rating;

    public CatalogItem(String userid, String moviename, String moviedesc, Integer rating) {
        this.userid = userid;
        this.moviename = moviename;
        this.moviedesc = moviedesc;
        this.rating = rating;
    }


    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getMoviedesc() {
        return moviedesc;
    }

    public void setMoviedesc(String moviedesc) {
        this.moviedesc = moviedesc;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}

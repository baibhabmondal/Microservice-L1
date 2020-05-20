package com.gradecinema.moviecatalogservice.dao;

public class Movie {
    private String movieid;
    private String desc;
    private String name;

    public Movie() {}

    public Movie(String movieid, String desc, String name) {
        this.movieid = movieid;
        this.desc = desc;
        this.name = name;
    }

    public String getMovieid() {
        return movieid;
    }

    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

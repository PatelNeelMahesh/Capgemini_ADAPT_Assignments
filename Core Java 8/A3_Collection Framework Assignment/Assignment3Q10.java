package com.company;

import java.util.*;

class MovieDetails {
    private String movieName;
    private String actor;
    private String actress;
    private String genre;

    public MovieDetails(String movieName, String actor, String actress, String genre) {
        this.movieName = movieName;
        this.actor = actor;
        this.actress = actress;
        this.genre = genre;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActress() {
        return actress;
    }

    public void setActress(String actress) {
        this.actress = actress;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "MovieDetails{" +
                "movieName='" + movieName + '\'' +
                ", actor='" + actor + '\'' +
                ", actress='" + actress + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}

class SortIt implements Comparator<MovieDetails> {

    String str = "";
    public SortIt(String str) {
        this.str = str;
    }
    @Override
    public int compare(MovieDetails obj1, MovieDetails obj2) {
        MovieDetails m1 = (MovieDetails) obj1;
        MovieDetails m2 = (MovieDetails) obj2;
        if (this.str.equals("movieName")) {
            return m1.getMovieName().compareTo(m2.getMovieName());
        }
        if (this.str.equals("actor")) {
            return m1.getActor().compareTo(m2.getActor());
        }
        if (this.str.equals("actress")) {
            return m1.getActress().compareTo(m2.getActress());
        }
        return m1.getGenre().compareTo(m2.getGenre());
    }
}

public class Assignment3Q10 {
    public static void main(String[] args) {}

    public static ArrayList<MovieDetails> md = new ArrayList<>();
    public static void sort(ArrayList<MovieDetails> movieDetails,Comparator<MovieDetails> movieDetailsComparator){
        Collections.sort(movieDetails, movieDetailsComparator);
    }
    public static void printSortedMovieList(ArrayList<MovieDetails> movieDetails){
        for (MovieDetails obj : movieDetails) {
            System.out.println(obj.getMovieName());
        }
    }
    public void addMovie(MovieDetails movie) {
        md.add(movie);
    }
    public void removeMovies(String movieName) {
        MovieDetails name = null;
        for (MovieDetails i : md) {
            if (i.getMovieName().equals(movieName)) {
                name = i;
                break;
            }
        }
        md.remove(name);
    }
    public void removeAllMovies(List<MovieDetails> movies) {
        md.removeAll(movies);
    }
    public MovieDetails find_movie_By_mov_Name(String movieName) {
        for (MovieDetails i : md) {
            if (i.getMovieName().equals(movieName)) {
                return i;
            }
        }
        return null;
    }
    public List<MovieDetails> find_movie_By_Genre(String genre) {
        List<MovieDetails> mg = new ArrayList<>();
        for (MovieDetails i : md) {
            if (i.getGenre().equals(genre)) {
                mg.add(i);
            }
        }
        return mg;
    }
    public static Comparator<MovieDetails> sortAccordingly(String str) {
        Comparator<MovieDetails> mD = (Comparator<MovieDetails>) new SortIt(str);
        return mD;
    }
}

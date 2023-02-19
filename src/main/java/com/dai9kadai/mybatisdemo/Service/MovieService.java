package com.dai9kadai.mybatisdemo.Service;

import com.dai9kadai.mybatisdemo.Model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();
    List<Movie> findMoviesByPublishedYear(Integer publishedYear);
}

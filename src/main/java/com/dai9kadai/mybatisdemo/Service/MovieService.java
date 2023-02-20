package com.dai9kadai.mybatisdemo.Service;

import com.dai9kadai.mybatisdemo.Model.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    List<String> findTitle();
    List<String> findMoviesByPublishedYear(Integer publishedYear);
    Movie findMovieById(Integer id);
    Optional<Movie> findMovieByTitle(String title);

    List<Movie> findAll();
}

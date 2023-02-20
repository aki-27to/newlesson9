package com.dai9kadai.mybatisdemo.Service;

import com.dai9kadai.mybatisdemo.Mapper.MovieMapper;
import com.dai9kadai.mybatisdemo.Model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieMapper movieMapper;

    @Autowired
    public MovieServiceImpl(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }
    @Override
    public List<Movie> findAll() {
        return movieMapper.findAll();
    }
    @Override
    public List<String> findTitle() {
        return movieMapper.findTitle();
    }

    @Override
    public List<String> findMoviesByPublishedYear(Integer publishedYear) {
        return movieMapper.findMoviesByPublishedYear(publishedYear);
    }
    @Override
    public Movie findMovieById(Integer id) {
        return movieMapper.findMovieById(id);
    }

    @Override
    public Optional<Movie> findMovieByTitle(String title) {
        return movieMapper.findMovieByTitle(title);
    }
}

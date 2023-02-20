package com.dai9kadai.mybatisdemo.Mapper;

import com.dai9kadai.mybatisdemo.Model.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MovieMapper {
    @Select("SELECT title FROM movies")
    List<String> findTitle();

    @Select("SELECT title FROM movies WHERE published_year = #{publishedYear}")
    List<String> findMoviesByPublishedYear(Integer publishedYear);

    @Select("SELECT * FROM movies WHERE id = #{id}")
    Movie findMovieById(Integer id);

    @Select("SELECT * FROM movies WHERE title = #{title}")
    Optional<Movie> findMovieByTitle(String title);
    @Select("SELECT * FROM movies")
    List<Movie> findAll();
}

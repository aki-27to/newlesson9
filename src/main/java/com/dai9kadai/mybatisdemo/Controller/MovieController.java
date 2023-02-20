package com.dai9kadai.mybatisdemo.Controller;

import com.dai9kadai.mybatisdemo.Model.Movie;
import com.dai9kadai.mybatisdemo.Model.Name;
import com.dai9kadai.mybatisdemo.Service.MovieService;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Validated
@RequestMapping(path = "api/v1/movies")
@RestController//Serviceの窓口的存在
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    //DB確認用
    @GetMapping("/all")
    public List<Movie> getMovies(){
        return movieService.findAll();
    }

    //titleの一括取得
    @GetMapping
    public List<String> getMoviesByPublishedYear(@RequestParam(value = "published_year", required = false)Integer publishedYear){
        if (publishedYear != null) {
            return movieService.findMoviesByPublishedYear(publishedYear);
        }
        return movieService.findTitle();
    }
    //idで検索
    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable
                              @NotNull(message = "ID must not be null")
                              @Min(value = 1, message = "ID must be greater than or equal to 1") Integer id) {
        return movieService.findMovieById(id);
    }
    //titleで検索
    @GetMapping("/title")
    public Movie getMovieByTitle(@RequestParam
                                 @NotNull(message = "Title must not be null") String title) {
        return movieService.findMovieByTitle(title).orElseThrow(() -> new IllegalArgumentException("Movie with title " + title + " does not exist"));
    }
}

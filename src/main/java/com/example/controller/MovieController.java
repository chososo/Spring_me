package com.example.controller;
import com.example.common.Response;
import com.example.domain.entity.Movie;
import com.example.domain.request.MovieRequest;
import com.example.domain.response.MovieResponse;
import com.example.service.MovieService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 서비스 호출해서 넣어서, 호출한다..
@Tag(name = "무비컨트롤러 ")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/") // 매핑 정보를 아래에 두는 것이 좋다
public class MovieController {

    private final MovieService movieService;



    @Deprecated
//    @GetMapping("/v1/movies")
//    public Movie getMovies() {
//        return movieService.getMovies();
//    }

//    public List<MovieResponse> getMovies2() {
//        return movieService.getMovies();
//    }
    @GetMapping("/v2/movies")
    public Response<List<MovieResponse>> getMovies2() {

        return Response.of(movieService.getMovies());
        //매핑이된 response 객체가 됩니다.
    }


    @GetMapping("/v1/movies/{movieId}")
    public Movie getMovie(
            @PathVariable(value = "movieId") long movieId)

    {
        return movieService.getMovie(movieId);
    }

    @PostMapping("/v1/movies")
    public void createMovie(MovieRequest movieRequest) {
        movieService.createMovies(movieRequest);
    }


    @PutMapping("/v1/movies/{movieId}")
    public void updateMovies(
            @PathVariable(value="movieId") long movieId,
            @RequestBody MovieRequest movieRequest
    ) {
      movieService.updateMovie(movieId, movieRequest);
    }


    @DeleteMapping("/v1/movies/{movieId}")

    public void deleteMovies(  @PathVariable(value="movieId") long movieId) {
        movieService.deleteMovies(movieId);
    }


    //    @GetMapping("/v1/movies/{movieId}")
//    public String getMovie(
//            @RequestParam(value="y", required = false) Integer v,
//            @PathVariable(value = "movieId") long movieId) {
//      //movieId 여기다 할당 할게~ path에 담아서 어디에다 할당할래 ? long 타입의 movieId에 할당할게!
//        // long은 null이 되지 않는 primitive 타입이ㄴ된다.
//        //movieId는 movie뒤에 반드시 와야하기 대문에 long으로 준다.
//
//        return String.valueOf(movieId+ " " + v);
//    }
}
package com.example.service;

import com.example.domain.entity.Movie;
import com.example.domain.request.MovieRequest;
import com.example.domain.response.MovieResponse;
import lombok.Getter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Service
public class MovieService {

    private static List<Movie> movies = new ArrayList<>();
    //final 하면 불변의 객체가 되기 대문에 빼줍히다
    @PostConstruct
    //post construct :: 생성하기 전에 호출한다. ==> movie Service가 생성하면, 생상자와 함께 해당 메서드가 호출될거야!

    public void init() {
        movies.addAll(List.of(
                new Movie(1,"찰리의 초콜릿 공장",2005, LocalDateTime.now()),
                new Movie(2, "하울의 움직이는 성",2006,LocalDateTime.now()),
                new Movie(3, "시간을 달리는 소녀",2009,LocalDateTime.now()),
                new Movie(4, "해리포터와 마법사의 돌",2004,LocalDateTime.now()),
                new Movie(5,"hello",2008,LocalDateTime.now())
        ));

    }

    public List<MovieResponse> getMovies() {
        //템플릿 메소드 . 깔끔함 !
        return movies.stream().map(MovieResponse::of).toList();
    }
//    public List<MovieResponse> getMovies() {
//        return movies.stream().map(movie ->
//                MovieResponse
//                .builder()
//                .id(movie.getId())
//                .name(movie.getName())
//                .productionYear(movie.getProductionYear())
//                .build()
//        ).toList();
//    }

    public void createMovies(@RequestBody MovieRequest movieRequest) {
        Movie movie = new Movie(
                movies.size() + 1 ,
                movieRequest.getName(),
                movieRequest.getProductionYear(),
                LocalDateTime.now()

        );
        movies.add(movie);
    }


    public void updateMovie(long movieId, MovieRequest movieRequest){
        Movie movie = getMovie(movieId);
        movie.setName(movieRequest.getName());
        movie.setProductionYear(movieRequest.getProductionYear());
    }


    public void deleteMovies(long movieId) {
        Movie movie= getMovie(movieId);
        movies.remove(movie);
    }

    public Movie getMovie(long movieId) {
        return movies.stream()
                .filter(movie -> movie.getId() == movieId)
                .toList()
                .stream()
                .findFirst()
                .orElseThrow();
        //stream 반환형은 stream 따라서 list화 시키고, find first 를 가져와
    }
}

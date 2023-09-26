package com.example.domain.response;

import com.example.domain.entity.Movie;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Builder
public class MovieResponse {
    //매핑만해서 넘겨줄거라서 final로 주자!
    private final long id;
    private final String name;
    private final Integer productionYear;

//정적 팩토리 패턴
    public static MovieResponse of(Movie movie){
        return new MovieResponse(movie.getId(),movie.getName(), movie.getProductionYear());
    }
}

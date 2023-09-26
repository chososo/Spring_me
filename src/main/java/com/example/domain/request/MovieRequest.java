package com.example.domain.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class MovieRequest {
// front에서 영화정보를 넘겨줄거야! 프론트에서 과연 아이디를 만들어 줄 수 있을 것인가?
//프론트는 정보만 전달해줘요.
    private final String name;
    private final Integer productionYear;
    //프론트는 디비담당이 아님! 이렇게 만들어줄거야~


}

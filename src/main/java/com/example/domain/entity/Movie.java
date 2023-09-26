package com.example.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class Movie {
    // movie의 속성 정보들
    private  long id;
    private  String name;
    private  Integer productionYear;
    private  LocalDateTime createdAt;

}

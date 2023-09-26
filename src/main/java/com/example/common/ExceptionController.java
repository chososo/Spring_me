package com.example.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

//말그대로 RestControllerAdvice
// 타고들어가면 똑같이 component들이다. 왜 이름을 이렇게 구분을 짓지?
// 어쨌든 이름을 보고 역할을 알아야하기 때문이야~
//결국엔 얘네들도 component로 만ㄷ르엊니 bean이야
@RestControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value= NoSuchElementException.class)
    public ResponseEntity<ExceptionResponse> handleException(NoSuchFieldException e){
        ExceptionResponse errorResponse = new ExceptionResponse("데이터좀 잘좀 배갑시다~ ", HttpStatus.INTERNAL_SERVER_ERROR.value());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
    }
}

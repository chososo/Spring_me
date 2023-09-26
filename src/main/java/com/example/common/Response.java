package com.example.common;

public class Response<T> {

    private final T data;

    public Response(T date) {
        this.data = date;
    }


    public T getData(){return data;}

    public static <T> Response<T> of(T data){return new Response<>( data);}


}

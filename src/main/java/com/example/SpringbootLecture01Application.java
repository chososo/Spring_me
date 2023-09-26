package com.example;

import com.example.ioc.Chef;
import com.example.ioc.IngredientFactory;
import com.example.ioc.PrintBeans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootLecture01Application {

    public static void main(String[] args) {
//        IngredientFactory ingredientFactory = new IngredientFactory();
//        Chef chef = new Chef(ingredientFactory);
//        String result = chef.cook("스테이크");
//        System.out.println(result);


        SpringApplication.run(SpringbootLecture01Application.class, args);

    }

}

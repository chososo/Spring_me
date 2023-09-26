package com.example.ioc;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Pork implements Ingredient {
    final String name;

    @Override
    public String getName() {
        return null;
    }
}

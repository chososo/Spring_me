package com.example.ioc;

public class IngredientFactory {
//메뉴에 따라서 식재료를 챙겨줄 공장
    public Ingredient getIngredient(String menu){
     return  switch(menu){
            case "치킨" -> new Chicken("국내산 닭");
            case "스테이크"->new Pork("국내산 돼지");
            default ->  throw new RuntimeException("처리할 수 없는 메뉴가 있습니다. ");
        };

    }

}

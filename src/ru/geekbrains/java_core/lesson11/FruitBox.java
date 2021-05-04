package ru.geekbrains.java_core.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitBox<T extends Fruit>{

    private final List<T> fruitsInTheBox;



    public FruitBox(T... fruits) {
        this.fruitsInTheBox = new ArrayList<>(Arrays.asList(fruits));
    }




    public float getWeight() {
        float boxWeight = 0.0f;

        for (int i=0; i<fruitsInTheBox.size(); i++ ){
            boxWeight+= fruitsInTheBox.get(i).getWeight();
        }

        return boxWeight;
    }



    public boolean weightCompare(FruitBox<?> anotherBox) {
        if (Math.abs(this.getWeight() - anotherBox.getWeight()) <0.01) {return true;}
        else { return false;}
    }




    public void moveFruitsToAnotherBox(FruitBox<T> anotherBox) {
        anotherBox.fruitsInTheBox.addAll(this.fruitsInTheBox);
        this.fruitsInTheBox.clear();
    }




    public void addFruit(T fruit) {
        fruitsInTheBox.add(fruit);
        }
}

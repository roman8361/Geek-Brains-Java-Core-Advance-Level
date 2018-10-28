package ru.kravchenko.se;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit> {
    private ArrayList <T> container;
    public Box(T...fruits){
        this.container = new ArrayList<T>(Arrays.asList(fruits));
    }
    public void addFruit (T fruit){
        this.container.add(fruit);
    }
    public float getWeigth() {
        if(container.size() == 0){ return 0f; }
         return container.size() * container.get(0).getWeigth();
    }

    public boolean compare (Box<?> another){
        return Math.abs(this.getWeigth() - another.getWeigth()) < 0.0001;
    }

    public void transfer (Box<T> dst) {
        dst.container.addAll(this.container);
        this.container.clear();
    }


}

package service;



import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private static List<Car> cars = new ArrayList<>();
    static {
        cars.add(new Car("BMW", 13, "Vova Vovchik"));
        cars.add(new Car("Audi", 8, "Dima Dmitriy"));
        cars.add(new Car("Nissan", 3, "Andrey Andreychik"));
        cars.add(new Car("Tesla", 1, "Elon Musk"));
        cars.add(new Car("RosKosmos", 10, "Dimka Rogozin"));
    }
    public static List<Car> countCars(Integer count){
        if(count>5) count = 5;
        return cars.subList(0,count);
    }

    public static List<Car> getCars() {
        return cars;
    }

}

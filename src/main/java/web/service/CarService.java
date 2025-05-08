package web.service;

import web.model.Car;

import java.util.List;

public class CarService {
    private final List<Car> cars = List.of(
            new Car("Toyota", 2015, "Black"),
            new Car("Hyundai", 2015, "Black"),
            new Car("Toyota", 2015, "Black"),
            new Car("Toyota", 2015, "Black"),
            new Car("Toyota", 2015, "Black")
    );

    public List<Car> getCars(int count) {
        if (count >= cars.size()) return cars;
        return cars.subList(0, count);
    }
    public List<Car> getAllCars() {
        return cars;
    }
}

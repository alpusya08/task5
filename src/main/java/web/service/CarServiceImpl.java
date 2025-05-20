package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = List.of(
            new Car("BMW", 2022, "Black"),
            new Car("Mercedes", 2021, "Red"),
            new Car("Audi", 2025, "Green"),
            new Car("Toyota", 2019, "White"),
            new Car("Bugatti", 2024, "Blue")
    );

    @Override
    public List<Car> getCars(int count) {
        if (count == 0 | count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}

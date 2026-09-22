package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {

    public static void main(String[] args) {

        Car car = new Car(
                "Toyota Camry",
                "A123BC",
                "Black",
                2020,
                "Ivan Petrov",
                "INS-001"
        );

        ElectricCar electricCar = new ElectricCar(
                "Tesla Model 3",
                "E777AA",
                "White",
                2023,
                "Petr Ivanov",
                "INS-002",
                75.0
        );

        System.out.println("Первоначальные данные:");
        System.out.println(car);
        System.out.println(electricCar);

        // Изменение года выпуска
        car.setYear(2021);

        // Изменение имени владельца
        car.setOwnerName("Alex Petrov");

        // Изменение страхового номера
        car.setInsuranceNumber("INS-100");

        // Изменение данных электромобиля
        electricCar.setYear(2024);
        electricCar.setOwnerName("Dmitry Ivanov");
        electricCar.setInsuranceNumber("INS-200");

        System.out.println();
        System.out.println("После изменения:");

        System.out.println(car);
        System.out.println(electricCar);

        System.out.println();
        System.out.println(
                "Емкость батареи: "
                        + electricCar.getBatteryCapacity()
                        + " kWh"
        );
    }
}
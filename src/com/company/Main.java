package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car [] cars = new Car[9];
        fillCarArray(scanner,cars);
    }
    private static String fillCarArray(Scanner scanner , Car [] cars ){
        while (true) {
            String maxSpeed, brandName, color, vinNumber;

            System.out.println();

            System.out.println("please fill max speed\n");
            maxSpeed= scanner.nextLine();
           maxSpeed = cheackMaxSpeed(maxSpeed,scanner);

            System.out.println("please fill ");
            brandName = scanner.nextLine();
           brandName = checkAuto(brandName,scanner);
            System.out.println("please fill \n");
            color = scanner.nextLine();
            System.out.println("please fill \n");
            vinNumber = scanner.nextLine();

            cars[i] = new Car(maxSpeed , brandName , color , vinNumber);

        }

    private static Car []doubleArraySize(Car[]cars){
            Car[] cars1 = Arrays.copyOf(cars, cars.length * 2);

        }}

        private static  void checkAuto(final String brand, final Scanner scanner){
            String carBrand = brand;
            if (carBrand.toLowerCase(Locale.ROOT).contains("Lada")){
                System.out.println("все ясно Депутат))))))");
                carBrand = checkAuto (scanner.nextLine(),scanner);

            }
            return carBrand;
        }
        private static void printCarTo(Car [] cars){
            for (Car car:
                 cars) {
                System.out.println(car.getbrandName()+""+car.getColor());

            }
        }
        private static void cheackMaxSpeed(String maxSpeed){
            String carSpeed = maxSpeed;
            if (carSpeed.matches("\\d+")) {
            return carSpeed;
        }else{
            System.out.println("только число");
            carSpeed = cheackMaxSpeed(scanner.nextLine(),scanner);
        }
        return carSpeed;
    }
  }

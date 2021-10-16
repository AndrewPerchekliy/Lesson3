package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car [] cars = new Car[9];
        fillCarArray(scanner,cars);
    }
    private static String fillCarArray(Scanner scanner , Car [] cars ){
        for (int i = cars.length; i < cars.length; i++) {
            System.out.println();
            String carName = scanner.nextLine();
             int maxSpeed;
             String brandName;
             String color;
             String vinNumber;
             double oilNumber;
             String brand;

            System.out.println("please fill max speed\n");
            maxSpeed= Integer.parseInt(scanner.nextLine());

            System.out.println("please fill ");
            brandName = scanner.nextLine();
            brandName = checkAuto(scanner.nextLine(),scanner);
            System.out.println("please fill ");
            color = scanner.nextLine();
            System.out.println("please fill ");
            vinNumber = scanner.nextLine();

            cars[i] = new Car(maxSpeed , brandName , color , vinNumber);

        }
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
}

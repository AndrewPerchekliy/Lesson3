package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car[] cars = fillCarArray(scanner);
        printCarTo(String.valueOf(cars));
    }
    private static Car[] fillCarArray(Scanner scanner){
        Car[] cars = new Car[1];
        int carIndex=0;

        while (true) {
            String maxSpeed, brandName, color, vinNumber;



            System.out.println("please fill max speed\n");
            maxSpeed= scanner.nextLine();
           maxSpeed = cheackMaxSpeed(maxSpeed,scanner);

            System.out.println("please fill ");
            brandName = scanner.nextLine();
           brandName = checkAuto(brandName,scanner);
           if (brandName.toLowerCase(Locale.ROOT).contains("lada")){
               System.out.println("нет");
               break;
           }
            System.out.println("please fill \n");
            color = scanner.nextLine();
            System.out.println("please fill \n");
            vinNumber = scanner.nextLine();

           cars[carIndex]= new Car ()

        }

    private static Car [] doubleArraySize (Car[] cars){
            Car[] cars1 = Arrays.copyOf(cars, cars.length * 2);

        }}

        private static String checkAuto(final String brand, final Scanner scanner){
            String carBrand = brand;
            if (carBrand.toLowerCase(Locale.ROOT).contains("Lada")){
                System.out.println("все ясно Депутат))))))");
                checkAuto (scanner.nextLine(),scanner);

            }
            return carBrand;
        }
        private static void printCarTo(String cars){
            for (Car car:
                 cars) {
                System.out.println(car.brandName()+""+car.color());

            }
        }
        private static String cheackMaxSpeed(String maxSpeed){
            String carSpeed = maxSpeed;
            if (carSpeed.matches("\\d+")) {
            return carSpeed;
        }else{
            System.out.println("только число");
                Object scanner;
                carSpeed = cheackMaxSpeed(Scanner.nextLine(),scanner);
        }
        return carSpeed;
            private static Car[] doubleArraySize(Car[] cars){
                return Arrays
            }
    }
  }

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car [] cars = new Car[9];
        fillCarArray(scanner,cars);
    }
    private static void fillCarArray(Scanner scanner , Car [] cars ){
        for (int i = cars.length; i < cars.length; i++) {
            System.out.println();
            String carName = scanner.nextLine();
             int maxSpeed;
             String brandName;
             String color;
             String vinNumber;
             double oilNumber;

            System.out.println("please fill max speed\n");

        }
    }
}

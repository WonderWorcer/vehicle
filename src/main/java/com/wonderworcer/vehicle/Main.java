package com.wonderworcer.vehicle;

import com.wonderworcer.vehicle.factory.VehicleFactory;
import com.wonderworcer.vehicle.model.Vehicle;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            try {
                Vehicle vehicle = VehicleFactory.createVehicle(Integer.parseInt(args[i]));
                if (vehicle != null) {
                    System.out.println("Наименование транспорта: " + vehicle.getName());
                    System.out.println("Количество колес: " + vehicle.getAmountOfWheel());
                    System.out.println("Максимальная скорость: " + vehicle.getMaxSpeed());
                    System.out.println("Уникальные характеристики: " + vehicle.getUniqueStat());
                    System.out.println("");
                } else
                    System.out.println("Неизвестный тип транспорта");
            } catch (NumberFormatException e) {
                System.out.println("Параметр: " + args[i] + " не корректен");
            }
        }
        if (args.length == 0)
            System.out.println("Параметры не переданы");
    }
}

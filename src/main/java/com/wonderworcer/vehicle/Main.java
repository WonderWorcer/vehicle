package com.wonderworcer.vehicle;

public class Main {

    public static void main(String[] args) {

           for( int i = 0; i < args.length; i++)
           {
               Vehicle vehicle = VehicleFactory.createVehicle(Integer.parseInt(args[i]));
               if (vehicle!=null) {
               System.out.println("Наименование транспорта" + vehicle.getName());
               System.out.println("Количество колес" + vehicle.getAmountOfWheel());
               System.out.println("Максимальная скорость" + vehicle.getMaxSpeed());
               System.out.println("Уникальные характеристики" + vehicle.getUniqueStat());
           }
               else
                   System.out.println("Неизвестный тип транспорта");
           }

    }
}

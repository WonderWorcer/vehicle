package com.wonderworcer.vehicle.factory;

import com.wonderworcer.vehicle.model.*;

public class VehicleFactory {
    public static Vehicle createVehicle(int type) {
        switch (type) {
            case 0:
                return new Motorcycle("Мотоцикл",2,120,"Можно присоединить люльку");
            case 1:
                return new Scooter("Самокат",2,30,"Переносной");
            case 2:
                return new Car("Автомобиль",4,150,"Правый руль");
            case 3:
                return new Bus("Автобус",6,100,"Возит людей");
            default:
                return null;
        }

    }
}

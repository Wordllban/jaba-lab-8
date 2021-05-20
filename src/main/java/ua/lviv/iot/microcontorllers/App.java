package ua.lviv.iot.microcontorllers;

import ua.lviv.iot.microcontorllers.enums.SortType;
import ua.lviv.iot.microcontorllers.manager.DeviceManager;
import ua.lviv.iot.microcontorllers.enums.DeviceType;
import ua.lviv.iot.microcontorllers.models.Controller;
import ua.lviv.iot.microcontorllers.models.Motor;
import ua.lviv.iot.microcontorllers.models.Sensor;
import ua.lviv.iot.microcontorllers.enums.SensorType;

public class App {
  public static void main(String[] args) {
    DeviceManager device = new DeviceManager();
    device.addDevice(new Controller(1234.56, 0.3, 0.5,
        DeviceType.CONTROLLER, "N/A", false, 20));
    device.addDevice(new Controller(124.5, 0.4, 0.6,
        DeviceType.CONTROLLER, "USA", false, 25));
    device.addDevice(new Controller(234.4, 0.5, 0.7,
        DeviceType.CONTROLLER, "China", false, 30));
    device.addDevice(new Controller(56.54, 0.2, 0.8,
        DeviceType.CONTROLLER, "Ukraine", false, 35));
    device.addDevice(new Sensor(523.66, 0.01, 0.05,
        DeviceType.SENSOR, "USA", true, SensorType.HUMIDITY));
    device.addDevice(new Sensor(623.66, 0.02, 0.005,
        DeviceType.SENSOR, "USA", true, SensorType.TOUCH));
    device.addDevice(new Sensor(866.66, 0.03, 0.5,
        DeviceType.SENSOR, "China", true, SensorType.SOUND));
    device.addDevice(new Motor(228.5, 23.5, 16.7,
        DeviceType.MOTOR, "UKraine", false, 2287));
    device.addDevice(new Motor(328.7, 45.5, 62.7,
        DeviceType.MOTOR, "Ukraine", false, 6342));
    device.addDevice(new Motor(428.9, 85.5, 37.7,
        DeviceType.MOTOR, "Ukraine", false, 5237));

    System.out.println("---------------_ Find device _---------------");
    device.printDeviceList(device.findDevice(DeviceType.MOTOR));

    System.out.println("\n\n------------_ Sort by manufacturer _------------");
    device.printDeviceList(device.sortByManufacturer(SortType.ASC));

    System.out.println("\n\n------------_ Sort by consumption _------------");
    device.printDeviceList(device.sortByConsumption(SortType.DESC));
  }
}

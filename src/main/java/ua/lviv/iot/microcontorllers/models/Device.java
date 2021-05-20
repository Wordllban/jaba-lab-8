package ua.lviv.iot.microcontorllers.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import ua.lviv.iot.microcontorllers.enums.DeviceType;



@Data
@NoArgsConstructor
public abstract class Device {
  private double price;
  private double operatingVoltageInWatts;
  private double currentConsumptionInWatts;
  private DeviceType deviceType;
  private String manufacturer;
  private boolean isPowered;

  public Device(double price, double operatingVoltageInWatts, double currentConsumptionInWatts,
                DeviceType deviceType, String manufacturer, boolean isPowered) {
    this.price = price;
    this.operatingVoltageInWatts = operatingVoltageInWatts;
    this.currentConsumptionInWatts = currentConsumptionInWatts;
    this.deviceType = deviceType;
    this.manufacturer = manufacturer;
    this.isPowered = isPowered;
  }
}

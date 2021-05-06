package ua.lviv.iot.microcontorllers.models;

import lombok.*;
import ua.lviv.iot.microcontorllers.enums.DeviceType;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Motor extends Device {
  private double revolutionsPerSec;

  public Motor(double price, double operatingVoltageInWatts, double currentConsumptionInWatts,
               DeviceType deviceType, String manufacturer, boolean isPowered,
               double revolutionsPerSec) {
    super(price, operatingVoltageInWatts, currentConsumptionInWatts, deviceType,
        manufacturer, isPowered);
    this.revolutionsPerSec = revolutionsPerSec;
  }
}

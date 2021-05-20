package ua.lviv.iot.microcontorllers.models;

import lombok.*;
import ua.lviv.iot.microcontorllers.enums.DeviceType;
import ua.lviv.iot.microcontorllers.enums.SensorType;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Sensor extends Device {
  private SensorType sensorType;

  public Sensor(double price, double operatingVoltageInWatts, double currentConsumptionInWatts,
                DeviceType deviceType, String manufacturer, boolean isPowered,
                SensorType sensorType) {
    super(price, operatingVoltageInWatts, currentConsumptionInWatts, deviceType,
        manufacturer, isPowered);
    this.sensorType = sensorType;
  }
}

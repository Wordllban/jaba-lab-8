package ua.lviv.iot.microcontorllers.models;

import lombok.*;
import ua.lviv.iot.microcontorllers.enums.DeviceType;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Controller extends Device {
  private int totalNumberOfPins;

  public Controller(double price, double operatingVoltageInWatts, double currentConsumptionInWatts,
                    DeviceType deviceType, final String manufacturer, boolean isPowered,
                    int totalNumberOfPins) {
    super(price, operatingVoltageInWatts, currentConsumptionInWatts, deviceType,
        manufacturer, isPowered);
    this.totalNumberOfPins = totalNumberOfPins;
  }
}

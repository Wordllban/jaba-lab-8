package ua.lviv.iot.microcontorllers.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import ua.lviv.iot.microcontorllers.enums.DeviceType;

import javax.persistence.*;


@Data
@Entity
@NoArgsConstructor
@Table(name = "devices")
public class Device  {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private double price;
  private double operatingVoltageInWatts;
  private double currentConsumptionInWatts;
  private DeviceType deviceType;
  private String manufacturer;

  public Device(double price, double operatingVoltageInWatts, double currentConsumptionInWatts,
                DeviceType deviceType, String manufacturer) {
    this.price = price;
    this.operatingVoltageInWatts = operatingVoltageInWatts;
    this.currentConsumptionInWatts = currentConsumptionInWatts;
    this.deviceType = deviceType;
    this.manufacturer = manufacturer;
  }
}

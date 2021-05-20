package ua.lviv.iot.microcontorllers.manager;

import lombok.Data;
import lombok.NoArgsConstructor;
import ua.lviv.iot.microcontorllers.enums.DeviceType;
import ua.lviv.iot.microcontorllers.enums.SortType;
import ua.lviv.iot.microcontorllers.models.Device;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public final class DeviceManager {

  private List<Device> devices = new ArrayList<>();

  public final void addDevice(Device device) {
    this.devices.add(device);
  }

  public List<Device> findDevice(DeviceType type) {
    return devices.stream()
        .filter(device -> device.getDeviceType().equals(type))
        .collect(Collectors.toList());
  }

  public List<Device> sortByManufacturer(SortType type) {
    if (type == SortType.ASC) {
      devices.sort(Comparator.comparing(Device::getManufacturer));
    } else {
      devices.sort(Comparator.comparing(Device::getManufacturer).reversed());
    }

    return devices;
  }

  public List<Device> sortByConsumption(SortType type) {
    if (type == SortType.DESC) {
      devices.sort(Comparator.comparing(Device::getCurrentConsumptionInWatts));
    } else {
      devices.sort(Comparator.comparing(Device::getCurrentConsumptionInWatts).reversed());
    }
    return devices;
  }

  public void printDeviceList(List<Device> devices) {
    devices.forEach(System.out::println);
  }
}

package ua.lviv.iot.microcontorllers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.microcontorllers.models.Device;
import ua.lviv.iot.microcontorllers.repository.DeviceRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DeviceService {
  @Autowired
  private DeviceRepository deviceRepository;
  public List<Device> allDevices() {
    return deviceRepository.findAll();
  }
  public void saveDevice(Device device) {
    deviceRepository.save(device);
  }
  public Device getDevice(Integer id) {
    return deviceRepository.findById(id).get();
  }
  public void deleteDevice(Integer id) {
    deviceRepository.deleteById(id);
  }
}

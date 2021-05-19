package ua.lviv.iot.microcontorllers.controllers;
import ua.lviv.iot.microcontorllers.models.Device;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RequestMapping(path = "/device")
@RestController
public class DeviceController {
  int counter = 1;
  private final Map<Integer, Device> devices = new HashMap<>();

  @PostMapping
  public ResponseEntity<Object> addDevice(@RequestBody Device device){
    device.setId(counter++);
    devices.put(device.getId(), device);
    return ResponseEntity.ok(Collections.singletonMap("id", device.getId()));
  }

  @GetMapping
  public Collection<Device> getDevices(){
    return devices.values();
  }

  @GetMapping(path ="{id}")
  public ResponseEntity<Device> getDevice(@PathVariable("id") int id){
    Device device = devices.get(id);
    if (device != null)
      return ResponseEntity.ok(device);
    return ResponseEntity.notFound().build();
  }

  @DeleteMapping(path ="{id}")
  public ResponseEntity<Object> deleteDevice(@PathVariable("id") int id){
    Device device = devices.get(id);
    if(device != null){
      devices.remove(id);
      return ResponseEntity.ok(Collections.singletonMap("id", id));
    }
    return ResponseEntity.notFound().build();
  }

  @PutMapping(path ="{id}")
  public ResponseEntity<Device> updateDevice(@RequestBody Device newDevice, @PathVariable("id") int id){
    Device oldDevice = devices.get(id);
    if(oldDevice != null){
      newDevice.setId(id);
      devices.replace(id, newDevice);
      return ResponseEntity.ok(oldDevice);
    }
    return ResponseEntity.notFound().build();
  }
}

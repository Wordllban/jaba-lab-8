package ua.lviv.iot.microcontorllers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.microcontorllers.models.Device;

public interface DeviceRepository extends JpaRepository<Device, Integer> {
}

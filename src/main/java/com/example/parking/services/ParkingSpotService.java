package com.example.parking.services;

import com.example.parking.models.ParkingSpotModel;
import com.example.parking.repositories.ParkingRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {

    final
    ParkingRepository parkingRepository;

    public ParkingSpotService(ParkingRepository parkingRepository) {
        this.parkingRepository = parkingRepository;
    }

    @Transactional
    public Object save(ParkingSpotModel parkingSpotModel) {
        return parkingRepository.save(parkingSpotModel);
    }
}

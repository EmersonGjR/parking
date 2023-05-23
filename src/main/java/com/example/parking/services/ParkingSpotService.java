package com.example.parking.services;

import com.example.parking.models.ParkingSpotModel;
import com.example.parking.repositories.ParkingRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
    public boolean existsByparkingSpotNumber(String parkingSpotNumber){ return parkingRepository.existsByparkingSpotNumber( parkingSpotNumber ); }
    public boolean existsByapartment (String apartment){ return parkingRepository.existsByapartment( apartment ); }

    public Page<ParkingSpotModel> findAll(Pageable pageable) { return parkingRepository.findAll(pageable); }

    public Optional<ParkingSpotModel> findById(UUID id) { return parkingRepository.findById(id); }

    @Transactional
    public void delete(ParkingSpotModel parkingSpotModel) { parkingRepository.delete(parkingSpotModel); }
}

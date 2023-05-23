package com.example.parking.repositories;

import com.example.parking.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingRepository extends JpaRepository<ParkingSpotModel, UUID> {
    boolean existsByparkingSpotNumber(String parkingSpotNumber);
    boolean existsByapartment (String apartment);

}

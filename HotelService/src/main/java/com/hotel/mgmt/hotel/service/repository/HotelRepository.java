package com.hotel.mgmt.hotel.service.repository;

import com.hotel.mgmt.hotel.service.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

    public Optional<Hotel> findByHotelName(String name);
    public Optional<Hotel> findByHotelId(String name);
}

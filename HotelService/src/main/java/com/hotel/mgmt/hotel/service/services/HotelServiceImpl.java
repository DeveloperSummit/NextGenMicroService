package com.hotel.mgmt.hotel.service.services;

import com.hotel.mgmt.hotel.service.entity.Hotel;
import com.hotel.mgmt.hotel.service.exception.HotelResourceNotFound;
import com.hotel.mgmt.hotel.service.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class HotelServiceImpl implements  HotelService {

    private HotelRepository hotelRepository;
    @Autowired
    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public Optional<Hotel> getHotelById(String id) {
        Hotel hotel = hotelRepository.findByHotelId(id).orElseThrow(() -> new HotelResourceNotFound("Hotel id not found -  " + id));
        return Optional.of(hotel);
    }

    @Override
    public Optional<Hotel> getHotelByName(String name) {
        Hotel hotel = hotelRepository.findByHotelName(name).orElseThrow(() -> new HotelResourceNotFound("Hotel name not found -  " + name));
        return Optional.of(hotel);
    }

    @Override
    public Optional<Hotel> createHotel(Hotel hotel) {
        hotel.setHotelId(UUID.randomUUID().toString());
        Hotel save = hotelRepository.save(hotel);
        return Optional.of(save);
    }

    @Override
    public Optional<Hotel> updateHotel(Hotel hotel) {
        return Optional.empty();
    }

    @Override
    public List<Hotel> getAllHotels() {
        System.out.println("All hotels in HotelServiceImpl");
        return hotelRepository.findAll();
    }
}

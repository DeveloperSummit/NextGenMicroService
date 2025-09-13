package com.hotel.mgmt.hotel.service.services;

import com.hotel.mgmt.hotel.service.entity.Hotel;

import java.util.List;
import java.util.Optional;

public interface HotelService {

    Optional<Hotel> getHotelById(String id);
    Optional<Hotel> getHotelByName(String name);
    Optional<Hotel> createHotel(Hotel hotel);
    Optional<Hotel> updateHotel(Hotel hotel);
    List<Hotel> getAllHotels();


}

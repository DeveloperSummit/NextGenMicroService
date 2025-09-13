package com.hotel.mgmt.hotel.service.exception;

public class HotelResourceNotFound extends  RuntimeException {

    public HotelResourceNotFound(String message) {
        super(message);
    }
}

package com.hotel.mgmt.hotel.service.exception;

import com.hotel.mgmt.hotel.service.HotelServiceApplication;
import com.hotel.mgmt.hotel.service.entity.Hotel;
import com.hotel.mgmt.hotel.service.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHotelExcepationHandler {


    @ExceptionHandler(value = HotelResourceNotFound.class)
    public ResponseEntity<ApiResponse> handleException(HotelResourceNotFound hotelResourceNotFound) {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setId("#2");
        apiResponse.setMessage(hotelResourceNotFound.getMessage());
        apiResponse.setHttpStatus(HttpStatus.NOT_FOUND);
        apiResponse.setStatus(false);
        return new ResponseEntity<>(apiResponse, HttpStatus.NOT_FOUND);

    }
}

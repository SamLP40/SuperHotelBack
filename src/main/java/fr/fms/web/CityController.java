package fr.fms.web;

import fr.fms.service.HotelRoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class CityController {
    @Autowired
    HotelRoomServiceImpl hotelRoomService;

//    @GetMapping("/cities")
//    public List<Long> getAllCities() {
//        return hotelRoomService.getAllCities();
//    }
}

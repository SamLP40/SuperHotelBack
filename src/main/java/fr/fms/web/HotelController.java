package fr.fms.web;

import fr.fms.dao.HotelRepository;
import fr.fms.entities.Hotel;
import fr.fms.service.HotelRoomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@CrossOrigin("*")
@RestController
@Slf4j

public class HotelController {

    @Autowired
    HotelRoomService hotelRoomService;

    @GetMapping("/hotels")
    public List<Hotel> getHotels() { return hotelRoomService.getHotels();}

}

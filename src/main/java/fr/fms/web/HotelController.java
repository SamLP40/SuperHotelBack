package fr.fms.web;

import fr.fms.dao.HotelRepository;
import fr.fms.entities.Hotel;
import fr.fms.service.HotelRoomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Objects;

@CrossOrigin("*")
@RestController
@Slf4j
public class HotelController {

    @Autowired
    HotelRoomService hotelRoomService;

    @GetMapping("/hotels")
    public List<Hotel> getHotels() { return hotelRoomService.getHotels();}

//    @PostMapping("/hotels")
//    public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hot){
//        hot.setCity(hotelRoomService.getCity(hot.getCity().getId()));
//        Hotel hotel = hotelRoomService.saveHotel(hot);
//        if(Objects.isNull(hotel)) {
//            return ResponseEntity.noContent().build();
//        }
//        URI location =  ServletUriComponentsBuilder
//                .fromCurrentRequest()
//                .path("/{id}")
//                .buildAndExpand(hotel.getId())
//                .toUri();
//        return ResponseEntity.created(location).build();
//    }

}

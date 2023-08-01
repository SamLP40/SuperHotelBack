package fr.fms.service;

import fr.fms.dao.CityRepository;
import fr.fms.dao.HotelRepository;
import fr.fms.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelRoomServiceImpl implements HotelRoomService {
    @Autowired
    CityRepository cityRepository;
    @Autowired
    HotelRepository hotelRepository;

//    public List<Long> getAllCities() { return cityRepository.findAll()}

    @Override
    public Hotel saveHotel(Hotel hotel) {
        return null;
    }

    @Override
    public Optional<Hotel> readHotel(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteHotel() {

    }

    public List<Hotel> getHotels() { return hotelRepository.findAll();}
}

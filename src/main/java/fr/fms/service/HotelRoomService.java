package fr.fms.service;

import fr.fms.entities.Hotel;

import java.util.List;
import java.util.Optional;

public interface HotelRoomService {

    public Hotel saveHotel(Hotel hotel);
    public Optional<Hotel> readHotel(Long id);
    public void deleteHotel();
    public List<Hotel> getHotels();

}

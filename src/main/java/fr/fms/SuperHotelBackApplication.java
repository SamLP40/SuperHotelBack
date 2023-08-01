package fr.fms;

import fr.fms.dao.CityRepository;
import fr.fms.dao.HotelRepository;
import fr.fms.entities.City;
import fr.fms.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collection;

@SpringBootApplication
public class SuperHotelBackApplication implements CommandLineRunner {
	@Autowired
	HotelRepository hotelRepository;
	@Autowired
	CityRepository cityRepository;


	public static void main(String[] args) {
		SpringApplication.run(SuperHotelBackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

	private void generateData() {

//		City bali = cityRepository.save(new City(null, "Bali", "Indonésie", null));
//		hotelRepository.save(new Hotel(null, "Golden Sands Resort", "1 rue du sable", "0333343536", 3, 50, 98.90,bali));

	}
}



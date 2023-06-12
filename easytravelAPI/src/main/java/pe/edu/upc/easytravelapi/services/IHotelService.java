package pe.edu.upc.easytravelapi.services;

import org.springframework.stereotype.Service;
import pe.edu.upc.easytravelapi.entities.Hotel;
import java.util.List;


public interface IHotelService {

    public void insert (Hotel hotel);
    List<Hotel> list();

    public void delete (int idHotels);
public Hotel listId(int idHotels);
}

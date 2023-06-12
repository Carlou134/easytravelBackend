package pe.edu.upc.easytravelapi.services;

import pe.edu.upc.easytravelapi.entities.Notificacion;

import java.util.List;

public interface INotificacionService {
    public void insertar(Notificacion notificacion);
    List<Notificacion> listar();
    List<Notificacion> findInteresID(Integer id);
}

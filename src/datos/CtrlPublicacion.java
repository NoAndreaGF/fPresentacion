/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import clasesfaceboot.Publicacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author María Encinas
 */
public class CtrlPublicacion {
    
    private static final List<Publicacion> LPublicaciones = new ArrayList<>();

    public CtrlPublicacion() {
        
    }
    
    /**
     * Método que guarda una publicación
     *
     * @param publicacion publicacion a guardar
     */
    public void guardar(Publicacion publicacion) {
        LPublicaciones.add(publicacion);
    }
    
    /**
     * Método que elimina una publicación.
     *
     * @param publicacion publicacion a eliminar
     */
    public void eliminar(Publicacion publicacion) {
        LPublicaciones.remove(publicacion);
    }
    
    /**
     * Método que regresa una lista de todas las publicaciones.
     *
     * @return regresa una lista de todas las publicaciones.
     */
    public List<Publicacion> consultar() {
        return LPublicaciones;
    }
}

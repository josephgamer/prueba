package me.moovin.service;

import me.moovin.model.Poligono;

import java.io.IOException;
import java.util.List;
/*
 * @author Esteban
 * @created 24/09/2020 - 05:33 p. m.
 */
/**
 * Se crea la interfaz PoligonoService
 */
public interface PoligonoService {
    /**
     * Método que devuelve la lista de puntos de cobertura y los carga desde un archivo .json
     * para crear el poligono
     * @return lista puntos
     * @throws IOException exception
     */
    List<Poligono> findAll() throws IOException;

}

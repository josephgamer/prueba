package me.moovin.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.moovin.Constants;
import me.moovin.model.Poligono;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
/*
 * @author Esteban
 * @created 24/09/2020 - 05:37 p. m.
 */
/**
 * Se crea la clase PoligonoServiceImpl que implementa la interfaz
 */
public class PoligonoServiceImpl implements PoligonoService{
    final Logger logger = LogManager.getLogger(PoligonoServiceImpl.class);

    public PoligonoServiceImpl() {}

    /**
     * Método que devuelve la lista de puntos de cobertura y los carga desde un archivo .json
     * para crear el poligono
     * @return lista puntos
     * @throws IOException exception
     */
    @Override
    public List<Poligono> findAll() throws IOException {
        logger.debug("Obteniendo toda la lista de secuencias");

        // Library Jackson parse JSon
        List<Poligono> puntoscobertura = null;

        ObjectMapper mapper = new ObjectMapper();
        // Convert JSON string from file to Object
        puntoscobertura = Arrays.asList(mapper.readValue(new File(
                getClass().getClassLoader().getResource(Constants.FILENAME).getFile()
        ),  Poligono[].class));

        return puntoscobertura;
    }
}
package me.moovin.service;

import me.moovin.model.Point;

import java.io.IOException;
import java.util.List;
/*
 * @author Esteban
 * @created 24/09/2020 - 05:33 p. m.
 */
/**
 * Se crea la interfaz point service
 */
public interface PointService {
    /**
     * Método que verifica si un punto esta dentro de la zona de cobertura
     * @return una lista de puntos
     * @throws IOException exception
     */
    List<Point> isWithIn() throws IOException;

    /**
     * Método que guarda un punto
     * @param point tipo Point
     * @return point
     */
    Point savePoint(Point point);
}

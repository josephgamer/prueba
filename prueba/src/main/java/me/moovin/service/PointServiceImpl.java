package me.moovin.service;

/**
 * @author Esteban
 * @created 24/09/2020 - 05:36 p. m.
 */

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.LinearRing;
import com.vividsolutions.jts.geom.Polygon;
import me.moovin.model.Point;
import me.moovin.model.Poligono;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/*
 * @author Esteban
 * @created 24/09/2020 - 05:37 p. m.
 */

/**
 * Se crea la clase PointServiceImpl que implementa la interfaz
 */
public class PointServiceImpl implements PointService{
    private PoligonoService poligonoService = new PoligonoServiceImpl();
    private List<Point> points = new ArrayList<>();

    /**
     * Constructor sin parámetros
     */
    public PointServiceImpl() {}

    /**
     * Método que verifica si un punto esta dentro de la zona de cobertura
     * @return una lista de puntos
     * @throws IOException exception
     */
    @Override
    public List<Point> isWithIn() throws IOException {
        List<Poligono> secuencias = poligonoService.findAll();
        GeometryFactory geometryFactory = new GeometryFactory();
        List<Point> result = new ArrayList<>();
        int numPoints = secuencias.size();
        int index = 0;
        Coordinate[] points = new Coordinate[numPoints];
        for (Poligono poligono : secuencias) {
            points[index] = new Coordinate(poligono.getLongitude(), poligono.getLatitude());
            index++;
        }

        LinearRing linearRing = geometryFactory.createLinearRing(points);
        Polygon polygon = geometryFactory.createPolygon(linearRing,null);
        List<Point> pointList = findAllPoints();
        for (Point point : pointList) {
            Coordinate coordinate = new Coordinate(point.getLongitude() , point.getLatitude());
            com.vividsolutions.jts.geom.Point pt = geometryFactory.createPoint(coordinate);
            if (polygon.contains(pt)) {
                point.setEstaDentro(true);
            } else {
                point.setEstaDentro(false);
            }
            result.add(point);
        }
        return result;
    }

    /**
     * Método que guarda un punto
     * @param point tipo Point
     * @return point
     */
    @Override
    public Point savePoint(Point point) {
        this.points.add(point);
        return point;
    }

    /**
     * Método que devuelve todos los puntos
     * @return lista de puntos
     */
    public List<Point> findAllPoints() {
        points.add(new Point( -16.665493,-49.246870));
        points.add(new Point(-83.971468,9.897453));
        return points;
    }
}

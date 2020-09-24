package me.moovin.model;

/*
 * @author Esteban
 * @created 24/09/2020 - 05:31 p. m.
 */
/**
 * Se crea la clase Point que contiene latitude y longitude
 */
public class Point {
    private double latitude;
    private double longitude;
    private boolean estaDentro;

    /**
     * Constructor con parámetros
     * @param latitude tipo double
     * @param longitude tipo double
     */
    public Point(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.estaDentro = false;
    }

    /**
     * Constructor sin parámetros
     */
    public Point() {}

    /**
     * Retorna la latitude
     * @return double
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Modifica la latitud
     * @param latitude double
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * Devuelve la longitud
     * @return double
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Modifica la longitud
     * @param longitude double
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * Devuelve si un punto esta dentro de una zona de cobertura
     * @return boolean
     */
    public boolean isEstaDentro() {
        return estaDentro;
    }

    /**
     * Modifica el estado de un punto
     * @param estaDentro boolean
     */
    public void setEstaDentro(boolean estaDentro) {
        this.estaDentro = estaDentro;
    }

    /**
     * Devuelve la información del punto
     * @return string
     */
    @Override
    public String toString() {
        return "Point{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", estaDentro=" + estaDentro +
                '}';
    }
}

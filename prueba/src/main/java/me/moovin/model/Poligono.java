package me.moovin.model;

/*
 * @author Esteban
 * @created 24/09/2020 - 05:31 p. m.
 */
/**
 * Se crea la clase poligono con los atributos necesarios
 */
public class Poligono {
    private int secuencia;
    private double latitude;
    private double longitude;

    /**
     * Constructor sin parámetros
     */
    public Poligono() {
    }

    /**
     * Constructor con parámetros
     * @param secuencia int
     * @param latitude double
     * @param longitude double
     */
    public Poligono(int secuencia,double latitude, double longitude) {
        this.secuencia = secuencia;
        this.latitude = latitude;
        this.longitude = longitude;

    }

    /**
     * Devuelve la secuencia del poligono
     * @return int
     */
    public int getSecuencia() {
        return secuencia;
    }

    /**
     * Modifica la secuencia del poligono
     * @param secuencia int
     */
    public void setSecuencia(int secuencia) {
        this.secuencia = secuencia;
    }

    /**
     * Retorna la latitud de la zona de cobertura
     * @return double
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Modifica la latitud de la zona de cobertura
     * @param latitude double
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * Devuelve la longitud de la zona de cobertura
     * @return double
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Modifica la longitud de la zona de cobertura
     * @param longitude double
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * Devuelve la informacion del punto de la zona de cobertura
     * @return string
     */
    @Override
    public String toString() {
        return "Poligono{" +
                "secuencia=" + secuencia +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
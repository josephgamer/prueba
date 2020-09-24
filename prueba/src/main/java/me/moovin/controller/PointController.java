package me.moovin.controller;

import me.moovin.model.Point;
import me.moovin.service.PointService;
import me.moovin.service.PointServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
/*
 * @author Esteban
 * @created 24/09/2020 - 05:41 p. m.
 */
/**
 * Se crea el controller
 */

@Controller
@RequestMapping(value = "/api/points")
public class PointController {
    private PointService pointService = new PointServiceImpl();

    /**
     * Método que devuelve la lista de puntos que están dentro de
     * la zona de cobertuta
     * @return lista de puntos
     * @throws IOException exception
     */
    @GetMapping()
    @ResponseBody
    public List<Point> findAll() throws IOException {
        List<Point> pointList = null;
        pointList = pointService.isWithIn();
        return pointList;
    }

    /**
     * Método que guarda un punto
     * @param point Point
     * @return un punto
     */
    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Point savePoint(@RequestBody Point point) {
        Point result = null;
        result = pointService.savePoint(point);
        return result;
    }
}

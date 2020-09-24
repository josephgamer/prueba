package me.moovin;

/**
 * @author Esteban
 * @created 24/09/2020 - 05:27 p. m.
 */
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Collections;
@SpringBootApplication
public class BackEndServiceApplication {
    private static final Logger logger = LogManager.getLogger(BackEndServiceApplication.class);
    public static void main(String[] args) throws IOException {
        logger.info("Inicializando el Backend");
        SpringApplication app = new SpringApplication(BackEndServiceApplication.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "8083"));
        app.run(args);

    }
}

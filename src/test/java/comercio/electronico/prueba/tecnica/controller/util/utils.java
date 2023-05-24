package comercio.electronico.prueba.tecnica.controller.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class utils {

    public static <T> T convertTo(String path, Class<T> clazz) throws IOException,
            URISyntaxException {
        String jsonRequest = readJson(path);
        return new ObjectMapper().readValue(jsonRequest, clazz);
    }

    private static String readJson(String path) throws IOException,
            URISyntaxException {

        return new String(Files.readAllBytes(Paths.get(utils.class.getResource(path).toURI())));
    }
}

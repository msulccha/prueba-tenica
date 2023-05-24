package comercio.electronico.prueba.tecnica.controller;

import comercio.electronico.prueba.tecnica.dto.request.PriceRequestDTO;
import comercio.electronico.prueba.tecnica.dto.response.PriceResponseDTO;
import comercio.electronico.prueba.tecnica.service.IPricesService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.net.URISyntaxException;
import java.time.LocalDateTime;

import static comercio.electronico.prueba.tecnica.controller.util.utils.convertTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PricesControllerTest {

    @InjectMocks
    private PricesController controller;
    @Mock
    IPricesService service;


    @Test
    @DisplayName("Prueba para las 10am del dia 14 del producto 35455 para la brand 1")
    void returnPriceResponseDTOWhenTimeOfDayIs10AM() throws IOException, URISyntaxException {

        PriceResponseDTO priceResponseDTO = convertTo("/mock/responsePrueba10am.json",
               PriceResponseDTO.class);

        PriceRequestDTO priceRequestDTO = convertTo("/mock/prueba10am.json",
                PriceRequestDTO.class);

        when(service.checkingPrices(priceRequestDTO)).thenReturn(
                priceResponseDTO);

        assertAll();

    }
}
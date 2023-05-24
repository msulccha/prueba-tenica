package comercio.electronico.prueba.tecnica.controller;

import comercio.electronico.prueba.tecnica.dto.response.PriceResponseDTO;
import comercio.electronico.prueba.tecnica.service.PricesService;
import comercio.electronico.prueba.tecnica.dto.request.PriceRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
@Slf4j
@RestController
@RequestMapping("/prices")
public class PricesController {
    private final PricesService pricesService;


    public PricesController(PricesService pricesService) {
        this.pricesService = pricesService;
    }

    @PostMapping("/cheking")
    public PriceResponseDTO checkingPrices(@RequestBody PriceRequestDTO priceRequestDTO){
        log.info("con fe sale");
        return this.pricesService.checkingPrices(priceRequestDTO);
    }

}


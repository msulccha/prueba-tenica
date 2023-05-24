package comercio.electronico.prueba.tecnica.service;

import comercio.electronico.prueba.tecnica.dto.response.PriceResponseDTO;
import comercio.electronico.prueba.tecnica.mapper.PriceRequestDTOToPrices;
import comercio.electronico.prueba.tecnica.mapper.PricesToPricesResponseDTO;
import comercio.electronico.prueba.tecnica.persistence.Entity.PricesEntity;
import comercio.electronico.prueba.tecnica.persistence.Repository.PricesRepository;
import comercio.electronico.prueba.tecnica.dto.request.PriceRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class PricesService {

    private final PricesRepository pricesRepository;
    private final PriceRequestDTOToPrices mapperRequest;
    private final PricesToPricesResponseDTO mapperResponse;

    public PricesService(PricesRepository pricesRepository, PriceRequestDTOToPrices mapperRequest, PricesToPricesResponseDTO mapperResponse) {
        this.pricesRepository = pricesRepository;
        this.mapperRequest = mapperRequest;
        this.mapperResponse = mapperResponse;
    }
    public PriceResponseDTO checkingPrices(PriceRequestDTO priceRequestDTO){
        log.info("service");
        PricesEntity pricesEntity = this.pricesRepository.findPrices(priceRequestDTO.getBrand_id(),priceRequestDTO.getStart_date(), priceRequestDTO.getProduct_id()).get();
        PriceResponseDTO priceResponseDTO = mapperResponse.map(pricesEntity);
        return priceResponseDTO;
    }
}

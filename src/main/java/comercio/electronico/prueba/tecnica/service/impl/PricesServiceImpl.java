package comercio.electronico.prueba.tecnica.service.impl;

import comercio.electronico.prueba.tecnica.dto.response.PriceResponseDTO;
import comercio.electronico.prueba.tecnica.mapper.PriceRequestDTOToPrices;
import comercio.electronico.prueba.tecnica.mapper.PricesToPricesResponseDTO;
import comercio.electronico.prueba.tecnica.repository.entity.PricesEntity;
import comercio.electronico.prueba.tecnica.repository.contract.PricesRepository;
import comercio.electronico.prueba.tecnica.dto.request.PriceRequestDTO;
import comercio.electronico.prueba.tecnica.service.IPricesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class PricesServiceImpl implements IPricesService {

    private final PricesRepository pricesRepository;
    private final PriceRequestDTOToPrices mapperRequest;
    private final PricesToPricesResponseDTO mapperResponse;

    public PricesServiceImpl(PricesRepository pricesRepository, PriceRequestDTOToPrices mapperRequest, PricesToPricesResponseDTO mapperResponse) {
        this.pricesRepository = pricesRepository;
        this.mapperRequest = mapperRequest;
        this.mapperResponse = mapperResponse;
    }
    public PriceResponseDTO checkingPrices(PriceRequestDTO priceRequestDTO){
        PricesEntity pricesEntity = this.pricesRepository.findByBrandIdAndStartDateAndProductId(priceRequestDTO.getBrandId(),priceRequestDTO.getStartDate(), priceRequestDTO.getProductId()).get();
        PriceResponseDTO priceResponseDTO = mapperResponse.map(pricesEntity);
        return priceResponseDTO;
    }
}

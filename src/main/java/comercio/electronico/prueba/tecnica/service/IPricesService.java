package comercio.electronico.prueba.tecnica.service;

import comercio.electronico.prueba.tecnica.dto.request.PriceRequestDTO;
import comercio.electronico.prueba.tecnica.dto.response.PriceResponseDTO;

public interface IPricesService {
    public PriceResponseDTO checkingPrices(PriceRequestDTO priceRequestDTO);
}

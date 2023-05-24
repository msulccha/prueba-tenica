package comercio.electronico.prueba.tecnica.mapper;

import comercio.electronico.prueba.tecnica.dto.response.PriceResponseDTO;
import comercio.electronico.prueba.tecnica.persistence.Entity.PricesEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class PricesToPricesResponseDTO implements Mapper<PricesEntity, PriceResponseDTO>{


    @Override
    public PriceResponseDTO map(PricesEntity in) {
        PriceResponseDTO priceResponseDTO = PriceResponseDTO.builder()
                .price(in.getPrice())
                .price_list(in.getPriceList())
                .start_date(LocalDateTime.now())
                .end_date(LocalDateTime.now().plusMonths(4))
                .product_id(in.getProductId())
                .brand_id(in.getBrandId())
                .build();

        return priceResponseDTO;
    }
}

package comercio.electronico.prueba.tecnica.mapper;

import comercio.electronico.prueba.tecnica.repository.entity.PricesEntity;
import comercio.electronico.prueba.tecnica.dto.request.PriceRequestDTO;
import org.springframework.stereotype.Component;

@Component
public class PriceRequestDTOToPrices implements Mapper<PriceRequestDTO, PricesEntity>{

    @Override
    public PricesEntity map(PriceRequestDTO in) {

        PricesEntity pricesEntity = PricesEntity.builder()
                .brandId(in.getBrandId())
                .startDate(in.getStartDate())
                .productId(in.getProductId())
                .build();

        return pricesEntity;
    }
}

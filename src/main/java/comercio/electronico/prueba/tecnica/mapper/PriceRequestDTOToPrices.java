package comercio.electronico.prueba.tecnica.mapper;

import comercio.electronico.prueba.tecnica.persistence.Entity.PricesEntity;
import comercio.electronico.prueba.tecnica.dto.request.PriceRequestDTO;
import org.springframework.stereotype.Component;

@Component
public class PriceRequestDTOToPrices implements Mapper<PriceRequestDTO, PricesEntity>{

    @Override
    public PricesEntity map(PriceRequestDTO in) {
        PricesEntity pricesEntity = new PricesEntity();
        pricesEntity.setBrandId(in.getBrand_id());
        pricesEntity.setStartDate(in.getStart_date());
        pricesEntity.setProductId(in.getProduct_id());

        return pricesEntity;
    }
}

package comercio.electronico.prueba.tecnica.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceRequestDTO {
    private String brandId;
    private LocalDateTime startDate;
    private String productId;
}

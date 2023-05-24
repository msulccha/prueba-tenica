package comercio.electronico.prueba.tecnica.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceRequestDTO {
    private String brand_id;
    private LocalDateTime start_date;
    private String product_id;
}

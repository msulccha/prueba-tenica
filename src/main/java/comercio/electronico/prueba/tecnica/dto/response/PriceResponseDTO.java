package comercio.electronico.prueba.tecnica.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PriceResponseDTO {

    private String brand_id;
    private LocalDateTime start_date;
    private LocalDateTime end_date;
    private String product_id;
    private String price_list;
    private String price;
    private String curr;
}

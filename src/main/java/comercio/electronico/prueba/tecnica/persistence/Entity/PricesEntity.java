package comercio.electronico.prueba.tecnica.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Prices")
public class PricesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "ID")
    private Long id;
    @Column(name = "BRAND_ID")
    private String brandId;
    @Column(name = "START_DATE")
    private LocalDateTime startDate;
    @Column(name = "END_DATE")
    private LocalDateTime endDate;
    @Column(name = "PRICE_LIST")
    private String priceList;
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Column(name = "PRIORITY")
    private String priority;
    @Column(name = "PRICE")
    private String price;
    @Column(name = "CURR")
    private String curr;


}

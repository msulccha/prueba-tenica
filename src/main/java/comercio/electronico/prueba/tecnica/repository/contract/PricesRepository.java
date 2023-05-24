package comercio.electronico.prueba.tecnica.repository.contract;

import comercio.electronico.prueba.tecnica.repository.entity.PricesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.Optional;


public interface PricesRepository extends JpaRepository<PricesEntity, Long> {

//    @Query(value = "SELECT * "
//            + "FROM Prices "
//            + "WHERE BRAND_ID = :brandId "
//            + "AND START_DATE = :startDate "
//            + "AND PRODUCT_ID = :productId "
//            , nativeQuery = true)
//    Optional<PricesEntity> findPrices(
//            @Param("brandId") String brandId,
//            @Param("startDate") LocalDateTime startDate,
//            @Param("productId") String productId);

    Optional<PricesEntity> findByBrandIdAndStartDateAndProductId(
            String brandId,
            LocalDateTime startDate,
            String productId
    );

}

package com.dashboard.sales.repositories;

import com.dashboard.sales.dto.SaleSumDTO;
import com.dashboard.sales.entities.Sale;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SaleRepository extends JpaRepository<Sale, Long> {
  @Query(
    "SELECT new com.dashboard.sales.dto.SaleSumDTO(obj.seller, SUM(obj.amount))" +
    " FROM Sale as obj GROUP BY obj.seller"
  )
  List<SaleSumDTO> amountGroupedBySeller();
}

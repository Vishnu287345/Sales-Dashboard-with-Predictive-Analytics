package com.dashboard.sales.repositories;

import com.dashboard.sales.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {}

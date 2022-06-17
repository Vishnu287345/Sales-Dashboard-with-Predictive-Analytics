package com.dashboard.sales.repositories;

import com.dashboard.sales.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {}

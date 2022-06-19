package com.dashboard.sales.services;

import com.dashboard.sales.dto.SaleDTO;
import com.dashboard.sales.dto.SaleSumDTO;
import com.dashboard.sales.entities.Sale;
import com.dashboard.sales.repositories.SaleRepository;
import com.dashboard.sales.repositories.SellerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {
  @Autowired
  private SaleRepository repository;

  @Autowired
  private SellerRepository sellerRepository;

  @Transactional(readOnly = true) // Avoid locking the database
  public Page<SaleDTO> findAll(Pageable pageable) {
    sellerRepository.findAll(); //Prevents too many database accesses
    Page<Sale> result = repository.findAll(pageable);
    return result.map(x -> new SaleDTO(x));
  }

  @Transactional(readOnly = true)
  public List<SaleSumDTO> amountGroupedBySeller() {
    return repository.amountGroupedBySeller();
  }
}

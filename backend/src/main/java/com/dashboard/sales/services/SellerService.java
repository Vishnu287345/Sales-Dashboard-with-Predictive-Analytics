package com.dashboard.sales.services;

import com.dashboard.sales.dto.SellerDTO;
import com.dashboard.sales.entities.Seller;
import com.dashboard.sales.repositories.SellerRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
  @Autowired
  private SellerRepository repository;

  public List<SellerDTO> findAll() {
    List<Seller> result = repository.findAll();
    return result
      .stream()
      .map(x -> new SellerDTO(x))
      .collect(Collectors.toList());
  }
}

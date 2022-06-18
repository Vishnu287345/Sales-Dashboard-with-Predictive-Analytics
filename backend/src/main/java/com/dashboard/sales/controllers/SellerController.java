package com.dashboard.sales.controllers;

import com.dashboard.sales.dto.SellerDTO;
import com.dashboard.sales.services.SellerService;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {
  @Autowired
  private SellerService service;

  @GetMapping
  @Operation(
    summary = "Sellers list",
    description = "Paged list of all sellers",
    tags = { "Sellers" }
  )
  public ResponseEntity<List<SellerDTO>> findAll() {
    List<SellerDTO> list = service.findAll();
    return ResponseEntity.ok(list);
  }
}

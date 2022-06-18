package com.dashboard.sales.controllers;

import com.dashboard.sales.dto.SaleDTO;
import com.dashboard.sales.services.SaleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
  @Autowired
  private SaleService service;

  @GetMapping
  @Operation(
    summary = "Sales list",
    description = "Paged list of all sales",
    tags = { "Sales" }
  )
  @Parameter(
    in = ParameterIn.QUERY,
    description = "Zero-based page index (0..N)",
    name = "page",
    content = @Content(schema = @Schema(type = "integer", defaultValue = "0"))
  )
  @Parameter(
    in = ParameterIn.QUERY,
    description = "The size of the page to be returned",
    name = "size",
    content = @Content(schema = @Schema(type = "integer", defaultValue = "10"))
  )
  @Parameter(
    in = ParameterIn.QUERY,
    description = "Sorting criteria in the format: property(asc|desc). " +
    "Default sort order is ascending date. " +
    "Multiple sort criteria are supported: seller.name,amount,desc",
    name = "sort",
    content = @Content(schema = @Schema(type = "string", defaultValue = "date"))
  )
  public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
    Page<SaleDTO> page = service.findAll(pageable);
    return ResponseEntity.ok(page);
  }
}

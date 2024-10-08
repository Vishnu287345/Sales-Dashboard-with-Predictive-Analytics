package com.dashboard.sales.dto;

import com.dashboard.sales.entities.Seller;
import java.io.Serializable;

public class SaleSuccessDTO implements Serializable {
  private static final long serialVersionUID = 1L;
  private String sellerName;
  private Long visited;
  private Long deals;

  public SaleSuccessDTO() {}

  public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
    sellerName = seller.getName();
    this.visited = visited;
    this.deals = deals;
  }

  public String getSellerName() {
    return this.sellerName;
  }

  public void setSellerName(String sellerName) {
    this.sellerName = sellerName;
  }

  public Long getVisited() {
    return this.visited;
  }

  public void setVisited(Long visited) {
    this.visited = visited;
  }

  public Long getDeals() {
    return this.deals;
  }

  public void setDeals(Long deals) {
    this.deals = deals;
  }
}

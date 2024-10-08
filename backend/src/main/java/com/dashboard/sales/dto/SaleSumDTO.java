package com.dashboard.sales.dto;

import com.dashboard.sales.entities.Seller;
import java.io.Serializable;

public class SaleSumDTO implements Serializable {
  private static final long serialVersionUID = 1L;
  private String sellerName;
  private Double sum;

  public SaleSumDTO() {}

  public SaleSumDTO(Seller seller, Double sum) {
    this.sellerName = seller.getName();
    this.sum = sum;
  }

  public String getSellerName() {
    return this.sellerName;
  }

  public void setSellerName(String sellerName) {
    this.sellerName = sellerName;
  }

  public Double getSum() {
    return this.sum;
  }

  public void setSum(Double sum) {
    this.sum = sum;
  }
}

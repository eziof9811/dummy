package com.example.productservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(schema = "product_details")
public class Product {

    @Id
   @GeneratedValue
   @Column(name = "product_id")
    private long proId;
    private String proName;
    private String proDescription;
    private double proStock;
    private double proQuantity;
    private double proPrice;
    private String imageUrl;

    public Product() {
    }

    public Product(long proId, String proName, String proDescription, double proStock, double proQuantity, double proPrice, String imageUrl) {
        this.proId = proId;
        this.proName = proName;
        this.proDescription = proDescription;
        this.proStock = proStock;
        this.proQuantity = proQuantity;
        this.proPrice = proPrice;
        this.imageUrl = imageUrl;
    }

    public long getProId() {
        return proId;
    }

    public void setProId(long proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProDescription() {
        return proDescription;
    }

    public void setProDescription(String proDescription) {
        this.proDescription = proDescription;
    }

    public double getProStock() {
        return proStock;
    }

    public void setProStock(double proStock) {
        this.proStock = proStock;
    }

    public double getProQuantity() {
        return proQuantity;
    }

    public void setProQuantity(double proQuantity) {
        this.proQuantity = proQuantity;
    }

    public double getProPrice() {
        return proPrice;
    }

    public void setProPrice(double proPrice) {
        this.proPrice = proPrice;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId=" + proId +
                ", proName='" + proName + '\'' +              
                ", proDescription='" + proDescription + '\'' +
                ", proStock=" + proStock +
                ", proQuantity=" + proQuantity +
                ", proPrice=" + proPrice +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product )) return false;
        return getProId() == getProId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProId());
    }
}

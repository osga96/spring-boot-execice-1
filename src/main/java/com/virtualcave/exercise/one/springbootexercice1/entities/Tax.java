package com.virtualcave.exercise.one.springbootexercice1.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T_RATES")
public class Tax {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private Integer brand_id;
    private Integer product_id;
    private Date start_date;
    private Date end_date;
    private Integer price;
    private String currency_code;

    public Tax() {
    }

    public Tax(Integer brand_id, Integer product_id, Date start_date, Date end_date, Integer price, String currency_code) {
        this.brand_id = brand_id;
        this.product_id = product_id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.price = price;
        this.currency_code = currency_code;
    }

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }
}

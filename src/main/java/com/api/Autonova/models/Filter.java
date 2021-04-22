package com.api.Autonova.models;

import com.api.Autonova.utils.Constants;

public class Filter {
    private String token;
    private String language = Constants.LANGUAGE_UA;
    private String code;
    private String name;
    private String category;
    private String manufacturer;
    private String amount;
    private String priceFrom;
    private String priceTo;
    private int page = 1;
    private int limit = 9;
    private String order = "name";
    private String sort = Constants.SORT_VECTOR_ASC;


    public int getLimit() {
        return limit;
    }

    public String getAmount() {
        return amount;
    }

    public int getPage() {
        return page;
    }

    public String getCategory() {
        return category;
    }

    public String getCode() {
        return code;
    }

    public String getLanguage() {
        return language;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }

    public String getOrder() {
        return order;
    }

    public String getPriceFrom() {
        return priceFrom;
    }

    public String getPriceTo() {
        return priceTo;
    }

    public String getSort() {
        return sort;
    }

    public String getToken() {
        return token;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setPriceFrom(String priceFrom) {
        this.priceFrom = priceFrom;
    }

    public void setPriceTo(String priceTo) {
        this.priceTo = priceTo;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
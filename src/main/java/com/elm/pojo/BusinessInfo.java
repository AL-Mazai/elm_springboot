package com.elm.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class BusinessInfo implements Serializable {

    private Integer businessId;

    private String name;

    private Double starPrice;

    private Double deliveryPrice;

    private String businessExplain;

    private String logoUrl;

    private Integer other;
}
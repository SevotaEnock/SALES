package com.sales.sales.SERVICES;

import com.sales.sales.ENTITY.SALES;

import java.util.List;

public interface SERVICES {
    SALES creatSales(SALES sales);

    SALES getSALESById(Long salesId);

    List<SALES> getAllSALES();

    SALES updateUser(SALES  sales);

    void deleteSALES(Long salesId);
}

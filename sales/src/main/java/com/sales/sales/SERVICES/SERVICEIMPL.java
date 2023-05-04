package com.sales.sales.SERVICES;

import com.sales.sales.ENTITY.SALES;
import com.sales.sales.REPOSITORY.SALESREPOSITORY;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor

public class SERVICEIMPL implements SERVICES{
    private SALESREPOSITORY salesrepository;
    @Override
    public SALES creatSales(SALES sales) {
        return salesrepository.save(sales);
    }

    @Override
    public SALES getSALESById(Long salesId) {
        Optional<SALES> optionalSALES = salesrepository.findById(salesId);
        return optionalSALES.get();
    }

    @Override
    public List<SALES> getAllSALES() {
        return salesrepository.findAll();
    }

    @Override
    public SALES updateUser(SALES sales) {


    }

    @Override
    public void deleteSALES(Long salesId) {
       salesrepository.deleteById(salesId);

    }
}

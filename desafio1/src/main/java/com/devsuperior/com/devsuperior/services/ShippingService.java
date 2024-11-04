package com.devsuperior.com.devsuperior.services;


import com.devsuperior.com.devsuperior.entities.Orders;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Orders order){
        double shipValue=0;
        if (order.getBasic()<= 100){
            shipValue = 20;
        } else if (order.getBasic()>100 && order.getBasic()<=200) {
            shipValue = 12;
        } else if (order.getBasic()>200) {
            shipValue = 0;
        }
        return shipValue;
    }
}

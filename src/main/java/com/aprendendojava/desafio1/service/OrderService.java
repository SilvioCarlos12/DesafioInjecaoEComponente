package com.aprendendojava.desafio1.service;

import com.aprendendojava.desafio1.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order){

        double frete = shippingService.shipment(order);

        double discontoEmPorcentagem = order.getDiscount()/100;

        double valorDoDesconto = order.getBasic()*discontoEmPorcentagem;

        return order.getBasic() - valorDoDesconto  + frete;
    }
}
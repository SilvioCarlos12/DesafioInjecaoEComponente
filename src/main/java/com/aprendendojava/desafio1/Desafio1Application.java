package com.aprendendojava.desafio1;

import com.aprendendojava.desafio1.model.Order;
import com.aprendendojava.desafio1.service.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {
	private final OrderService orderService;

    public Desafio1Application(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1309,95.90,0);
		double valorTotal = orderService.total(order);
		System.out.println("Pedido código "+order.getCode());
		System.out.println("Valor total: "+valorTotal);
	}
}
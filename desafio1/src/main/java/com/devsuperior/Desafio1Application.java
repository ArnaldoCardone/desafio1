package com.devsuperior;

import com.devsuperior.com.devsuperior.entities.Orders;
import com.devsuperior.com.devsuperior.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Autowired
	private OrderService orderService;

	@Override
	public void run(String... args) throws Exception {
		Orders order1 = new Orders(1034, 150,20);
		System.out.println("Pedido código: " + order1.getCode() + " Valor total: " + orderService.total(order1));

		Orders order2 = new Orders(2282, 800,10);
		System.out.println("Pedido código: " + order2.getCode() + " Valor total: " + orderService.total(order2));

		Orders order3 = new Orders(1309, 95.9,0);
		System.out.println("Pedido código: " + order3.getCode() + " Valor total: " + orderService.total(order3));

	}
}

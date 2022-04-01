package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
//@SpringBootApplication
public class MySqlTest implements CommandLineRunner {

	@Autowired
	private BookRepositary repository;

	@Override
	public void run(String... args) {

		System.out.println("StartApplication...");

		repository.save(new Book("Angular"));
		repository.save(new Book("Node"));
		repository.save(new Book("Python"));
//		repository.
//
//		System.out.println("\nfindAll()");
//		repository.findAll().forEach(x -> System.out.println(x));
//
//		System.out.println("\nfindById(1L)");
//		repository.findById(1l).ifPresent(x -> System.out.println(x));

		System.out.println("\nfindByName('Node')");
		repository.findAll().forEach(x -> System.out.println("node name -->" + x));
	}
}

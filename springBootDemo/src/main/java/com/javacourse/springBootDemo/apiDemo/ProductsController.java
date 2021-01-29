package com.javacourse.springBootDemo.apiDemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class ProductsController {
//http://jsonplaceholder.typicode.com/
	@GetMapping("/")
	public String  get() {
		return "Laptop";
	}
	@GetMapping("/products")
	public String  get2() {
		return "Laptop 2";
	}
}

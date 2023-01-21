package com.javatutorials.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class ProductFactory {

	List<Product> listProduct = new ArrayList<Product>();
	int capacity = 100;

	public void produce() throws InterruptedException {

		while (true) {
			Product product = new Product("Product-A");
			synchronized (this) {
				while (listProduct.size() == capacity) {
					wait();
				}
				System.out.println("adding product "
						+ ":" + product.getName() + 
						" size of list is " + listProduct.size());
				listProduct.add(product); // Critical Section
				notify();
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				while (listProduct.size() == 0) {
					wait();
				}
				Product product = listProduct.remove(0); // Critical Section
				System.out.println("removing product "
						+ ":" + product.getName() + 
						" size of list is " + listProduct.size());
				notify();
			}
		}
	}
}

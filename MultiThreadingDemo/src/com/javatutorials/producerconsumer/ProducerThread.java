package com.javatutorials.producerconsumer;

public class ProducerThread implements Runnable {

	private ProductFactory productFactory;
	
	
	public ProducerThread(ProductFactory productFactory) {
		this.productFactory = productFactory;
	}



	@Override
	public void run() {		
		try {
			productFactory.produce();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

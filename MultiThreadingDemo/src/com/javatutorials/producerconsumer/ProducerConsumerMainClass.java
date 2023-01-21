package com.javatutorials.producerconsumer;

public class ProducerConsumerMainClass {

	public static void main(String[] args) {

		ProductFactory productFactory = new ProductFactory();
		Thread producerThread = new Thread(new 
				ProducerThread(productFactory));
		
		Thread producerThread1 = new Thread(new 
				ProducerThread(productFactory));
		
		Thread producerThread2 = new Thread(new 
				ProducerThread(productFactory));

		Thread consumerThread = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					productFactory.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		producerThread.start();
		producerThread1.start();
		producerThread2.start();
		consumerThread.start();
	}
}

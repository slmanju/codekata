package com.slmanju.globalcounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@SpringBootApplication
public class GlobalCounterApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GlobalCounterApplication.class, args);
	}

	@Autowired
	private SequenceGenerator sequenceGenerator;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("+++++++++ START ++++");

		TimeLogger.log(() -> sequenceGenerator.findNext());
		TimeLogger.log(() -> sequenceGenerator.findNext());
		TimeLogger.log(() -> sequenceGenerator.findNext());
//		TimeLogger.log(() -> counterService.findNext());
//		TimeLogger.log(() -> counterService.findNext());

//		ExecutorService executorService = Executors.newFixedThreadPool(1000);
//		ExecutorService executorService = Executors.newCachedThreadPool();

//		List<Callable<Object>> callables = new ArrayList<>();
//
//		for (int i = 0; i < 15000; i++) {
//			int finalI = i;
//			callables.add(() -> {
//				long start = System.currentTimeMillis();
//				long count = sequenceGenerator.findNext();
//				//System.out.println("Time taken for " + finalI + " is " + (System.currentTimeMillis() - start));
//				return count;
//			});
//		}
//
//		TimeLogger.log(() -> {
//			executorService.invokeAll(callables);
//			return -1;
//		});
//		TimeLogger.log(() -> {
//			executorService.invokeAll(callables);
//			return -1;
//		});
//		TimeLogger.log(() -> {
//			executorService.invokeAll(callables);
//			return -1;
//		});

//		executorService.shutdown();

		System.out.println("++++++++ DONE +++++++");
	}
}

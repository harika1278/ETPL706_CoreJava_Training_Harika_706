package com.evergent.Corejava.Collections.Concurrent.harika;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
// asynchronous communicatin 
//public interface ExecutorService extends Executor (from JDK 1.5)
// Executor having one method execute()
public class ExecutorDemo1 {
	public static void main(String[] args) {
	                                 //here only sigle thread 
		ExecutorService exservice=Executors.newSingleThreadExecutor();
		 for(int i=0;i<5;i++) {
			 exservice.execute(new Myclass("Thread"+i));
		 }		 
        exservice.shutdown();
        System.out.println("All Threads executons completed");
	}       
}
class Myclass implements Runnable{
	final String task;
	
	public Myclass(String task) {
		this.task=task;
	}	
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
	System.out.println("Executing :"+task+"  from "+Thread.currentThread().getName());
		}		
	}
	
}






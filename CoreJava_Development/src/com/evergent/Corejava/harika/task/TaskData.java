package com.evergent.Corejava.harika.task;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

public class TaskData {

	public static void main(String[] args) {
		List<Task> list=new ArrayList<Task>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee details");
		for(int i=0;i<3;i++){
			Task obj=new Task();
			System.out.println("Enter the id");
			obj.settaskId(sc.nextInt());
			System.out.println("Enter the name");
			obj.settaskName(sc.next());
			System.out.println("Enter the status");
			obj.settaskStatus(sc.next());
			list.add(obj); 		
			}		 
	
		Iterator<Task> obj=list.iterator();
		while(obj.hasNext()){
			System.out.println("Iterator order");
			Task ob=obj.next();
			System.out.println(ob.gettaskId()+ " "+ ob.gettaskName()+ " "+ob.gettaskStatus());


	}

}
}

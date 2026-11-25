package genericslab;

import java.util.ArrayDeque;
		import java.util.Queue;
		
public class QueueExample {

	public static void main(String[] args) {
		
		 
		        Queue<String> printJobs = new ArrayDeque<>();
		 
		        printJobs.offer("Essay");
		        printJobs.offer("Report");
		        printJobs.offer("Resume");
		 
		        System.out.println("Waiting: " + printJobs);
		        System.out.println("Next job: " + printJobs.peek());
		        System.out.println("Printing: " + printJobs.poll());
		        System.out.println("Still waiting: " + printJobs);
		        
		        printJobs.offer("Lab Notes");
		        System.out.println("Printing: " + printJobs.poll());
		        System.out.println("Remaining queue: " + printJobs);
		    }
		
	}


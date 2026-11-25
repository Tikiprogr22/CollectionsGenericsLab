package genericslab;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		
		HashMap<String, Integer> scores = new HashMap<>();
		
		scores.put("Maya", 90);
		scores.put("Jordan", 85);
		
		System.out.println("Scores: " + scores);
		System.out.println("Maya's score: " + scores.get("Maya"));
		
		scores.put("Maya", 95);
		System.out.println("Update scores: " + scores);
		
		scores.put("La'Tysha", 98);
		System.out.println("La'Tysha's score: " + scores.get("La'Tysha"));
	}

}

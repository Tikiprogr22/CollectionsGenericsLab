package genericslab;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {
		HashSet<String> languages = new HashSet<>();
		
		languages.add("Java");
		languages.add("Python");
		languages.add("Java");
		languages.add("JavaScript");
		languages.add("Python");
		
		System.out.println("Languages: " + languages);
		System.out.println("Total languages: " + languages.size());
		System.out.println("Contains Java? " + languages.contains("Java"));
	}

}

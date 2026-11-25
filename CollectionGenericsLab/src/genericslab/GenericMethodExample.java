package genericslab;

public class GenericMethodExample {

		public static <T> void displayItems(T[] items) {
	        for (T item : items) {
	            System.out.println(item);
	        }
	    }
	 
	    public static void main(String[] args) {
	        String[] names = {"Maya", "Jordan"};
	        Integer[] numbers = {10, 20, 30};
	 
	        System.out.println("Names:");
	        displayItems(names);
	 
	        System.out.println("Numbers:");
	        displayItems(numbers);
	        
	        Double[] prices = {43.75, 128.49, 267.95};
	        System.out.println("Prices:");
	        displayItems(prices);
	}

}

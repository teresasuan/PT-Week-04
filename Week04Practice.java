package Week04Package;
import java.util.Set;
import java.util.HashSet;
import java.io.*;
import java.util.*;

public class Week04Practice {

	public static void main(String[] args) {

		Set<String> vegetables = new HashSet<String>();

		vegetables.add("Carrot");
		//System.out.println(vegetables);

		vegetables.add(null);
		//System.out.println(vegetables);

		vegetables.add(null);
		//System.out.println(vegetables);

		//System.out.println("The size of our set is: " + vegetables.size());
		
		Scanner in = new Scanner(System.in);
		int indexVal = in.nextInt();
		List<String> productList = new ArrayList<>(); 
		
		productList.add("Macbook");
		productList.add("HP Notebook");
		productList.add("iPhone 14");
		productList.add("Acer Aspire");
		productList.add("Windows Surface");
		productList.add("Galaxy S23");
	/***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/
	    
    if(indexVal >= 0 && indexVal < productList.size()) {
        //System.out.println(productList(indexVal));
    	System.out.println(productList.get(indexVal));
         } else {  
             System.out.println("No product can be found with that product number.");
		
	}
	}

}

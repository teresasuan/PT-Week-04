package Week04Package;

import java.io.*;
import java.util.*;

public class Week04MorePractice1 {

	static void wordReplace(List<String> tenWords, int num1, int num2, int num3) {
		
	List<String> threeWords = new ArrayList<String>();

    if((num1>=0 && num1<=9) && (num2>=0 && num2<=9) && (num3>=0 && num3<=9)) {

        threeWords.add(tenWords.get(num1));
        threeWords.add(tenWords.get(num2));
        threeWords.add(tenWords.get(num3));

        System.out.println(threeWords);

    } else {
        
        System.out.println("Sorry, there was an error getting a number you requested.");
    
    }
    

	/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		
		List<String> tenWords = new ArrayList<String>();
		tenWords.add("Bumfuzzle");
		tenWords.add("Cattywampus");
		tenWords.add("Widdershins");
		tenWords.add("Gubbins");
		tenWords.add("Lollygag");
		tenWords.add("Malarkey");
		tenWords.add("Wabbit");
		tenWords.add("Impignorate");
		tenWords.add("Yarborough");
		tenWords.add("Bloviate");
		
		wordReplace(tenWords, num1, num2, num3);
		
	}
}
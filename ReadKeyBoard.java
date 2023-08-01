import java.util.*;

public class ReadKeyBoard
{
public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number");
		int x = in.nextInt();
		System.out.println(x);
		// print and move the cursor to the next line 
		// Scanner class is present inside the util package 
		// if we dont import it then error will come 
		// Error: cannot find symbol
		System.out.println("enter a Float");
		float y = in.nextFloat();
		System.out.println(y);
		// String example 
		String word;
		System.out.println("enter a word");
		word = in.next();
		System.out.println(word);
		
		// String line example 
		String line;
		System.out.println("enter a sentence");
		
		in.nextLine(); // trick 
		// reason - searching 
		// consumes the rest of the  new line 
		line = in.nextLine();
		System.out.println(line);
		
		
		
		
		
	
	}
}

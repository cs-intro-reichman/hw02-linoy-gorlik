/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		
            String input = args[0];
    
            String reversed = new StringBuilder(input).reverse().toString();
            System.out.println(reversed);
    
            int middleIndex = input.length() / 2;
            char middle = input.charAt(middleIndex);
            System.out.println("The middle character is " + middle);
        }
    }
    
    
    


	


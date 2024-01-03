/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		
            String input = args[0];

            String s = "";
            for (int i = input.length() - 1; i >= 0; i--){
                s = s + input.charAt(i);
            }
            System.out.println(s);
            // if (input.length() % 2 == 0)
            // { int middleIndex = input.length() / 2;
            // char middle = input.charAt(middleIndex);
            // System.out.println("The middle character is " + middle);}
            // else {
            int middleIndex = ((input.length() + 1) / 2) -1;
            char middle = input.charAt(middleIndex);
            System.out.println("The middle character is " + middle);
         
    } }
    
    
    


	


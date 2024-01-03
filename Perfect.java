/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		
            int number = Integer.parseInt(args[0]);

            String a = number +" is a perfect number since " + number + " = 1";
        
            int sum = 1; 
             for ( int i = 2; i < number - 1; i++)

             if (number%i == 0) {
                a = a + " + " + i;
                sum = sum + i;
            }
if (sum == number) {
    System.out.println(a);
        }
    else {
        System.out.println(number + " is not a perfect number");

    } } }

        
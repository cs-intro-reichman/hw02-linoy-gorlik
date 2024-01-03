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

        //         for (int i = 1; i <= number; i++) {
        //             if (number % i == 0) {
        //                 sum += i;
        //             }
        //         }
        //         String bla = "";  
        //             for (int i = 1; i <= number; i++) {
        //                 if (number % i == 0) {
        //                     bla += " + " + i ; 
        //                 }
        //             }
        //         System.out.print(sum);
        //         if (sum == number) {
        //             System.out.print(number+" is a perfect number since " + bla);
        //         } else {
        //             System.out.printf("%d is not a perfect number%n", number);
        //         }
        //     }
        //  }


		


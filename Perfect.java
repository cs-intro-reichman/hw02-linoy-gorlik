/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		
            int number = Integer.parseInt(args[0]);

                int sum = 1; 

                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        sum += i;
                    }
                }

                if (sum == number) {
                    System.out.printf("%d is a perfect number since %s%n", number, getDivisorsString(number));
                } else {
                    System.out.printf("%d is not a perfect number%n", number);
                }
            }
        
    public static String getDivisorsString(int num) {
        StringBuilder divisors = new StringBuilder("= 1");
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                divisors.append(" + ").append(i);
            }
        }
        return divisors.toString();
	} }


		


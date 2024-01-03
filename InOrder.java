import java.util.Random;

/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {

        Random random = new Random();
        int prevValue = -1;

        while (true) {
            int currentValue = random.nextInt(10);

            if (currentValue >= prevValue) {
                System.out.print(currentValue + " ");
                prevValue = currentValue;
            } else {
                break;
            }
        }

        System.out.println();
    }
}



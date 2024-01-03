/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
 
		import java.util.Random;
public class OneOfEachStats1 { 
	public static void main (String[] args) {
 
    
        int T = Integer.parseInt(args[0]);

        double totalChildren = 0;
        int familiesWith2Children = 0;
        int familiesWith3Children = 0;
        int familiesWith4OrMoreChildren = 0;

        for (int i = 0; i < T; i++) {
            
				boolean boyBorn = false;
				boolean girlBorn = false;
				int childrenCount = 0;
		
				while (!(boyBorn && girlBorn)) {
					// Generate a random value (0 or 1) to represent the gender
					int gender = (int) (Math.random() * 2); // 0 for girl, 1 for boy
		
					// Update the Boolean variables based on the gender
					if (gender == 0) {
						girlBorn = true;
					} else {
						boyBorn = true;
					}
		
					// Print the gender (g for girl, b for boy)
					// System.out.print((gender == 0) ? "g " : "b ");
		
					// Increment the count of children
					childrenCount++;

                    totalChildren++;
				}

                if(childrenCount==2){
                    familiesWith2Children++;
                }
                if(childrenCount==3){
                    familiesWith3Children++;
                }
                if(childrenCount>3){
                    familiesWith4OrMoreChildren++;
                }

            }
                double x = totalChildren /T;
                System.out.println("Average: " + x + " children to get at least one of each gender.");
                System.out.println("Number of families with 2 children: " + familiesWith2Children);
                System.out.println("Number of families with 3 children: " + familiesWith3Children);
                System.out.println("Number of families with 4 or more children: " + familiesWith4OrMoreChildren);
				// System.out.println(); // Move to the next line after printing the children's genders
				// System.out.println("You made it... and you now have " + childrenCount + " children.");
			
		}

}
		

//         for (int i = 0; i < numberOfExperiments; i++) {
//             int numberOfChildren = simulateFamily();
//             totalChildren += numberOfChildren;
//             childCounts[i] = numberOfChildren;

//             if (numberOfChildren == 2) {
//                 familiesWith2Children++;
//             } else if (numberOfChildren == 3) {
//                 familiesWith3Children++;
//             } else if (numberOfChildren >= 4) {
//                 familiesWith4OrMoreChildren++;
//             }
//         }

//         double averageChildren = (double) totalChildren / numberOfExperiments;

//         System.out.println("Average: " + averageChildren + " children to get at least one of each gender.");
//         System.out.println("Number of families with 2 children: " + familiesWith2Children);
//         System.out.println("Number of families with 3 children: " + familiesWith3Children);
//         System.out.println("Number of families with 4 or more children: " + familiesWith4OrMoreChildren);

//         int mostCommonCount = findMode(childCounts);
//         System.out.println("The most common number of children is " + (mostCommonCount >= 4 ? "4 or more" : mostCommonCount) + ".");
//     }

//     public static int simulateFamily() {
//         Random random = new Random();
//         int numberOfChildren = 0;
//         boolean hasBoy = false;
//         boolean hasGirl = false;

//         while (!hasBoy || !hasGirl) {
//             if (random.nextBoolean()) {
//                 hasBoy = true;
//             } else {
//                 hasGirl = true;
//             }
//             numberOfChildren++;
//         }

//         return numberOfChildren;
//     }

//     public static int findMode(int[] arr) {
//         int[] counts = new int[5]; 
//         int mode = 0;
//         int maxCount = 0;

//         for (int count : arr) {
//             counts[count]++;
//             if (counts[count] > maxCount) {
//                 maxCount = counts[count];
//                 mode = count;
//             }
//         }

//         return mode;
//     }
// }

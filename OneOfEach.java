
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {

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
					System.out.print((gender == 0) ? "g " : "b ");
		
					// Increment the count of children
					childrenCount++;
				}
				System.out.println(); // Move to the next line after printing the children's genders
				System.out.println("You made it... and you now have " + childrenCount + " children.");
			}
		}
		

 
		// 	}
		
		// 	// Function to simulate having children until at least one boy and one girl are born
		// 	private static void simulateChildBirth() {
		// 		boolean boyBorn = false;
		// 		boolean girlBorn = false;
		// 		int childrenCount = 0;
		
		// 		while (!(boyBorn && girlBorn)) {
		// 			// Generate a random value (0 or 1) to represent the gender
		// 			int gender = (int) (Math.random() * 2); // 0 for girl, 1 for boy
		
		// 			// Update the Boolean variables based on the gender
		// 			if (gender == 0) {
		// 				girlBorn = true;
		// 			} else {
		// 				boyBorn = true;
		// 			}
		
		// 			// Print the gender (g for girl, b for boy)
		// 			System.out.print((gender == 0) ? "g " : "b ");
		
		// 			// Increment the count of children
		// 			childrenCount++;
		// 		}
		
		// 		System.out.println(); // Move to the next line after printing the children's genders
		// 		System.out.println("You made it... and you now have " + childrenCount + " children.");
		// 	}
		// }
		


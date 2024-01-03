
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
					
					int gender = (int) (Math.random() * 2); 
		
					if (gender == 0) {
						girlBorn = true;
					} else {
						boyBorn = true;
					}
		
					System.out.print((gender == 0) ? "g " : "b ");
		
					
					childrenCount++;
				}
				System.out.println(); 
				System.out.println("You made it... and you now have " + childrenCount + " children.");
			}
		}
		

 
		
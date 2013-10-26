/*Uriah Sypolt
 * 10/26/2013
 *
 * creates a array list of 20 Spots 
 * 
 */
package parkinglot;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {

		ArrayList<Spot> garage = new ArrayList<Spot>(20);
		boolean used;
		
		for (int i = 1; i <= 20; i++) {
			if (i < 5) {
				Spot place = new Handicapped(getRandomBoolean(),i);
				garage.add(place);
			} else {
				Spot place = new Regular(getRandomBoolean(),i);
				garage.add(place);
			}

			System.out.println(garage.get(i-1).toString());
		}
	}
	public static boolean getRandomBoolean() {
	       return Math.random() < 0.5;
	   }
}

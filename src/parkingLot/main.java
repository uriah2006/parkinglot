/*Uriah Sypolt
 * 10/26/2013
 *
 * creates a array list of 20 Spots 
 * 10 spots selected at random will be filled 
 */
package parkinglot;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {

		ArrayList<Spot> garage = new ArrayList<Spot>(20);
		ArrayList<Integer> used = new ArrayList<Integer>(10);
		int i;

		while (used.size() < 10) {
			i = (int) (Math.random() * 20 + 1);
			if (!(used.contains(i))) {
				used.add(i);
				//System.out.println(i);    					    //test point
			}
		}
		for (i = 1; i <= 20; i++) {
			if (i <= 5) {
				Spot place = new Handicapped(used.contains(Integer.valueOf(i)), i);
				garage.add(place);
			} else {
				Spot place = new Regular(used.contains(Integer.valueOf(i)), i);
				garage.add(place);
			}

			System.out.println(garage.get(i - 1).toString());
		}
	}
}

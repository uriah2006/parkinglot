/*Uriah Sypolt
 * 10/26/2013
 *
 * **must have**
 * 	1 boolean value (if the location is being filled)
 *  2 int value (what is the parking spot number)
 *  
 *  the cost per hour is free (0.00)
 */
package parkinglot;

public class Handicapped extends Spot implements parking {

	double price = 0;
	String type = "Handicapped";
	String cost;

	public Handicapped(boolean open, int loc) {
		super(open, location);
		super.open = open;
		super.location = loc;
		this.cost=Integer.toString((int) (this.price*super.hour));
	}

	public String toString() {
		String r;
		r = super.toString();
		if (super.open) {
			r = r + this.type + " x " + super.hour + " hours, Cost = $"
					+ this.cost;
		} else {
			r = r + "Empty";
		}
		return r;
	}
}

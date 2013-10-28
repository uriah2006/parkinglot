/*Uriah Sypolt
 * 10/26/2013
 *
 * **must have**
 * 	1 boolean value (if the location is being filled)
 *  2 int value (what is the parking spot number)
 *  
 *  the cost per hour is 0.50
 */
package parkinglot;

public class Regular extends Spot implements parking {

	double price = 0.5;
	String type = "Regular";
	String cost;

	public Regular(boolean open, int loc) {
		super(open, location);
		super.open = open;
		super.location = loc;
		if (!(super.hour % 2 == 0)) {
			this.cost = String.format("%.2f", this.price * super.hour);
		} else {
			this.cost = Integer.toString((int) (this.price * super.hour));
		}
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

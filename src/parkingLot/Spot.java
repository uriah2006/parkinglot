/*Uriah Sypolt
 * 10/26/2013
 *
 * **must have**
 * 	1 boolean value (if the location is being filled)
 *  2 int value (what is the parking spot number)
 *  
 *  the time used (hour) is generated only if the spot is being used
 *  hour is a randomly generated number from 0 to 24  
 *  
 *  hour also has a getter and a setter for future use
 */
package parkinglot;

public class Spot {

	boolean open;
	public int hour;
	static int location;

	public Spot(boolean open, int loc) {
		this.open = open;
		this.location = loc;
		if (this.open) {
			this.hour = (int) (Math.random() * 24);
		}
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public String toString() {
		return "Spot " + this.location + ", ";
	}
}

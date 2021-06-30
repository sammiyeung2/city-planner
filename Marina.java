/**
 * This class represents a Marina. It is a subclass of the Building class. Each Marina has a symbol, width, and length.
 * A Marina must touch at least one of the city's edges.
 * 
 * @author sammi
 *
 */
public class Marina extends Building {
	
	
	// Constructor
	/**
	 * Constructor creates a marina with the given symbol, width, and length
	 * @param symbol
	 * @param width
	 * @param length
	 */
	public Marina (String symbol, int width, int length) {
		
		// initialize the instance variables (inherited from parent class Building)
		
		super(symbol, width, length);
	}
	
	
	
	// Methods
	/**
	 * Boolean method to check for additional requirements specific to the Marina subclass 
	 * @param layout a 2D array of type Building that represents the city
	 * @param x the x coordinate of the desired placement location
	 * @param y the y coordinate of the desired placement location
	 * @return true if the Marina can be placed in the desired location and false if it can't
	 */
	public boolean isValidPlacement(Building[][] layout, int x, int y) {
		
		// check to see if the desired Marina meets the original requirements of parent class Building first
		if (super.isValidPlacement(layout, x, y)==false) {
			// if it doesn't, return false
			return false;
		}
		// if it meets the original requirements, then check to see if it meets the Marina-specific requirements too
		else {
			// if it touches the water (edge of the city), then it fits the requirements for a Marina
			if (x == 0 || y == 0 || x + super.getWidth() >= layout[0].length || y + super.getLength() >= layout.length) {
				return true;
			}
			// if it doesn't touch the edge of the water, it can't be placed there
			else {
				return false;
			}
		}
		
		
	}
	
}



	
	
	
	

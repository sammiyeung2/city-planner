/**
 * This class represents a Skyscraper, which is a subclass of the Building class. Each Skyscraper has a symbol, width, length, and height.
 * A Skyscraper's height must be less than 10 and it must be greater than or equal to the base area (width x length).
 * @author sammi
 *
 */

public class Skyscraper extends Building {
	
	
	// Instance Variables (Attributes)
	/**
	 * Height of the skyscraper
	 */
	private int height;
	
	
	// Constructor
	/**
	 * Constructor creates a skyscraper with the given symbol, width, length, and height
	 * @param symbol symbol of the skyscraper
	 * @param width width of the skyscraper
	 * @param length length of the skyscraper
	 * @param height height of the skyscraper
	 */
	public Skyscraper(String symbol, int width, int length, int height) {
		
		// initialize the instance variables (with some of them inherited from the parent class Building)
		
		super(symbol, width, length);
		this.height = height;
		
	}
	
	
	
	// Methods
	
	/**
	 * Boolean method to check for additional requirements specific to the Skyscraper subclass
	 * @param layout a 2D array of type Building that represents the city
	 * @param x the x coordinate of the desired placement location
	 * @param y the y coordinate of the desired placement location
	 * @return true if the skyscraper can be placed there; false if it can't
	 */
	
	public boolean isValidPlacement(Building[][] layout, int x, int y) {
		
		// calculate the base area of the skyscraper by accessing its width and length
		int area = super.getWidth()*super.getLength();
		
		// if it doesn't fit the original Building requirements, the attempted placement is invalid
		if (super.isValidPlacement(layout, x, y) == false) {
			return false;
		}
		// check if it fits the Skyscraper specific requirements
		else {
			// if height is less than 10 and greater than or equal to the skyscraper's base area, the attempted placement is valid
			if (height < 10 && height >= area) {
				return true;
			}
			// if height if greater than or equal to 10 and/or less than the skyscraper's base area, the attempted placement is invalid
			else {
				return false;
			}
		}
	}
	

	
	// toString
	/**
	 * toString method overrides the parent class' toString and returns the height of the skyscraper
	 * @return skyscraper's height
	 */
	public String toString() {
		return String.valueOf(height);
	}
	
	
}	
	


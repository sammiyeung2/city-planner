/**
 * This class represents a City. Each city has a width, length, and 2D array of type Building.
 * @author sammi
 *
 */
public class City {

	// Instance Variables (Attributes)
	/**
	 * Width of the city
	 */
	private int width;
	/**
	 * Length of the city
	 */
	private int length;
	/**
	 * A 2D array to store the city's layout.
	 */
	private Building[][] layout; 
	
	
	
	// Constructor
	/**
	 * Constructor creates a city with the given x and y values of the city's layout
	 * @param x represents the width of the city
	 * @param y represents the length of the city
	 */
	public City(int x, int y) {
		
		// initialize the instance variables
		
		width = x;
		length = y;
		
		layout = new Building[length][width];
		
	}
	
	// Methods
	/**
	 * Boolean method to add the desired Building object to the city if the attempted placement is valid
	 * @param x x coordinate of the city to start placing the building at (if valid placement)
	 * @param y y coordinate of the city to start placing the building at (if valid placement)
	 * @param b the building object to try to add to the city
	 * @return true if building can and will be added to the city; false if it can't be added to the city based on the City and Building rules
	 */
	public boolean addStructure(int x, int y, Building b) {
		
		// call the appropriate isValidPlacement method depending on the building object's class and check if the placement is valid
		if (b.isValidPlacement(layout, x, y) == false) {
			// if the placement isn't valid, return false
			return false;
		}
		// if the placement is valid, add the Building object to the desired location
		else {
			// loop through the layout array representing the city to build the Building at the desired location and of the desired size
			for (int row = y; row < y + b.getLength(); row++) {
		        for (int col = x; col < x + b.getWidth(); col++) {
		        	// to build the building, point some of the cells of the City's layout, based on the desired building's location and size, to the given Building object
		        	layout[row][col] = b;
		        }
		    }
			return true;
		}
		
		
	}
	

	
	
	
	
	// toString
	/**
	 * toString method to return the City's layout grid after all the building(s) have been placed (if any)
	 * @return string that contains the grid-like representation of the City's layout
	 */
	public String toString() {
		
		// make an empty string
		String s = "";
		
		// loop through all the cells in the 2D array of type Building that represents the City
		for (int row = 0; row < layout.length; row++) {
			for (int col = 0; col < layout[0].length; col++) {
				// if the cell holds part of a building, print out the building's symbol with appropriate spacing before the next cell
				if (layout[row][col] instanceof Building) {
					s += layout[row][col].toString() + "  ";
				}
				// if the cell is empty (doesn't have a building object there), print a dot to represent the empty space
				else {
					s += "."+ "  ";
				}
			}
			// print appropriate spacing between the rows (using new line character); this "if loop" helps to avoid printing a new line after the grid is done being represented
			if (row < layout.length -  1) {
				s += "\n";
			}
		}
		// return the final string
		return s;
		
	}
	
	
}

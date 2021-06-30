/**
 * This class represents a Building. Each building has a symbol, width, and length.
 * @author sammi
 *
 */

public class Building {

	// Instance Variables (Attributes)
	/**
	 * Symbol of the building
	 */
	private String symbol;
	/**
	 * Width of the building
	 */
	private int width;
	/**
	 * Length of the building
	 */
	private int length;

	
	
	// Constructor
	/**
	 * Constructor creates a building with the given symbol, width, and length
	 * @param symbol symbol of the building
	 * @param width width of the building
	 * @param length length of the building
	 */
	public Building(String symbol, int width, int length) {
		
		// initialize the instance variables
		
		this.symbol = symbol;
		this.width = width;
		this.length = length;
		
	}
	
	
	// Getters
	
	/**
	 * Accessor method to get the width of the building
	 * @return width of the building
	 */
	public int getWidth() {
		// Returns the width
		return width;
	}
	
	/**
	 * Accessor method to get the length of the building
	 * @return length of the building
	 */
	public int getLength() {
		// Returns the length
		return length;
	}
	
	
	
	// Methods
	
	/**
	 * Boolean method to check if the building can be placed at the given location in the city (it must be within the city's bounds and not overlap on top of another building's coordinates)
	 * @param layout a 2D array of type building that represents the city
	 * @param x the x coordinate of the desired placement location
	 * @param y the y coordinate of the desired placement location
	 * @return true if the building's desired placement is valid and false if the desired placement is invalid
	 */
	public boolean isValidPlacement(Building[][] layout, int x, int y) {
		
		// if it's beyond the city's bounds, return false
		if (x < 0 || y < 0 || x + width > layout[0].length || y + length > layout.length) {
			return false;
		}
		
		// enter this else loop if the desired location is within the city's bounds
		else {
			// iterate through each y coordinate involved in the building's desired length
			for (int row = y; row < y + length; row++) {
				// iterate through each x coordinate involved in the building's desired width
		        for (int col = x; col < x + width; col++) {
		        	// if any cell is occupied, return false because the building can't be placed there
		        	if (layout[row][col] instanceof Building) {
		    			return false;
		    		}
		        }
		    }
			return true; 
		}
		
	}
	
	
	// toString
	
	/**
	 * toString method to return the building's symbol
	 * @return symbol of building
	 */
	public String toString() {
		// Simply return the symbol variable to represent the building
		return symbol;
	}
	
	
	
}

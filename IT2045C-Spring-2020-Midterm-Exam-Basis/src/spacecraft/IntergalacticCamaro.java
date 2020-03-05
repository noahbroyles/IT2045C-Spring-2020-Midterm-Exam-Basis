package spacecraft;

public class IntergalacticCamaro extends Spacecraft {
	
	private String color;

	public IntergalacticCamaro(String name, String color) {
		super(name);
		setColor(color);
	}

	@Override
	public void Launch() {
		System.out.println("I am an Intergalactic Camaro and I am launching.");

	}

	/***
	 * Returns a string representation of the Intergalactic Camaro
	 */
	public String toString() {
		return super.toString() + ", Color: " + getColor();
	}
	
	
	// Getters and setters
	// These are actually both used! Yay!
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

}

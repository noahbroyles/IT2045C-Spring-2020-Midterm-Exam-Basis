package spacecraft;

public class IntergalacticCamaro extends Spacecraft {
	
	private String color;

	public IntergalacticCamaro(String name, String color) {
		super(name);
		setColor(color);
	}

	@Override
	public void Launch() {
		// I need something to put here

	}

	
	public String toString() {
		return super.toString() + ", Color: " + getColor();
	}
	
	// Getters and setters
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

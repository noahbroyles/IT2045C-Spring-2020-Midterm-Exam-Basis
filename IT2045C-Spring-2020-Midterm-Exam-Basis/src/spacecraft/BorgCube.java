package spacecraft;

public class BorgCube extends Spacecraft {

	public BorgCube(String name) {
		super(name);
	}

	@Override
	public void Launch() {
		System.out.println("I am a Borg Cube and I am launching.");

	}

}

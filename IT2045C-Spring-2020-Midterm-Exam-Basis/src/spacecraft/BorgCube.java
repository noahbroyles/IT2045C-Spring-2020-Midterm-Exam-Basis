/*
 * Name: Noah Broyles
 * Email: broylend@mail.uc.edu
 * Midterm Exam
 * Due Date: 3/05/2020
 * Course: Computer Programming 2, Spring 2020
 */


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

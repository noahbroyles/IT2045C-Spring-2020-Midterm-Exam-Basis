/*
 * Name: Noah Broyles
 * Email: broylend@mail.uc.edu
 * Midterm Exam
 * Due Date: 3/05/2020
 * Course: Computer Programming 2, Spring 2020
 */

package spacecraft;

/**
 * Model the Starship Enterprise in the Star Trek canon
 * @author nicomp
 *
 */
public class StarshipEnterprise extends Spacecraft {
	public StarshipEnterprise(String name) {
		super(name);
	}
	
	@Override
	public void Launch() {
		System.out.println("I am the Starship Enterprise and I am launching.");
	}

}

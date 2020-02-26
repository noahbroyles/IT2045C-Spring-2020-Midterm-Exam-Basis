/*
 * IT2045C Spring 2020 Midterm Exam Basis
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
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

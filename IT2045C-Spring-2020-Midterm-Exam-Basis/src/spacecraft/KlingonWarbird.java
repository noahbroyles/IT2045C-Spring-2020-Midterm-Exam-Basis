/*
 * IT2045C Spring 2020 Midterm Exam Basis
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package spacecraft;
/**
 * Model a Klingon Warbird-class spacecraft in the Star Trek canon
 * @author nicomp
 *
 */
public class KlingonWarbird extends Spacecraft {
	
	public KlingonWarbird(String name) {
		super(name);
	}
	
	@Override
	public void Launch() {
		System.out.println("I am a Klingon Warrbird and I am launching.");
	}


}

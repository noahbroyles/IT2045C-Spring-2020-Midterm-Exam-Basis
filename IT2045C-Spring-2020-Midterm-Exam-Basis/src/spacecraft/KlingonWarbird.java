/*
 * Name: Noah Broyles
 * Email: broylend@mail.uc.edu
 * Midterm Exam
 * Due Date: 3/05/2020
 * Course: Computer Programming 2, Spring 2020
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

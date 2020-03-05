/*
 * Name: Noah Broyles
 * Email: broylend@mail.uc.edu
 * Midterm Exam
 * Due Date: 3/05/2020
 * Course: Computer Programming 2, Spring 2020
 */

package spacecraft;

/**
 * Model a spacecraft in the Star Trek canon
 * @author nicomp
 *
 */
public abstract class Spacecraft implements Launch {
	private String name;

	public Spacecraft(String name) {
		setName(name);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {return name;}
}

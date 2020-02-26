/*
 * IT2045C Spring 2020 Midterm Exam Basis
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
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

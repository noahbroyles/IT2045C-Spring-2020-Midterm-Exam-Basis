/*
 * Name: Noah Broyles
 * Email: broylend@mail.uc.edu
 * Midterm Exam
 * Due Date: 3/05/2020
 * Course: Computer Programming 2, Spring 2020
 * Description: This is the Midterm Spacecraft Project
 * 
 */
package main;

import spacecraft.*;
// Importing one thing at a time is old. Import * is MUCH better.

public class Main {

	public static void main(String[] args) {
		StarshipEnterprise NCC1701 = new StarshipEnterprise("NCC 1701");
		KlingonWarbird destroyer = new KlingonWarbird("porgh");
		BorgCube borgCube = new BorgCube("101100100111000111100011");
		// This is the new code featuring... The Intergalactic Camaro!
		IntergalacticCamaro camaro = new IntergalacticCamaro("My Ride", "Black with red Stripes");
		
		System.out.println(NCC1701.toString());
		System.out.println(destroyer.toString());
		System.out.println(borgCube.toString());
		System.out.println(camaro.toString()); 
		// I really didn't want to say .toString() here, but I was told to "Follow the pattern in the existing code".

		
		
	}

}

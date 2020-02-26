/*
 * IT2045C Spring 2020 Midterm Exam Basis
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package main;

import spacecraft.BorgCube;
import spacecraft.KlingonWarbird;
import spacecraft.StarshipEnterprise;

public class Main {

	public static void main(String[] args) {
		StarshipEnterprise NCC1701 = new StarshipEnterprise("NCC 1701");
		KlingonWarbird destroyer = new KlingonWarbird("porgh");
		BorgCube borgCube = new BorgCube("101100100111000111100011");
		
		System.out.println(NCC1701.toString());
		System.out.println(destroyer.toString());
		System.out.println(borgCube.toString());

		
		
	}

}

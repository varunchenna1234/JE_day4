package day4;
import java.util.*;
public class Avenger {
	Scanner in =new Scanner(System.in);
	String name;
	int age;
	String power;
	String Weapon;
	String Planet;
	public void getdetails() {
		System.out.println("Enter avenger name: ");
		name=in.nextLine();
		System.out.println("Enter the age of avenger: ");
		age=in.nextInt();
		in.nextLine();
		System.out.println("Enter power of avenger: ");
		power=in.nextLine();
		System.out.println("Enter avenger weapon: ");
		Weapon=in.nextLine();
		System.out.println("Enter avenger planet: ");
		Planet=in.nextLine();
		
	}
	void display() {
		System.out.println("The name of Avneger is "+name);
		System.out.println("The age of Avneger is "+age);
		System.out.println("The power of Avneger is "+power);
		System.out.println("The weapon of Avneger is "+Weapon);
		System.out.println("The planet of Avneger is "+Planet);

	}

	public static void main(String[] args) {
		Avenger avengers[]=new Avenger[5];
		
		for(int i=0;i<5;i++) {
			avengers[i]=new Avenger();
			avengers[i].getdetails();
			avengers[i].display();
			
		}
		for(int i=0;i<5;i++) {
			
		}
		
	}

}

package day10;

public class Car {
	String make;
	int year;
	Car(){
		this.make="Unknow";
		this.year=2000;
	}
	Car(String make){
		this.year=2000;
		this.make=make;
	}
	Car(String make,int year){
		this.make=make;
		this.year=year;
	}
	void displayCarDetails() {
		System.out.println(make);
		System.out.println(year);
	}

}

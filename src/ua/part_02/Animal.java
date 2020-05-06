package ua.part_02;

public class Animal {

	private String name;
	private double speed;
	private int age;

	public Animal(String name, double speed, int age) {
		super();
		this.name = name;
		this.speed = speed;
		this.age = age;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSpeed() {
		return speed;
	}

	void setSpeed(double speed) {
		this.speed = speed;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

}

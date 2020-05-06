package ua.part_01;

public class Robot {

	public String model;
	public String operation;

	public Robot(String model, String operation) {
		this.model = model;
		this.operation = operation;
	}

	public void work() {
		System.out.println("I am " + model + " – I'm just " + operation);
	}

}
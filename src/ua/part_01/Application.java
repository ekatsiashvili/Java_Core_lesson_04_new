package ua.part_01;

public class Application {
	public static void main(String[] args) {

		Robot a = new Robot("Robot", "working");
		a.work();

		CoffeRobot b = new CoffeRobot("CoffeRobot", "making coffe");
		b.work();

		RobotCoocker c = new RobotCoocker("RobotCoocker", "cooking food");
		c.work();

		RobotDancer d = new RobotDancer("RobotDancer", "dancing");
		d.work();

		Robot[] array = { a, b, c, d };

		for (int i = 0; i < array.length; i++) {
			System.out.println("\n" + "==========================================" + "\n");
			array[i].work();

		}

	}

}
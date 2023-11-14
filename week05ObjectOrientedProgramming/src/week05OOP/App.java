package week05OOP;

public class App {

	public static void main(String[] args) {
		AsteriskLogger app = new AsteriskLogger();
		app.log("Hello");
		app.error("Hello");
		SpacedLogger app2 = new SpacedLogger();
		app2.log("Hello");
		app2.error("Hello");

	}

}

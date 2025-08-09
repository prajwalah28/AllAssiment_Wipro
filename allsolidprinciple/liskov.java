package wiprofirst.allsolidprinciple;
class Bird {
	void fly() {
		System.out.println("Bird is flying");
	}
}
class Sparrow extends Bird{
	void fly() {
		System.out.println("sparrow is flying");
	}
}
class Crow extends Bird {
	void fly() {
		System.out.println("crow is flying");
	}
}
public class liskov {
public static void main(String[] args) {
	Bird bb = new Sparrow();
	bb.fly();
}
}

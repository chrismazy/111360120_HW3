
public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.num = 123455;
		car1.gas = 20.5;

		System.out.println("車號是:" + car1.num);
		System.out.print("汽油量是:" + car1.gas);
	}

}

class Car {
	int num;
	double gas;
}
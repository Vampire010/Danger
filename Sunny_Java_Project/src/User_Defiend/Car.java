package User_Defiend;

public class Car 
{

	void printClassName(Object obj) 
	{
		System.out.println("The object's" + " class is " + obj.getClass().getSimpleName());
	}
	public static void main(String[] args)
	{
		Car car = new Car();
		car.printClassName(car);
	}

}

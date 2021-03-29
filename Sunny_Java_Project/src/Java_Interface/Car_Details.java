package Java_Interface;

public class Car_Details implements Cars , car_model
{
	
	public static void main(String[] args) 
	{

		Car_Details car = new Car_Details();
		
		car.car_name("Benzz");
		car.car_models("Benzz");
		
	}

	@Override
	public void car_name(String Name) 
	{
		System.out.println("Benzzz");
	}

	@Override
	public void car_models(String Name) 
	{
		System.out.println("Benzzz2020");
		
	}
	

}

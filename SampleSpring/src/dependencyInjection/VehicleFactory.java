package dependencyInjection;




public class VehicleFactory {
	
	public static Vehicle factorymethod(Vehicle obj)
	{
		if(obj instanceof Car)
		{
			return new Car();
		}
		else
		{
			return new Bike();
		}
	}
}

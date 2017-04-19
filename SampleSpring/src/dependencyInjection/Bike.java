package dependencyInjection;

import java.util.Collection;

public class Bike implements Vehicle {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private Collection<Tyre> tyres;
	
	public Collection<Tyre> getTyres() {
		return tyres;
	}

	public void setTyres(Collection<Tyre> tyres) {
		this.tyres = tyres;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Bike start");
		for (Tyre tyre : tyres) {
			System.out.println(tyre.getTyrename());
		}
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Bike stop");
	}
	
	public void drive()
	{
		
	}
	
private Engine e;
	
	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}


}

package annotation;

public class Engine {
	
	String enginename;
	
	
	public String getEnginename() {
		return enginename;
	}


	public Engine(String enginename) 
	{
		// TODO Auto-generated constructor stub
		this.enginename=enginename;
	}

	
	
	public void estart()
	{
		System.out.println("Engine starttt "+enginename);
	}
	
	public void estop()
	{
		System.out.println("Engine stopppp"+enginename);
	}
}

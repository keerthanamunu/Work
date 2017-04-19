package annotation;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Car implements Vehicle{
	
	
	
	@Autowired
	@Qualifier("engine2")
	private Engine engine;
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Value("${car.name}")
	private String name;
	
	@Value("120")
	private int cc;
	
	
	@Autowired
	//@Qualifier("economy")
	@Model10
	private Model model;
	
	
	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	 void setName(String name) {
		this.name = name;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		getEngine().estart();
		
		
		getModel().features();
		System.out.println(" "+ getName()+" "+ getCc());
		
		
		System.out.println("Car start ");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		getEngine().estop();
		System.out.println("Car stop");
	}

}

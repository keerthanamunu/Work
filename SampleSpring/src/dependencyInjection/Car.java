package dependencyInjection;

public class Car implements Vehicle{
	
	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("defautl");
	}
	private String name;
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

	private int cc;
	private EngineInterface engine;
	
	

	

	public EngineInterface getEngine() {
		return engine;
	}

	public void setEngine(EngineInterface engine) {
		this.engine = engine;
	}
	
	public Car(EngineInterface engine, String name, int cc) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.engine = engine;
		this.cc=cc;
	}
	
	public Car(String name, int cc) {
		// TODO Auto-generated constructor stub
		this.name = name;
		//this.engine = engine;
		this.cc=cc;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		getEngine().estart();
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

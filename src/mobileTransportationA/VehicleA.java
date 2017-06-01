package mobileTransportationA;


public abstract class VehicleA {

	private int speed = 60;
	private boolean started = false;
	private boolean accelerating = false;
	//private String wayOfTravel = "";
	private String color = "Black";
	private String model = "Masarati";
	
	
	public VehicleA (int spe, boolean sta, boolean acc, String col, String mod){
		speed = spe;
		started = sta;
		accelerating = acc;
		color = col;
		model = mod;
	}
	public VehicleA (){
		
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public boolean hasStarted(){
		return started;
	}
	
	public boolean hasStopped(){
		return !started;
	}
	
	public boolean isAccelerating(){
		return accelerating;
	}
	
	public boolean isDecelerating(){
		return !accelerating;
	}
	
	public abstract String travelsVia();
	
	public String getColor(){
		return color;
	}
	
	public String getModel(){
		return model;
	}
	
	public void setSpeed(int sp){
		speed = sp;
	}
	
	public void accelerate(){
		accelerating = true;
	}
	
	public void decelerate(){
		accelerating = false;
	}
	
	public void start(){
		started = true;
	}
	
	public void stop(){
		started = false;
	}
	
	public void setColor(String co){
		color = co;
	}
	
	public void setModel(String mo){
		model = mo;
	}

}

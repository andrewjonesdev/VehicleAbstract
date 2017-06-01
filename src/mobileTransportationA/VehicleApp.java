package mobileTransportationA;


public class VehicleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarA carA = new CarA();
		BoatA boatA = new BoatA();
		boatA.setColor("Froest Green");
		boatA.setModel("Destroyer");
		PlaneA planeA = new PlaneA();
		planeA.setColor("Gold");
		planeA.setModel("Boeing 747");
		//Car A Started or Stopped
		if(carA.hasStarted()==true){
			System.out.printf("The %s %s is starting!",carA.getColor(), carA.getModel());
			System.out.println();
		}
		else{
			System.out.printf("The %s %s has stopped!",carA.getColor(), carA.getModel());
			System.out.println();
		}
		//Car B Started or Stopped
		if(boatA.hasStarted()==true){
			System.out.printf("The %s %s is starting!",boatA.getColor(), boatA.getModel());
			System.out.println();
		}
		else{
			System.out.printf("The %s %s has stopped!",boatA.getColor(), boatA.getModel());
			System.out.println();
		}
		if(planeA.hasStarted()==true){
			System.out.printf("The %s %s is starting!",planeA.getColor(), planeA.getModel());
			System.out.println();
		}
		else{
			System.out.printf("The %s %s has stopped!",planeA.getColor(), planeA.getModel());
			System.out.println();
		}
		//Car A Accelerating of Decelerating
		if(carA.isAccelerating()==true){
			System.out.printf("The %s %s is accelerating!",carA.getColor(), carA.getModel());
			System.out.println();
		}
		else{
			System.out.printf("The %s %s is decelerating!",carA.getColor(), carA.getModel());
			System.out.println();
		}
		//Car B Accelerating of Decelerating
		if(boatA.isAccelerating()==true){
			System.out.printf("The %s %s is accelerating!",boatA.getColor(), boatA.getModel());
			System.out.println();
		}
		else{
			System.out.printf("The %s %s is decelerating!",boatA.getColor(), boatA.getModel());
			System.out.println();
		}
		if(planeA.isAccelerating()==true){
			System.out.printf("The %s %s is accelerating!",planeA.getColor(), planeA.getModel());
			System.out.println();
		}
		else{
			System.out.printf("The %s %s is decelerating!",planeA.getColor(), planeA.getModel());
			System.out.println();
		}
		//Car A Speed		
		System.out.printf("The %s %s is going %smph!",carA.getColor(), carA.getModel(), carA.getSpeed());
		System.out.println();
		//Car B Speed
		System.out.printf("The %s %s is going %smph!",boatA.getColor(), boatA.getModel(), boatA.getSpeed());
		System.out.println();
		carA.setSpeed(200);
		boatA.setSpeed(250);
		planeA.setSpeed(300);
		carA.accelerate();
		boatA.accelerate();
		planeA.accelerate();
		if(carA.isAccelerating()==true){
			System.out.printf("The %s %s is accelerating!",carA.getColor(), carA.getModel());
			System.out.println();
		}
		else{
			System.out.printf("The %s %s is decelerating!",carA.getColor(), carA.getModel());
			System.out.println();
		}
		//Car B Accelerating of Decelerating
		if(boatA.isAccelerating()==true){
			System.out.printf("The %s %s is accelerating!",boatA.getColor(), boatA.getModel());
			System.out.println();
		}
		else{
			System.out.printf("The %s %s is decelerating!",boatA.getColor(), boatA.getModel());
			System.out.println();
		}
		if(planeA.isAccelerating()==true){
			System.out.printf("The %s %s is accelerating!",planeA.getColor(), planeA.getModel());
			System.out.println();
		}
		else{
			System.out.printf("The %s %s is decelerating!",planeA.getColor(), planeA.getModel());
			System.out.println();
		}
		System.out.printf("The %s %s is going %smph!",carA.getColor(), carA.getModel(), carA.getSpeed());
		System.out.println();
		//Car B Speed
		System.out.printf("The %s %s is going %smph!",boatA.getColor(), boatA.getModel(), boatA.getSpeed());
		System.out.println();
		System.out.printf("The %s %s is going %smph!",planeA.getColor(), planeA.getModel(), planeA.getSpeed());
		System.out.println();
		System.out.printf("The %s %s is going %smph!",carA.getColor(), carA.getModel(), carA.travelsVia());
		System.out.println();
		//Car B Speed
		System.out.printf("The %s %s travels through the %s!",carA.getColor(), carA.getModel(), carA.travelsVia());
		System.out.println();
		System.out.printf("The %s %s travels through the %s!",boatA.getColor(), boatA.getModel(), boatA.travelsVia());
		System.out.println();
		System.out.printf("The %s %s travels through the %s!",planeA.getColor(), planeA.getModel(), planeA.travelsVia());
		System.out.println();
	}

}

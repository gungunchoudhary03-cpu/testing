package pac1;

class car{
	int noOfCylinders;
	int noOfValues;
	int enginePower;
	boolean isPowerSteering;
	
	car(){
		noOfCylinders = 3;
		noOfValues = 4 ;
		enginePower = 45;
		isPowerSteering = false;
	}
	
	car (boolean isPowerSteering){
		this.isPowerSteering = isPowerSteering;
		
	}
	
	car(int noOfCylinders,int noOfValues, int enginePower){
		this.noOfCylinders = noOfCylinders;
		this.noOfValues = noOfValues;
		this.enginePower = enginePower;
		this.isPowerSteering = true;
	}
}

public class TC_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car obj = new car();
		System.out.println(obj.noOfCylinders);
		
		car obj1 = new car(true);
		System.out.println("isPowerSteering :"+obj1.isPowerSteering);
		
		car obj2 = new car(4,50,4);
		System.out.println("noofcylinders:"+obj2.noOfCylinders);
		System.out.println("noOfValues:"+obj2.noOfValues);
		System.out.println("enginePower:"+obj2.enginePower);
		System.out.println("isPowerSteering :"+obj2.isPowerSteering);
	}
}

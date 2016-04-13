package inheritance;

public class BMWX5 extends BMW{

	//constructor
	public BMWX5 (){
		System.out.println("Use any BMW ");
	}
	
	public BMWX5 (String Color) {
		System.out.println("Use BMW " + Color);
	}
	
	public static void main (String[] args){
		BMWX5 mycar = new BMWX5("black");
		System.out.println("Lets Drive");
		mycar.applyBrakes();  //from BMW
	}
	
	public void withoutobject() {
		applyBrakes();
		applyHorn();
	}
	
}

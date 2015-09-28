public class CarTest {
	public static void main (String[]args){
		Car myHybrid = new Car (50,20000,15);
		myHybrid.addGas(15);
		myHybrid.drive(100);
		double gasLeft = myHybrid.getGasInTank();
		System.out.println(gasLeft);
	}
}
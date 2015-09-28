public class Car {
	private double milesPGas; //Miles per gallon
	private double miles;
	private double tank;
	private double gInTank; //Gas in tank
	public Car(){
		milesPGas = 0;
		miles = 0;
		tank = 0;
		gInTank = 0;
	}
	public Car(int milesPGas, int miles, int tank){
		if (milesPGas < 0 || tank < 0 || miles < 0){
			throw new UnsupportedOperationException("Can't be less then zero.");
		}
		this.milesPGas = milesPGas;
		this.miles = miles;
		this.tank = tank;
		gInTank = 0;
	}
	public void setMilesPGas(int milesPGas) {
		milesPGas = milesPGas;
	}
	public void setMiles(int miles) {
		miles = miles;
	}
	public void setTank(int tank) {
		tank = tank;
	}
	public void addGas (int gas){
		if ((gas + gInTank) > tank){
			throw new UnsupportedOperationException("Exceeds Gas Limit!");
		}
		gInTank += gas;
	}
	public void drive (int miles){
		if ((gInTank - miles/milesPGas) < 0){
			throw new UnsupportedOperationException("Not Enough Gas!");
		}
		gInTank -= miles/milesPGas;
	}
	public double getGasInTank (){
		return gInTank;
	}
}
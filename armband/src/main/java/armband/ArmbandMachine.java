package armband;

import ap.lib.IarmbandMachine;


public class ArmbandMachine 
		implements IarmbandMachine{

	public float getCost(float price, int quantity){
		return price * quantity;
	}
}

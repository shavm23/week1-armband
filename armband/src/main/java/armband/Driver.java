package armband;

import ap.lib.IarmbandMachine;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IarmbandMachine machine = 
				 new ArmbandMachine();
		System.out.println("Cost :" + machine.getCost(3, 5));
	}

}

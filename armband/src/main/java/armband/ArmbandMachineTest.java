package armband;

import org.junit.Test;

import ap.lib.IarmbandMachine;

public class ArmbandMachineTest {
		@Test
		public void shouldCalculateCost(){
			IarmbandMachine machine =
					new ArmbandMachine();
			assertEquals(15, machine.getCost(3, 5),0);
		}

		private void assertEquals(int i, float cost, int j) {
			// TODO Auto-generated method stub
			
		}

}

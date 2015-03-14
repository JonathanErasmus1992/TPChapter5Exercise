package za.ac.cput.project.chapter5;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class BridgePatternTest {
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		BridgePatternVehicle vehicle = new BridgePatternBigBus(new BridgePatternSmallEngine());
		BridgePatternVehicle vehicle2 = vehicle;
		vehicle2.setEngine(new BridgePatternBigEngine());
		Assert.assertTrue((vehicle == vehicle2));
	}

}

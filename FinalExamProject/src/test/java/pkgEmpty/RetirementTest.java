package pkgEmpty;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Retirement;

public class RetirementTest {

	@Test
	public void TotalAmountSaved_Test() {
		Retirement r1 = new Retirement(40, 0.07, 20, 0.02, 10000, 2642);
		try {
			assertEquals(r1.TotalAmountSaved(), 1454485.55, 0.01);
		}catch(Exception e) {
			System.out.println("TotalAmountSaved failed");
		}
	}
	
	@Test
	public void AmountToSave_Test() {
		Retirement r2 = new Retirement(40, 0.07, 20, 0.02, 10000, 2642);
		try {
			assertEquals(r2.AmountToSave(), 554.13, 0.01);
		}catch(Exception e) {
			System.out.println("AmountToSave failed");
		}
	}

}

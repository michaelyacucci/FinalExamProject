package pkgCore;

import org.apache.poi.ss.formula.functions.*;


public class Retirement {

	private int iYearsToWork;
	private double dAnnualReturnWorking;
	private int iYearsRetired;
	private double dAnnualReturnRetired;
	private double dRequiredIncome;
	private double dMonthlySSI;
	
	public Retirement(int yearsToWork, double annualReturnWorking, int yearsRetired, 
			double annualReturnRetired, double requiredIncome, double monthlySSI) {
		
		iYearsToWork = yearsToWork;
		dAnnualReturnWorking = annualReturnWorking;
		iYearsRetired = yearsRetired;
		dAnnualReturnRetired = annualReturnRetired;
		dRequiredIncome = requiredIncome;
		dMonthlySSI = monthlySSI;
		
	}
	
	public int getiYearsToWork() {
		return iYearsToWork;
	}

	public void setiYearsToWork(int iYearsToWork) {
		this.iYearsToWork = iYearsToWork;
	}

	public double getdAnnualReturnWorking() {
		return dAnnualReturnWorking;
	}

	public void setdAnnualReturnWorking(double dAnnualReturnWorking) {
		this.dAnnualReturnWorking = dAnnualReturnWorking;
	}

	public int getiYearsRetired() {
		return iYearsRetired;
	}

	public void setiYearsRetired(int iYearsRetired) {
		this.iYearsRetired = iYearsRetired;
	}

	public double getdAnnualReturnRetired() {
		return dAnnualReturnRetired;
	}

	public void setdAnnualReturnRetired(double dAnnualReturnRetired) {
		this.dAnnualReturnRetired = dAnnualReturnRetired;
	}

	public double getdRequiredIncome() {
		return dRequiredIncome;
	}

	public void setdRequiredIncome(double dRequiredIncome) {
		this.dRequiredIncome = dRequiredIncome;
	}

	public double getdMonthlySSI() {
		return dMonthlySSI;
	}

	public void setdMonthlySSI(double dMonthlySSI) {
		this.dMonthlySSI = dMonthlySSI;
	}
	
	public double AmountToSave()
	{
		//TODO: Determine the amount to save each month based on TotalAmountSaved, YearsToWork
		//		and Annual return while working
		
		
		return 0;
	}
	
	/*
	 * apache poi - call office functions Maven Dependencies - poi-3.12 -
	 * org.apache.poi.ss.formula.functions import
	 * org.apache.poi.ss.formula.functions.*; FinanceLib.pv(rate, num payments,
	 * payment each period, future value, false) assertEqual(expected, actual,
	 * round) Double.parseDouble(txtAnnualReturn.getText());
	 * txtAnnualReturn.setText(""); iterate through instead
	 */

	public double TotalAmountSaved()
	{
		//	TODO: Determine amount to be saved based on Monthly SSI, Required Income, Annual return during retirement
		//		and number of years retired.
		//
		FinanceLib.pv(rate, num payments, payment each period, future value, false)
		return 0;
	}
}

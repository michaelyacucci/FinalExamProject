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
		return FinanceLib.pv(dAnnualReturnRetired, 12*iYearsRetired, TotalAmountSaved(), 0, false);
	}

	public double TotalAmountSaved()
	{
		return FinanceLib.pv(dAnnualReturnWorking, 12*iYearsToWork, 0, dRequiredIncome - dMonthlySSI, false);
	}
}

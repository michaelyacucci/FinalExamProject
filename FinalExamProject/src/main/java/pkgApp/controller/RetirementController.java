package pkgApp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;
import pkgCore.Retirement;

public class RetirementController implements Initializable {

		
	private RetirementApp mainApp = null;
	
	@FXML
	private TextField txtYearsToWork;
	
	@FXML
	private TextField txtAnnualReturn;
	
	@FXML
	private TextField txtYearsRetired;
	
	@FXML
	private TextField txtAnnualReturn2;
	
	@FXML
	private TextField txtRequiredIncome;
	
	@FXML
	private TextField txtMonthlySSI;
	
	@FXML
	private Label txtSaveEachMonth;
	
	@FXML
	private Label txtWhatYouNeedToSave;
	

	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
	@FXML
	public void btnClear(ActionEvent event) {
		txtYearsToWork.setText("");
		txtAnnualReturn.setText("");
		txtYearsRetired.setText("");
		txtAnnualReturn2.setText("");
		txtRequiredIncome.setText("");
		txtMonthlySSI.setText("");
		txtSaveEachMonth.setText("");
		txtWhatYouNeedToSave.setText("");
	}
	
	@FXML
	public void btnCalculate(ActionEvent event) {
		try {
			Integer yearsToWork = new Integer(txtYearsToWork.getText());
			Double annualReturn = new Double(txtAnnualReturn.getText());
			Integer yearsRetired = new Integer(txtYearsRetired.getText());
			Double annualReturn2 = new Double(txtAnnualReturn2.getText());
			Double requiredIncome = new Double(txtRequiredIncome.getText());
			Double monthlySSI = new Double(txtMonthlySSI.getText());
			
			Retirement r = new Retirement(yearsToWork, annualReturn, yearsRetired, annualReturn2, 
					requiredIncome, monthlySSI);
			
			String save = Double.toString(r.AmountToSave());
			String total = Double.toString(r.TotalAmountSaved());
			
			txtSaveEachMonth.setText(save);
			txtWhatYouNeedToSave.setText(total);
			
			
		}catch(Exception e) {
			txtSaveEachMonth.setText("Invalid Inputs");
			txtWhatYouNeedToSave.setText("Invalid Inputs");
		}
		
	}
	
}

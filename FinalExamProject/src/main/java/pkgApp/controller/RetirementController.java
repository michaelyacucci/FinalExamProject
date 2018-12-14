package pkgApp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;

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
	}
	
	@FXML
	public void btnCalculate(ActionEvent event) {
		System.out.println("Calculate pressed");
		
		//	TODO: Call AmountToSave and TotalAmountSaved and populate 
		
	}
	
}

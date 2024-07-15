package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class Myform implements Initializable{
@FXML private 	Spinner<Integer> myspinner;
@FXML private Label l1;
int currentvalue;
	public Myform() {
		// TODO Auto-generated constructor stub
	}
	public void initialize (URL arg0,ResourceBundle arg1) {
		SpinnerValueFactory<Integer> valueFactory =new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10);
		valueFactory.setValue(1);
		myspinner.setValueFactory(valueFactory);
		currentvalue=myspinner.getValue();
	}
	

}

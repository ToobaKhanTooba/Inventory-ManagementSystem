package application;

import java.awt.event.ItemEvent;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class restraunt {
@FXML private CheckBox c1,c2,c3;
@FXML private Button B1,B2;
@FXML private Label l1;
public void order(ActionEvent ee) {
	int amt=0;
	//never use else with checkboxes...
	if(c1.isSelected())
		amt=amt+100;
	if(c2.isSelected())
		amt=amt+500;
	if(c3.isSelected())
		amt=amt+1000;
	l1.setText(amt+"");
	
}
public void clear(ActionEvent ee) {
	c1.setSelected(false);
	c2.setSelected(false);
	c3.setSelected(false);
l1.setText("0.0");}

}


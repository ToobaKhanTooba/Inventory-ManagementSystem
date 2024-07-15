package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class xyz {
@FXML private Button B1,B2,B3,B4,B5,B6,B7,B8,B9;
int f=0;
public void tick(ActionEvent ee) {
	Alert a=new Alert(AlertType.INFORMATION);
	if(f==0) {
	((Button)ee.getSource()).setText("X");
	f=1;
	}
	else
	{
		((Button)ee.getSource()).setText("0");
		f=0;
	}
	((Button)ee.getSource()).setDisable(true);
if(B1.getText().equals(B2.getText()) && B2.getText().equals(B3.getText()) && B1.getText()!="") {
	a.setContentText(B1.getText()+ " Wins");
	a.show();
	clear();

}
else if(B4.getText().equals(B5.getText()) && B5.getText().equals(B6.getText()) && B4.getText()!="") {
	a.setContentText(B4.getText()+ " Wins");
	a.show();
	clear();

}
else if(B7.getText().equals(B8.getText()) && B8.getText().equals(B9.getText()) && B7.getText()!="") {
	a.setContentText(B7.getText()+ " Wins");
	a.show();
	clear();

}
else if(B1.getText().equals(B5.getText()) && B5.getText().equals(B9.getText()) && B1.getText()!="") {
	a.setContentText(B1.getText()+ " Wins");
	a.show();
	clear();
}
else if(B1.getText().equals(B4.getText()) && B4.getText().equals(B7.getText()) && B1.getText()!="") {
	a.setContentText(B1.getText()+ " Wins");
	a.show();
	clear();
}
else if(B2.getText().equals(B5.getText()) && B5.getText().equals(B8.getText()) && B2.getText()!="") {
	a.setContentText(B2.getText()+ " Wins");
	a.show();
	clear();
}
else if(B3.getText().equals(B6.getText()) && B6.getText().equals(B9.getText()) && B3.getText()!="") {
	a.setContentText(B3.getText()+ " Wins");
	a.show();
	clear();
}

else if(B3.getText().equals(B5.getText()) && B5.getText().equals(B7.getText()) && B3.getText()!="") {
	a.setContentText(B3.getText()+ " Wins");
	a.show();
	clear();
}
else if(B1.getText()!="" && B2.getText()!="" && B3.getText()!="" && B4.getText()!="" && B5.getText()!="" && B6.getText()!="" && B7.getText()!="" && B8.getText()!="" && B9.getText()!="")
	
{
	a.setContentText(" DRAW");
	a.show();
	clear();
}

}
void clear()
{
	B1.setText("");B1.setDisable(false);
	B2.setText("");B2.setDisable(false);
	B3.setText("");B3.setDisable(false);
	B4.setText("");B4.setDisable(false);
	B5.setText("");B5.setDisable(false);
	B6.setText("");B6.setDisable(false);
	B7.setText("");B7.setDisable(false);
	B8.setText("");B8.setDisable(false);
	B9.setText("");B9.setDisable(false);
	clear();
}


	
}



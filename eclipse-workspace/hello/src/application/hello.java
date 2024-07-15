package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
public class hello {
	@FXML private TextField T1,T2,T3;
	@FXML protected void sum(ActionEvent e) {
		 int a,b,c;
		 a=Integer.parseInt(T1.getText());
		 b=Integer.parseInt(T2.getText());
		 c=a+b;
		 T3.setText(c+"");
		System.out.println("hello");
		
		System.out.println("You have sucessfully logged in....");
	}
}

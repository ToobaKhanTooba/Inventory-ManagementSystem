package fxml_files;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class add{
	@FXML private TextField T1,T2,T3;
	 public void sum(ActionEvent e) {
		 int a,b,c;
		 a=Integer.parseInt(T1.getText());
		 b=Integer.parseInt(T2.getText());
		 c=a+b;
		 T3.setText(c+"");
		System.out.println("hello");
		
		System.out.println("You have sucessfully generated sum");
}
}

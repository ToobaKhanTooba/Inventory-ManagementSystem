package fxml_files;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class email {
	@FXML private TextField T1,T2;
	 public void check(ActionEvent e) {
		 String a,b,c;
		 a=T1.getText();
		 b=T2.getText();
		
	 if(b.equals("tooba"))
		System.out.println("Sucessfully logged in");
		 else
		System.out.println("Incorrect password");
}
}

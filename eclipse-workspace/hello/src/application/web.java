package application;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class web {
 @FXML private TextField t1;
 @FXML private PasswordField t2;
 private Stage stage;
 private Scene scene;
 public void check(ActionEvent event)throws IOException
 {
	 String s1,s2;
	 s1=t1.getText();
	 s2=t2.getText();
	 if(s1.equals("Tooba")&&s2.equals("abcd"))
	 {
		 Parent root=FXMLLoader.load(getClass().getResource("web.fxml"));
		 
		 stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		 scene=new Scene(root);
		 stage.setScene(scene);
		 stage.show();
	 }
	 else
	 {
		 System.out.println("Invalid username and password");
	 }
 }
 
}

package application;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class eo {
@FXML private TextField t1,t3;
@FXML private Button b1;
private Stage stage;
private Scene scene;
public void check(ActionEvent event)throws IOException
{Parent root=FXMLLoader.load(getClass().getResource("web.fxml"));

stage=(Stage)((Node)event.getSource()).getScene().getWindow();
scene=new Scene(root);
stage.setScene(scene);
stage.show();

	int a=Integer.parseInt(t1.getText());
if(a%2==0)
	t3.setText("Even");
else
	t3.setText("Odd");

	
}
}



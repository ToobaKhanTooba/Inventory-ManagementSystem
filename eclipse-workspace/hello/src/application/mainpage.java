package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class mainpage {
	@FXML private Button B1,B2;
	private Stage stage;
	private Scene scene;
	public void print(ActionEvent event)throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("web.fxml"));
		stage= (Stage)((Node)event.getSource()).getScene().getWindow();
		scene= new Scene(root);
		stage.setScene(scene);
		stage.show();
		System.out.println("Hello");
	}
	public void check(ActionEvent event)throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("Even_odd.fxml"));
		stage= (Stage)((Node)event.getSource()).getScene().getWindow();
		scene= new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
	


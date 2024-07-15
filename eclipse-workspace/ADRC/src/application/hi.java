package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class hi {
	private Stage stage;
	private Scene scene;
	public void view(ActionEvent event)throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("add.fxml"));
		stage= (Stage)((Node)event.getSource()).getScene().getWindow();
		scene= new Scene(root);
		stage.setScene(scene);
		stage.show();
		System.out.println("Hello");
	}

}

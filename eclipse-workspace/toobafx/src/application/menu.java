package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.MenuItem;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;

public class menu {
@FXML private BorderPane bp;
@FXML private MenuItem mp,mp1,mp2;
public void rest(ActionEvent ee) {
	try{Parent root = FXMLLoader.load(getClass().getResource("restraunt.fxml"));
	   bp.setCenter(root);}
	catch(Exception e) {
		System.out.println(e.toString());
	}
}

public void page(ActionEvent ee) {
	try{Parent root = FXMLLoader.load(getClass().getResource("calculator.fxml"));
	   bp.setCenter(root);}
	catch(Exception e) {
		System.out.println(e.toString());
	}
	
}
public void close(ActionEvent ee) {
	System.exit(1);
}


}

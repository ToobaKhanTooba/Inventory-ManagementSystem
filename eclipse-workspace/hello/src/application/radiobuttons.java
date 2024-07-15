package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class radiobuttons {
@FXML private BorderPane Bp;
@FXML private RadioButton r1,r2,r3,r4,r5;
@FXML private ImageView img;
public void select(ActionEvent event)throws IOException
{
	if(r1.isSelected())
	{
		File file = new File("C:\\Users\\HP\\eclipse-workspace\\hello\\src\\application\\flower.jpg");
        Image image = new Image(file.toURI().toString());  
        img.setImage(image);
		      
	}
	else if(r2.isSelected())
	{
		File file = new File("C:\\Users\\HP\\eclipse-workspace\\hello\\src\\application\\flower.jpg");
        Image image = new Image(file.toURI().toString());  
        img.setImage(image);
		      
	}
	if(r3.isSelected())
	{
		Bp.setStyle("-fx-background-color:red;");
	}
	else if(r4.isSelected())
	{
		Bp.setStyle("-fx-background-color:green;");
	}
	else if(r5.isSelected())
	{
		Bp.setStyle("-fx-background-color:pink;");
	}

		
}
}

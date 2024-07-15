package application;



import java.awt.event.ActionEvent;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class first extends Application {
	void sum(ActionEvent e)
	{
		System.out.println("hello ji");
		}
	@Override
	public void start(Stage primary) throws Exception {
		Parent root=FXMLLoader.load(getClass().getResource("FIRST.fxml"));
		TextField textField = new TextField();       
	      Button playButton = new Button("Play");       
	      Button stopButton = new Button("stop"); 
	      HBox hbox = new HBox(); 
	      hbox.setSpacing(10);
	      ObservableList list = hbox.getChildren();  
	      
	      //Adding all the nodes to the observable list (HBox) 
	      list.addAll(textField, playButton, stopButton);       
	      
	    
	      Scene ss= new Scene(root,300,300);
	      
	    primary.setScene(ss);   
		primary.setTitle("first page");
		primary.show();
					// TODO Auto-generated method stub
		
	}
	public static void main(String args[])
	{
		launch(args);
	}

}

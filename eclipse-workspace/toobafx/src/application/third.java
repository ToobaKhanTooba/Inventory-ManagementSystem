package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class third extends Application {

	public static void main(String[] args) {
		
		launch(args);
	}
	public void start(Stage primaryStage) throws Exception {
		 Button button1 = new Button("Button1");       
	      button1.setStyle("-fx-background-color:blue; -fx-text-fill:green;");
	     /* //Creating button2 
	      Button button2 = new Button("Button2");       
	      
	      //Creating button3
	      Button button3 = new Button("Button3");       
	      
	      //Creating button4 
	      Button button4 = new Button("Button4"); 
	      */
	      Button button5 = new Button("Button5");
	      Button button6 = new Button("Button6");
	      Button button7 = new Button("Button7");
	    		  Button button8 = new Button("Button8");  ;  
	    		  HBox hbox = new HBox();    
	    		  hbox.getStyleClass().add("hbox");
	      //FlowPane flowPane = new FlowPane();
	      ObservableList list = hbox.getChildren();  
	      list.add(button1);
	      //Adding all the nodes to the observable list (HBox) 
	      list.addAll(button5,button6,button8,button7);       
	      button5.setId("Button5");
	     //ObservableList list = flowPane.getChildren(); 
	      //Setting the space between the nodes of a HBox pane 
	      hbox.setSpacing(10);    
	      
	      //Setting the margin to the nodes 
	      hbox.setMargin(button1, new Insets(20, 20, 20, 20));  
	      hbox.setMargin(button5, new Insets(20, 20, 20, 20)); 
	      hbox.setMargin(button6, new Insets(20, 20, 20, 20)); 
	      hbox.setMargin(button7, new Insets(20, 20, 20, 20));  
	      hbox.setMargin(button8, new Insets(20, 20, 20, 20));  
	      //Adding all the nodes to the flow pane 
	      //list.addAll(button1, button2, button3, button4); 
	      Scene scene = new Scene(hbox);
	      scene.getStylesheets().add("style.css");
		primaryStage.setTitle("Flow Pane Example"); 
		
	      //Adding scene to the stage 
	      primaryStage.setScene(scene); 
	         
	      //Displaying the contents of the stage 
	      primaryStage.show(); 
	   } 
	      
	}


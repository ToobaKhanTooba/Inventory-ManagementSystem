package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.MouseEvent;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.*;

public class splash {
@FXML private ProgressBar pb;
	public void click(MouseEvent ee)
	{
		System.out.print("gg");
		  Task<Void> task = new Task<Void>() {
	            @Override
	            protected Void call() throws Exception {
	            	int steps = 1000;
	            	for (int i = 0; i < steps; i++) {
	            		Thread.sleep(5); 
	                    updateProgress(i, steps);
	                    updateMessage(String.valueOf(i));
	                }
	                return null;
	            }
	        };
	        task.setOnFailed(wse -> {
	            wse.getSource().getException().printStackTrace();
	        });
	        task.setOnSucceeded(wse -> {
	        	try {
	    			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Forms/login.fxml"));
	    			Parent root1 = (Parent) fxmlLoader.load();
	    			Stage stage = new Stage();
	    			stage.initStyle(StageStyle.UNDECORATED);
	    			stage.setScene(new Scene(root1,600,400));  
	    			
	    			stage.show();
	    		} catch(Exception e) {}
	            System.out.println("Done!");
	            Node node = (Node) ee.getSource();
	            // Step 3
	            Stage stage = (Stage) node.getScene().getWindow();
	            stage.close();
	            
	        });
	        pb.progressProperty().bind(task.progressProperty());
	         new Thread(task).start();
	    
	}

}
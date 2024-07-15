package application;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

public class Controller implements Runnable {
	Thread Th=null;
	Stage primaryStage;
	@FXML private ProgressBar pb;
	private Stage stage;
	private Scene scene;
	public void initialize() {
		Th=new Thread(this);
		Th.start();
	}
	public void run() {
	
		for(double i=0;i<=1.0;i=i+0.1)
		{
			pb.setProgress(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			
		}
	
	}}
	
	
package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class view {
	@FXML public void initialize() {
		count();
	}
	@FXML private Button B1,B2;
	private Stage stage;
	private Scene scene;
	@FXML protected Label l1;
	public void print(ActionEvent event)throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("add.fxml"));
		stage= (Stage)((Node)event.getSource()).getScene().getWindow();
		scene= new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void count() {
		int a=0;
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/issue","root","root");  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select count(*) from records");  
		while(rs.next())  
		a=rs.getInt(1);
		con.close();
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}			
		l1.setText(a+"");
	}
	public void search(ActionEvent event)throws IOException {
		Parent root=FXMLLoader.load(getClass().getResource("search.fxml"));
		stage= (Stage)((Node)event.getSource()).getScene().getWindow();
		scene= new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
}

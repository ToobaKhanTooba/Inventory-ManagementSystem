package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class add {
	private Stage stage;
	private Scene scene;
	@FXML protected TextField t1,t2,t5;
	@FXML protected DatePicker t3,t4;
	
	public void view(ActionEvent event)throws IOException
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/issue","root","root");  
		PreparedStatement stmt=con.prepareStatement("insert into records(Enrollment_no,Name,Isuue_date,Return_date,Product_ID) values(?,?,?,?,?)");
		String Enrollment_no=t1.getText();
		String name=t2.getText();
		   
		  String Product_ID=t5.getText(); 
		stmt.setString(1,Enrollment_no);
		stmt.setString(2,name);
		stmt.setDate(3, java.sql.Date.valueOf(t3.getValue()));
		stmt.setDate(4, java.sql.Date.valueOf(t4.getValue()));
		stmt.setString(5,Product_ID);
		int i=stmt.executeUpdate();
		System.out.println(i+"recordsinserted");
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void goback(ActionEvent event)throws IOException
	{
		Parent root=FXMLLoader.load(getClass().getResource("abc.fxml"));
		stage= (Stage)((Node)event.getSource()).getScene().getWindow();
		scene= new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
		
	}



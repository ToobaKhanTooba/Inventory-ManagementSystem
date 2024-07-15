package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class login implements Initializable{
	@FXML private TextField t1;
	@FXML private PasswordField t2;
	@FXML Button b1;
	@FXML ImageView exit;
	public void log(ActionEvent event)throws IOException
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/inventory","root","root");  
		PreparedStatement stmt=con.prepareStatement("select count(*) from login where username =? and passwd =?");
		stmt.setString(1,t1.getText());
		stmt.setString(2,t2.getText());
		
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			int x = rs.getInt(1);
			if(x == 1) {
				try {
	    			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Forms/mainpage.fxml"));
	    			Parent root1 = (Parent) fxmlLoader.load();
	    			Stage stage = new Stage();
	    			stage.initStyle(StageStyle.UNDECORATED);
	    			stage.setScene(new Scene(root1,600,400));  
	    			stage.show();
	    		} catch(Exception e) {}
			}else {
				System.out.print("Wrong id or password");
			}
			Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
		}
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		exit.setOnMouseClicked(event ->{
			Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
		});
		
	}
}



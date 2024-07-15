package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class mysqlconnect {
	Connection con = null;
	
	public static Connection ConnectDb() {
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/inventory","root","root");  
//			Statement stmt=con.createStatement();
			System.out.println("Connection established");
			return con;
			
		}catch(Exception e) {
			System.out.println("Error in Connection");
			return null;
		}
		
	}
	public static ObservableList<user> getDatausers(){
		
		Connection con = ConnectDb();
		ObservableList<user> list = FXCollections.observableArrayList();
		try {
			PreparedStatement ps = con.prepareStatement("select * from item");
			ResultSet rs = ps.executeQuery();
			System.out.print(rs.toString());
			while(rs.next()) {
				list.add(new user(Integer.parseInt(rs.getString("sno")),rs.getString("item"),rs.getString("item_type"),Integer.parseInt(rs.getString("price")),Integer.parseInt(rs.getString("total"))));
			}
		}catch(Exception e) {
	System.out.print(e.toString());
		}
		return list;
	}
public static ObservableList<user> search_data(int Sno){
		Connection con = ConnectDb();
		ObservableList<user> list = FXCollections.observableArrayList();
		try {
			PreparedStatement ps = con.prepareStatement("select * from item where sno =?");
			ps.setInt(1,Sno);
			ResultSet rs = ps.executeQuery();
			System.out.print(rs.toString());
			while(rs.next()) {
				list.add(new user(Integer.parseInt(rs.getString("sno")),rs.getString("item"),rs.getString("item_type"),Integer.parseInt(rs.getString("price")),Integer.parseInt(rs.getString("total"))));
			}
		}catch(Exception e) {
			System.out.print(e.toString());
		}
		return list;
	}
	public static void delete_data(int Sno) {
		Connection con = ConnectDb();
		try {
			PreparedStatement ps = con.prepareStatement("delete from item where sno =?");
			ps.setInt(1,Sno);
			ps.executeUpdate();
			System.out.print("Hello");
		}catch(Exception e) {
		}
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText("Item Deleted");
		alert.show();
	}
	
	public static String add(int sno,String name,String type,int quantity,int price) {
		Connection con = ConnectDb();
		String st = "select * from item where sno=?";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(st);
			ps.setInt(1,sno);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return "Data is Already Present";
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			ps = con.prepareStatement("insert into item (sno,item,item_type,price,total) values(?,?,?,?,?)");
			ps.setInt(1,sno);
			ps.setString(2, name);
			ps.setString(3, type);
			ps.setDouble(4, price);
			ps.setInt(5, quantity);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Data inserted";
	}
public static String modify(int sno,String name,String type,int quantity,double price) {
		Connection con = ConnectDb();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("update item set item =?,item_type =?,price =?,total =? where sno =?");
			ps.setString(1, name);
			ps.setString(2, type);
			ps.setDouble(3, price);
			ps.setInt(4, quantity);
			ps.setInt(5, sno);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Changes has been saved";
	}
}

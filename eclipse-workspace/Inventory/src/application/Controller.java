package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller implements Initializable{
	 	@FXML
	    private TableColumn<user, Integer> Sno;

	    @FXML
	    private TableColumn<user, String> Item;

	    @FXML
	    private TableColumn<user, String>Item_type;

	    @FXML
	    private TableColumn<user, Integer>Price;

		@FXML 
		private TableColumn<user, Integer>Total;

	    @FXML
	    private TableView<user> table;

	    ObservableList<user> listM;
	    int index = -1;
	    
	    Connection con = null;
	    ResultSet rs = null;
	    PreparedStatement pst = null;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		Sno.setCellValueFactory(new PropertyValueFactory<user,Integer>("Sno"));
		Item.setCellValueFactory(new PropertyValueFactory<user,String>("Item"));
		Item_type.setCellValueFactory(new PropertyValueFactory<user,String>("Item_type"));
		Price.setCellValueFactory(new PropertyValueFactory<user,Integer>("Price"));
		Total.setCellValueFactory(new PropertyValueFactory<user,Integer>("Total"));


		
		listM = mysqlconnect.getDatausers();
		table.setItems(listM);
	}
}

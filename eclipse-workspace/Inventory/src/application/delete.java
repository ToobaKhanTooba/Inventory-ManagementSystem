package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class delete implements Initializable {
	
	@FXML
    private TextField t1;
	
	@FXML
    private TableColumn<user, Integer> price;

    @FXML
    private TableColumn<user, Integer> quantity;

    @FXML
    private TableColumn<user, Integer> sno;

    @FXML
    private TableColumn<user, String> type;

    @FXML
    private TableColumn<user, String> item;
    
    @FXML
    private TableView<user> table;
	@FXML
    private ImageView exit;
	
	ObservableList<user> listM;
    int index = -1;
    
    private int pk;
    
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		exit.setOnMouseClicked(event ->{
			Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
		});
		
		
	}
	public void del() {
		pk = Integer.parseInt(t1.getText());
		mysqlconnect.delete_data(pk);
	}
	public void search() {
		pk = Integer.parseInt(t1.getText());
		sno.setCellValueFactory(new PropertyValueFactory<user,Integer>("Sno"));
		item.setCellValueFactory(new PropertyValueFactory<user,String>("Item"));
		type.setCellValueFactory(new PropertyValueFactory<user,String>("Type"));
		quantity.setCellValueFactory(new PropertyValueFactory<user,Integer>("Quantity"));
		price.setCellValueFactory(new PropertyValueFactory<user,Integer>("Price"));
		
		listM = mysqlconnect.search_data(pk);
		table.setItems(listM);
		System.out.print("Hello");
	}
}
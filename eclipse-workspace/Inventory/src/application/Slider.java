package application;


import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class Slider implements Initializable{
	
	

    @FXML
    private AnchorPane slider;

    @FXML
    private TableView<user> issue;

    @FXML
    private TableColumn<user, ?> col_sno;

    @FXML
    private TableColumn<user, ?> col_item;

    @FXML
    private TableColumn<user, ?> col_type;

    @FXML
    private TableColumn<user, ?> col_price;

    @FXML
    private TableColumn<user, ?>col_total;
	@FXML
    private Stage stage;
	@FXML
    private Scene scene;
	@FXML
    private ImageView exit;

    @FXML
    private Label menu;
    
    @FXML
    private Label menuclose;

    ObservableList<user>listM;
    int index=-1;
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public void ex() {
    	System.exit(0);
    }
public void search(ActionEvent event) {
	try {
	Parent root=FXMLLoader.load(getClass().getResource("/Forms/search.fxml"));
	stage= (Stage)((Node)event.getSource()).getScene().getWindow();
	stage.initStyle(StageStyle.UNDECORATED);
	scene= new Scene(root);
	stage.setScene(scene);
	stage.show();
	}catch(Exception e) {};
}

public void modify(ActionEvent event) {
	try {
	Parent root=FXMLLoader.load(getClass().getResource("/Forms/modify.fxml"));
	stage= (Stage)((Node)event.getSource()).getScene().getWindow();
	scene= new Scene(root);
	stage.setScene(scene);
	stage.show();
	}catch(Exception e) {};
}
	public void insert(ActionEvent event) {
		try {
		Parent root=FXMLLoader.load(getClass().getResource("/Forms/insert.fxml"));
		stage= (Stage)((Node)event.getSource()).getScene().getWindow();
		scene= new Scene(root);
		stage.setScene(scene);
		stage.show();
		}catch(Exception e) {}
	}
public void delete(ActionEvent event) {
	
	try {
	Parent root=FXMLLoader.load(getClass().getResource("/Forms/delete.fxml"));
	stage= (Stage)((Node)event.getSource()).getScene().getWindow();
	scene= new Scene(root);
	stage.setScene(scene);
	stage.show();}

catch(Exception e) {
	System.out.print("ff"+ e);
}}



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		exit.setOnMouseClicked(event ->{
			System.exit(0);
		});
		slider.setTranslateX(-176);
		menu.setOnMouseClicked(event ->{
			TranslateTransition slide = new TranslateTransition();
			slide.setDuration(Duration.seconds(0.2));
			slide.setNode(slider);
			
			slide.setToX(0);
			slide.play();
			
			slider.setTranslateX(-176);
			
			slide.setOnFinished((ActionEvent ) ->{
				menu.setVisible(false);
				menuclose.setVisible(true);
			});
		});
		menuclose.setOnMouseClicked(event ->{
			TranslateTransition slide = new TranslateTransition();
			slide.setDuration(Duration.seconds(0.4));
			slide.setNode(slider);
			
			slide.setToX(-176);
			slide.play();
			
			slider.setTranslateX(0);
			
			slide.setOnFinished((ActionEvent ) ->{
				menu.setVisible(true);
				menuclose.setVisible(false);
			});
		});
	col_sno.setCellValueFactory(new PropertyValueFactory<>("Sno"));
	col_item.setCellValueFactory(new PropertyValueFactory<>("item"));
	col_type.setCellValueFactory(new PropertyValueFactory<>("item_type"));
	col_price.setCellValueFactory(new PropertyValueFactory<>("price"));
	col_total.setCellValueFactory(new PropertyValueFactory<>("total"));
	listM=mysqlconnect.getDatausers();
	issue.setItems(listM);
	}

}
package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class itemcontroller {
	@FXML
    private Label namelabel;

    @FXML
    private Label pricelabel;

    @FXML
    private ImageView img;
    private Tool tool;
    private MyListener mylistener;
    @FXML
    private void click(MouseEvent mouseEvent) {
    	mylistener.OnClickListener(tool);
    }
	public void setData(Tool tool,MyListener mylistener) {
this.tool=tool;
this.mylistener=mylistener;
namelabel.setText(tool.getName());
pricelabel.setText(Main.CURRENCY+tool.getPrice());
Image image=new Image(getClass().getResourceAsStream(tool.getImgsrc()));
img.setImage(image);

}}

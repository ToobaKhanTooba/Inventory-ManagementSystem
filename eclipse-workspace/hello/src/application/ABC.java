package application;


import java.io.FileInputStream;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.*;

public class ABC{
@FXML private RadioButton r1,r2;
@FXML private ImageView iim;
public void show(ActionEvent e)throws IOException
{Image image;
if(r1.isSelected())
{
image=new Image(new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\hello\\src\\application\\flower.jpg"));
iim.setImage(image);
}else if(r2.isSelected())
	{image=new Image(new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\hello\\src\\application\\dog.jpg"));
iim.setImage(image);
}
}
}

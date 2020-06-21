package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class playerss  {

 	@FXML 
	private TableView<String> table;
	@FXML 
	private TableColumn<String,String> Players;
@FXML
private ListView<String> list1;
public  ObservableList<String>search =  FXCollections.observableArrayList();

	
	public void receive(ObservableList<String> list) {
	   search=list;
		for(int i =0;i<search.size();i++) {
			list1.getItems().add(search.get(i));
		}	
	}

public void Quit(ActionEvent event) {
	Stage window = (Stage)(((Node) event.getSource()).getScene().getWindow());
	window.close();
}
public void back(ActionEvent event) {
	Main Scene=new Main();
	try {
	 Parent root = FXMLLoader.load(getClass().getResource("/application/menu.fxml"));
   	 Scene.setScene(event, root,"Hangman");
} catch (IOException e) {
	e.printStackTrace();
}
}
}

package application;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;

import eg.edu.alexu.csd.datastructure.linkedList.cs77_cs84.doublyLinkedLists;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class controller1 {
	public static app app = new app();
	@FXML
	private Label warning;
	@FXML
	private Button animals;
	@FXML
	private Button countries;
	@FXML
	private Button movies;
	@FXML
	private Button random;
	@FXML
	private TextField name;
	@FXML
	private ListView<String> list1;
	
	static FileOutputStream fos = null;
	static ObjectOutputStream owrite = null;
	static FileInputStream fis = null;
	static ObjectInputStream Oread = null;
	
public void help(ActionEvent event) {
	Main Scene=new Main();
	try {
	 Parent root = FXMLLoader.load(getClass().getResource("/application/hint.fxml"));
   	 Scene.setScene(event, root, "How to Play?");
} catch (IOException e) {
	e.printStackTrace();
}
}
public void game(ActionEvent event) {
	Main Scene=new Main();
	try {
	 Parent root = FXMLLoader.load(getClass().getResource("/application/game.fxml"));
   	 Scene.setScene(event, root, "Game");
   	 
} catch (IOException e) {
	e.printStackTrace();
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
public void category(ActionEvent event) {
	Main Scene=new Main();
	try {
	 Parent root = FXMLLoader.load(getClass().getResource("/application/categories.fxml"));
   	 Scene.setScene(event, root,"Categories");
} catch (IOException e) {
	e.printStackTrace();
}
}
public static doublyLinkedLists list = new doublyLinkedLists();


public void save(ActionEvent event) {
	try {
	File score = new File("Scores.txt");
	if(!score.exists()) {
		score.createNewFile();
	}
	if(!name.getText().isEmpty()) {
		if(score.length()!=0) {
			list = readFile(score);
		}
		int verify=0;
		for(int i =0;i<list.size();i++) {
			if(list.get(i).equals((String)name.getText())) {
             verify=1;
             
             }
			
		}
		if(verify==1) {
			warning.setText("Name already exists!");

		}
		else if(verify==0) {			
		list.add(name.getText());
		fos = new FileOutputStream(score);
		owrite = new ObjectOutputStream(fos);
		owrite.writeObject(list);
		owrite.close();
		fos.close();
		Main Scene=new Main();
	
	 Parent root = FXMLLoader.load(getClass().getResource("/application/menu.fxml"));
   	 Scene.setScene(event, root,"Hangman");}
	}

else {
	warning.setText("Please enter your name!");
}
	} catch (IOException e) {
		e.printStackTrace();
	}
}
public void players(ActionEvent event) {
	Main Scene=new Main();
		try {
			File score = new File("Scores.txt");
			doublyLinkedLists players = readFile(score);
			ObservableList<String>search =  FXCollections.observableArrayList();
			for(int i =0;i<players.size();i++) {
				search.add((String)players.get(i));
			}
			FXMLLoader loader=new FXMLLoader(getClass().getResource("/application/top.fxml"));
			Parent root1=loader.load();
			playerss c=loader.getController();
		   c.receive(search);
	      Scene.setScene(event, root1,"Players");
	 
} catch (IOException e) {
	e.printStackTrace();
}
}
public void listing() {
	File score = new File("Scores.txt");
	doublyLinkedLists players = readFile(score);
	ObservableList<String>search =  FXCollections.observableArrayList();
	for(int i =0;i<players.size();i++) {
		System.out.println((String)players.get(i));
		search.add((String)players.get(i));
	}
	FXMLLoader loader=new FXMLLoader(getClass().getResource("/application/top.fxml"));
	
	playerss c=loader.getController();
	System.out.println((String)search.get(1)+"1111111111115555555555555555555");

   c.receive(search);
	System.out.println((String)search.get(1)+"22221111111115555555555555555555");

}
public static doublyLinkedLists readFile(File file) {
	  doublyLinkedLists list = new doublyLinkedLists();
	  if(file.length()!=0) {
		try {
		fis = new FileInputStream(file);
		Oread = new ObjectInputStream(fis);
		list = (doublyLinkedLists) Oread.readObject();
		Oread.close();
		fis.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	  }
		return list;
	}
public void handle (ActionEvent event) {
	 if(event.getSource()== animals) {
     app.read("animals.txt");
	  app.Secretword=  app.selectRandomSecretWord();
}
	 else if(event.getSource()== movies) {
		 app.read("movies.txt");
	  app.Secretword=  app.selectRandomSecretWord();


	 }
	 else if(event.getSource()==random) {
		 app.read("random.txt");
		  app.Secretword=  app.selectRandomSecretWord();


	 }
	 else if(event.getSource()== countries) {
		 app.read("countries.txt");
		 app.Secretword=  app.selectRandomSecretWord();

	 }
	 Main Scene=new Main();
		try {
		 Parent root = FXMLLoader.load(getClass().getResource("/application/game.fxml"));
	   	 Scene.setScene(event, root, "Game");
	   	 
	} catch (IOException e) {
		e.printStackTrace();
	}

}


}


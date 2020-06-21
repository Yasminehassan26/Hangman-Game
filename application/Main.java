package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent  root=FXMLLoader.load(getClass().getResource("/application/menu.fxml"));
			Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void setScene(javafx.event.ActionEvent event ,Parent root,String name) {
		  Scene scene=new Scene(root);
			Stage window = (Stage)(((Node) event.getSource()).getScene().getWindow());
		    window.setScene(scene);
			 window.setTitle(name);
		    window.setResizable(false);
				window.show(); 
	}
	public static void main(String[] args) {
		launch(args);
	}
}

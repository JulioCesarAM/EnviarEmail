package dad.mvc.app;

import dad.mvc.Controller.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {
private Controller controller;
	
	public void start(Stage primaryStage) throws Exception {
		
		controller=new Controller();
		
		Scene scene=new Scene(controller.getView());
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Enviar Email");

		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);

}
}

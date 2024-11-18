package Application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.net.URL;

public class App extends Application {

   @Override
   public void start(Stage primaryStage) throws Exception {
       // Charger le fichier FXML
       URL fxmlUrl = getClass().getResource("signup.fxml");
       System.out.println("FXML URL: " + fxmlUrl);
       
       FXMLLoader loader = new FXMLLoader(fxmlUrl);
       AnchorPane root = loader.load();
       
       // Créer la scène et l'ajouter au stage
       Scene scene = new Scene(root, 800, 400);
       primaryStage.setTitle("Advanced Library Signup");
       primaryStage.setScene(scene);
       primaryStage.show();
   }

   public static void main(String[] args) {
       launch(args);
   }
}
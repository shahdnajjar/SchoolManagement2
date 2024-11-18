import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Left Section (Image and Welcome Text)
        VBox leftSection = new VBox(10);
        leftSection.setPadding(new Insets(20));
        leftSection.setAlignment(Pos.CENTER);
        leftSection.setStyle("-fx-background-color: #FFFFFF;");

        Text welcomeText = new Text("Welcome to Advance Library");
        welcomeText.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        welcomeText.setFill(Color.DARKRED);

        Image image = new Image("https://example.com/library_image.png"); // Replace with your image URL or local file
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(200);
        imageView.setFitHeight(200);
        imageView.setPreserveRatio(true);

        leftSection.getChildren().addAll(welcomeText, imageView);

        // Right Section (Signup Form)
        VBox rightSection = new VBox(15);
        rightSection.setPadding(new Insets(20));
        rightSection.setAlignment(Pos.TOP_CENTER);
        rightSection.setStyle("-fx-background-color: #FFC0CB;");

        Text signupTitle = new Text("Signup Page");
        signupTitle.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        signupTitle.setFill(Color.WHITE);

        Text createAccountText = new Text("Create New Account");
        createAccountText.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        createAccountText.setFill(Color.RED);

        TextField usernameField = new TextField();
        usernameField.setPromptText("Username");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        TextField emailField = new TextField();
        emailField.setPromptText("E-mail");

        TextField contactField = new TextField();
        contactField.setPromptText("Contact");

        Button signupButton = new Button("SIGNUP");
        signupButton.setStyle("-fx-background-color: #FF0000; -fx-text-fill: white; -fx-font-size: 14px;");

        Button loginButton = new Button("LOGIN");
        loginButton.setStyle("-fx-background-color: #FF0000; -fx-text-fill: white; -fx-font-size: 14px;");

        rightSection.getChildren().addAll(signupTitle, createAccountText, usernameField, passwordField, emailField, contactField, signupButton, loginButton);

        // Main Layout
        HBox mainLayout = new HBox();
        mainLayout.getChildren().addAll(leftSection, rightSection);
        HBox.setHgrow(leftSection, Priority.ALWAYS);
        HBox.setHgrow(rightSection, Priority.ALWAYS);

        Scene scene = new Scene(mainLayout, 800, 400);
        primaryStage.setTitle("Advanced Library Signup");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

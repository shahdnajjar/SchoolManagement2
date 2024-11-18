package Application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class Appcontroller {

    @FXML
    private TextField usernameField;
    
    @FXML
    private PasswordField passwordField;
    
    @FXML
    private TextField emailField;
    
    @FXML
    private TextField contactField;

    @FXML
    public void handleSignup() {
        // Add logic for handling signup
        System.out.println("Signing up user: " + usernameField.getText());
    }

    @FXML
    public void handleLogin() {
        // Add logic for handling login
        System.out.println("Logging in user: " + usernameField.getText());
    }
}

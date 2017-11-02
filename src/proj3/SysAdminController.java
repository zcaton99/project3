package proj3;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SysAdminController {

    @FXML
    private TextField userTypeTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    private TextField usernameTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField phoneNumberTextField;

    @FXML
    private TextField deleteUserTextField;

    @FXML
    private TextField resetUserTextField;

    @FXML
    private TextField resetPasswordTextField;

    @FXML
    void createAccountButton(ActionEvent event) {
        String userType = userTypeTextField.getText();
        String pass = passwordTextField.getText();
        String username = usernameTextField.getText();
        String email = emailTextField.getText();
        String phoneNum = phoneNumberTextField.getText();
        
        //SysAdmin.addUser(userType, phoneNum, email, username, pass);
    }

    @FXML
    void deleteAccountButton(ActionEvent event) {

    }

    @FXML
    void resetPasswordButton(ActionEvent event) {

    }

}

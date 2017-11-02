package proj3;



import java.io.FileNotFoundException;
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
    void createAccountButton(ActionEvent event) throws FileNotFoundException {
        SysAdmin sysAdmin = new SysAdmin();
        String userType = userTypeTextField.getText();
        String pass = passwordTextField.getText();
        String username = usernameTextField.getText();
        String email = emailTextField.getText();
        String phoneNum = phoneNumberTextField.getText();
       
        sysAdmin.addUser(userType, phoneNum, email, username, pass);
        
        //SysAdmin.addUser(userType, phoneNum, email, username, pass);
    }

    @FXML
    void deleteAccountButton(ActionEvent event) throws FileNotFoundException{
        String usernameDelete = deleteUserTextField.getText();
        SysAdmin delAdmin = new SysAdmin();
        delAdmin.deleteUser(usernameDelete);
        
        
    }

    @FXML
    void resetPasswordButton(ActionEvent event) {
        String usernameReset = resetUserTextField.getText();
        String passwordReset = resetPasswordTextField.getText();
    }

}

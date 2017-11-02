package proj3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 *
 * @author zachcaton
 */
public class SysAdmin extends Employee{
    
    
    ArrayList<Employee> users = new ArrayList<>();
    String fileName = "users.txt";
    
    public void addUsers(String userType, String phoneNumber, String email, String userName, String password) throws FileNotFoundException{
        
        String [] user = new String[5];
        user[0] = userType;
        user[1] = phoneNumber;
        user[2] = email;
        user[3] = userName;
        user[4] = password;
        Employee em = new Employee(user[0], user[1], user[2], user[3], user[4]);
        
        users.add(em);           
        
        File f = new File(fileName);
        try (PrintWriter p = new PrintWriter(f)) {
            for(Employee usr: users){
                p.println(usr.toString());
            }
        }
        
    }

    
    
    
}

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
import java.util.Scanner;
/**
 *
 * @author zachcaton
 */
public class SysAdmin extends Employee{
    
    
    ArrayList<Employee> users = new ArrayList<>();
    String fileName = "users.txt";
    
    public void addUser(String userType, String phoneNumber, String email, String userName, String password) throws FileNotFoundException{
        
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

    public void deleteUser(String username) throws FileNotFoundException{
        //read from user.txt
        //then compare names and delete the correct one
        if(users.isEmpty() == true){
            File vf = new File(fileName);
            Scanner inVF = new Scanner(vf);

            while(inVF.hasNext()){
                String line = inVF.nextLine();
                String [] pA = line.split(",");
                Employee ba = new Employee(pA[0], pA[1], pA[2], pA[3], pA[4]);
                users.add(ba);
            }
            for(int i=0; i< users.size(); i++){
                if(users.get(i).getUsername().compareTo(username) == 0){
                    users.remove(i);
                }
            }
            File f = new File(fileName);
            try (PrintWriter p = new PrintWriter(f)) {
                for(Employee usr: users){
                    p.println(usr.toString());
                }
            }
        }else{
            for(int i=0; i< users.size(); i++){
                if(users.get(i).getUsername().compareTo(username) == 0){
                    users.remove(i);
                }
            }
            File f = new File(fileName);
            try (PrintWriter p = new PrintWriter(f)) {
                for(Employee usr: users){
                    p.println(usr.toString());
                }
            }
        }
                
    }
    
    
    
}

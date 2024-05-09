package controller;
import view.*;
import model.*;
import javax.swing.*;
public class logincontrol extends JFrame{
public logincontrol (){

    admin A = new admin();
    
    if(A.getUseradmin().equals(login.us)&&A.getPasswordadmin().equals(login.pa)){
        new viewAdmin();
        
    }
    else {
    new login();

    JOptionPane.showMessageDialog(rootPane, "Sai tài khoản hoặc mật khẩu.","Login error",
    JOptionPane.ERROR_MESSAGE);
    }
}
}

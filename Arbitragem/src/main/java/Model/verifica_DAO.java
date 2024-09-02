
package Model;


import View.Menu_GUI;
import javax.swing.JOptionPane;

public class verifica_DAO {
   
    public static void login(){
        String log = View.Login_GUI.login_txt.getText();
        log = log.toLowerCase();
        
        String sen = View.Login_GUI.senha_txt.getText();
        sen = sen.toLowerCase();
        
        if(log.equals("admin") && sen.equals("admin")){
            JOptionPane.showMessageDialog(null,"Seja Bem Vindo !!!");
            new Menu_GUI().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Senha ou Login incorreto\nTente Novamente !");
        }
        
        
    
    }
    
    
}

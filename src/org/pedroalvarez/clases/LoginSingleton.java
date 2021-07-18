package org.pedroalvarez.clases;

import javax.swing.JFrame;
import org.pedroalvarez.sistema.FRM_Login;


public class LoginSingleton {
    
    private static JFrame log;
    
    private LoginSingleton() {
    }
    
    public static JFrame getInstance(){
        if(log == null)
            log = new FRM_Login();
        
        return log;
    }
    
}

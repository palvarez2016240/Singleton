package org.pedroalvarez.clases;

import javax.swing.JFrame;
import org.pedroalvarez.sistema.FRM_Programador;

public class Programador {
    
    private static JFrame prog;
    
    private Programador() {
    }
    
    public static JFrame getInstance(){
        if(prog == null)
            prog = new FRM_Programador();
        
        return prog;
    }
    
}

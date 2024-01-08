package eventos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class Ventana extends JFrame{
    
    Ventana(String title, int width, int height, int close){
        setTitle(title);
        setSize(width, height);
        setDefaultCloseOperation(close);
        setLocationRelativeTo(null);
        
        addWindowListener(new WindowAdapter(){
            /*
            @Override
            public void windowStateChanged(WindowEvent we){
                System.out.println("New State");
                if(we.getNewState()==Frame.MAXIMIZED_BOTH){
                    System.out.println("Window "+title+" Maximized "+(int)(Math.random()*10));
                }
            }
            */
            @Override
            public void windowActivated(WindowEvent we) {
                System.out.println("Window "+title+" Activated "+(int)(Math.random()*10));
            }

            @Override
            public void windowDeactivated(WindowEvent we) {
                System.out.println("Window "+title+" Desactivated "+(int)(Math.random()*10));
            }
        });
    }
    
    void secondWindow(Ventana v){
        //v.setLocationRelativeTo(this);
        v.setVisible(!v.isVisible());
    }
}
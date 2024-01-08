package eventos;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lámina extends JPanel{
    
    Color background;
    boolean darker;
    
    Lámina(Color background){
        setBackgroundColor(background);
        darker=false;
    }
    
    public void setBackgroundColor(Color background){
        this.background=background;
        repaint();
    }
    
    @Override
    public void paintComponent(java.awt.Graphics g){
        super.paintComponent(g);
        setBackground(background);
    }
    
    void addButton(JButton button){
        add(button);
    }
    
    void addButton(String name, ActionListener al, Action a){
        javax.swing.JButton button=new javax.swing.JButton(a);
        button.addActionListener(al);
        add(button);
    }
    
    void addTextField(JTextField field){
        add(field);
    }
    
    void darkAndBright(){
        background=darker?background.brighter():background.darker();
        repaint();
        darker=!darker;
    }
    
    void print(String msg){
        System.out.println(msg);
    }
    
    void transferText(JTextField emisor, JTextField receptor){
        receptor.setText(emisor.getText());
    }
    
    /**
     * @deprecated 
     */
    private void setPosition(JComponent comp, int x, int y){
        int width=(int)comp.getPreferredSize().getWidth(),
        height=(int)comp.getPreferredSize().getHeight();
        setLayout(null);
        //comp.setLocation(x-width/2, y-height/2);
        comp.setBounds(x-width/2, y-height/2, width, height);
    }
}
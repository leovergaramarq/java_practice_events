package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;

public class ActionIDK extends AbstractAction{

    public ActionIDK(String name, Icon icon, Color buttonColor){
        putValue(Action.NAME, name);
        putValue(Action.SMALL_ICON, icon);
        putValue(Action.SHORT_DESCRIPTION, "Poner el panel de color "+buttonColor+".");
        putValue("button_color", buttonColor);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Action Performed uwu");
    }
    
}

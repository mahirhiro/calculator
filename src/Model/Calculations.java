package Model;

import View.Panel;

import java.util.Observable;
import java.util.Observer;

public class Calculations extends Observable implements Observer {
    private Panel panel;

    public Calculations() {

    }

    public Calculations(Panel panel) {
        this.panel = panel;

    }

    public void setNumberOne(int i) {
        panel.getTextField().setText(panel.getTextField().getText()+4);
    }

    @Override
    public void update(Observable o, Object arg) {
        refresh();
    }
    public void refresh(){
        setChanged();
        notifyObservers();
    }
}

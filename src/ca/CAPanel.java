package ca;

import mvc.AppFactory;
import mvc.AppPanel;

import javax.swing.*;

public class CAPanel extends AppPanel {

    public CAPanel(AppFactory factory) {
        super(factory);
        JButton run1 = new JButton("RUN1");
        run1.addActionListener(this);
        JButton run50 = new JButton("RUN50");
        run50.addActionListener(this);
        JButton clear = new JButton("CLEAR");
        clear.addActionListener(this);
        JButton populate = new JButton("POPULATE");
        populate.addActionListener(this);
        //controlPanel.setLayout(new GridLayout(2,2));
        controlPanel.add(run1);
        controlPanel.add(run50);
        controlPanel.add(clear);
        controlPanel.add(populate);
    }

}



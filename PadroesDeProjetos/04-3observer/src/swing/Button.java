package src.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton implements ActionListener {

    private static final long serialVersionUID = -6974131059020314059L;
    private Label[] labels;

    public Button(String text, Label... labels) {
        super(text);
        // 1 - Implementar a interface ActionListener
        this.labels = labels;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Label label : labels) {
            label.increment();
        }

    }

    // Existem 3 possiblidade de se implementar o addAcaoListener
    // 1 - Implementar a interface ActionListener
    // 2 - Usar uma classe anonima
    // 3 - Usar uma expressão lambda



//    public Button(String text, Label... labels) {
//        super(text);
//        // 2 - Usar uma classe anonima
//
//        addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                for (Label label : labels) {
//                    label.increment();
//                }
//            }
//        });
//
//    }
//fomra mais enxuta de se trabalhar
//    public Button(String text, Label... labels) {
//        super(text);
//        // 3 - Usar uma expressão lambda
//        addActionListener(e -> {
//            for (Label label : labels) {
//                label.setText(text);
//            }
//        });
//    }




}

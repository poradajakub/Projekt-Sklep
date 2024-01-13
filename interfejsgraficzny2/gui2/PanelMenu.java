package interfejsgraficzny2.gui2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelMenu extends JPanel {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JComboBox comboBox;
    private String[] metody;
    private JButton button6;

    private int spacing = 1;


    public PanelMenu(Frame frame) {
        setLayout(new GridLayout(0, 1));
        setOpaque(false);


        button1 = new JButton("Przesun tydzien");
        button2 = new JButton("Zapis");
        button3 = new JButton("Odczyt");
        button4 = new JButton("Statystyki ogolne");
        button5 = new JButton("Algorytm koszykowy");
        button6 = new JButton("Promocje");

        add(Box.createVerticalStrut(spacing));
        add(Box.createVerticalStrut(spacing));
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);


        button2.addActionListener(e -> {
            //serializacja
            JOptionPane.showMessageDialog(frame, "Zapisano stan sklepu", "Serializacja", JOptionPane.INFORMATION_MESSAGE);
        });

        button3.addActionListener(e -> {
            //serializacja
            JOptionPane.showMessageDialog(frame, "Odczytano stan sklepu", "Deserializacja", JOptionPane.INFORMATION_MESSAGE);
        });

        button4.addActionListener(e ->{
            //statystyki ogolne
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO: metody
                metody = new String[]{"Metoda 1", "Metoda 2", "Metoda 3"};
                JComboBox<String> optionComboBox = new JComboBox<>(metody);

                int result = JOptionPane.showOptionDialog(frame,
                        optionComboBox,
                        "Wybierz algorytm koszykowy",
                        JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        null,
                        null);

                if (result == JOptionPane.OK_OPTION) {
                    String selectedOption = (String) optionComboBox.getSelectedItem();
                    JOptionPane.showMessageDialog(frame,
                            "Wybrano: " + selectedOption,
                            "Algorytm koszykowy", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        button5.addActionListener(e ->{
            //promocje
        });
    }


    public JButton getButton1() {
        return button1;
    }
}
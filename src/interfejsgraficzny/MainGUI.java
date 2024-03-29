package interfejsgraficzny;


import interfejsgraficzny2.gui2.Frame;

import javax.swing.*;

import static javax.swing.UIManager.setLookAndFeel;

public class MainGUI {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            try {
                // Odpowiednie zakomentowac przy uzywaniu:

                //setLookAndFeel("com.apple.laf.AquaLookAndFeel"); // MacOS
                setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); // Windows
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (UnsupportedLookAndFeelException e) {
                throw new RuntimeException(e);
            }
            new Ramka();
        });
    }
}

package interfejsgraficzny2.gui2;

import sklep.Regal;
import sklep.Sklep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Regal4 extends JFrame {
    private Sklep sklep;
    private Regal regal;

    public Regal4(Sklep sklep) {
        this.sklep = sklep;
        this.regal = sklep.getRegalyWSklepie()[3];

        // USTAWIENIA RAMKI
        setTitle("Regał 4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(650, 600);

        // TŁO (REGAL JPG)
        ImageIcon mainImageIcon = loadImageIcon("jhzg_o32t_221020.jpg"); // regal.jpg
        Image mainImage = mainImageIcon.getImage();
        Image scaledMainImage = mainImage.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        mainImageIcon = new ImageIcon(scaledMainImage);

        JLabel mainImageLabel = new JLabel(mainImageIcon);
        mainImageLabel.setBounds(0, 0, getWidth(), getHeight());

        // tu powklejać sciezki do jpg produktow
        ImageIcon produkt1 = loadImageIcon("majonez.png");
        ImageIcon produkt2 = loadImageIcon("tuńczyk.png");
        ImageIcon produkt3 = loadImageIcon("kiełbasa.png");
        ImageIcon produkt4 = loadImageIcon("mąka pszenna.png");
        ImageIcon produkt5 = loadImageIcon("wodamienralna.png");
        ImageIcon produkt6 = loadImageIcon("majonez.png");
        ImageIcon produkt7 = loadImageIcon("tuńczyk.png");
        ImageIcon produkt8 = loadImageIcon("kiełbasa.png");
        ImageIcon produkt9 = loadImageIcon("mąka pszenna.png");
        ImageIcon produkt10 = loadImageIcon("wodamienralna.png");
        ImageIcon produkt11 = loadImageIcon("majonez.png");
        ImageIcon produkt12 = loadImageIcon("tuńczyk.png");
        ImageIcon produkt13 = loadImageIcon("kiełbasa.png");
        ImageIcon produkt14 = loadImageIcon("mąka pszenna.png");
        ImageIcon produkt15 = loadImageIcon("wodamienralna.png");

        // skalowanie jpgow produktow
        produkt1 = new ImageIcon(produkt1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        produkt2 = new ImageIcon(produkt2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        produkt3 = new ImageIcon(produkt3.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        produkt4 = new ImageIcon(produkt4.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        produkt5 = new ImageIcon(produkt5.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        produkt6 = new ImageIcon(produkt6.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        produkt7 = new ImageIcon(produkt7.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        produkt8 = new ImageIcon(produkt8.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        produkt9 = new ImageIcon(produkt9.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        produkt10 = new ImageIcon(produkt10.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        produkt11 = new ImageIcon(produkt11.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        produkt12 = new ImageIcon(produkt12.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        produkt13 = new ImageIcon(produkt13.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        produkt14 = new ImageIcon(produkt14.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        produkt15 = new ImageIcon(produkt15.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));

        JButton button1 = new JButton(produkt1);
        JButton button2 = new JButton(produkt2);
        JButton button3 = new JButton(produkt3);
        JButton button4 = new JButton(produkt4);
        JButton button5 = new JButton(produkt5);
        JButton button6 = new JButton(produkt6);
        JButton button7 = new JButton(produkt7);
        JButton button8 = new JButton(produkt8);
        JButton button9 = new JButton(produkt9);
        JButton button10 = new JButton(produkt10);
        JButton button11 = new JButton(produkt11);
        JButton button12 = new JButton(produkt12);
        JButton button13 = new JButton(produkt13);
        JButton button14 = new JButton(produkt14);
        JButton button15 = new JButton(produkt15);

         button1.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrzewijalneOkno aaa= new PrzewijalneOkno(0,0);
                aaa.setVisible(true);
                aaa.setLocationRelativeTo(null);
                //System.out.println("OKOKO");
            }
        });

        button2.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrzewijalneOkno aaa= new PrzewijalneOkno(0,1);
                aaa.setVisible(true);
                aaa.setLocationRelativeTo(null);


            }
        });

        button3.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrzewijalneOkno aaa= new PrzewijalneOkno(0,2);
                aaa.setVisible(true);
                aaa.setLocationRelativeTo(null);
            }
        });

        button4.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrzewijalneOkno aaa= new PrzewijalneOkno(0,3);
                aaa.setVisible(true);
                aaa.setLocationRelativeTo(null);
            }
        });

        button5.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrzewijalneOkno aaa= new PrzewijalneOkno(0,4);
                aaa.setVisible(true);
                aaa.setLocationRelativeTo(null);
            }
        });

        button6.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrzewijalneOkno aaa= new PrzewijalneOkno(1,0);
                aaa.setVisible(true);
                aaa.setLocationRelativeTo(null);
            }
        });

        button7.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrzewijalneOkno aaa= new PrzewijalneOkno(1,1);
                aaa.setVisible(true);
                aaa.setLocationRelativeTo(null);
            }
        });

        button8.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrzewijalneOkno aaa= new PrzewijalneOkno(1,2);
                aaa.setVisible(true);
                aaa.setLocationRelativeTo(null);
            }
        });

        button9.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrzewijalneOkno aaa= new PrzewijalneOkno(1,3);
                aaa.setVisible(true);
                aaa.setLocationRelativeTo(null);
            }
        });

        button10.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrzewijalneOkno aaa= new PrzewijalneOkno(1,4);
                aaa.setVisible(true);
                aaa.setLocationRelativeTo(null);
            }
        });

        button11.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrzewijalneOkno aaa= new PrzewijalneOkno(2,0);
                aaa.setVisible(true);
                aaa.setLocationRelativeTo(null);
            }
        });

        button12.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrzewijalneOkno aaa= new PrzewijalneOkno(2,1);
                aaa.setVisible(true);
                aaa.setLocationRelativeTo(null);
            }
        });

        button13.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrzewijalneOkno aaa= new PrzewijalneOkno(2,2);
                aaa.setVisible(true);
                aaa.setLocationRelativeTo(null);
            }
        });

        button14.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrzewijalneOkno aaa= new PrzewijalneOkno(2,3);
                aaa.setVisible(true);
                aaa.setLocationRelativeTo(null);
            }
        });

        button15.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrzewijalneOkno aaa= new PrzewijalneOkno(2,4);
                aaa.setVisible(true);
                aaa.setLocationRelativeTo(null);
            }
        });
        
        button1.setBounds(50, 20, 100, 100);
        button2.setBounds(162, 20, 100, 100);
        button3.setBounds(274, 20, 100, 100);
        button4.setBounds(386, 20, 100, 100);
        button5.setBounds(498, 20, 100, 100);
        button6.setBounds(50, 150, 100, 100);
        button7.setBounds(162, 150, 100, 100);
        button8.setBounds(274, 150, 100, 100);
        button9.setBounds(386, 150, 100, 100);
        button10.setBounds(498, 150, 100, 100);
        button11.setBounds(50, 290, 100, 100);
        button12.setBounds(162, 290, 100, 100);
        button13.setBounds(274, 290, 100, 100);
        button14.setBounds(386, 290, 100, 100);
        button15.setBounds(498, 290, 100, 100);

        JButton statOgolne = new JButton("Statystyki ogólne");
        JButton statTygodniowe = new JButton("Statystyki tygodniowe");
        JButton powrot = new JButton("Powrót do strony głównej");

        statOgolne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Wykresy.pokazWykresSprzedazyCalorocznejDlaRegalu(regal);
            }
        });

        statTygodniowe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Wykresy.pokazWykresSprzedazyTygodniowejDlaRegalu(regal);
            }
        });

        powrot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                 Frame panelGlowny = new Frame(getSklep());

                dispose();

                 panelGlowny.setVisible(true);
            }
        });
        
        statOgolne.setBounds(37, 460, 178, 50);
        statTygodniowe.setBounds(224, 460, 172, 50);
        powrot.setBounds(406, 460, 185, 50);

        // tu dodaje wszystko do ramki
        getContentPane().setLayout(null);
        
        getContentPane().add(button1);
        getContentPane().add(button2);
        getContentPane().add(button3);
        getContentPane().add(button4);
        getContentPane().add(button5);
        getContentPane().add(button6);
        getContentPane().add(button7);
        getContentPane().add(button8);
        getContentPane().add(button9);
        getContentPane().add(button10);
        getContentPane().add(button11);
        getContentPane().add(button12);
        getContentPane().add(button13);
        getContentPane().add(button14);
        getContentPane().add(button15);
        getContentPane().add(statOgolne);
        getContentPane().add(statTygodniowe);
        getContentPane().add(powrot);

        getContentPane().add(mainImageLabel);
        
        setLocationRelativeTo(null);
    }

    private ImageIcon loadImageIcon(String imageName) {
        ClassLoader classLoader = getClass().getClassLoader();
        java.net.URL imageURL = classLoader.getResource("interfejsgraficzny2/obrazki/" + imageName);
        return new ImageIcon(imageURL);
    }
    private class PrzewijalneOkno extends JFrame {
        public PrzewijalneOkno(int x, int y) {
            // Ustawienia podstawowe okna
            setTitle("Polka [" + x + ", " + y + "]");
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setSize(500, 350);

            // Tworzenie obszaru tekstowego
            JTextArea textArea = new JTextArea(regal.getPolkiWRegale()[x][y].toString());
            textArea.setEditable(false); // Ustawienie, aby obszar tekstowy był tylko do odczytu

            // Ustawienie czcionki
            Font currentFont = textArea.getFont();
            int newSize = currentFont.getSize() + 2; // Przykładowy przyrost rozmiaru czcionki (zmień według potrzeb)
            Font newFont = new Font(currentFont.getName(), currentFont.getStyle(), newSize);
            textArea.setFont(newFont);

            // Dodanie obszaru tekstowego do panelu z przewijaniem
            JScrollPane scrollPane = new JScrollPane(textArea);

            // Dodanie panelu z przewijaniem do okna
            add(scrollPane, BorderLayout.CENTER);
        }
    }
//    public static void main(String[] args) {
//        javax.swing.SwingUtilities.invokeLater(() -> new Regal4().setVisible(true));
//    }

    // GETTERY
    public Sklep getSklep() {
        return sklep;
    }

    // SETTERY
    public void setSklep(Sklep sklep) {
        this.sklep = sklep;
    }
}

package Miguel.Corporation;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import java.util.Scanner;

public class Main extends JFrame {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ImageIcon logo = new ImageIcon(Objects.requireNonNull(MacrosPanel
            .class
            .getClassLoader()
            .getResource("muscles.png")));

    public Main(String title) throws HeadlessException {
        super(title);
        FlatLightLaf.install();
        getContentPane().setLayout(null);

        // Now add an AddressPanel
        MacrosPanel macrosPanel = new MacrosPanel("Enter Your Data In Grams");
        macrosPanel.setLocation(10, 50);
        getContentPane().add(macrosPanel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(445, 440);
        setResizable(true);
        setIconImage(logo.getImage());
    }

    public static void main(String[] args) {
        JFrame frame = new Main("Macros Converter");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
}

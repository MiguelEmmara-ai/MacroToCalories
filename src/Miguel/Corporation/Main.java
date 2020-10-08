package Miguel.Corporation;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main extends JFrame{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        JFrame frame = new Main("Macros Converter");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        /*Macros macros = questions();
        System.out.println("\nYour Total Calories is: " + macros.getTotalCalories());*/
    }

    private static Macros questions() {
        System.out.print("Enter Your Proteins In Grams: ");
        float proteins = scanner.nextFloat();

        System.out.print("Enter Your Fats In Grams: ");
        float fats = scanner.nextFloat();

        System.out.print("Enter Your Carbs In Grams: ");
        float carbs = scanner.nextFloat();

        return new Macros(proteins,fats,carbs);
    }

    public Main(String title) throws HeadlessException {
        super(title);
        getContentPane().setLayout(null);

        // Now add an AddressPanel
        MacrosPanel macrosPanel = new MacrosPanel("Enter Your Data In Grams");
        macrosPanel.setLocation(10, 50);
        getContentPane().add(macrosPanel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(445, 440);
        setResizable(true);
    }
}

package Miguel.Corporation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MacrosPanel extends JPanel {
    private JLabel proteinsInputLabel, fatsInputLabel, carbsInputLabel, totalCaloriesLabel;
    private JTextField proteins, fats, carbs;
    private JPanel buttonPanel;
    private JButton button;

    public MacrosPanel(String title) throws HeadlessException {
        ButtonListener listener = new ButtonListener();
        this.setLayout(null);
        this.setBorder(BorderFactory.createTitledBorder(title));

        proteinsInputLabel = new JLabel("Protein:");
        proteinsInputLabel.setLocation(10, 20);
        proteinsInputLabel.setSize(50, 35);
        this.add(proteinsInputLabel);

        fatsInputLabel = new JLabel("Fats:");
        fatsInputLabel.setLocation(10, 55);
        fatsInputLabel.setSize(50, 35);
        this.add(fatsInputLabel);

        carbsInputLabel = new JLabel("Carbs:");
        carbsInputLabel.setLocation(10, 90);
        carbsInputLabel.setSize(50, 35);
        this.add(carbsInputLabel);

        totalCaloriesLabel = new JLabel("Total Calories: 0");
        totalCaloriesLabel.setLocation(190, 130);
        totalCaloriesLabel.setSize(200, 30);
        this.add(totalCaloriesLabel);

        button = new JButton("Convert");
        button.addActionListener(listener);

        buttonPanel = new JPanel();
        buttonPanel.setLocation(195, 160);
        buttonPanel.setSize(80, 35);
        buttonPanel.add(button);
        this.add(buttonPanel);

        proteins = new JTextField();
        proteins.setLocation(100, 25);
        proteins.setSize(300,30);
        this.add(proteins);

        fats = new JTextField();
        fats.setLocation(100, 60);
        fats.setSize(300,30);
        this.add(fats);

        carbs = new JTextField();
        carbs.setLocation(100, 95);
        carbs.setSize(300,30);
        this.add(carbs);

        setSize(413, 260);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                String textProtein = proteins.getText();
                String textFats = fats.getText();
                String textCarbs = carbs.getText();

                float tempProteinsCal = Integer.parseInt(textProtein) * 4;
                float tempFatsCal = Integer.parseInt(textFats) * 9;
                float tempCarbsCal = Integer.parseInt(textCarbs) * 4;
                float tempTotalCalories = tempProteinsCal + tempFatsCal + tempCarbsCal;

                totalCaloriesLabel.setText("Total Calories: " + tempTotalCalories);
            }
        }
    }
}

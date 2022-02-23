import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberPad {
    public JFrame frame;
    public JTextField field1;
    public JButton button1, button2, button3, button4;

    public NumberPad() {
        // Set up the frame
        frame = new JFrame("Number Pad");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Need to create this before button ActionListener code
        field1 = new JTextField();
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("Clear");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(field1);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String buttonName = ae.getActionCommand();
                if ("123".contains(buttonName)){
                field1.setText(buttonName);
                }
                else if (buttonName.equals("Clear")){
                    field1.setText("");
                }
            }
        });

        // pack and show
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        NumberPad n = new NumberPad();
    }
}

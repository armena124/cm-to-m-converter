import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class second
{
    public static void main(String[] args)
    {
        
        JFrame main_frame = new JFrame("Centimeters to meters conversion");
        main_frame.setSize(500, 500);

        JLabel output = new JLabel("Centimeters is equivalent to meters");
        output.setBounds(160, 200, 200, 20);
        output.setOpaque(true);
        main_frame.add(output);
        output.setVisible(false);

        JLabel error = new JLabel("Invalid input");
        error.setBounds(220, 200, 200, 20);
        error.setOpaque(true);
        main_frame.add(error);
        error.setVisible(false);

        JLabel prompt = new JLabel("Enter the measurement in cm to get equivalent in m");
        prompt.setBounds(100, 50, 400, 50);
        main_frame.add(prompt);

        JTextField user_input = new JTextField();
        user_input.setBounds(150, 100, 200, 25);
        main_frame.add(user_input);

        JButton convert = new JButton("Convert");
        convert.setBounds(210, 150, 80, 25);
        main_frame.add(convert);
        convert.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String user_input_string = user_input.getText();
                double meters = 0;
                double centimeters = 0;
                try
                {
                    centimeters = Double.parseDouble(user_input_string);
                    meters = centimeters / 100;
                    output.setText(centimeters + " cm is equivalent to " + meters + "m");
                    error.setVisible(false);
                    output.setVisible(true);
                    
                }
                catch(NumberFormatException err)
                {
                    output.setVisible(false);
                    error.setVisible(true);
                    
                }
                finally
                {
                    main_frame.revalidate();
                    main_frame.repaint();
                }
            }
        });
        main_frame.setLayout(null);
        main_frame.setResizable(false);
        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_frame.setVisible(true);
    }
}

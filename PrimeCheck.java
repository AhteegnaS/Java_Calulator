import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrimeCheck extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField number;
	private JTextField Answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeCheck frame = new PrimeCheck();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrimeCheck() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		number = new JTextField();
		number.setBounds(215, 50, 187, 38);
		contentPane.add(number);
		number.setColumns(10);
		
		JLabel num1 = new JLabel("Enter a number");
		num1.setBounds(44, 50, 105, 38);
		contentPane.add(num1);
		
		Answer = new JTextField();
		Answer.setBounds(50, 215, 341, 38);
		contentPane.add(Answer);
		Answer.setColumns(10);
		
		JButton b1 = new JButton("Even / Odd");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int number = Integer.parseInt(num1.getText());
				    if (number % 2 == 0 ) {
					Answer.setText("The number is Even");
				    }
				   }
			         catch (NumberFormatException ex) {
						Answer.setText("The number is Odd");
		            }
			}
		});
		b1.setBounds(26, 117, 85, 21);
		contentPane.add(b1);
	}
}

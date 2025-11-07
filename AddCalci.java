import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddCalci extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Num1;
	private JTextField Num2;
	private JTextField Answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCalci frame = new AddCalci();
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
	public AddCalci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Num1 = new JTextField();
		Num1.setBounds(119, 33, 96, 29);
		contentPane.add(Num1);
		Num1.setColumns(10);
		
		Num2 = new JTextField();
		Num2.setBounds(330, 33, 96, 29);
		contentPane.add(Num2);
		Num2.setColumns(10);
		
		JButton btnNewButton = new JButton("Subtract");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { 
					double num1 = Double.parseDouble(Num1.getText());
					double num2 = Double.parseDouble(Num2.getText());
					double sum = num1 - num2;
					Answer.setText(String.valueOf(sum));
					} catch (NumberFormatException ex) {
						Answer.setText("Invalid input!");
					}
				
			}
		});
		btnNewButton.setBounds(105, 91, 85, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try { 
						double num1 = Double.parseDouble(Num1.getText());
						double num2 = Double.parseDouble(Num2.getText());
						double sum = num1 + num2;
						Answer.setText(String.valueOf(sum));
						} catch (NumberFormatException ex) {
							Answer.setText("Invalid input!");
						}
				}
				
			
		});
		btnNewButton_1.setBounds(10, 91, 85, 33);
		contentPane.add(btnNewButton_1);
		
		Answer = new JTextField();
		Answer.setBounds(185, 189, 96, 32);
		contentPane.add(Answer);
		Answer.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("     Answer");
		lblNewLabel.setBounds(85, 192, 60, 29);
		contentPane.add(lblNewLabel);
		
		JButton Multiply = new JButton("Multiply");
		Multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try { 
					double num1 = Double.parseDouble(Num1.getText());
					double num2 = Double.parseDouble(Num2.getText());
					double sum = num1 * num2;
					Answer.setText( String.valueOf(sum));
					} catch (NumberFormatException ex) {
						Answer.setText("Invalid input!");
					}
			}
		});
		Multiply.setBounds(215, 91, 85, 33);
		contentPane.add(Multiply);
		
		JButton btnNewButton_2 = new JButton("Division");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { 
					double num1 = Double.parseDouble(Num1.getText());
					double num2 = Double.parseDouble(Num2.getText());
					double sum = num1 / num2;
					Answer.setText(String.valueOf(sum));
					} catch (NumberFormatException ex) {
						Answer.setText("Invalid input!");
					}
			}
		});
		btnNewButton_2.setBounds(329, 91, 85, 33);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Enter number 1");
		lblNewLabel_1.setBounds(10, 36, 99, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" Enter number 2");
		lblNewLabel_2.setBounds(225, 36, 95, 26);
		contentPane.add(lblNewLabel_2);
	}
}

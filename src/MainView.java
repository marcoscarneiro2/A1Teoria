import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainView extends JFrame {

	private JPanel contentPane;
	private JTextField c_A;
	private JTextField c_B;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView frame = new MainView();
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
	public MainView() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 227, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		c_A = new JTextField();
		c_A.setBounds(39, 43, 162, 20);
		contentPane.add(c_A);
		c_A.setColumns(10);
		
		c_B = new JTextField();
		c_B.setBounds(39, 98, 162, 20);
		contentPane.add(c_B);
		c_B.setColumns(10);
		
		JButton btnNewButton = new JButton("Gerar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = c_A.getText();
				String b = c_B.getText();
				resultado = resultado;
				String s;
				s = a .concat (b);
				//.add(s);
				//System.out.println(s);
				resultado.setText(String.valueOf(s));
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(10, 141, 191, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("A =");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 46, 34, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("B =");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 101, 34, 14);
		contentPane.add(lblNewLabel_1);
		
		resultado = new JTextField();
		resultado.setForeground(Color.WHITE);
		resultado.setBackground(Color.DARK_GRAY);
		resultado.setBounds(10, 194, 191, 56);
		contentPane.add(resultado);
		resultado.setColumns(10);
	}
}

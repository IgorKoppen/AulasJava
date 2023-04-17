package forms;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class FormLogin {

	private JFrame frame;
	private Icon icon = new ImageIcon(getClass().getResource("Logo.png"));
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormLogin window = new FormLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FormLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 367, 227);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblUsuario = new JLabel("Novo Usuário");
				
		panel.add(lblUsuario, BorderLayout.EAST);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1, BorderLayout.WEST);
		
		JLabel lblNewLabel = new JLabel(icon);
		lblNewLabel.setPreferredSize(new Dimension(140, 30));
		panel_1.add(lblNewLabel);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut, BorderLayout.SOUTH);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 10));
		panel.add(rigidArea, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Usuário");
		lblNewLabel_1.setBounds(56, 11, 46, 14);
		panel_2.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(112, 8, 188, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(112, 43, 188, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setBounds(56, 46, 46, 14);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setPreferredSize(new Dimension(140, 30));
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setPreferredSize(new Dimension(140, 30));
		panel_4.add(btnNewButton_1);
		
		Component verticalStrut = Box.createVerticalStrut(15);
		panel_3.add(verticalStrut, BorderLayout.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("Esqueci minha senha");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_3, BorderLayout.SOUTH);
		
		
	}
}

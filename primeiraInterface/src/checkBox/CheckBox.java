package checkBox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BoxLayout;
import java.awt.Font;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.Box;

public class CheckBox {

	private JFrame frame;
	private JTextField textBox;
    private JCheckBox boldJcheckBox;
    private JCheckBox italicJcheckBox;
    private Component horizontalGlue;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBox window = new CheckBox();
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
	public CheckBox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 345, 109);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		horizontalGlue = Box.createHorizontalGlue();
		panel.add(horizontalGlue);
		
		textBox = new JTextField();
		textBox.setHorizontalAlignment(SwingConstants.CENTER);
		textBox.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		panel.add(textBox);
		textBox.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		 boldJcheckBox = new JCheckBox("Negrito");
		 italicJcheckBox = new JCheckBox("Italico");
		panel_1.add(boldJcheckBox);
		panel_1.add(italicJcheckBox);
		CheckBoxHandler handler = new CheckBoxHandler();
		 boldJcheckBox.addItemListener(handler);
		 italicJcheckBox.addItemListener(handler);
		
	}
	
	private class CheckBoxHandler implements ItemListener{
		private int valBold = Font.PLAIN;
		private int valItalic = Font.PLAIN;
		
		public void itemStateChanged(ItemEvent event) {
			if(event.getSource() == boldJcheckBox)
				valBold =  boldJcheckBox.isSelected() ? Font.BOLD : Font.PLAIN;
			if(event.getSource() == italicJcheckBox)
				valBold =  italicJcheckBox.isSelected() ? Font.ITALIC : Font.PLAIN;
			textBox.setFont(new Font("Serif", valBold + valItalic, 14));
		}
	}
	

}

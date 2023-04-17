package comboBox;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JComboBox;

public class ComboBoxImage extends JFrame {


	private JComboBox imagesJComboBox;
	private JFrame frame;
	private String names[] = { "bug1.gif", "bug2.gif", "travelbug;gif", "buganim.gif" };

	private Icon icons[] = {
			new ImageIcon(getClass().getResource(names[0])),
			new ImageIcon(getClass().getResource(names[1])),
			new ImageIcon(getClass().getResource(names[2])),
			new ImageIcon(getClass().getResource(names[3])), };

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboBoxImage window = new ComboBoxImage();
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
	public ComboBoxImage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);

		imagesJComboBox = new JComboBox(names);
		imagesJComboBox.setMaximumRowCount(4);

		imagesJComboBox.setBounds(204, 103, 193, 22);

		JLabel label = new JLabel("");
		panel.add(label);
		
		imagesJComboBox.setBounds(204, 103, 60, 22);
		imagesJComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				if (event.getStateChange() == ItemEvent.SELECTED)
					label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
			}
		});
		label.setBounds(139, 107, 46, 14);
		panel.add(imagesJComboBox);
		label = new JLabel(icons[0]);
		panel.setLayout(null);
	}
}

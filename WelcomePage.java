import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;


public class Welcome {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
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
	public Welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Evaporator");
		frame.getContentPane().setBackground(new Color(245, 255, 250));
		frame.getContentPane().setForeground(new Color(255, 250, 240));
		frame.setBounds(100, 100, 841, 734);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("D:\\photo.jpg"));
		label.setBounds(59, 95, 670, 449);
		frame.getContentPane().add(label);
		
		JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE PROJECT \"DESIGN AND IMPLEMENTATION OF MATHEMATICAL MODEL OF EVAPORATOR\"");
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWelcomeToThe.setBounds(59, 25, 670, 59);
		frame.getContentPane().add(lblWelcomeToThe);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(610, 571, 89, 23);
		frame.getContentPane().add(btnNext);
		
		btnNext.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent m){
				frame.setVisible(false);
				TeamDetails t = new TeamDetails();
			}
		});
	}
}

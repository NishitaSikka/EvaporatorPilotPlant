import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GasDetector {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GasDetector window = new GasDetector();
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
	public GasDetector() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("GAS DETECTOR");
		frame.getContentPane().setBackground(new Color(250, 250, 210));
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.setBounds(100, 100, 841, 734);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblDescription = new JLabel("Description :");
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDescription.setBounds(10, 10, 200, 29);
		frame.getContentPane().add(lblDescription);
		
		JTextArea txtrAGasDetector = new JTextArea();
		txtrAGasDetector.setEditable(false);
		txtrAGasDetector.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrAGasDetector.setText("A Gas Detector is a device that detects the pressure of gasses in an area, \r\noften as part of safety system. This type eqipment is used to detect a gas leak \r\nor other emissions and can interface with a control system, so a process can be\r\nautomatically shut down. A gas detector can sound an alarm to operations in the \r\narea where there is a leak, giving them an opportunity to leave. This type of \r\ndevice is important because there are many gases that can be harmful to organic \r\nlife, such as humans or animals.");
		txtrAGasDetector.setBounds(10, 50, 719, 151);
		frame.getContentPane().add(txtrAGasDetector);
		
		JLabel lblImage = new JLabel("Image :");
		lblImage.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblImage.setBounds(10, 212, 200, 36);
		frame.getContentPane().add(lblImage);
		
		JLabel lblGraph = new JLabel("Graph :");
		lblGraph.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGraph.setBounds(326, 212, 200, 36);
		frame.getContentPane().add(lblGraph);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\gasDetector.jpg"));
		label.setBounds(10, 259, 236, 187);
		frame.getContentPane().add(label);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(10, 661, 112, 23);
		frame.getContentPane().add(btnPrevious);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("D:\\GraphGasdetector.jpg"));
		label_1.setBounds(320, 248, 409, 319);
		frame.getContentPane().add(label_1);
		
		btnPrevious.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent m){
				frame.setVisible(false);
				Sensors s = new Sensors();
			}
		});
	}

}

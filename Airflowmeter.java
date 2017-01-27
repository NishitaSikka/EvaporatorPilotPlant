import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class AirflowMeter {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AirflowMeter window = new AirflowMeter();
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
	public AirflowMeter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("AIRFLOW METERS");
		frame.getContentPane().setBackground(new Color(255, 255, 224));
		frame.setBounds(100, 100, 841, 734);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JTextArea txtrAnAirflowMeter = new JTextArea();
		txtrAnAirflowMeter.setBackground(new Color(255, 255, 255));
		txtrAnAirflowMeter.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrAnAirflowMeter.setEditable(false);
		txtrAnAirflowMeter.setText("An Airflow Meter is a device that measures air flow, ie how much air is flowing \r\nthrough a tube. It does not measure the volume of the air passing through the \r\ntube, it measures the mass of air flowing through the device per unit time. \r\nThus, airflow meters are simply an application of mass flow meters for a \r\nspecial medium. Typically, mass air flow measurements are expressed in the \r\nunits of kilograms per second (kg/s).");
		txtrAnAirflowMeter.setBounds(10, 35, 805, 130);
		frame.getContentPane().add(txtrAnAirflowMeter);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\Airflow meters.jpg"));
		label.setBounds(10, 202, 220, 215);
		frame.getContentPane().add(label);
		
		JLabel lblDescription = new JLabel("Description :");
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDescription.setBounds(10, 11, 200, 17);
		frame.getContentPane().add(lblDescription);
		
		JLabel lblImage = new JLabel("Image :");
		lblImage.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblImage.setBounds(10, 176, 152, 23);
		frame.getContentPane().add(lblImage);
		
		JLabel lblGraph = new JLabel("Graph :");
		lblGraph.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGraph.setBounds(240, 176, 200, 23);
		frame.getContentPane().add(lblGraph);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(10, 671, 141, 23);
		frame.getContentPane().add(btnPrevious);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("D:\\GraphAirflowMeters1.jpg"));
		label_1.setBounds(240, 202, 575, 474);
		frame.getContentPane().add(label_1);
		
		btnPrevious.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent m){
				frame.setVisible(false);
				Sensors s = new Sensors();
			}
		});
	}
}

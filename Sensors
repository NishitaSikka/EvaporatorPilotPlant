import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Sensors {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sensors window = new Sensors();
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
	public Sensors() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 250));
		frame.setBounds(100, 100, 841, 920);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblSensorsUsed = new JLabel("Sensors Used :");
		lblSensorsUsed.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSensorsUsed.setBounds(171, 649, 124, 23);
		frame.getContentPane().add(lblSensorsUsed);
		
		JButton btnAirflowMeter = new JButton("Airflow Meter");
		btnAirflowMeter.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAirflowMeter.setHorizontalAlignment(SwingConstants.LEFT);
		btnAirflowMeter.setBounds(265, 672, 146, 23);
		frame.getContentPane().add(btnAirflowMeter);
		
		JButton btnAquastat = new JButton("Aquastat");
		btnAquastat.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAquastat.setHorizontalAlignment(SwingConstants.LEFT);
		btnAquastat.setBounds(171, 672, 89, 23);
		frame.getContentPane().add(btnAquastat);
		
		JButton btnGasDetector = new JButton("Gas Detector");
		btnGasDetector.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnGasDetector.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnGasDetector.setHorizontalAlignment(SwingConstants.LEFT);
		btnGasDetector.setBounds(416, 672, 124, 23);
		frame.getContentPane().add(btnGasDetector);
		
		JButton btnMinimumEfficiencyReporting = new JButton("Minimum Efficiency Reporting Valve");
		btnMinimumEfficiencyReporting.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnMinimumEfficiencyReporting.setHorizontalAlignment(SwingConstants.LEFT);
		btnMinimumEfficiencyReporting.setBounds(544, 672, 251, 23);
		frame.getContentPane().add(btnMinimumEfficiencyReporting);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPrevious.setBounds(10, 672, 89, 23);
		frame.getContentPane().add(btnPrevious);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\Final Plant1.jpg"));
		label.setBounds(10, 11, 785, 627);
		frame.getContentPane().add(label);
		
		btnAirflowMeter.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent m){
				frame.setVisible(false);
				AirflowMeter a = new AirflowMeter();
			}
		});
		
		btnAquastat.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent m){
				frame.setVisible(false);
				Aquastat a = new Aquastat();
			}
		});
		
		btnGasDetector.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent m){
				frame.setVisible(false);
				GasDetector a = new GasDetector();
			}
		});
		
		btnMinimumEfficiencyReporting.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent m){
				frame.setVisible(false);
				Valve a = new Valve();
			}
		});
		
		btnPrevious.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent m){
				frame.setVisible(false);
				TeamDetails t = new TeamDetails();
			}
		});
		
		
	}

}

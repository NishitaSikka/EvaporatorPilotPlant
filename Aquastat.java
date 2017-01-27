import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Aquastat {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aquastat window = new Aquastat();
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
	public Aquastat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("AQUASTAT");
		frame.getContentPane().setBackground(new Color(255, 228, 225));
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.setBounds(100, 100, 841, 734);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblDescription = new JLabel("Description :");
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDescription.setBounds(10, 10, 200, 33);
		frame.getContentPane().add(lblDescription);
		
		JTextArea txtrAnAquastatIs = new JTextArea();
		txtrAnAquastatIs.setEditable(false);
		txtrAnAquastatIs.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrAnAquastatIs.setText("An Aquastat is a device used in hydronic heating systems for controlling water\r\ntemperature. To prevent the boiler from firing too often, aquastats have a high \r\nlimit temperature and a low limit. If the thermostat is calling for heat, the \r\nboiler will fire until the high limit is reached, the shut off. The boiler will \r\nre-fire if the boiler water temperature drops below a range around the high \r\nlimit. The high limit exists for the sake of efficiency and safety. The low \r\nlimit is intended for tankless domestic hot water. It ensures that boiler water \r\nis always warm enough to heat the domestic hot water. ");
		txtrAnAquastatIs.setBounds(10, 43, 794, 172);
		frame.getContentPane().add(txtrAnAquastatIs);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("D:\\aquastat.jpg"));
		label.setBounds(10, 258, 219, 225);
		frame.getContentPane().add(label);
		
		JLabel lblImage = new JLabel("Image :");
		lblImage.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblImage.setBounds(10, 229, 200, 33);
		frame.getContentPane().add(lblImage);
		
		JLabel lblGraph = new JLabel("Graph :");
		lblGraph.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGraph.setBounds(271, 226, 200, 33);
		frame.getContentPane().add(lblGraph);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(10, 661, 114, 23);
		frame.getContentPane().add(btnPrevious);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("D:\\GraphAquastat1.png"));
		label_1.setBounds(271, 258, 544, 437);
		frame.getContentPane().add(label_1);
		
		btnPrevious.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent m){
				frame.setVisible(false);
				Sensors s = new Sensors();
			}
		});
	}

}

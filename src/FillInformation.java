import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;

public class FillInformation extends JFrame {

	private JPanel contentPane;
	private JTextField textSeat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FillInformation frame = new FillInformation();
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
	public FillInformation() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\Gold Line art Video Camera for Movie Cinema Production Logo (200 \u00D7 200 px).png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1363, 607);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCinmaIcon = new JLabel("");
		lblCinmaIcon.setIcon(new ImageIcon("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\Gold Line art Video Camera for Movie Cinema Production Logo (200 \u00D7 200 px).png"));
		lblCinmaIcon.setBounds(169, 11, 200, 129);
		contentPane.add(lblCinmaIcon);
		
		JLabel lblSeatIcon = new JLabel("");
		lblSeatIcon.setIcon(new ImageIcon("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\Access-seating-plan-Sep-2021-1000x752.png"));
		lblSeatIcon.setBounds(22, 151, 500, 389);
		contentPane.add(lblSeatIcon);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(542, 0, 8, 574);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(947, 0, 8, 574);
		contentPane.add(separator_1);
		
		JLabel lblTitle = new JLabel("PLEASE FILL THE INFORMATION");
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setBackground(new Color(255, 255, 255));
		lblTitle.setFont(new Font("Arial", Font.PLAIN, 13));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(994, 11, 325, 14);
		contentPane.add(lblTitle);
		
		JLabel lblSeatNumber = new JLabel("SEAT NUMBER");
		lblSeatNumber.setForeground(new Color(255, 255, 255));
		lblSeatNumber.setFont(new Font("Arial", Font.PLAIN, 13));
		lblSeatNumber.setBounds(965, 47, 160, 14);
		contentPane.add(lblSeatNumber);
		
		JLabel lblAdult = new JLabel("ADULT");
		lblAdult.setForeground(new Color(255, 255, 255));
		lblAdult.setFont(new Font("Arial", Font.PLAIN, 13));
		lblAdult.setBounds(965, 80, 160, 14);
		contentPane.add(lblAdult);
		
		JLabel lblChildren = new JLabel("CHILDREN");
		lblChildren.setForeground(new Color(255, 255, 255));
		lblChildren.setFont(new Font("Arial", Font.PLAIN, 13));
		lblChildren.setBounds(965, 115, 160, 14);
		contentPane.add(lblChildren);
		
		JLabel lblMembership = new JLabel("MEMBERSHIP");
		lblMembership.setFont(new Font("Arial", Font.PLAIN, 13));
		lblMembership.setForeground(new Color(255, 255, 255));
		lblMembership.setBounds(965, 151, 160, 14);
		contentPane.add(lblMembership);
		
		JLabel lblFnB = new JLabel("FOOD AND BEVERAGES");
		lblFnB.setFont(new Font("Arial", Font.PLAIN, 13));
		lblFnB.setForeground(new Color(255, 255, 255));
		lblFnB.setBounds(965, 227, 160, 14);
		contentPane.add(lblFnB);
		
		textSeat = new JTextField();
		textSeat.setFont(new Font("Arial", Font.PLAIN, 11));
		textSeat.setBounds(1177, 44, 142, 20);
		contentPane.add(textSeat);
		textSeat.setColumns(10);
		
		JSpinner spinnerAdult = new JSpinner();
		spinnerAdult.setFont(new Font("Arial", Font.PLAIN, 11));
		spinnerAdult.setBounds(1177, 77, 142, 20);
		contentPane.add(spinnerAdult);
		
		JSpinner spinnerChildren = new JSpinner();
		spinnerChildren.setFont(new Font("Arial", Font.PLAIN, 11));
		spinnerChildren.setBounds(1177, 112, 142, 20);
		contentPane.add(spinnerChildren);
		
		JRadioButton rdbtnMembership = new JRadioButton("Membership");
		rdbtnMembership.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnMembership.setBounds(1177, 149, 142, 19);
		contentPane.add(rdbtnMembership);
		
		JRadioButton rdbtnNonMembership = new JRadioButton("Non-Membership");
		rdbtnNonMembership.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnNonMembership.setBounds(1177, 186, 142, 19);
		contentPane.add(rdbtnNonMembership);
		
		JComboBox comboBoxFnB1 = new JComboBox();
		comboBoxFnB1.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBoxFnB1.setModel(new DefaultComboBoxModel(new String[] {"1. Nasi Kerabu", "2. Popcorn", "3. Soda Drink", "4.Hot Dog"}));
		comboBoxFnB1.setBounds(1177, 225, 142, 19);
		contentPane.add(comboBoxFnB1);
		
		JComboBox comboBoxFnB2 = new JComboBox();
		comboBoxFnB2.setModel(new DefaultComboBoxModel(new String[] {"1. Nasi Kerabu", "2. Popcorn", "3. Soda Drink", "4.Hot Dog"}));
		comboBoxFnB2.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBoxFnB2.setBounds(1177, 264, 142, 19);
		contentPane.add(comboBoxFnB2);
		
		JComboBox comboBoxFnB3 = new JComboBox();
		comboBoxFnB3.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBoxFnB3.setModel(new DefaultComboBoxModel(new String[] {"1. Nasi Kerabu", "2. Popcorn", "3. Soda Drink", "4.Hot Dog"}));
		comboBoxFnB3.setBounds(1177, 303, 142, 19);
		contentPane.add(comboBoxFnB3);
	}
}

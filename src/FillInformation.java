import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
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
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FillInformation extends JFrame {

	private JPanel contentPane;
	private JTextField textSeat;
	private JTextField textField;
	private JTextField textFnB1;
	private JTextField textFnB2;
	private JTextField textFnB3;

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
		setTitle("DIAMOND SCREEN CINEMA(DSC)");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\Gold Line art Video Camera for Movie Cinema Production Logo (200 \u00D7 200 px).png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1364, 609);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		JLabel lblCinmaIcon = new JLabel("");
		lblCinmaIcon.setIcon(new ImageIcon("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\DSC Cinema Logo Long (542 \u00D7 140 px).png"));
		lblCinmaIcon.setBounds(0, 0, 542, 140);
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
		separator_1.setBounds(940, 0, 8, 574);
		contentPane.add(separator_1);
		
		JLabel lblTitle = new JLabel("PLEASE FILL THE INFORMATION");
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setBackground(new Color(255, 255, 255));
		lblTitle.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(978, 32, 325, 14);
		contentPane.add(lblTitle);
		
		JLabel lblSeatNumber = new JLabel("SEAT NUMBER");
		lblSeatNumber.setForeground(new Color(255, 255, 255));
		lblSeatNumber.setFont(new Font("Arial", Font.BOLD, 13));
		lblSeatNumber.setBounds(965, 110, 160, 14);
		contentPane.add(lblSeatNumber);
		
		JLabel lblAdult = new JLabel("ADULT");
		lblAdult.setForeground(new Color(255, 255, 255));
		lblAdult.setFont(new Font("Arial", Font.BOLD, 13));
		lblAdult.setBounds(965, 147, 160, 14);
		contentPane.add(lblAdult);
		
		JLabel lblChildren = new JLabel("CHILDREN");
		lblChildren.setForeground(new Color(255, 255, 255));
		lblChildren.setFont(new Font("Arial", Font.BOLD, 13));
		lblChildren.setBounds(965, 182, 160, 14);
		contentPane.add(lblChildren);
		
		JLabel lblMembership = new JLabel("MEMBERSHIP");
		lblMembership.setFont(new Font("Arial", Font.BOLD, 13));
		lblMembership.setForeground(new Color(255, 255, 255));
		lblMembership.setBounds(965, 218, 160, 14);
		contentPane.add(lblMembership);
		
		JLabel lblFnB = new JLabel("FOOD AND BEVERAGES");
		lblFnB.setFont(new Font("Arial", Font.BOLD, 13));
		lblFnB.setForeground(new Color(255, 255, 255));
		lblFnB.setBounds(965, 294, 160, 14);
		contentPane.add(lblFnB);
		
		textSeat = new JTextField();
		textSeat.setBackground(new Color(255, 255, 255));
		textSeat.setFont(new Font("Arial", Font.PLAIN, 11));
		textSeat.setBounds(1177, 108, 142, 20);
		contentPane.add(textSeat);
		textSeat.setColumns(10);
		
		JSpinner spinnerAdult = new JSpinner();
		spinnerAdult.setBackground(new Color(255, 255, 255));
		spinnerAdult.setFont(new Font("Arial", Font.PLAIN, 11));
		spinnerAdult.setBounds(1177, 141, 142, 20);
		contentPane.add(spinnerAdult);
		
		JSpinner spinnerChildren = new JSpinner();
		spinnerChildren.setBackground(new Color(255, 255, 255));
		spinnerChildren.setFont(new Font("Arial", Font.PLAIN, 11));
		spinnerChildren.setBounds(1177, 176, 142, 20);
		contentPane.add(spinnerChildren);
		
		JRadioButton rdbtnMembership = new JRadioButton("Membership");
		rdbtnMembership.setBackground(new Color(255, 255, 255));
		rdbtnMembership.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnMembership.setBounds(1177, 213, 142, 19);
		contentPane.add(rdbtnMembership);
		
		JRadioButton rdbtnNonMembership = new JRadioButton("Non-Membership");
		rdbtnNonMembership.setBackground(new Color(255, 255, 255));
		rdbtnNonMembership.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnNonMembership.setBounds(1177, 250, 142, 19);
		contentPane.add(rdbtnNonMembership);
		
		JComboBox comboBoxFnB1 = new JComboBox();
		comboBoxFnB1.setBackground(new Color(255, 255, 255));
		comboBoxFnB1.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBoxFnB1.setModel(new DefaultComboBoxModel(new String[] {"", "1. Nasi Kerabu", "2. Popcorn", "3. Soda Drink", "4.Hot Dog"}));
		comboBoxFnB1.setBounds(1177, 289, 142, 19);
		contentPane.add(comboBoxFnB1);
		
		JComboBox comboBoxFnB2 = new JComboBox();
		comboBoxFnB2.setBackground(new Color(255, 255, 255));
		comboBoxFnB2.setModel(new DefaultComboBoxModel(new String[] {"", "1. Nasi Kerabu", "2. Popcorn", "3. Soda Drink", "4.Hot Dog"}));
		comboBoxFnB2.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBoxFnB2.setBounds(1177, 412, 142, 19);
		contentPane.add(comboBoxFnB2);
		
		JComboBox comboBoxFnB3 = new JComboBox();
		comboBoxFnB3.setBackground(new Color(255, 255, 255));
		comboBoxFnB3.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBoxFnB3.setModel(new DefaultComboBoxModel(new String[] {"", "1. Nasi Kerabu", "2. Popcorn", "3. Soda Drink", "4.Hot Dog"}));
		comboBoxFnB3.setBounds(1177, 350, 142, 19);
		contentPane.add(comboBoxFnB3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(965, 508, 160, 10);
		contentPane.add(separator_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(965, 547, 160, 10);
		contentPane.add(separator_2_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(965, 518, 160, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnProceed = new JButton("Proceed");
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paymentPage a = new paymentPage();
				a.show();
				dispose();
			}
		});
		btnProceed.setBackground(new Color(255, 255, 255));
		btnProceed.setFont(new Font("Arial", Font.PLAIN, 11));
		btnProceed.setBounds(1177, 517, 142, 23);
		contentPane.add(btnProceed);
		
		JLabel lblPriceIcon = new JLabel("");
		lblPriceIcon.setIcon(new ImageIcon("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\Price List cinema.png"));
		lblPriceIcon.setBounds(560, 11, 367, 546);
		contentPane.add(lblPriceIcon);
		
		JLabel lblHallNum = new JLabel("HALL NUMBER");
		lblHallNum.setForeground(Color.WHITE);
		lblHallNum.setFont(new Font("Arial", Font.BOLD, 13));
		lblHallNum.setBounds(965, 76, 160, 14);
		contentPane.add(lblHallNum);
		
		JButton btnTotal = new JButton("Total:");
        btnTotal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int spinnerAdult1 = (int) spinnerAdult.getValue();
                int spinnerChildren1 = (int) spinnerChildren.getValue();
                double price = 0.0;
                double price1 = 0.0;
                double price2 = 0.0;
                double textFnB = Double.parseDouble(textFnB1.getText());
                double textFnB1 = Double.parseDouble(textFnB2.getText());
                double textFnB2 = Double.parseDouble(textFnB3.getText());
                
                
                //Combobox1
                if (((String) comboBoxFnB1.getSelectedItem()).equals("1. Nasi Kerabu"))
                {
                    price = 10.0;
                    
                }
                else if (((String) comboBoxFnB1.getSelectedItem()).equals("2. Popcorn"))
                {
                    price = 7.50;
                }
                else if (((String) comboBoxFnB1.getSelectedItem()).equals("3. Soda Drink"))
                {
                	price = 4.0;
                }
                else if (((String) comboBoxFnB1.getSelectedItem()).equals("4. Hot Dog"))
                {
                    price = 6.50;
                }

                //ComboBox2
                if (((String) comboBoxFnB2.getSelectedItem()).equals("1. Nasi Kerabu"))
                {
                    price = 10.0;
                }
                else if (((String) comboBoxFnB2.getSelectedItem()).equals("2. Popcorn"))
                {
                    price = 7.50;
                }
                else if (((String) comboBoxFnB2.getSelectedItem()).equals("3. Soda Drink"))
                {
                    price = 4.0;
                }
                else if (((String) comboBoxFnB2.getSelectedItem()).equals("4. Hot Dog"))
                {
                    price = 6.50;
                }

                //ComboBox3
                if (((String) comboBoxFnB3.getSelectedItem()).equals("1. Nasi Kerabu"))
                {
                    price = 10.0;
                }
                else if (((String) comboBoxFnB3.getSelectedItem()).equals("2. Popcorn"))
                {
                    price = 7.50;
                }
                else if (((String) comboBoxFnB3.getSelectedItem()).equals("3. Soda Drink"))
                {
                    price = 4.0;
                }
                else if (((String) comboBoxFnB3.getSelectedItem()).equals("4. Hot Dog"))
                {
                    price = 6.50;
                }

                double totalTicket = (spinnerAdult1 * 15) + (spinnerChildren1 *12) + (price * textFnB) + (price * textFnB1) + (price * textFnB2);
                textField.setText("" +totalTicket);
            }
        });
        btnTotal.setBackground(new Color(255, 255, 255));
        btnTotal.setFont(new Font("Arial", Font.BOLD, 14));
        btnTotal.setBounds(965, 474, 160, 23);
        contentPane.add(btnTotal);
		
		JComboBox comboBoxHallNum = new JComboBox();
		comboBoxHallNum.setModel(new DefaultComboBoxModel(new String[] {"", "Hall 1", "Hall 2", "Hall 3", "Hall 4", "Hall 5", "Hall 6", "Hall 7"}));
		comboBoxHallNum.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBoxHallNum.setBackground(Color.WHITE);
		comboBoxHallNum.setBounds(1177, 72, 142, 19);
		contentPane.add(comboBoxHallNum);
		
		textFnB1 = new JTextField();
		textFnB1.setFont(new Font("Arial", Font.PLAIN, 11));
		textFnB1.setColumns(10);
		textFnB1.setBackground(Color.WHITE);
		textFnB1.setBounds(1177, 319, 142, 20);
		contentPane.add(textFnB1);
		
		textFnB2 = new JTextField();
		textFnB2.setFont(new Font("Arial", Font.PLAIN, 11));
		textFnB2.setColumns(10);
		textFnB2.setBackground(Color.WHITE);
		textFnB2.setBounds(1177, 381, 142, 20);
		contentPane.add(textFnB2);
		
		textFnB3 = new JTextField();
		textFnB3.setFont(new Font("Arial", Font.PLAIN, 11));
		textFnB3.setColumns(10);
		textFnB3.setBackground(Color.WHITE);
		textFnB3.setBounds(1177, 442, 142, 20);
		contentPane.add(textFnB3);
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

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
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class FillInformation extends JFrame 
{

	private JPanel contentPane;
	private JTextField textSeat;
	private JTextField textTotal;
	private JTextField textFnB1;
	private JTextField textFnB2;
	private JTextField textFnB3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private double membership = 0.0;
	private double membershipValue = 0.0;
	DecimalFormat priceformatter = new DecimalFormat ("#0.00");

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
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
	public FillInformation(String name, String type, String movie, String date, String time,double pricetype) {
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
		
		JComboBox comboBoxHallNum = new JComboBox();
		comboBoxHallNum.setModel(new DefaultComboBoxModel(new String[] {"", "Hall 1", "Hall 2", "Hall 3", "Hall 4", "Hall 5", "Hall 6", "Hall 7"}));
		comboBoxHallNum.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBoxHallNum.setBackground(Color.WHITE);
		comboBoxHallNum.setBounds(1177, 72, 142, 19);
		contentPane.add(comboBoxHallNum);

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
		rdbtnMembership.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == rdbtnMembership)
				{
					membershipValue = 0.05;
				}
				else
				{
					membershipValue = 0.00;
				}
			}
		});
		buttonGroup.add(rdbtnMembership);
		rdbtnMembership.setBackground(new Color(255, 255, 255));
		rdbtnMembership.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnMembership.setBounds(1177, 213, 142, 19);
		contentPane.add(rdbtnMembership);
		
		JRadioButton rdbtnNonMembership = new JRadioButton("Non-Membership");
		buttonGroup.add(rdbtnNonMembership);
		rdbtnNonMembership.setBackground(new Color(255, 255, 255));
		rdbtnNonMembership.setFont(new Font("Arial", Font.PLAIN, 11));
		rdbtnNonMembership.setBounds(1177, 250, 142, 19);
		contentPane.add(rdbtnNonMembership);
		
		JComboBox comboBoxFnB1 = new JComboBox();
		comboBoxFnB1.setBackground(new Color(255, 255, 255));
		comboBoxFnB1.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBoxFnB1.setModel(new DefaultComboBoxModel(new String[] {"", "1. Nasi Kerabu", "2. Popcorn", "3. Soda Drink", "4. Hot Dog"}));
		comboBoxFnB1.setBounds(1177, 289, 142, 19);
		contentPane.add(comboBoxFnB1);
		
		JComboBox comboBoxFnB2 = new JComboBox();
		comboBoxFnB2.setBackground(new Color(255, 255, 255));
		comboBoxFnB2.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBoxFnB2.setModel(new DefaultComboBoxModel(new String[] {"", "1. Nasi Kerabu", "2. Popcorn", "3. Soda Drink", "4. Hot Dog"}));
		comboBoxFnB2.setBounds(1177, 350, 142, 19);
		contentPane.add(comboBoxFnB2);
		
		JComboBox comboBoxFnB3 = new JComboBox();
		comboBoxFnB3.setBackground(new Color(255, 255, 255));
		comboBoxFnB3.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBoxFnB3.setModel(new DefaultComboBoxModel(new String[] {"", "1. Nasi Kerabu", "2. Popcorn", "3. Soda Drink", "4. Hot Dog"}));
		comboBoxFnB3.setBounds(1177, 412, 142, 19);
		contentPane.add(comboBoxFnB3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(965, 508, 160, 10);
		contentPane.add(separator_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(965, 547, 160, 10);
		contentPane.add(separator_2_1);
		
		textTotal = new JTextField();
		textTotal.setBackground(new Color(255, 255, 255));
		textTotal.setBounds(965, 518, 160, 20);
		contentPane.add(textTotal);
		textTotal.setText(null);
		textTotal.setColumns(10);
		
		JButton btnProceed = new JButton("Proceed");
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int spinnerAdult1 = (int) spinnerAdult.getValue();
                int  spinnerChildren1 = (int) spinnerChildren.getValue();
                double price = 0.0;
                double price1 = 0.0;
                double price2 = 0.0;
                double textFnB = Double.parseDouble(textFnB1.getText());
                double textFnB1 = Double.parseDouble(textFnB2.getText());
                double textFnB2 = Double.parseDouble(textFnB3.getText());
                int priceAdult = 5;
                int priceChildren = 3;
                String seat = textSeat.getText();
                String comboBox1 = (String)comboBoxFnB1.getSelectedItem();
                String comboBox2 = (String)comboBoxFnB2.getSelectedItem();
                String comboBox3 = (String)comboBoxFnB3.getSelectedItem();
                String hallNum = (String)comboBoxHallNum.getSelectedItem();
                String membership1 = (rdbtnMembership).toString();
                String membershipDiscount = (rdbtnMembership).toString();
                
                //ComboBoxHallNum
                if (((String)comboBoxHallNum.getSelectedItem()).equals("Hall 1"))
                {
                	hallNum = "Hall 1";
                }
                else if (((String)comboBoxHallNum.getSelectedItem()).equals("Hall 2"))
				{
					hallNum = "Hall 2";
				}
                else if (((String)comboBoxHallNum.getSelectedItem()).equals("Hall 3"))
                {
                	hallNum = "Hall 3";
                }
                else if (((String)comboBoxHallNum.getSelectedItem()).equals("Hall 4"))
                {
                	hallNum = "Hall 4";
                }
                else if (((String)comboBoxHallNum.getSelectedItem()).equals("Hall 5"))
                {
                	hallNum = "Hall 5";
                }
                else if (((String)comboBoxHallNum.getSelectedItem()).equals("Hall 6"))
                {
                	hallNum = "Hall 6";
                }
                else if (((String)comboBoxHallNum.getSelectedItem()).equals("Hall 7"))
                {
                	hallNum = "Hall 6";
                }
                
                //Combobox1
                if (((String) comboBoxFnB1.getSelectedItem()).equals("1. Nasi Kerabu"))
                {
                	comboBox1 = "Nasi Kerabu";
                    price = 10.00 * textFnB;
                    
                }
                else if (((String) comboBoxFnB1.getSelectedItem()).equals("2. Popcorn"))
                {
                	comboBox1 = "Popcorn";
                    price = 8.00 * textFnB;
                }
                else if (((String) comboBoxFnB1.getSelectedItem()).equals("3. Soda Drink"))
                {
                	comboBox1 = "Soda Drink";
                	price = 4.00 * textFnB;
                }
                else if (((String) comboBoxFnB1.getSelectedItem()).equals("4. Hot Dog"))
                {
                	comboBox1 = "Hot Dog";
                    price = 6.00 * textFnB;
                }
                else if (((String) comboBoxFnB1.getSelectedItem()).equals(""))
                {
                	comboBox1 = "---";
                }

                //ComboBox2
                if (((String) comboBoxFnB2.getSelectedItem()).equals("1. Nasi Kerabu"))
                {
                	comboBox2 = "Nasi Kerabu";
                    price1 = 10.00 * textFnB1;
                    
                }
                else if (((String) comboBoxFnB2.getSelectedItem()).equals("2. Popcorn"))
                {
                	comboBox2 = "Popcorn";
                    price1 = 8.00 * textFnB1;
                }
                else if (((String) comboBoxFnB2.getSelectedItem()).equals("3. Soda Drink"))
                {
                	comboBox2 = "Soda Drink";
                	price1 = 4.00 * textFnB1;
                }
                else if (((String) comboBoxFnB2.getSelectedItem()).equals("4. Hot Dog"))
                {
                	comboBox2 = "Hot Dog";
                    price1 = 6.00 * textFnB1;
                }
                else if (((String) comboBoxFnB2.getSelectedItem()).equals(""))
                {
                	comboBox2 = "---";
                }

                //ComboBox3
                if (((String) comboBoxFnB3.getSelectedItem()).equals("1. Nasi Kerabu"))
                {
                	comboBox3 = "Nasi Kerabu";
                    price2 = 10.00 * textFnB2;
                    
                }
                else if (((String) comboBoxFnB3.getSelectedItem()).equals("2. Popcorn"))
                {
                	comboBox3 = "Popcorn";
                    price2 = 8.00 * textFnB2;
                }
                else if (((String) comboBoxFnB3.getSelectedItem()).equals("3. Soda Drink"))
                {
                	comboBox3 = "Soda Drink";
                	price2 = 4.00 * textFnB2;
                }
                else if (((String) comboBoxFnB3.getSelectedItem()).equals("4. Hot Dog"))
                {
                	comboBox3 = "Hot Dog";
                    price2 = 6.00 * textFnB2;
                }
                else if (((String) comboBoxFnB3.getSelectedItem()).equals(""))
                {
                	comboBox3 = "---";
                }
                
                double totalAmount = (spinnerAdult1 * priceAdult) + (spinnerAdult1 * pricetype) + (spinnerChildren1 * priceChildren) +(spinnerChildren1 * pricetype) + (price) + (price1) + (price2);
                double membership = (totalAmount) * (membershipValue);
                double totalTicket = (totalAmount) - (membership);
                
                //RadioButtonMembership
                if (rdbtnMembership.isSelected() == true)
                {
                	membership1 = "Yes";
                	membershipDiscount = "" +priceformatter.format(membership);
                }
                else if (rdbtnMembership.isSelected() == false)
                {
                	membership1 = "No";
                	membershipDiscount = "" +priceformatter.format(membership);
                }
                
				paymentPage a = new paymentPage(name,type,movie,date,time,spinnerAdult1,spinnerChildren1,totalTicket,comboBox1,comboBox2,comboBox3,hallNum,seat,membership1,price,price1,price2,priceAdult,priceChildren,membershipDiscount,textFnB,textFnB1,textFnB2);
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
            	DecimalFormat priceformatter = new DecimalFormat ("#0.00");
                int spinnerAdult1 = (int) spinnerAdult.getValue();
                int spinnerChildren1 = (int) spinnerChildren.getValue();
                int priceAdult = 5;
                int priceChildren = 3;
                double price = 0.0;
                double price1 = 0.0;
                double price2 = 0.0;
                double textFnB = Double.parseDouble(textFnB1.getText());
                double textFnB1 = Double.parseDouble(textFnB2.getText());
                double textFnB2 = Double.parseDouble(textFnB3.getText());
                String comboBox1 = (String)comboBoxFnB1.getSelectedItem();
                String comboBox2 = (String)comboBoxFnB2.getSelectedItem();
                String comboBox3 = (String)comboBoxFnB3.getSelectedItem();
                
                //Combobox1
                if (((String) comboBoxFnB1.getSelectedItem()).equals("1. Nasi Kerabu"))
                {
                	comboBox1 = "Nasi Kerabu";
                    price = 10.00 * textFnB;
                    
                }
                else if (((String) comboBoxFnB1.getSelectedItem()).equals("2. Popcorn"))
                {
                	comboBox1 = "Popcorn";
                    price = 8.00 * textFnB;
                }
                else if (((String) comboBoxFnB1.getSelectedItem()).equals("3. Soda Drink"))
                {
                	comboBox1 = "Soda Drink";
                	price = 4.00 * textFnB;
                }
                else if (((String) comboBoxFnB1.getSelectedItem()).equals("4. Hot Dog"))
                {
                	comboBox1 = "Hot Dog";
                    price = 6.00 * textFnB;
                }
                else if (((String) comboBoxFnB1.getSelectedItem()).equals(""))
                {
                	comboBox1 = "---";
                }

                //ComboBox2
                if (((String) comboBoxFnB2.getSelectedItem()).equals("1. Nasi Kerabu"))
                {
                	comboBox2 = "Nasi Kerabu";
                    price1 = 10.00 * textFnB1;
                    
                }
                else if (((String) comboBoxFnB2.getSelectedItem()).equals("2. Popcorn"))
                {
                	comboBox2 = "Popcorn";
                    price1 = 8.00 * textFnB1;
                }
                else if (((String) comboBoxFnB2.getSelectedItem()).equals("3. Soda Drink"))
                {
                	comboBox2 = "Soda Drink";
                	price1 = 4.00 * textFnB1;
                }
                else if (((String) comboBoxFnB2.getSelectedItem()).equals("4. Hot Dog"))
                {
                	comboBox2 = "Hot Dog";
                    price1 = 6.00 * textFnB1;
                }
                else if (((String) comboBoxFnB2.getSelectedItem()).equals(""))
                {
                	comboBox2 = "---";
                }

                //ComboBox3
                if (((String) comboBoxFnB3.getSelectedItem()).equals("1. Nasi Kerabu"))
                {
                	comboBox3 = "Nasi Kerabu";
                    price2 = 10.00 * textFnB2;
                    
                }
                else if (((String) comboBoxFnB3.getSelectedItem()).equals("2. Popcorn"))
                {
                	comboBox3 = "Popcorn";
                    price2 = 8.00 * textFnB2;
                }
                else if (((String) comboBoxFnB3.getSelectedItem()).equals("3. Soda Drink"))
                {
                	comboBox3 = "Soda Drink";
                	price2 = 4.00 * textFnB2;
                }
                else if (((String) comboBoxFnB3.getSelectedItem()).equals("4. Hot Dog"))
                {
                	comboBox3 = "Hot Dog";
                    price2 = 6.00 * textFnB2;
                }
                else if (((String) comboBoxFnB3.getSelectedItem()).equals(""))
                {
                	comboBox3 = "---";
                }
                
                double totalAmount = (spinnerAdult1 * priceAdult) + (spinnerAdult1 * pricetype) + (spinnerChildren1 * priceChildren) +(spinnerChildren1 * pricetype) + (price) + (price1) + (price2);
                double membership = (totalAmount) * (membershipValue);
                double totalTicket = (totalAmount) - (membership);
                textTotal.setText("" +priceformatter.format(totalTicket));
            }
        });
        btnTotal.setBackground(new Color(255, 255, 255));
        btnTotal.setFont(new Font("Arial", Font.BOLD, 14));
        btnTotal.setBounds(965, 474, 160, 23);
        contentPane.add(btnTotal);

		textFnB1 = new JTextField();
		textFnB1.setFont(new Font("Arial", Font.PLAIN, 11));
		textFnB1.setColumns(10);
		textFnB1.setBackground(Color.WHITE);
		textFnB1.setBounds(1177, 319, 142, 20);
		textFnB1.setText("0");
		contentPane.add(textFnB1);
		
		textFnB2 = new JTextField();
		textFnB2.setFont(new Font("Arial", Font.PLAIN, 11));
		textFnB2.setColumns(10);
		textFnB2.setBackground(Color.WHITE);
		textFnB2.setBounds(1177, 381, 142, 20);
		textFnB2.setText("0");
		contentPane.add(textFnB2);
		
		textFnB3 = new JTextField();
		textFnB3.setFont(new Font("Arial", Font.PLAIN, 11));
		textFnB3.setColumns(10);
		textFnB3.setBackground(Color.WHITE);
		textFnB3.setBounds(1177, 442, 142, 20);
		textFnB3.setText("0");
		contentPane.add(textFnB3);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnReset)
				{
					spinnerAdult.setValue(0);
					spinnerChildren.setValue(0);
					rdbtnMembership.setSelected(false);
					rdbtnNonMembership.setSelected(false);
					comboBoxHallNum.setSelectedItem("");
					comboBoxFnB1.setSelectedItem("");
					comboBoxFnB3.setSelectedItem("");
					comboBoxFnB2.setSelectedItem("");
					textTotal.setText(null);
					textSeat.setText(null);
					textFnB1.setText("0");
					textFnB2.setText("0");
					textFnB3.setText("0");
				}
				
			}
		});
		btnReset.setFont(new Font("Arial", Font.PLAIN, 11));
		btnReset.setBackground(Color.WHITE);
		btnReset.setBounds(1177, 476, 142, 23);
		contentPane.add(btnReset);
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
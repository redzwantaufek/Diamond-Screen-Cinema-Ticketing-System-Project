import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class paymentPage extends JFrame 
{

	DecimalFormat priceformatter = new DecimalFormat ("#0.00");
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	//
	public paymentPage(String name,String type, String movie, String date, String time, int spinnerAdult1,int spinnerChildren1,double totalTicket, String comboBox1, String comboBox2, String comboBox3,String hallNum,String seat,String membership1,double price,double price1,double price2,double typeAdultPrice,double typeChildPrice, String membershipDiscount,double textFnB,double textFnB1,double textFnB2,double pricetype) {
		setTitle("DIAMOND SCREEN CINEMA (DSC)");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1364, 609);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//covert from double to int
		int textFnbInt =(int)textFnB;
		int textFnbInt1 =(int)textFnB1;
		int textFnbInt2 =(int)textFnB2;
		
		
		JLabel lblNewLabelBanner = new JLabel("");
		lblNewLabelBanner.setIcon(new ImageIcon("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\Icon\\Payment Page\\DSC Cinema Banner.png"));
		lblNewLabelBanner.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabelBanner.setBounds(0, 0, 1348, 143);
		contentPane.add(lblNewLabelBanner);
		
		
		JPanel panelConfirmPayment = new JPanel();
		panelConfirmPayment.setBorder(new TitledBorder(null, "CONFIRM PAYMENT", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panelConfirmPayment.setBackground(new Color(0, 102, 102));
		panelConfirmPayment.setBounds(10, 153, 1035, 414);
		contentPane.add(panelConfirmPayment);
		panelConfirmPayment.setLayout(null);
		
		
		JLabel lblName = new JLabel("NAME: " +name);
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setFont(new Font("Arial", Font.BOLD, 16));
		lblName.setBounds(10, 28, 170, 43);
		panelConfirmPayment.add(lblName);
		
		
		JLabel lblCinemaType = new JLabel("CINEMA TYPE: " +type);
		lblCinemaType.setForeground(Color.WHITE);
		lblCinemaType.setFont(new Font("Arial", Font.BOLD, 16));
		lblCinemaType.setBounds(10, 82, 334, 43);
		panelConfirmPayment.add(lblCinemaType);
		
		
		JLabel lblMovie = new JLabel("MOVIE: " +movie);
		lblMovie.setForeground(Color.WHITE);
		lblMovie.setFont(new Font("Arial", Font.BOLD, 16));
		lblMovie.setBounds(10, 136, 334, 43);
		panelConfirmPayment.add(lblMovie);
		
		
		JLabel lblDate = new JLabel("DATE: " +date);
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Arial", Font.BOLD, 16));
		lblDate.setBounds(10, 190, 334, 43);
		panelConfirmPayment.add(lblDate);
		
		
		JLabel lblTime = new JLabel("TIME: " +time);
		lblTime.setForeground(Color.WHITE);
		lblTime.setFont(new Font("Arial", Font.BOLD, 16));
		lblTime.setBounds(10, 244, 334, 43);
		panelConfirmPayment.add(lblTime);
		
		
		JLabel lblHallNum = new JLabel("HALL NUMBER: " +hallNum);
		lblHallNum.setForeground(Color.WHITE);
		lblHallNum.setFont(new Font("Arial", Font.BOLD, 16));
		lblHallNum.setBounds(10, 299, 334, 43);
		panelConfirmPayment.add(lblHallNum);
		
		
		JLabel lblSeatNum = new JLabel("SEAT NUMBER: " +seat);
		lblSeatNum.setForeground(Color.WHITE);
		lblSeatNum.setFont(new Font("Arial", Font.BOLD, 16));
		lblSeatNum.setBounds(10, 353, 435, 43);
		panelConfirmPayment.add(lblSeatNum);
		
		
		JLabel lblAdult = new JLabel("ADULT: " +spinnerAdult1);
		lblAdult.setForeground(Color.WHITE);
		lblAdult.setFont(new Font("Arial", Font.BOLD, 16));
		lblAdult.setBounds(385, 28, 407, 43);
		panelConfirmPayment.add(lblAdult);
		
		
		JLabel lblChildren = new JLabel("CHILDREN: " +spinnerChildren1);
		lblChildren.setForeground(Color.WHITE);
		lblChildren.setFont(new Font("Arial", Font.BOLD, 16));
		lblChildren.setBounds(385, 82, 407, 43);
		panelConfirmPayment.add(lblChildren);
		
		
		JLabel lblMember = new JLabel("MEMBERSHIP: " +membership1);
		lblMember.setForeground(Color.WHITE);
		lblMember.setFont(new Font("Arial", Font.BOLD, 16));
		lblMember.setBounds(385, 299, 407, 43);
		panelConfirmPayment.add(lblMember);
		
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(367, 8, 19, 404);
		panelConfirmPayment.add(separator);
		
		
		JLabel lblFnB1 = new JLabel("FOOD & BEVERAGES 1: " +comboBox1 +" x " +textFnbInt);
		lblFnB1.setForeground(Color.WHITE);
		lblFnB1.setFont(new Font("Arial", Font.BOLD, 16));
		lblFnB1.setBounds(385, 136, 407, 43);
		panelConfirmPayment.add(lblFnB1);
		
		
		JLabel lblFnB2 = new JLabel("FOOD & BEVERAGES 2: " +comboBox2 +" x " +textFnbInt1);
		lblFnB2.setForeground(Color.WHITE);
		lblFnB2.setFont(new Font("Arial", Font.BOLD, 16));
		lblFnB2.setBounds(385, 190, 407, 43);
		panelConfirmPayment.add(lblFnB2);
		
		
		JLabel lblFnB3 = new JLabel("FOOD & BEVERAGES 3: " +comboBox3 +" x " +textFnbInt2);
		lblFnB3.setForeground(Color.WHITE);
		lblFnB3.setFont(new Font("Arial", Font.BOLD, 16));
		lblFnB3.setBounds(385, 244, 407, 43);
		panelConfirmPayment.add(lblFnB3);
		
		
		JLabel lblTotal = new JLabel("TOTAL: RM " +priceformatter.format(totalTicket));
		lblTotal.setForeground(Color.WHITE);
		lblTotal.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblTotal.setBounds(385, 353, 311, 43);
		panelConfirmPayment.add(lblTotal);
		
		
		JPanel panelPayOption = new JPanel();
		panelPayOption.setBackground(new Color(255, 250, 240));
		panelPayOption.setBounds(791, 16, 234, 338);
		panelConfirmPayment.add(panelPayOption);
		panelPayOption.setLayout(null);
		
		
		JLabel lblPayment = new JLabel("Payment ");
		lblPayment.setHorizontalAlignment(SwingConstants.CENTER);
		lblPayment.setForeground(new Color(0, 0, 0));
		lblPayment.setFont(new Font("Arial", Font.BOLD, 16));
		lblPayment.setBounds(10, 11, 214, 43);
		panelPayOption.add(lblPayment);
		
		
		JLabel lblPayOption = new JLabel("");
		lblPayOption.setForeground(new Color(0, 0, 0));
		lblPayOption.setFont(new Font("Arial", Font.BOLD, 11));
		lblPayOption.setBounds(116, 250, 108, 43);
		panelPayOption.add(lblPayOption);
		
		
		JComboBox comboBoxPayOption = new JComboBox();
		comboBoxPayOption.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				//to show the pay option in the GUI JLabel
				lblPayOption.setText(comboBoxPayOption.getSelectedItem().toString());
			}
		});
		comboBoxPayOption.setModel(new DefaultComboBoxModel(new String[] {"", "Online Banking", "E-Wallet", "Credit or Debit Card", "Paypal", "Cryptocurrency"}));
		comboBoxPayOption.setFont(new Font("Arial", Font.PLAIN, 15));
		comboBoxPayOption.setBounds(10, 89, 214, 22);
		panelPayOption.add(comboBoxPayOption);
		

		JLabel lblPay = new JLabel("Please Choose Your Payment Option");
		lblPay.setHorizontalAlignment(SwingConstants.CENTER);
		lblPay.setForeground(Color.BLACK);
		lblPay.setFont(new Font("Arial", Font.BOLD, 11));
		lblPay.setBounds(10, 48, 214, 30);
		panelPayOption.add(lblPay);
		
		
		JLabel lblPayOption2 = new JLabel("PAYMENT OPTION:");
		lblPayOption2.setForeground(Color.BLACK);
		lblPayOption2.setFont(new Font("Arial", Font.BOLD, 11));
		lblPayOption2.setBounds(10, 250, 108, 43);
		panelPayOption.add(lblPayOption2);
		
		
		JButton btnPay = new JButton("PAY");
		btnPay.setBounds(10, 304, 214, 23);
		panelPayOption.add(btnPay);
		btnPay.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				//if else to get the payment option
				String comboBoxPayOption1 = (String)comboBoxPayOption.getSelectedItem();
				if (((String) comboBoxPayOption.getSelectedItem()).equals("Online Banking"))
                {
					comboBoxPayOption1 = "Online Banking";
                    
                }
				else if (((String) comboBoxPayOption.getSelectedItem()).equals("E-Wallet"))
                {
					comboBoxPayOption1 = "E-Wallet";
                    
                }
				else if (((String) comboBoxPayOption.getSelectedItem()).equals("Credit or Debit Card"))
                {
					comboBoxPayOption1 = "Credit or Debit Card";
                    
                }
				else if (((String) comboBoxPayOption.getSelectedItem()).equals("Paypal"))
                {
					comboBoxPayOption1 = "Paypal";
                    
                }
				else if (((String) comboBoxPayOption.getSelectedItem()).equals("Cryptocurrency"))
                {
					comboBoxPayOption1 = "Cryptocurrency";
                    
                }
				else if (((String) comboBoxPayOption.getSelectedItem()).equals(""))
                {
					comboBoxPayOption1 = "";
                    
                }
				
				
				//if else to show the error message if there any error
				if(((String) comboBoxPayOption.getSelectedItem()).equals(""))
                {
                	JOptionPane.showMessageDialog(null, "PLEASE SELECT THE PAYMENT OPTION", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                else 
                {
                	//to connect with Receipt Page and bring the variable
    				ReceiptPage a = new ReceiptPage(comboBoxPayOption1,name,type,movie,date,time,spinnerAdult1,spinnerChildren1,totalTicket,comboBox1,comboBox2,comboBox3,hallNum,seat,membership1,price,price1,price2,typeAdultPrice,typeChildPrice,membershipDiscount,textFnB,textFnB1,textFnB2);
    				a.show();
    				dispose();
                }
			}
		});
		btnPay.setBackground(new Color(255, 255, 255));
		btnPay.setFont(new Font("Arial", Font.BOLD, 11));
		
		
		JLabel lblEwalletIcon = new JLabel("");
		lblEwalletIcon.setIcon(new ImageIcon("C:\\Users\\taufe\\Documents\\Coding\\CodingSem2\\Group Project\\Ticketing System Project\\Icon\\Payment Page\\Ewallet Icon.png"));
		lblEwalletIcon.setBounds(10, 122, 214, 130);
		panelPayOption.add(lblEwalletIcon);
		
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(801, 365, 213, 23);
		panelConfirmPayment.add(btnBack);
		btnBack.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				//to back and connect with FillInformation frame
				FillInformation a = new FillInformation(name,type,movie,date,time, pricetype);
				a.show();
				dispose();
			}
		});
		btnBack.setFont(new Font("Arial", Font.PLAIN, 11));
		btnBack.setBackground(Color.WHITE);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "NOW SHOWING", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel.setBackground(new Color(0, 102, 102));
		panel.setBounds(1055, 148, 285, 419);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel lblNewLabelNowShowing = new JLabel("");
		lblNewLabelNowShowing.setBounds(10, 14, 264, 394);
		panel.add(lblNewLabelNowShowing);
		lblNewLabelNowShowing.setIcon(new ImageIcon("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\Icon\\Payment Page\\Now Showing Gif.gif"));
		
		
		//to make frame pop out center
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	}
}

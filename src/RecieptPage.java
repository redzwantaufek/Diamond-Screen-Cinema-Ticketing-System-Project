import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;

public class RecieptPage extends JFrame {

	private JPanel contentPane;
	DecimalFormat priceformatter = new DecimalFormat ("#0.00");

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecieptPage frame = new RecieptPage();
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
	public RecieptPage(String name,String type, String movie, String date, String time, int spinnerAdult1,int spinnerChildren1,double totalTicket, String comboBox1, String comboBox2, String comboBox3,String hallNum,String seat,String membership1) {
		setTitle("DIAMOND SCREEN CINEMA (DSC)");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1364, 609);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBanner = new JLabel("");
		lblBanner.setIcon(new ImageIcon("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\Black Yellow Simple Business Thank You Postcard (1348 \u00D7 143 mm).png"));
		lblBanner.setHorizontalAlignment(SwingConstants.CENTER);
		lblBanner.setBounds(0, 0, 1348, 143);
		contentPane.add(lblBanner);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(new Color(0, 102, 102));
		panel.setBounds(10, 154, 1328, 405);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblQR = new JLabel("");
		lblQR.setIcon(new ImageIcon("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\SCANE ME.png"));
		lblQR.setBounds(1018, 11, 300, 383);
		panel.add(lblQR);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 11, 998, 383);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblName_1 = new JLabel("NAME:" +name);
		lblName_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblName_1.setBounds(10, 39, 129, 23);
		panel_1.add(lblName_1);
		
		JLabel lblName_1_1 = new JLabel("CINEMA TYPE:" +type);
		lblName_1_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblName_1_1.setBounds(9, 81, 129, 23);
		panel_1.add(lblName_1_1);
		
		JLabel lblName_1_2 = new JLabel("MOVIE:" +movie);
		lblName_1_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblName_1_2.setBounds(10, 121, 129, 23);
		panel_1.add(lblName_1_2);
		
		JLabel lblDate = new JLabel("DATE:" +date);
		lblDate.setFont(new Font("Arial", Font.BOLD, 15));
		lblDate.setBounds(10, 163, 129, 23);
		panel_1.add(lblDate);
		
		JLabel lblTime = new JLabel("TIME:" +time);
		lblTime.setFont(new Font("Arial", Font.BOLD, 15));
		lblTime.setBounds(10, 201, 129, 23);
		panel_1.add(lblTime);
		
		JLabel lblHallNum = new JLabel("HALL NUMBER:" +hallNum);
		lblHallNum.setFont(new Font("Arial", Font.BOLD, 15));
		lblHallNum.setBounds(10, 245, 129, 23);
		panel_1.add(lblHallNum);
		
		JLabel lblSeatNum = new JLabel("SEAT NUMBER:" +seat);
		lblSeatNum.setFont(new Font("Arial", Font.BOLD, 15));
		lblSeatNum.setBounds(10, 290, 129, 23);
		panel_1.add(lblSeatNum);
		
		JLabel lblReceiptIcon = new JLabel("");
		lblReceiptIcon.setIcon(new ImageIcon("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\RECEIPT.png"));
		lblReceiptIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblReceiptIcon.setBounds(352, 0, 281, 33);
		panel_1.add(lblReceiptIcon);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(Color.BLACK);
		separator.setBounds(429, 29, 14, 354);
		panel_1.add(separator);
		
		JLabel lblAdult = new JLabel("ADULT:" +spinnerAdult1);
		lblAdult.setFont(new Font("Arial", Font.BOLD, 15));
		lblAdult.setBounds(453, 39, 168, 23);
		panel_1.add(lblAdult);
		
		JLabel lblChildren = new JLabel("CHILDREN:" +spinnerChildren1);
		lblChildren.setFont(new Font("Arial", Font.BOLD, 15));
		lblChildren.setBounds(453, 81, 168, 23);
		panel_1.add(lblChildren);
		
		JLabel lblFoodBeverages = new JLabel("FOOD & BEVERAGES:" +comboBox1);
		lblFoodBeverages.setFont(new Font("Arial", Font.BOLD, 15));
		lblFoodBeverages.setBounds(453, 121, 168, 23);
		panel_1.add(lblFoodBeverages);
		
		JLabel lblFoodBeverages_1 = new JLabel("FOOD & BEVERAGES:" +comboBox2);
		lblFoodBeverages_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblFoodBeverages_1.setBounds(453, 163, 168, 23);
		panel_1.add(lblFoodBeverages_1);
		
		JLabel lblFoodBeverages_2 = new JLabel("FOOD & BEVERAGES:" +comboBox3);
		lblFoodBeverages_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblFoodBeverages_2.setBounds(453, 201, 168, 23);
		panel_1.add(lblFoodBeverages_2);
		
		JLabel lblMembership = new JLabel("MEMBERSHIP:" +membership1);
		lblMembership.setFont(new Font("Arial", Font.BOLD, 15));
		lblMembership.setBounds(453, 245, 168, 23);
		panel_1.add(lblMembership);
		
		JPanel panelPrice1 = new JPanel();
		panelPrice1.setBackground(new Color(255, 250, 240));
		panelPrice1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPrice1.setBounds(143, 39, 276, 333);
		panel_1.add(panelPrice1);
		panelPrice1.setLayout(null);
		
		JLabel lblTimePurchaseAns = new JLabel("TIME PURCHASE:");
		lblTimePurchaseAns.setFont(new Font("Arial", Font.BOLD, 15));
		lblTimePurchaseAns.setBounds(9, 296, 256, 23);
		panelPrice1.add(lblTimePurchaseAns);
		
		JPanel panelPrice2 = new JPanel();
		panelPrice2.setBackground(new Color(255, 250, 240));
		panelPrice2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPrice2.setBounds(649, 39, 339, 333);
		panel_1.add(panelPrice2);
		panelPrice2.setLayout(null);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBounds(168, 0, 11, 333);
		panelPrice2.add(separator_1_1);
		
		JLabel lblAdultans = new JLabel("AdultAns");
		lblAdultans.setFont(new Font("Arial", Font.BOLD, 15));
		lblAdultans.setBounds(10, 1, 158, 23);
		panelPrice2.add(lblAdultans);
		
		JLabel lblTimePurchaseAns_8_1 = new JLabel("ChildrenAns");
		lblTimePurchaseAns_8_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblTimePurchaseAns_8_1.setBounds(9, 41, 158, 23);
		panelPrice2.add(lblTimePurchaseAns_8_1);
		
		JLabel lblTimePurchaseAns_8_2 = new JLabel("FnB1Ans");
		lblTimePurchaseAns_8_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblTimePurchaseAns_8_2.setBounds(10, 80, 158, 23);
		panelPrice2.add(lblTimePurchaseAns_8_2);
		
		JLabel lblTimePurchaseAns_8_3 = new JLabel("FnB2Ans");
		lblTimePurchaseAns_8_3.setFont(new Font("Arial", Font.BOLD, 15));
		lblTimePurchaseAns_8_3.setBounds(10, 122, 158, 23);
		panelPrice2.add(lblTimePurchaseAns_8_3);
		
		JLabel lblTimePurchaseAns_8_4 = new JLabel("FnB3Ans");
		lblTimePurchaseAns_8_4.setFont(new Font("Arial", Font.BOLD, 15));
		lblTimePurchaseAns_8_4.setBounds(10, 160, 158, 23);
		panelPrice2.add(lblTimePurchaseAns_8_4);
		
		JLabel lblTimePurchaseAns_8_5 = new JLabel("MembershipAns");
		lblTimePurchaseAns_8_5.setFont(new Font("Arial", Font.BOLD, 15));
		lblTimePurchaseAns_8_5.setBounds(10, 207, 158, 23);
		panelPrice2.add(lblTimePurchaseAns_8_5);
		
		JLabel lblAdultPriceAns = new JLabel("AdultPriceAns");
		lblAdultPriceAns.setFont(new Font("Arial", Font.BOLD, 15));
		lblAdultPriceAns.setBounds(181, 1, 148, 23);
		panelPrice2.add(lblAdultPriceAns);
		
		JLabel lblChildPriceAns = new JLabel("ChildPriceAns");
		lblChildPriceAns.setFont(new Font("Arial", Font.BOLD, 15));
		lblChildPriceAns.setBounds(181, 41, 148, 23);
		panelPrice2.add(lblChildPriceAns);
		
		JLabel lblFnB1PriceAns = new JLabel("FnB1PriceAns");
		lblFnB1PriceAns.setFont(new Font("Arial", Font.BOLD, 15));
		lblFnB1PriceAns.setBounds(181, 80, 148, 23);
		panelPrice2.add(lblFnB1PriceAns);
		
		JLabel lblFnB2PriceAns = new JLabel("FnB2PriceAns");
		lblFnB2PriceAns.setFont(new Font("Arial", Font.BOLD, 15));
		lblFnB2PriceAns.setBounds(181, 122, 148, 23);
		panelPrice2.add(lblFnB2PriceAns);
		
		JLabel lblTFnB3PriceAns = new JLabel("FnB3PriceAns");
		lblTFnB3PriceAns.setFont(new Font("Arial", Font.BOLD, 15));
		lblTFnB3PriceAns.setBounds(181, 160, 148, 23);
		panelPrice2.add(lblTFnB3PriceAns);
		
		JLabel lblMembershipPriceAns = new JLabel("MembershipPriceAns");
		lblMembershipPriceAns.setFont(new Font("Arial", Font.BOLD, 15));
		lblMembershipPriceAns.setBounds(181, 207, 148, 23);
		panelPrice2.add(lblMembershipPriceAns);
		
		JLabel lblTimePurchase = new JLabel("TIME PURCHASE:");
		lblTimePurchase.setFont(new Font("Arial", Font.BOLD, 15));
		lblTimePurchase.setBounds(10, 335, 129, 23);
		panel_1.add(lblTimePurchase);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		lblTimePurchaseAns.setText(dtf.format(now));
		
		JLabel lblTimeNameAns = new JLabel("NameAns");
		lblTimeNameAns.setFont(new Font("Arial", Font.BOLD, 15));
		lblTimeNameAns.setBounds(9, 0, 256, 23);
		panelPrice1.add(lblTimeNameAns);
		
		JLabel lblCinemaans = new JLabel("CinemaAns");
		lblCinemaans.setFont(new Font("Arial", Font.BOLD, 15));
		lblCinemaans.setBounds(9, 42, 256, 23);
		panelPrice1.add(lblCinemaans);
		
		JLabel lblMovieans = new JLabel("MovieAns");
		lblMovieans.setFont(new Font("Arial", Font.BOLD, 15));
		lblMovieans.setBounds(9, 82, 256, 23);
		panelPrice1.add(lblMovieans);
		
		JLabel lblDateans = new JLabel("DateAns");
		lblDateans.setFont(new Font("Arial", Font.BOLD, 15));
		lblDateans.setBounds(9, 124, 256, 23);
		panelPrice1.add(lblDateans);
		
		JLabel lblTimeans = new JLabel("TimeAns");
		lblTimeans.setFont(new Font("Arial", Font.BOLD, 15));
		lblTimeans.setBounds(9, 163, 256, 23);
		panelPrice1.add(lblTimeans);
		
		JLabel lblHallnumans = new JLabel("HallNumAns");
		lblHallnumans.setFont(new Font("Arial", Font.BOLD, 15));
		lblHallnumans.setBounds(9, 205, 256, 23);
		panelPrice1.add(lblHallnumans);
		
		JLabel lblSeatans = new JLabel("SeatAns");
		lblSeatans.setFont(new Font("Arial", Font.BOLD, 15));
		lblSeatans.setBounds(9, 249, 256, 23);
		panelPrice1.add(lblSeatans);
		
		JLabel lblTotal = new JLabel("TOTAL:" +priceformatter.format(totalTicket));
		lblTotal.setBounds(453, 337, 54, 18);
		panel_1.add(lblTotal);
		lblTotal.setFont(new Font("Arial", Font.BOLD, 15));
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	}
}

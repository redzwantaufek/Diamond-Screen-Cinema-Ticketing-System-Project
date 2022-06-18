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
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class paymentPage extends JFrame {

	DecimalFormat priceformatter = new DecimalFormat ("#0.00");
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paymentPage frame = new paymentPage();
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
	//
	public paymentPage(String name,String type, String movie, String date, String time, int spinnerAdult1,int spinnerChildren1,double totalTicket, String comboBox1, String comboBox2, String comboBox3,String hallNum,String seat,String membership1,double price,double price1,double price2,int priceAdult, int priceChildren, String membershipDiscount) {
		setTitle("DIAMOND SCREEN CINEMA (DSC)");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1364, 609);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabelBanner = new JLabel("");
		lblNewLabelBanner.setIcon(new ImageIcon("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\DSC Cinema Logo Long (1328 \u00D7 143 px).png"));
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
		lblAdult.setBounds(484, 28, 407, 43);
		panelConfirmPayment.add(lblAdult);
		
		JLabel lblChildren = new JLabel("CHILDREN: " +spinnerChildren1);
		lblChildren.setForeground(Color.WHITE);
		lblChildren.setFont(new Font("Arial", Font.BOLD, 16));
		lblChildren.setBounds(484, 82, 407, 43);
		panelConfirmPayment.add(lblChildren);
		
		JLabel lblMember = new JLabel("MEMBERSHIP: " +membership1);
		lblMember.setForeground(Color.WHITE);
		lblMember.setFont(new Font("Arial", Font.BOLD, 16));
		lblMember.setBounds(484, 299, 407, 43);
		panelConfirmPayment.add(lblMember);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(455, 11, 19, 404);
		panelConfirmPayment.add(separator);
		
		JLabel lblFnB1 = new JLabel("FOOD & BEVERAGES 1: " +comboBox1);
		lblFnB1.setForeground(Color.WHITE);
		lblFnB1.setFont(new Font("Arial", Font.BOLD, 16));
		lblFnB1.setBounds(484, 136, 407, 43);
		panelConfirmPayment.add(lblFnB1);
		
		JLabel lblFnB2 = new JLabel("FOOD & BEVERAGES 2: " +comboBox2);
		lblFnB2.setForeground(Color.WHITE);
		lblFnB2.setFont(new Font("Arial", Font.BOLD, 16));
		lblFnB2.setBounds(484, 190, 407, 43);
		panelConfirmPayment.add(lblFnB2);
		
		JLabel lblFnB3 = new JLabel("FOOD & BEVERAGES 3: " +comboBox3);
		lblFnB3.setForeground(Color.WHITE);
		lblFnB3.setFont(new Font("Arial", Font.BOLD, 16));
		lblFnB3.setBounds(484, 244, 407, 43);
		panelConfirmPayment.add(lblFnB3);
		
		JLabel lblTotal = new JLabel("TOTAL: RM " +priceformatter.format(totalTicket));
		lblTotal.setForeground(Color.WHITE);
		lblTotal.setFont(new Font("Arial", Font.BOLD, 16));
		lblTotal.setBounds(484, 353, 407, 43);
		panelConfirmPayment.add(lblTotal);
		
		JButton btnConfirm = new JButton("CONFIRM");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RecieptPage a = new RecieptPage(name,type,movie,date,time,spinnerAdult1,spinnerChildren1,totalTicket,comboBox1,comboBox2,comboBox3,hallNum,seat,membership1,price,price1,price2,priceAdult,priceChildren,membershipDiscount);
				a.show();
				dispose();
			}
		});
		btnConfirm.setBackground(new Color(255, 255, 255));
		btnConfirm.setFont(new Font("Arial", Font.BOLD, 11));
		btnConfirm.setBounds(901, 365, 89, 23);
		panelConfirmPayment.add(btnConfirm);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "NOW SHOWING", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel.setBackground(new Color(0, 102, 102));
		panel.setBounds(1055, 148, 285, 419);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabelNowShowing = new JLabel("");
		lblNewLabelNowShowing.setBounds(10, 14, 264, 394);
		panel.add(lblNewLabelNowShowing);
		lblNewLabelNowShowing.setIcon(new ImageIcon("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\iloveimg-resized\\now showing gif.gif"));
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	}
}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;

public class WelcomePage extends JFrame {

	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage frame = new WelcomePage();
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
	public WelcomePage(String name) {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\Gold Line art Video Camera for Movie Cinema Production Logo (200 \u00D7 200 px).png"));
		setTitle("DIAMOND SCREEN CINEMA (DSC)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1364, 609);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		JLabel lblLogoIconWelcome = new JLabel("");
		lblLogoIconWelcome.setIcon(new ImageIcon("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\DSC Cinema Logo Long (950 \u00D7 107 px) dolby imax.png"));
		lblLogoIconWelcome.setBounds(388, 11, 950, 107);
		contentPane.add(lblLogoIconWelcome);
		
		JPanel panelNowShowing = new JPanel();
		panelNowShowing.setBackground(new Color(0, 102, 102));
		panelNowShowing.setBorder(new TitledBorder(null, "NOW SHOWING", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panelNowShowing.setBounds(10, 11, 368, 548);
		contentPane.add(panelNowShowing);
		panelNowShowing.setLayout(null);
		
		JLabel lblTopGunIcon = new JLabel("");
		lblTopGunIcon.setIcon(new ImageIcon("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\TOPGUN POSTER kecik.jpg"));
		lblTopGunIcon.setBounds(10, 21, 159, 222);
		panelNowShowing.add(lblTopGunIcon);
		
		JLabel lblDrStrangeIcon = new JLabel("");
		lblDrStrangeIcon.setIcon(new ImageIcon("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\FQWWNqgVEAUX1Uz kecik.jpg"));
		lblDrStrangeIcon.setBounds(199, 21, 152, 222);
		panelNowShowing.add(lblDrStrangeIcon);
		
		JLabel lblJurassicIcon = new JLabel("");
		lblJurassicIcon.setIcon(new ImageIcon("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\nima-neemz-nakhshab-dominion-final kecik.jpg"));
		lblJurassicIcon.setBounds(199, 288, 152, 222);
		panelNowShowing.add(lblJurassicIcon);
		
		JLabel lblSonicIcon = new JLabel("");
		lblSonicIcon.setIcon(new ImageIcon("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\MV5BMGI1NjA1MjUtNGQxNC00NDYyLThjODgtZjFkZjQ4OGM0NDc5XkEyXkFqcGdeQXVyMTM0NTUzNDIy._V1_FMjpg_UX1000_Sonic.jpg"));
		lblSonicIcon.setBounds(10, 288, 152, 222);
		panelNowShowing.add(lblSonicIcon);
		
		JLabel lblTopGunLabel = new JLabel("Top Gun: Maverick");
		lblTopGunLabel.setForeground(Color.WHITE);
		lblTopGunLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTopGunLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblTopGunLabel.setBounds(10, 254, 152, 14);
		panelNowShowing.add(lblTopGunLabel);
		
		JLabel lblSonic2Label = new JLabel("Sonic The Heghedog 2");
		lblSonic2Label.setHorizontalAlignment(SwingConstants.CENTER);
		lblSonic2Label.setForeground(Color.WHITE);
		lblSonic2Label.setFont(new Font("Arial", Font.BOLD, 13));
		lblSonic2Label.setBounds(10, 521, 152, 14);
		panelNowShowing.add(lblSonic2Label);
		
		JLabel lblJurassicLabel = new JLabel("Jurassic World Dominion");
		lblJurassicLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblJurassicLabel.setForeground(Color.WHITE);
		lblJurassicLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblJurassicLabel.setBounds(199, 521, 152, 14);
		panelNowShowing.add(lblJurassicLabel);
		
		JLabel lblDrStrange2Label = new JLabel("Doctor Strange: 2");
		lblDrStrange2Label.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrStrange2Label.setForeground(Color.WHITE);
		lblDrStrange2Label.setFont(new Font("Arial", Font.BOLD, 14));
		lblDrStrange2Label.setBounds(199, 254, 152, 14);
		panelNowShowing.add(lblDrStrange2Label);
		
		JPanel panelsShowtime = new JPanel();
		panelsShowtime.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "SHOWTIME", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panelsShowtime.setBackground(new Color(0, 102, 102));
		panelsShowtime.setBounds(388, 129, 656, 430);
		contentPane.add(panelsShowtime);
		panelsShowtime.setLayout(null);
		
		JLabel lblCinemaType = new JLabel("CINEMA TYPE");
		lblCinemaType.setForeground(new Color(255, 255, 255));
		lblCinemaType.setFont(new Font("Arial", Font.BOLD, 14));
		lblCinemaType.setBounds(27, 126, 113, 30);
		panelsShowtime.add(lblCinemaType);
		
		JComboBox comboBoxCinemaType = new JComboBox();
		comboBoxCinemaType.setBackground(new Color(255, 255, 255));
		comboBoxCinemaType.setModel(new DefaultComboBoxModel(new String[] {"", "1. Classic", "2. Dolby Cinema", "3. IMAX Cinema", "4. Deluxe", "5. Luxury"}));
		comboBoxCinemaType.setFont(new Font("Arial", Font.BOLD, 14));
		comboBoxCinemaType.setBounds(215, 131, 177, 22);
		panelsShowtime.add(comboBoxCinemaType);
		
		JLabel lblMovie = new JLabel("MOVIE");
		lblMovie.setForeground(Color.WHITE);
		lblMovie.setFont(new Font("Arial", Font.BOLD, 14));
		lblMovie.setBounds(27, 177, 113, 30);
		panelsShowtime.add(lblMovie);
		
		JLabel lblDate = new JLabel("DATE");
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Arial", Font.BOLD, 14));
		lblDate.setBounds(27, 227, 113, 30);
		panelsShowtime.add(lblDate);
		
		JLabel lblTime = new JLabel("TIME");
		lblTime.setForeground(Color.WHITE);
		lblTime.setFont(new Font("Arial", Font.BOLD, 14));
		lblTime.setBounds(27, 278, 113, 30);
		panelsShowtime.add(lblTime);
		
		JComboBox comboBoxMovie = new JComboBox();
		comboBoxMovie.setModel(new DefaultComboBoxModel(new String[] {"", "1. Top Gun Maverick", "2. Doctor Strange: 2", "3. Sonic The Heghedog 2", "4. Jurassic World Dominion"}));
		comboBoxMovie.setFont(new Font("Arial", Font.BOLD, 14));
		comboBoxMovie.setBackground(Color.WHITE);
		comboBoxMovie.setBounds(215, 182, 177, 22);
		panelsShowtime.add(comboBoxMovie);
		
		JComboBox comboBoxDate = new JComboBox();
		comboBoxDate.setModel(new DefaultComboBoxModel(new String[] {"", "20/6/2022", "21/6/2022", "22/6/2022", "23/6/2022", "24/6/2022", "25/6/2022", "26/6/2022", "27/6/2022"}));
		comboBoxDate.setFont(new Font("Arial", Font.BOLD, 14));
		comboBoxDate.setBackground(Color.WHITE);
		comboBoxDate.setBounds(215, 232, 177, 22);
		panelsShowtime.add(comboBoxDate);
		
		JComboBox comboBoxTime = new JComboBox();
		comboBoxTime.setMaximumRowCount(11);
		comboBoxTime.setModel(new DefaultComboBoxModel(new String[] {"", "11:00", "01:30", "03:20", "05:40", "07:30", "08:10", "09:20", "10:10", "11:30", "12:10"}));
		comboBoxTime.setFont(new Font("Arial", Font.BOLD, 14));
		comboBoxTime.setBackground(Color.WHITE);
		comboBoxTime.setBounds(215, 283, 177, 22);
		panelsShowtime.add(comboBoxTime);
		
		JLabel lblShowtimeTable = new JLabel("");
		lblShowtimeTable.setIcon(new ImageIcon("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\Comparison Table List Infographic Gantt Chart Graph (234 \u00D7 408 px).png"));
		lblShowtimeTable.setBounds(412, 15, 234, 404);
		panelsShowtime.add(lblShowtimeTable);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double pricetype = 0.0;
				
				String type = (String)comboBoxCinemaType.getSelectedItem();
				if (((String)comboBoxCinemaType.getSelectedItem()).equals("1. Classic"))
				{
					type = "Classic";
					pricetype = 10;
				}
				else if (((String)comboBoxCinemaType.getSelectedItem()).equals("2. Dolby Cinema"))
				{
					type = "Dolby Cinema";
					pricetype = 25;
					
				}
				else if (((String)comboBoxCinemaType.getSelectedItem()).equals("3. IMAX Cinema"))
				{
					type = "IMAX Cinema";
					pricetype = 25;
				}
				else if (((String)comboBoxCinemaType.getSelectedItem()).equals("4. Deluxe"))
				{
					type = "Deluxe";
					pricetype = 30;
				}
				else if (((String)comboBoxCinemaType.getSelectedItem()).equals("5. Luxury"))
				{
					type = "Luxury";
					pricetype = 40;
				}
				
				String movie = (String)comboBoxMovie.getSelectedItem();
				if (((String)comboBoxMovie.getSelectedItem()).equals("1. Top Gun Maverick"))
				{
					movie = "Top Gun Maverick";
				}
				else if (((String)comboBoxMovie.getSelectedItem()).equals("2. Doctor Strange: 2"))
				{
					movie =  "Doctor Strange: 2";
				}
				else if (((String)comboBoxMovie.getSelectedItem()).equals("3. Sonic The Heghedog 2"))
				{
					movie = "Sonic The Heghedog 2";
				}
				else if (((String)comboBoxMovie.getSelectedItem()).equals("4. Jurassic World Dominion"))
				{
					movie = "Jurassic World Dominion";
				}
				
				String date = (String)comboBoxDate.getSelectedItem();
				if (((String)comboBoxDate.getSelectedItem()).equals("20/6/2022"))
				{
					date = "20/6/2022";
				}
				else if (((String)comboBoxDate.getSelectedItem()).equals("21/6/2022"))
				{
					date = "21/6/2022";
				}
				else if (((String)comboBoxDate.getSelectedItem()).equals("22/6/2022"))
				{
					date = "22/6/2022";
				}
				else if (((String)comboBoxDate.getSelectedItem()).equals("23/6/2022"))
				{
					date = "23/6/2022";
				}
				else if (((String)comboBoxDate.getSelectedItem()).equals("24/6/2022"))
				{
					date = "24/6/2022";
				}
				else if (((String)comboBoxDate.getSelectedItem()).equals("25/6/2022"))
				{
					date = "25/6/2022";
				}
				else if (((String)comboBoxDate.getSelectedItem()).equals("26/6/2022"))
				{
					date = "26/6/2022";
				}
				else if (((String)comboBoxDate.getSelectedItem()).equals("27/6/2022"))
				{
					date = "27/6/2022";
				}
				
				String time = (String)comboBoxTime.getSelectedItem();
				if (((String)comboBoxTime.getSelectedItem()).equals("11:00"))
				{
					time = "11:00";
				}
				else if (((String)comboBoxTime.getSelectedItem()).equals("01:30"))
				{
					time = "01:30";
				}
				else if (((String)comboBoxTime.getSelectedItem()).equals("03:20"))
				{
					time = "03:20";
				}
				else if (((String)comboBoxTime.getSelectedItem()).equals("05:40"))
				{
					time = "05:40";
				}
				else if (((String)comboBoxTime.getSelectedItem()).equals("07:30"))
				{
					time = "07:30";
				}
				else if (((String)comboBoxTime.getSelectedItem()).equals("08:10"))
				{
					time = "08:10";
				}
				else if (((String)comboBoxTime.getSelectedItem()).equals("09:20"))
				{
					time = "09:20";
				}
				else if (((String)comboBoxTime.getSelectedItem()).equals("10:10"))
				{
					time = "10:10";
				}
				else if (((String)comboBoxTime.getSelectedItem()).equals("11:30"))
				{
					time = "11:30";
				}
				else if (((String)comboBoxTime.getSelectedItem()).equals( "12:10"))
				{
					time =  "12:10";
				}
				
				FillInformation a = new FillInformation(name,type,movie,date,time,pricetype);
				a.show();
				dispose();
				
				
				
			}
		});
		btnNext.setBounds(215, 335, 177, 23);
		panelsShowtime.add(btnNext);
		btnNext.setForeground(new Color(0, 0, 0));
		btnNext.setFont(new Font("Arial", Font.BOLD, 14));
		
		JPanel panelComingSoon = new JPanel();
		panelComingSoon.setBackground(new Color(0, 102, 102));
		panelComingSoon.setBorder(new TitledBorder(null, "COMING SOON", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panelComingSoon.setBounds(1054, 129, 284, 430);
		contentPane.add(panelComingSoon);
		panelComingSoon.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "CURRENT TIME", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(26, 15, 365, 78);
		panelsShowtime.add(panel);
		panel.setLayout(null);
		
		JLabel dateTime = new JLabel("Dynamic Clock");
        dateTime.setBackground(new Color(255, 255, 255));
        dateTime.setForeground(new Color(0, 0, 0));
        dateTime.setFont(new Font("Arial", Font.BOLD, 20));
        dateTime.setHorizontalAlignment(SwingConstants.CENTER);
        dateTime.setBounds(10, 21, 345, 41);
        panel.add(dateTime);

        Thread clock  = new Thread(){
            public void run(){
                for(;;){
                    //empty for will run forever
                    //System.out.print("p");
                    Calendar cal = new GregorianCalendar();

                    int month = cal.get(Calendar.MONTH);
                    int year = cal.get(Calendar.YEAR);
                    int day = cal.get(Calendar.DAY_OF_MONTH);

                    int second = cal.get(Calendar.SECOND);
                    int minute = cal.get(Calendar.MINUTE);
                    int hour = cal.get(Calendar.HOUR);

                    dateTime.setText(day+"/"+(((month+1)<10)?"0"+(month+1):(month+1))+"/"+year+"  "
                            + hour+":"+minute+":"+second
                            );

                        try {
                            sleep(1000);//1000 miliseconds it will sleep which means one second sleep
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                }
            }
            };
            clock.start();
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\iloveimg-resized\\Webp.net-gifmaker.gif"));
		lblNewLabel.setBounds(10, 25, 264, 394);
		panelComingSoon.add(lblNewLabel);
	}
}
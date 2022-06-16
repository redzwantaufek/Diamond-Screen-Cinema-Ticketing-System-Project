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
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class WelcomePage extends JFrame {

	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	public WelcomePage() {
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
		lblCinemaType.setBounds(29, 22, 113, 30);
		panelsShowtime.add(lblCinemaType);
		
		JComboBox comboBoxCinemaType = new JComboBox();
		comboBoxCinemaType.setBackground(new Color(255, 255, 255));
		comboBoxCinemaType.setModel(new DefaultComboBoxModel(new String[] {"", "1. Classic", "2. Dolby Cinema", "3. IMAX Cinema", "4. Deluxe", "5. Luxury"}));
		comboBoxCinemaType.setFont(new Font("Arial", Font.BOLD, 14));
		comboBoxCinemaType.setBounds(217, 27, 177, 22);
		panelsShowtime.add(comboBoxCinemaType);
		
		JLabel lblMovie = new JLabel("MOVIE");
		lblMovie.setForeground(Color.WHITE);
		lblMovie.setFont(new Font("Arial", Font.BOLD, 14));
		lblMovie.setBounds(29, 73, 113, 30);
		panelsShowtime.add(lblMovie);
		
		JLabel lblDate = new JLabel("DATE");
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Arial", Font.BOLD, 14));
		lblDate.setBounds(29, 123, 113, 30);
		panelsShowtime.add(lblDate);
		
		JLabel lblTime = new JLabel("TIME");
		lblTime.setForeground(Color.WHITE);
		lblTime.setFont(new Font("Arial", Font.BOLD, 14));
		lblTime.setBounds(29, 174, 113, 30);
		panelsShowtime.add(lblTime);
		
		JComboBox comboBoxMovie = new JComboBox();
		comboBoxMovie.setModel(new DefaultComboBoxModel(new String[] {"", "1. Top Gun Maverick", "2. Doctor Strange: 2", "3. Sonic The Heghedog 2", "4. Jurassic World Dominion"}));
		comboBoxMovie.setFont(new Font("Arial", Font.BOLD, 14));
		comboBoxMovie.setBackground(Color.WHITE);
		comboBoxMovie.setBounds(217, 78, 177, 22);
		panelsShowtime.add(comboBoxMovie);
		
		JComboBox comboBoxDate = new JComboBox();
		comboBoxDate.setModel(new DefaultComboBoxModel(new String[] {"", "20/6/2022", "21/6/2022", "22/6/2022", "23/6/2022", "24/6/2022", "25/6/2022", "26/6/2022", "27/6/2022"}));
		comboBoxDate.setFont(new Font("Arial", Font.BOLD, 14));
		comboBoxDate.setBackground(Color.WHITE);
		comboBoxDate.setBounds(217, 128, 177, 22);
		panelsShowtime.add(comboBoxDate);
		
		JComboBox comboBoxTime = new JComboBox();
		comboBoxTime.setMaximumRowCount(11);
		comboBoxTime.setModel(new DefaultComboBoxModel(new String[] {"", "11:00", "01:30", "03:20", "05:40", "07:30", "08:10", "09:20", "10:10", "11:30", "12:10"}));
		comboBoxTime.setFont(new Font("Arial", Font.BOLD, 14));
		comboBoxTime.setBackground(Color.WHITE);
		comboBoxTime.setBounds(217, 179, 177, 22);
		panelsShowtime.add(comboBoxTime);
		
		JLabel lblShowtimeTable = new JLabel("");
		lblShowtimeTable.setIcon(new ImageIcon("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\Comparison Table List Infographic Gantt Chart Graph (234 \u00D7 408 px).png"));
		lblShowtimeTable.setBounds(412, 15, 234, 404);
		panelsShowtime.add(lblShowtimeTable);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setBounds(217, 231, 177, 23);
		panelsShowtime.add(btnNext);
		btnNext.setForeground(new Color(0, 0, 0));
		btnNext.setFont(new Font("Arial", Font.BOLD, 14));
		
		JPanel panelComingSoon = new JPanel();
		panelComingSoon.setBackground(new Color(0, 102, 102));
		panelComingSoon.setBorder(new TitledBorder(null, "COMING SOON", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panelComingSoon.setBounds(1054, 129, 284, 430);
		contentPane.add(panelComingSoon);
		panelComingSoon.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\iloveimg-resized\\Webp.net-gifmaker.gif"));
		lblNewLabel.setBounds(10, 25, 264, 394);
		panelComingSoon.add(lblNewLabel);
	}
}

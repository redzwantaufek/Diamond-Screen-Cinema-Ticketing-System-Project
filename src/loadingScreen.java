import javax.swing.*;
import java.awt.*;

public class loadingScreen {
    JFrame frame;
    JLabel image=new JLabel(new ImageIcon("C:\\Users\\taufe\\Documents\\Lecture\\Semester 2\\Object Oriented Programming(SWC2333)\\Kerja\\Assignment group\\Gambo\\dsc poster (1344 \u00D7 587 px) (1364 \u00D7 408 px).png"));
    JLabel text=new JLabel("WELCOME");
    JProgressBar progressBar=new JProgressBar();
    JLabel message=new JLabel();//Crating a JLabel for displaying the message
    loadingScreen()
    {
        createGUI();
        addImage();
        addText();
        addProgressBar();
        addMessage();
        runningPBar();
        //
    }
    public void createGUI(){
        frame=new JFrame();
        frame.setUndecorated(true);
        frame.setSize(1364,609);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(51, 51, 51));
        frame.setVisible(true);
        

    }
    public void addImage(){
        frame.getContentPane().setLayout(null);
        image.setBounds(0, 0, 1364, 408);
        frame.getContentPane().add(image);
    }
    public void addText()
    {
        text.setHorizontalAlignment(SwingConstants.CENTER);
        text.setBounds(387, 436, 600, 40);
        text.setFont(new Font("arial",Font.BOLD,30));
        text.setForeground(new Color(255, 255, 255));
        frame.getContentPane().add(text);
    }
    public void addMessage()
    {
        message.setHorizontalAlignment(SwingConstants.CENTER);
        message.setBounds(589, 487, 200, 40);
        message.setForeground(new Color(255, 255, 255));//Setting foreground Color
        message.setFont(new Font("arial",Font.BOLD,15));//Setting font properties
        frame.getContentPane().add(message);//adding label to the frame
    }
    public void addProgressBar(){
        progressBar.setBounds(491, 538, 400, 30);
        progressBar.setBorderPainted(true);
        progressBar.setStringPainted(true);
        progressBar.setBackground(Color.WHITE);
        progressBar.setForeground(Color.BLACK);
        progressBar.setValue(0);
        frame.getContentPane().add(progressBar);
    }
    public void runningPBar(){
        int i=0;//Creating an integer variable and intializing it to 0

        while( i<=100)
        {
            try{
                Thread.sleep(20);//Pausing execution for 50 milliseconds
                progressBar.setValue(i);//Setting value of Progress Bar
                message.setText("LOADING "+Integer.toString(i)+"%");//Setting text of the message JLabel
                i++;
                if(i==100)
                    frame.dispose();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

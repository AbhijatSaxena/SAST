import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class LogFom extends JFrame implements ActionListener
{
 JLabel lnl,pwl,ch,ch1;
 JTextField lnt;
 JPasswordField pwt;
 JButton ok,can;
 Container c;
 String ln="admin";
 String psw = "sast" ;

 Connection conn;
 PreparedStatement pstmt;
 	frmSplash FormSplash= new frmSplash();
	Thread ThFormSplash = new Thread(FormSplash);

	public void setUp()
	{

	c=getContentPane();
	resize(350,200);
	Dimension d=size();
	setLocation(d.width,d.height);
	setTitle("SAST");
      	c.setLayout(null);
	setIconImage(Toolkit.getDefaultToolkit().getImage("./icon/logo.ico"));
	loadSplashScreen();
		FormSplash.dispose(); //dispose
	show();
  	lnl=new JLabel("USER NAME");
	lnt=new JTextField();
  	lnl.setBounds(20,20,80,30);
  	lnt.setBounds(150,20,180,30);

  	pwl=new JLabel("PASSWORD");
	pwt=new JPasswordField();

  	pwl.setBounds(20,70,80,30);
  	pwt.setBounds(150,70,180,30);

  	ok=new JButton("OK");
  	ok.setBounds(50,120,100,30);

  	can=new JButton("CANCEL");
  	can.setBounds(180,120,100,30);



	c.add(lnl);
  	c.add(lnt);
  	c.add(pwl);
  	c.add(pwt);
  	c.add(ok);
  	c.add(can);


  	ok.addActionListener(this);
  	can.addActionListener(this);

	setResizable(false);
	setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
 	 String s=ae.getActionCommand();

		if(s.equals("OK"))
		{

			try
			{
			String lntt = lnt.getText();
				String psww = pwt.getText();
						int flag = 0;
						 if(ln.equals(lntt) && psw.equals(psww))
						{
							flag=1;
							Sast ru = new Sast(lntt);
							ru.setUp();
							setVisible(false);
							dispose();
						}


					if(flag==0)
					{
						JOptionPane.showMessageDialog (this, "Invalid User name or Password.","SAST", JOptionPane.PLAIN_MESSAGE);
							lnt.setText("");
							pwt.setText("");

					}
			}

        			catch(Exception e)
  			{
  				System.out.println("sql exception");
  			}

		}

	 	if(s.equals("CANCEL"))
	  	 {
	   	 System.exit(0);
	   	}
	}

public static void main(String args[])
 {
  LogFom lf=new  LogFom();
  lf.setUp();
 }

 protected void loadSplashScreen()
	{
		//Start the thread
		ThFormSplash.start();
		while(!FormSplash.isShowing())
		{
			try
			{
				//Display the FormSplash for 10 seconds
				Thread.sleep(5000);
			}
			catch(InterruptedException e){}
		}
	}//:Load Splash Screen
}
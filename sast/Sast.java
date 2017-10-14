import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Sast extends JFrame
{

	JPanel jp=new JPanel();
	JLabel jlb;
	JMenuBar mb;
	JMenu m1,m2,m3,m4 ,m5,m6,m7,m8;
	JMenuItem  mi11,mi12,mi13,mi21,mi31,mi32,mi41,mi42,mi43,mi44,mi51,mi52,mi53,mi54,mi55,mi56;
	JMenuItem mi61,mi62,mi63,mi64,mi71,mi72,mi73;
	JButton b1;
	Container c;
	String em;

	Sast(String email)
	{
		em=email;
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public void setUp()
	{
		c=getContentPane();
		setTitle("SAST");
		c.setBackground(Color.white);
		c.setLayout(null);
		jp.setLayout(new FlowLayout());
		//jp.setBackground(Color.white);
		//jp.setBounds(150,210,600,300);

		setIconImage(Toolkit.getDefaultToolkit().getImage("./icon/logo.ico"));

		jlb=new JLabel(new ImageIcon("./Images/uit.jpg"));
		jlb.setBounds(0,0,900,120);

		mb = new JMenuBar();

      	m1 = new JMenu("Sast");
      	m2 = new JMenu("Abstraction");
      	m3 = new JMenu("Security");
      	m4 = new JMenu("Log On");
      	m5 = new JMenu("Optimize");
      	m6 = new JMenu("Right Click");
		m7 = new JMenu("Others");
		m8 = new JMenu("Info");


      	mi11 = new JMenuItem("Inject Logo",new ImageIcon("./Images/logo.gif"));
      	mi12 = new JMenuItem("Reboot",new ImageIcon("./Images/reboot.gif"));
      	mi13 = new JMenuItem("Exit",new ImageIcon("./Images/exit.gif"));

      	mi21= new JMenuItem("Open",new ImageIcon("./Images/open.gif"));

      	mi31 = new JMenuItem("Add file Encryption / Decryption",new ImageIcon("./Images/lock.gif"));
      //	mi32 = new JMenuItem("Folder lock / unlock");

      	mi41 = new JMenuItem("Logon Type",new ImageIcon("./Images/login.gif"));
      	mi42 = new JMenuItem("Logon Notification",new ImageIcon("./Images/logon.gif"));
      	mi43 = new JMenuItem("Show Admin Account",new ImageIcon("./Images/admin.gif"));
      	mi44 = new JMenuItem("AutoLogin",new ImageIcon("./Images/login1.gif"));

		mi51 = new JMenuItem("Fast Shutdown",new ImageIcon("./Images/stop.gif"));
      	mi52 = new JMenuItem("Autoend Hunged Tasks");
      	mi53 = new JMenuItem("CHKDSK on System Crash",new ImageIcon("./Images/chkdsk.gif"));
      	//mi54 = new JMenuItem("Clear Temp Files");
      	mi55 = new JMenuItem("Clear Mediaplayer playlist");
      	mi56 = new JMenuItem("Automatic screen refresh",new ImageIcon("./Images/reboot.gif"));

      	mi61 = new JMenuItem("Right Click on Desktop",new ImageIcon("./Images/right.gif"));
      	mi62 = new JMenuItem("Add Open with to all Files",new ImageIcon("./Images/openwith.gif"));
      //	mi63 = new JMenuItem("Add an Application");
      	mi64 = new JMenuItem("Add Encrypt / Decrypt option",new ImageIcon("./Images/lock.gif"));

      	mi71 = new JMenuItem("Change AM / PM in System Tray",new ImageIcon("./Images/am2.gif"));
      	mi72 = new JMenuItem("Show Version in Desktop",new ImageIcon("./Images/ver.gif"));
      	mi73 = new JMenuItem("Rename into User's computer",new ImageIcon("./Images/user.gif"));


		b1=new JButton(new ImageIcon("./Images/exit.png"));
		b1.setBounds(735,490,48,48);

      	m1.add(mi11);
      	m1.add(mi12);
      	m1.add(mi13);
      	//m1.addSeparator();

      	m2.add(mi21);

		m3.add(mi31);
	//	m3.add(mi32);

		m4.add(mi41);
		m4.add(mi42);
		m4.add(mi43);
		m4.add(mi44);

		m5.add(mi51);
		m5.add(mi52);
		m5.add(mi53);
		//m5.add(mi54);
		m5.add(mi55);
		m5.add(mi56);

		m6.add(mi61);
		m6.add(mi62);
	//	m6.add(mi63);
		m6.add(mi64);

		m7.add(mi71);
		m7.add(mi72);
		m7.add(mi73);

      	mb.add(m1);
      	mb.add(m2);
      	mb.add(m3);
      	mb.add(m4);
      	mb.add(m5);
		mb.add(m6);
		mb.add(m7);
      	setJMenuBar(mb);

		//c.add(jsp);
		c.add(jlb);
		c.add(b1);

		mi11.addActionListener(new HandleAE());
		mi12.addActionListener(new HandleAE());
		mi13.addActionListener(new HandleAE());
		mi21.addActionListener(new HandleAE());
		mi31.addActionListener(new HandleAE());
		mi41.addActionListener(new HandleAE());
		mi42.addActionListener(new HandleAE());
		mi43.addActionListener(new HandleAE());
		mi44.addActionListener(new HandleAE());
		mi51.addActionListener(new HandleAE());
		mi52.addActionListener(new HandleAE());
		mi53.addActionListener(new HandleAE());
		mi55.addActionListener(new HandleAE());
		mi56.addActionListener(new HandleAE());
		mi61.addActionListener(new HandleAE());
		mi62.addActionListener(new HandleAE());
		mi64.addActionListener(new HandleAE());
		mi71.addActionListener(new HandleAE());
		mi72.addActionListener(new HandleAE());
		mi73.addActionListener(new HandleAE());



		b1.addActionListener(new HandleAE());

		setSize(800,600);
		//Dimension d= Toolkit.getDefaultToolkit().getScreenSize();
		//setSize(d.width, (int) (d.height-(d.height*.03)));
		setResizable(false);
		setVisible(true);

	}
		class HandleAE implements ActionListener
        {
        	public void actionPerformed(ActionEvent ae)
        	{
        		Object obj=ae.getSource();

        		if(obj==mi11)
        		{
        		try
				{
					InjectLogo il = new InjectLogo();
							il.setUp();
							//setVisible(false);
							//dispose();
					}
					catch(Exception e)
						{
						System.out.println("Error creating the FileInfo panel: " +e);
						}
        		}

        		if(obj==mi12)
        		{
        		try
				{
					Runtime.getRuntime().exec("cmd /c start run.bat");
						 System.exit(0);
					}
					catch(Exception e)
						{
						System.out.println("Error creating the FileInfo panel: " +e);
						}
        		}

        		if(obj==mi13)
        		{
        		try
				{
					 System.exit(0);
					}
					catch(Exception e)
						{
						System.out.println("Error creating the FileInfo panel: " +e);
						}
        		}

        		if(obj==mi21)
        		{
        		try
				{
					Abstraction abs = new Abstraction();
							abs.setUp();
							//setVisible(false);
							//dispose();
					}
					catch(Exception e)
						{
						System.out.println("Error creating the FileInfo panel: " +e);
						}
        		}

        		if(obj==mi31)
        		{
        		try
				{
						EncryDecry ed = new EncryDecry();
							ed.setUp();
							//setVisible(false);
							//dispose();
					}
					catch(Exception e)
						{
						System.out.println("Error creating the FileInfo panel: " +e);
						}
        		}

        		if(obj==mi41)
        		{
        		try
				{
						LogType lt= new LogType();
							lt.setUp();
							//setVisible(false);
							//dispose();
					}
					catch(Exception e)
						{
						System.out.println("Error creating the FileInfo panel: " +e);
						}
        		}

				if(obj==mi42)
        		{
        		try
				{
						Logon lo = new Logon();
							lo.setUp();
							//setVisible(false);
							//dispose();
					}
					catch(Exception e)
						{
						System.out.println("Error creating the FileInfo panel: " +e);
						}
        		}


				if(obj==mi43)
        		{
        		try
				{
						AdminAcc aa = new AdminAcc();
							aa.setUp();
							//setVisible(false);
							//dispose();
					}
					catch(Exception e)
						{
						System.out.println("Error creating the FileInfo panel: " +e);
						}
        		}

					if(obj==mi44)
        		{
        		try
				{
						AutoLogin al = new AutoLogin();
							al.setUp();
							//setVisible(false);
							//dispose();
					}
					catch(Exception e)
						{
						System.out.println("Error creating the FileInfo panel: " +e);
						}
        		}



				if(obj==mi51)
        		{
        		try
				{
						ShutDown sd = new ShutDown();
							sd.setUp();
							//setVisible(false);
							//dispose();
					}
						catch(Exception e)
						{
						System.out.println("Error creating the FileInfo panel: " +e);
						}
        		}




        		if(obj==mi52)
        		{
        		try
				{
						Hunged hung = new Hunged();
							hung.setUp();
							//setVisible(false);
							//dispose();
					}
					catch(Exception e)
						{
						System.out.println("Error creating the FileInfo panel: " +e);
						}
        		}



        			if(obj==mi53)
        		{
        		try
				{
						ChkDsk chk = new ChkDsk();
							chk.setUp();
							//setVisible(false);
							//dispose();
					}
					catch(Exception e)
						{
						System.out.println("Error creating the FileInfo panel: " +e);
						}
        		}

					if(obj==mi55)
        		{
        		try
				{
					String xxx = "call batch/optimize/clearmedia/clearmedia.bat";
					Runtime.getRuntime().exec("cmd /c start "+xxx);
					}
					catch(Exception e)
						{
						System.out.println("Error creating the FileInfo panel: " +e);
						}
        		}


        			if(obj==mi56)
        		{
        		try
				{
						Screen scr = new Screen();
							scr.setUp();
							//setVisible(false);
							//dispose();
					}
					catch(Exception e)
						{
						System.out.println("Error creating the FileInfo panel: " +e);
						}
        		}


        			if(obj==mi61)
        		{
        		try
				{
						Desk de = new Desk();
							de.setUp();
							//setVisible(false);
							//dispose();
					}
					catch(Exception e)
						{
						System.out.println("Error creating the FileInfo panel: " +e);
						}
        		}


        			if(obj==mi62)
        		{
        		try
				{
						Openwith ow = new Openwith();
							ow.setUp();
							//setVisible(false);
							//dispose();
					}
					catch(Exception e)
						{
						System.out.println("Error creating the FileInfo panel: " +e);
						}
        		}

				if(obj==mi64)
        		{
        		try
				{
						EncryDecry ed = new EncryDecry();
							ed.setUp();
							//setVisible(false);
							//dispose();
					}
					catch(Exception e)
						{
						System.out.println("Error creating the FileInfo panel: " +e);
						}
        		}

        			if(obj==mi71)
        		{
        		try
				{
						AmPm ampm= new AmPm();
						ampm.setUp();
							//setVisible(false);
							//dispose();
					}
					catch(Exception e)
						{
						System.out.println("Error creating the FileInfo panel: " +e);
						}
        		}
				if(obj==mi72)
        		{
        		try
				{
					Version ver = new Version();
							ver.setUp();
							//setVisible(false);
							//dispose();
					}
					catch(Exception e)
						{
						System.out.println("Error creating the FileInfo panel: " +e);
						}
        		}
        		if(obj==mi73)
        		{
        		try
				{
					Rename ren = new Rename();
							ren.setUp();
							//setVisible(false);
							//dispose();
					}
					catch(Exception e)
						{
						System.out.println("Error creating the FileInfo panel: " +e);
						}
        		}

        		if(obj==b1)
        		{
        		try
				{
					 System.exit(0);
					}
					catch(Exception e)
						{
						System.out.println("Error creating the FileInfo panel: " +e);
						}
        		}


        	}
	}

//	public static void main(String args[])
//	{
//		Sast r = new Sast();
//		r.setUp();
//			}
}
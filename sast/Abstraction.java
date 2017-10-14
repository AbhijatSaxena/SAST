import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Abstraction extends JFrame
{

	JPanel jp=new JPanel();
	JLabel jlb,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JButton b11,b12,b21,b22,b31,b32,b41,b42,b51,b52,b61,b62,b71,b72,b81,b82,b91,b92,b101,b102;


	Container c;
	String em;

	public void setUp()
	{

		c=getContentPane();
		setTitle("SAST");
		c.setBackground(Color.decode("#838383"));
		c.setLayout(null);
		jp.setLayout(new FlowLayout());
	//	jp.setBackground(Color.gray);
	//	jp.setBounds(150,210,600,300);

		setIconImage(Toolkit.getDefaultToolkit().getImage("./icon/logo.ico"));

		jlb=new JLabel(new ImageIcon("./Images/uit.jpg"));
		jlb.setBounds(0,0,900,120);


		l1 = new JLabel("Drives");
		l1.setBounds(10,170,150,50);
		l1.setFont(new Font("Arial", Font.BOLD,20));
		b11=new JButton(new ImageIcon("./Images/show.png"));
		b11.setBounds(165,170,120,50);
		b12=new JButton(new ImageIcon("./Images/hide.png"));
		b12.setBounds(290,170,120,50);

		l2 = new JLabel("Explore");
		l2.setBounds(10,225,150,50);
		l2.setFont(new Font("Arial", Font.BOLD,20));
		b21=new JButton(new ImageIcon("./Images/show.png"));
		b21.setBounds(165,225,120,50);
		b22=new JButton(new ImageIcon("./Images/hide.png"));
		b22.setBounds(290,225,120,50);

		l3 = new JLabel("Find");
		l3.setBounds(10,280,150,50);
		l3.setFont(new Font("Arial", Font.BOLD,20));
		b31=new JButton(new ImageIcon("./Images/show.png"));
		b31.setBounds(165,280,120,50);
		b32=new JButton(new ImageIcon("./Images/hide.png"));
		b32.setBounds(290,280,120,50);

		l4 = new JLabel("Open");
		l4.setBounds(10,335,150,50);
		l4.setFont(new Font("Arial", Font.BOLD,20));
		b41=new JButton(new ImageIcon("./Images/show.png"));
		b41.setBounds(165,335,120,50);
		b42=new JButton(new ImageIcon("./Images/hide.png"));
		b42.setBounds(290,335,120,50);

		l5 = new JLabel("Shortcut icons");
		l5.setBounds(10,390,150,50);
		l5.setFont(new Font("Arial", Font.BOLD,20));
		b51=new JButton(new ImageIcon("./Images/show.png"));
		b51.setBounds(165,390,120,50);
		b52=new JButton(new ImageIcon("./Images/hide.png"));
		b52.setBounds(290,390,120,50);

		l6 = new JLabel("TaskManager");
		l6.setBounds(460,170,150,50);
		l6.setFont(new Font("Arial", Font.BOLD,20));
		b61=new JButton(new ImageIcon("./Images/show.png"));
		b61.setBounds(615,170,120,50);
		b62=new JButton(new ImageIcon("./Images/hide.png"));
		b62.setBounds(740,170,120,50);

		l7 = new JLabel("Desktop icons");
		l7.setBounds(460,225,150,50);
		l7.setFont(new Font("Arial", Font.BOLD,20));
		b71=new JButton(new ImageIcon("./Images/show.png"));
		b71.setBounds(615,225,120,50);
		b72=new JButton(new ImageIcon("./Images/hide.png"));
		b72.setBounds(740,225,120,50);

		l8 = new JLabel("Shutdown");
		l8.setBounds(460,280,150,50);
		l8.setFont(new Font("Arial", Font.BOLD,20));
		b81=new JButton(new ImageIcon("./Images/show.png"));
		b81.setBounds(615,280,120,50);
		b82=new JButton(new ImageIcon("./Images/hide.png"));
		b82.setBounds(740,280,120,50);

		l9 = new JLabel("Hidden Files");
		l9.setBounds(460,335,150,50);
		l9.setFont(new Font("Arial", Font.BOLD,20));
		b91=new JButton(new ImageIcon("./Images/show.png"));
		b91.setBounds(615,335,120,50);
		b92=new JButton(new ImageIcon("./Images/hide.png"));
		b92.setBounds(740,335,120,50);

		l10 = new JLabel("File Extension");
		l10.setBounds(460,390,150,50);
		l10.setFont(new Font("Arial", Font.BOLD,20));
		b101=new JButton(new ImageIcon("./Images/show.png"));
		b101.setBounds(615,390,120,50);
		b102=new JButton(new ImageIcon("./Images/hide.png"));
		b102.setBounds(740,390,120,50);


		//c.add(jsp);
		c.add(jlb);

		c.add(l1);
		c.add(b11);
		c.add(b12);

		c.add(l2);
		c.add(b21);
		c.add(b22);

		c.add(l3);
		c.add(b31);
		c.add(b32);

		c.add(l4);
		c.add(b41);
		c.add(b42);

		c.add(l5);
		c.add(b51);
		c.add(b52);

		c.add(l6);
		c.add(b61);
		c.add(b62);

		c.add(l7);
		c.add(b71);
		c.add(b72);

		c.add(l8);
		c.add(b81);
		c.add(b82);

		c.add(l9);
		c.add(b91);
		c.add(b92);

		c.add(l10);
		c.add(b101);
		c.add(b102);


		b11.addActionListener(new HandleAE());
		b12.addActionListener(new HandleAE());

		b21.addActionListener(new HandleAE());
		b22.addActionListener(new HandleAE());

		b31.addActionListener(new HandleAE());
		b32.addActionListener(new HandleAE());

		b41.addActionListener(new HandleAE());
		b42.addActionListener(new HandleAE());

		b51.addActionListener(new HandleAE());
		b52.addActionListener(new HandleAE());

		b61.addActionListener(new HandleAE());
		b62.addActionListener(new HandleAE());

		b71.addActionListener(new HandleAE());
		b72.addActionListener(new HandleAE());

		b81.addActionListener(new HandleAE());
		b82.addActionListener(new HandleAE());

		b91.addActionListener(new HandleAE());
		b92.addActionListener(new HandleAE());

		b101.addActionListener(new HandleAE());
		b102.addActionListener(new HandleAE());



		setSize(900,520);
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
        		if(obj==b11)
        		{
        		try
				{	String xxx = "call batch/abstraction/drive/enable.bat";
					Runtime.getRuntime().exec("cmd /c start "+xxx);
				}
					catch(Exception e)
					{		System.out.println("Error creating the FileInfo panel: " +e);	}
        		}


        		if(obj==b12)
        		{
        		try
        		{  String xxx = "call batch/abstraction/drive/disable.bat";
					Runtime.getRuntime().exec("cmd /c start "+xxx);
        		}
					catch(Exception e)
					{  System.out.println("Error creating the FileInfo panel: " +e);	}
        		}

        		if(obj==b21)
        		{
        	try
				{	String xxx = "call batch/abstraction/explore/enable.bat";
					Runtime.getRuntime().exec("cmd /c start "+xxx);
				}
					catch(Exception e)
					{		System.out.println("Error creating the FileInfo panel: " +e);	}
        		}

        		if(obj==b22)
        		{
        		try
        		{  String xxx = "call batch/abstraction/explore/disable.bat";
					Runtime.getRuntime().exec("cmd /c start "+xxx);
        		}
					catch(Exception e)
					{  System.out.println("Error creating the FileInfo panel: " +e);	}
        		}

        		if(obj==b31)
        		{
        	try
				{	String xxx = "call batch/abstraction/find/enable.bat";
					Runtime.getRuntime().exec("cmd /c start "+xxx);
				}
					catch(Exception e)
					{		System.out.println("Error creating the FileInfo panel: " +e);	}
        		}

        		if(obj==b32)
        		{
        		try
        		{  String xxx = "call batch/abstraction/find/disable.bat";
					Runtime.getRuntime().exec("cmd /c start "+xxx);
        		}
					catch(Exception e)
					{  System.out.println("Error creating the FileInfo panel: " +e);	}
        		}

        		if(obj==b41)
        		{
        	try
				{String xxx = "call batch/abstraction/open/enable.bat";
					Runtime.getRuntime().exec("cmd /c start "+xxx);
				}
					catch(Exception e)
					{		System.out.println("Error creating the FileInfo panel: " +e);	}
        		}

        		if(obj==b42)
        		{
        		try
        		{  String xxx = "call batch/abstraction/open/disable.bat";
					Runtime.getRuntime().exec("cmd /c start "+xxx);
        		}
					catch(Exception e)
					{  System.out.println("Error creating the FileInfo panel: " +e);	}
        		}

        		if(obj==b51)
        		{
        	try
				{	String xxx = "call batch/abstraction/shortcut_icons/enable.bat";
					Runtime.getRuntime().exec("cmd /c start "+xxx);
				}
					catch(Exception e)
					{		System.out.println("Error creating the FileInfo panel: " +e);	}
        		}

        		if(obj==b52)
        		{
        		try
        		{  String xxx = "call batch/abstraction/shortcut_icons/disable.bat";
					Runtime.getRuntime().exec("cmd /c start "+xxx);
        		}
					catch(Exception e)
					{  System.out.println("Error creating the FileInfo panel: " +e);	}
        		}

        		if(obj==b61)
        		{
        	try
				{	String xxx = "call batch/abstraction/tskmgr/enable.bat";
					Runtime.getRuntime().exec("cmd /c start "+xxx);
				}
					catch(Exception e)
					{		System.out.println("Error creating the FileInfo panel: " +e);	}
        		}

        		if(obj==b62)
        		{
        		try
        		{  String xxx = "call batch/abstraction/tskmgr/disable.bat";
					Runtime.getRuntime().exec("cmd /c start "+xxx);
        		}
					catch(Exception e)
					{  System.out.println("Error creating the FileInfo panel: " +e);	}
        		}

        		if(obj==b71)
        		{
        	try
				{	String xxx = "call batch/abstraction/desktop/enable.bat";
					Runtime.getRuntime().exec("cmd /c start "+xxx);
				}
					catch(Exception e)
					{		System.out.println("Error creating the FileInfo panel: " +e);	}
        		}

        		if(obj==b72)
        		{
        		try
        		{  String xxx = "call batch/abstraction/desktop/disable.bat";
					Runtime.getRuntime().exec("cmd /c start "+xxx);
        		}
					catch(Exception e)
					{  System.out.println("Error creating the FileInfo panel: " +e);	}
        		}

        		if(obj==b81)
        		{
        	try
				{	String xxx = "call batch/abstraction/shutdown/enable.bat";
					Runtime.getRuntime().exec("cmd /c start "+xxx);
				}
					catch(Exception e)
					{		System.out.println("Error creating the FileInfo panel: " +e);	}
        		}

        		if(obj==b82)
        		{
        		try
        		{  String xxx = "call batch/abstraction/shutdown/disable.bat";
					Runtime.getRuntime().exec("cmd /c start "+xxx);
        		}
					catch(Exception e)
					{  System.out.println("Error creating the FileInfo panel: " +e);	}
        		}
        		if(obj==b91)
        		{
        	try
				{	String xxx = "call batch/abstraction/hiddenfiles/enable.bat";
					Runtime.getRuntime().exec("cmd /c start "+xxx);
				}
					catch(Exception e)
					{		System.out.println("Error creating the FileInfo panel: " +e);	}
        		}

        		if(obj==b92)
        		{
        		try
        		{  String xxx = "call batch/abstraction/hiddenfiles/disable.bat";
					Runtime.getRuntime().exec("cmd /c start "+xxx);
        		}
					catch(Exception e)
					{  System.out.println("Error creating the FileInfo panel: " +e);	}
        		}if(obj==b101)
        		{
        	try
				{	String xxx = "call batch/abstraction/extension/enable.bat";
					Runtime.getRuntime().exec("cmd /c start "+xxx);
				}
					catch(Exception e)
					{		System.out.println("Error creating the FileInfo panel: " +e);	}
        		}

        		if(obj==b102)
        		{
        		try
        		{  String xxx = "call batch/abstraction/extension/disable.bat";
					Runtime.getRuntime().exec("cmd /c start "+xxx);
        		}
					catch(Exception e)
					{  System.out.println("Error creating the FileInfo panel: " +e);	}
        		}

        	}
   	}

//	public static void main(String args[])
//	{
//		Abstraction r = new Abstraction();
//		r.setUp();
//			}
}
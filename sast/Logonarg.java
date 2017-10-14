import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Logonarg extends JFrame
{

	JPanel jp=new JPanel();
	JLabel jlb,l1,l2;
	JButton b1,b2;
	JTextField t1,t2;
	Container c;
	String em;

	public void setUp()
	{

		c=getContentPane();
		setTitle("SAST");
		c.setBackground(Color.white);
		c.setLayout(null);
		jp.setLayout(new FlowLayout());
	//	jp.setBackground(Color.gray);
	//	jp.setBounds(150,210,600,300);
		t1=new JTextField();
  		t1.setBounds(150,150,150,30);
  		l1 = new JLabel("Notification Caption");
  		l1.setBounds(10,150,140,30);

  		t2=new JTextField();
  		t2.setBounds(150,210,150,30);
  		l2 = new JLabel("Notification Text");
  		l2.setBounds(10,210,140,30);

		setIconImage(Toolkit.getDefaultToolkit().getImage("./icon/logo.ico"));

		jlb=new JLabel(new ImageIcon("./Images/uit.jpg"));
		jlb.setBounds(0,0,900,120);

		b1=new JButton(new ImageIcon("./Images/enable.png"));
		b1.setBounds(100,250,120,50);

		//c.add(jsp);
		c.add(jlb);
		c.add(l1);
		c.add(t1);
		c.add(l2);
		c.add(t2);
		c.add(b1);

		b1.addActionListener(new HandleAE());


		setSize(400,350);
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
        		if(obj==b1)
        		{
        		try
				{
					String xxx = "call batch/logon/logonnotification/enable.bat";
					String tt = t1.getText();
					String ttt = t2.getText();
					xxx = xxx+" "+tt+" "+ttt;
					Runtime.getRuntime().exec("cmd /c start "+xxx);
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
//		Logonarg r = new Logonarg();
//		r.setUp();
//			}
}
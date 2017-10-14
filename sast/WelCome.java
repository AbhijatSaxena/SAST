import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class WelCome extends JFrame
{

	JPanel jp=new JPanel();
	JLabel jlb;
	JButton b1;
	Container c;
	String em;

	public void setUp()
	{
		c=getContentPane();
		setTitle("SAST");
		c.setBackground(Color.decode("#ffffff"));
		c.setLayout(null);
		jp.setLayout(new FlowLayout());
		//jp.setBackground(Color.white);
		//jp.setBounds(150,210,600,300);

		setIconImage(Toolkit.getDefaultToolkit().getImage("./icon/logo.ico"));

		jlb=new JLabel(new ImageIcon("./Images/header.png"));
		jlb.setBounds(0,0,581,196);
		b1=new JButton(new ImageIcon("./Images/button.png"));
		b1.setBounds(180,296,218,218);


		//c.add(jsp);
		c.add(jlb);
		c.add(b1);

		b1.addActionListener(new HandleAE());


		setSize(581,600);
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
						LogFom lf= new LogFom();
							lf.setUp();
							setVisible(false);
							dispose();
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
//		WelCome r = new WelCome();
//		r.setUp();
//			}
}
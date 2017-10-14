import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Desk extends JFrame
{

	JPanel jp=new JPanel();
	JLabel jlb;
	JButton b1,b2;
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

		b1=new JButton(new ImageIcon("./Images/enable.png"));
		b1.setBounds(50,180,120,50);

		b2=new JButton(new ImageIcon("./Images/disable.png"));
		b2.setBounds(200,180,120,50);



		//c.add(jsp);
		c.add(jlb);
		c.add(b1);
		c.add(b2);

		b1.addActionListener(new HandleAE());
		b2.addActionListener(new HandleAE());

		setSize(400,300);
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
				{	String xxx = "call batch/rightclick/desktop/enable.bat";
					Runtime.getRuntime().exec("cmd /c start "+xxx);
					}
					catch(Exception e)
						{
						System.out.println("Error creating the FileInfo panel: " +e);
							}
        		}
        		if(obj==b2)
        		{
        		try
				{
					String xxx = "call batch/rightclick/desktop/disable.bat";
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
//	Desk r = new Desk();
//		r.setUp();
//			}
}
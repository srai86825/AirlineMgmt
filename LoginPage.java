import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.text.*;

public class LoginPage extends JFrame
{
	Container c = getContentPane();
	JPanel PFlightTypes = new JPanel(null);
	JPanel PLogin = new JPanel(null);
	JPanel PFlightDetails = new JPanel(null);

	public boolean bCheck=true;
	JLabel typesHeading=new JLabel("<html><h1 style='color:red'>Airline Reservation System</html><h1>");

	JLabel LUserName, LPassword;

	JLabel LDomesticFlight1 = new JLabel("<html><B>Domestic Flight Booking</B></html>");
	JLabel LDomesticFlight = new JLabel("<html><B>For Domestic Flights</B></html>");

	JTextField TFUserName;
	JPasswordField TPPassword;

	JButton BLogin;

	final String[] col1 ={ "From", "To", "Price", "Time" };

	final String[][] row1 = {
			{ "Mumbai", "Bangalore", "3125", "16:30" },
			{ "Patna", "Delhi ", "3225", "19:00" },
			{ "Amritsar", "Delhi", "1425 ", "08:30" },
			{ "Amritsar", "Goa", "1025 ", "09:50" },
			{ "Goa", "Patna", "1525", "11:00" },
			{ "Agra", "Gopalganj", "3825 ", "05:30" },
			{ "Gopalganj", "Amritsar", "3025 ", "05:30" },
			{ "Shimla", "Amritsar", "1725", "12:00" },
			{ "ShriNagar", "Vishakapatnam", "3725", "19:00" }
	};

	JTable TDomesticFlight1 = new JTable(row1, col1);

	JScrollPane JSP1 = new JScrollPane(TDomesticFlight1);



	public LoginPage()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setPreferredSize(new Dimension(796,572));

		PFlightTypes.setBackground(Color.decode("#EDC6B1"));
		PLogin.setBackground(Color.decode("#7C96AB"));
		PFlightDetails.setBackground(Color.decode("#BFCCB5"));
		TDomesticFlight1.setBackground(Color.decode("#BFCCB5"));



		JSP1.setBounds(0, 340, 790, 200);

		Icon img1 = new ImageIcon("img/economic.jpg");
		JLabel LEconomic = new JLabel("Economic", img1, SwingConstants.LEFT);
		LEconomic.setBounds(60, 170, 350, 125);
		LEconomic.setVisible(true);


		PFlightTypes.setBounds(0,0,500, 340);
		PLogin.setBounds(500,0,350, 340);
		PFlightDetails.setBounds(0,340,790,200);


		LUserName = new JLabel("         User Name ");
		LPassword = new JLabel("         Password ");
		TFUserName = new JTextField(10);
		TPPassword = new JPasswordField(10);
		BLogin = new JButton("Sign In");

		LUserName.setBounds(40, 100, 100, 21);
		LPassword.setBounds(40, 140, 100, 21);
		TFUserName.setBounds(160, 100, 100, 21);
		TPPassword.setBounds(160, 140, 100, 21);
		BLogin.setBounds(160, 200, 100,25);

		LDomesticFlight1.setBounds(60, 60, 190, 20);

		PLogin.add(LUserName);
		PLogin.add(TFUserName);
		PLogin.add(LPassword);
		PLogin.add(TPPassword);
		PLogin.add(BLogin);

		PFlightDetails.add(JSP1);

		JSP1.setVisible(true);


		typesHeading.setBounds(60,10,400,80);
		LDomesticFlight.setBounds(60, 60, 200, 25);
		c.add(PFlightTypes);
		c.add(PLogin);
		c.add(PFlightDetails);

		PFlightTypes.add(LDomesticFlight);
		PFlightTypes.add(typesHeading);
		PFlightTypes.add(LEconomic);

		pack();
		setVisible(true);

		addWindowListener(new ExitListener());

		LDomesticFlight1.addMouseListener(new mouse(this, true));

		BLogin.addActionListener(new button1(this));
	}

	public static void main(String args[])
	{
		new LoginPage();
	}
}


class button1 implements ActionListener
{
	LoginPage type;
	char[] cCheck, cPassword={'s','r','a','i','\0'};
	JFrame f;
	String sCheck, sCheck1="srai";

	public button1(LoginPage type)
	{
		this.type = type;
	}
	public void actionPerformed(ActionEvent e)
	{
		cCheck=type.TPPassword.getPassword();
		sCheck = type.TFUserName.getText();
		if ((sCheck1.equals(sCheck)) && check())
		{
			type.PLogin.add(type.LDomesticFlight1);

			type.PLogin.remove(type.LUserName);
			type.PLogin.remove(type.TFUserName);
			type.PLogin.remove(type.LPassword);
			type.PLogin.remove(type.TPPassword);
			type.PLogin.remove(type.BLogin);

			type.c.repaint();
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid username or password. Try again");
		}
	}
	public boolean check()
	{
		if (cCheck.length >= 6 || cCheck.length < 4)
			return false;
		for(int i=0;i<cCheck.length;i++)
		{
			if(cCheck[i]!=cPassword[i])
				return false;
		}
		return true;
	}
}


class mouse extends MouseAdapter
{
	LoginPage type;
	boolean bCheck;

	public mouse(LoginPage type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	public void mouseEntered(MouseEvent e)
	{
		type.LDomesticFlight1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	public void mouseClicked(MouseEvent e)
	{
		if (bCheck)
			new DomesticFlight(type);
	}
}


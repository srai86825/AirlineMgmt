import javax.swing.*;
import java.awt.*;
import java.util.Random;
//import java.awt.event.*;

public class PrintTicket1 extends JFrame {
	public PrintTicket1(String sFrom, String sTo, String sClass, Integer iAdult, Integer iChildren, Integer iInfant, String sBookingDate, Integer iPrice, String sTime,String sNames) {
		Container c = getContentPane();
		c.setBackground(Color.decode("#3C486B"));
		c.setLayout(new BorderLayout());


		JPanel Panel2 = new JPanel(null);

		Panel2.setPreferredSize(new Dimension(500, 200));

		JLabel LTitle = new JLabel("<html><b><font color=\"#F9D949\",size=\"7\">AirLine Ticket</font></b></html>");
		JLabel LFrom = new JLabel("<html><b><font color=\"#F0F0F0\">From &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font></b><font color=\"#778899\">" + sFrom + "</font></html>");
		JLabel LTo = new JLabel("<html><font color=\"#F0F0F0\">To &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">" + sTo + "</font></html>");
		JLabel LClass = new JLabel("<html><font color=\"#F0F0F0\">Class &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">" + sClass + "</font></html>");
		JLabel LBookingDate = new JLabel("<html><font color=\"#F0F0F0\">Traveling Date &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#778899\">" + sBookingDate + "</font></html>");
		JLabel LPrice = new JLabel("<html><font color=\"#F0F0F0\">Total Price &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#778899\">" + iPrice + "</font></html>");
		JLabel LTime = new JLabel("<html><font color=\"#F0F0F0\">DepatureTime  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#778899\">" + sTime + "</font></html>");
		JLabel LAdult = new JLabel("<html><font color=\"#F0F0F0\">Adult &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">" + iAdult + "</font></html>");
		JLabel LChildren = new JLabel("<html><font color=\"#F0F0F0\">Children &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; : &nbsp;</font><font color=\"#778899\">" + iChildren + "</font></html>");
		JLabel LInfant = new JLabel("<html><font color=\"#F0F0F0\">Infant &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">" + iInfant + "</font></html>");
		JLabel LWishes = new JLabel("<html><body><I><font color=\"#F0F0F0\">Wish you a happy journy</font></I></body></html>");

		Random r = new Random();
		int low = 10000;
		int high = 90000;
		int result = r.nextInt(high-low) + low;

		JLabel LTicketNo = new JLabel(String.format("<html><font color=\"#F0F0F0\">TicketNumber &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: %s</font></html>","TKT"+result));
		JLabel LBookedBy = new JLabel(String.format("<html><font color=\"#F0F0F0\">Passengers &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: %s</font></html>",sNames));

		JLabel LEmpty = new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		JLabel LDemo = new JLabel("<html><h1><U><font color=\"#F9D949\">AirLine-Project Developed By</font></U><h1></html>");
		JLabel LSaurabh = new JLabel("<html>" +
				"<I><font color=\"#F9D949\">• Saurabh Kumar Rai @Swing</font></I>" +
				"</html>");
		JLabel LHarsh1 = new JLabel("<html><I><font color=\"#F9D949\">• Harsh Sharma @AWT</font></I></html>");
		JLabel LHarsh2 = new JLabel("<html><I><font color=\"#F9D949\">• Harsh Kumar @Testing, Exception Handling</font></I></html>");


		LTitle.setBounds(170, 15, 500, 45);
		LFrom.setBounds(20, 80, 300, 20);

		LTo.setBounds(20, 125, 300, 20);
		LClass.setBounds(20, 170, 300, 20);
		LBookingDate.setBounds(20, 215, 300, 20);
		LPrice.setBounds(20, 260, 300, 20);
		LTime.setBounds(20, 305, 300, 20);
		LAdult.setBounds(20, 345, 300, 20);
		LChildren.setBounds(20, 385, 300, 20);
		LInfant.setBounds(20, 430, 300, 20);

		LWishes.setBounds(530, 435, 300, 20);


		LTicketNo.setBounds(320, 80, 300, 20);
		LBookedBy.setBounds(320, 125, 300, 20);

		LEmpty.setBounds(3, 445, 1000, 20);

		LDemo.setBounds(200, 465, 500, 30);
		LSaurabh.setBounds(100, 515, 300, 20);
		LHarsh1.setBounds(100, 550, 300, 20);
		LHarsh2.setBounds(100, 585, 300, 20);


		Panel2.add(LTitle);
		Panel2.add(LFrom);
		Panel2.add(LTo);
		Panel2.add(LClass);
		Panel2.add(LBookingDate);
		Panel2.add(LAdult);
		Panel2.add(LChildren);
		Panel2.add(LInfant);
		Panel2.add(LPrice);
		Panel2.add(LTime);
		Panel2.add(LBookedBy);
		Panel2.add(LSaurabh);
		Panel2.add(LHarsh1);
		Panel2.add(LHarsh2);

		Panel2.add(LWishes);

		Panel2.add(LTicketNo);
		Panel2.add(LBookedBy);
		Panel2.add(LEmpty);
		Panel2.add(LDemo);


		Panel2.setBackground(Color.decode("#3C486B"));

		c.add(Panel2, BorderLayout.CENTER);


		//pack();
		setSize(700, 650);
		setVisible(true);
	}

	public static void main(String[] args) {
		new PrintTicket1("Mumbai","Chennai",
				"economy",1,0,0,
				"12/12/12",1210,"06:40","Saurabh,Harsh");
	}
}

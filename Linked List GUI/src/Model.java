import java.awt.*;

import javax.swing.*;


public class Model extends Controller{
	
	Controller c = new Controller();
	JFrame frame;
	GroupLayout layout1;
	JPanel add, remove, show, choose, value;
	JButton addf,addb, remf, remb, sh;
	JLabel suit, card, pnts;
	JComboBox<String> suitc, cardc;
	
	
	
	public Model(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)screenSize.getWidth();
		int height = (int)screenSize.getHeight();
		frame = new JFrame("Test");
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void build(){
		//Define Buttons and Labels
		addf = new JButton("Add to Front");
		addb = new JButton("Add to Back");
		remf = new JButton("Remove from Front");
		remb = new JButton("Remove from Back");
		sh = new JButton("Show / Hide Cards");
		suit = new JLabel("Suit");
		card = new JLabel("Card");
		pnts = new JLabel("Point Value");
		
		//Add Listeners
		addf.addActionListener(c);
		
		
		suitc = new JComboBox<String>();
			suitc.addItem("Spades");
			suitc.addItem("Clubs");
			suitc.addItem("Diamond");
			suitc.addItem("Hearts");
			
		cardc = new JComboBox<String>();
			cardc.addItem("Ace");
			cardc.addItem("2");
			cardc.addItem("3");
			cardc.addItem("4");
			cardc.addItem("5");
			cardc.addItem("6");
			cardc.addItem("7");
			cardc.addItem("8");
			cardc.addItem("9");
			cardc.addItem("10");
			cardc.addItem("Jack");
			cardc.addItem("Queen");
			cardc.addItem("King");
		
		
		//Assign Group 1
		layout1 = new GroupLayout(frame.getContentPane());
		frame.getContentPane().setLayout(layout1);
		layout1.setAutoCreateContainerGaps(true);
		layout1.setAutoCreateGaps(true);
		
		GroupLayout.SequentialGroup hGroup = layout1.createSequentialGroup();
		GroupLayout.SequentialGroup vGroup = layout1.createSequentialGroup();
		
				
					hGroup.addGroup(layout1.createParallelGroup()
					.addComponent(addf)
					.addComponent(remf)
					.addComponent(sh));
					hGroup.addGroup(layout1.createParallelGroup()
					.addComponent(addb)
					.addComponent(remb));
					hGroup.addGroup(layout1.createParallelGroup()
					.addComponent(suit)
					.addComponent(suitc));
					hGroup.addGroup(layout1.createParallelGroup()
					.addComponent(card)
					.addComponent(cardc));
		
				
					vGroup.addGroup(layout1.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(addf)
					.addComponent(addb)
					.addComponent(suit)
					.addComponent(card));
					vGroup.addGroup(layout1.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(remf)
					.addComponent(remb)
					.addComponent(suitc)
					.addComponent(cardc));
					vGroup.addGroup(layout1.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(sh));
					
					layout1.setHorizontalGroup(hGroup);
					layout1.setVerticalGroup(vGroup);
					frame.setVisible(true);
		
		
		
		//Add to frame
		frame.revalidate();
		frame.repaint();
		
		
	}
	public void update(){
		frame.revalidate();
		frame.repaint();
	}


}

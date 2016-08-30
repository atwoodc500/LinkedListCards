import java.awt.event.*;

public class Controller implements ActionListener{
	
	public Controller(){
		
	}

	public static void main(String[] args) {
		Model m = new Model();
		m.build();
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("Worked");
		
	}
	
	
	
}

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main extends JFrame {

	public Main() {
		JTextField myNumber = new JTextField(9);
		JComboBox<String> myComboBox = new JComboBox<>();
		
		
		setTitle("The Converter");
		setSize(new Dimension(300, 100));
		setResizable(false);
		setLayout(new BorderLayout());
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		setLayout(new FlowLayout());

		myComboBox.addItem("in");
		myComboBox.addItem("cm");
		
		add(myNumber);
		add(myComboBox);
	}
	
}

package oops;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymousClass {

	public static void main(String[] args) {
		JFrame frame = new JFrame("button click");
		JButton button = new JButton("click me");
		button.setBounds(100, 200, 300, 400);
		
		button.addActionListener(new  ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("you clicked me");
				
			}
			
		});
		
		frame.add(button);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
      
	}

}

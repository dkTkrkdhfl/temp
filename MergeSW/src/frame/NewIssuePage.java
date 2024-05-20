package frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import style.ProjColor;
import style.ProjStyleButton;
import style.ProjStyleScrollBar;

public class NewIssuePage extends JDialog {
	
	public NewIssuePage() {
		setSize(700,400);
		setLocationRelativeTo(null);
		setModal(true);
		setUndecorated(true);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(Color.WHITE);
		panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
		ProjStyleButton btn1 = new ProjStyleButton(Color.WHITE, Color.WHITE, Color.BLACK, "X");
		btn1.setFont(new Font(null, Font.PLAIN, 50));
		panel1.add(btn1);
		btn1.setBounds(650, 20, 30, 35);
		btn1.setPreferredSize(new Dimension(30, 35));
		
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				setVisible(false);
				dispose();
			}
		});
		
		ProjStyleButton btn2 = new ProjStyleButton(ProjColor.customDarkGray, ProjColor.clickedCustomDarkGray, Color.BLACK, "ADD");
		btn2.setFont(new Font(null, Font.PLAIN, 20));
		panel1.add(btn2);
		btn2.setBounds(550, 20, 50, 35);
		btn2.setPreferredSize(new Dimension(50, 35));
		
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				setVisible(false);
				dispose();
			}
		});
		
		JLabel lbl1 = new JLabel("Add New Issue");
		lbl1.setFont(new Font(null, Font.PLAIN, 40));
		panel1.add(lbl1);
		lbl1.setBounds(10, 10, 300, 40);
		lbl1.setPreferredSize(new Dimension(300, 40));
		
		JLabel lbl2 = new JLabel("Issue title :");
		lbl2.setFont(new Font(null, Font.PLAIN, 20));
		panel1.add(lbl2);
		lbl2.setBounds(10, 70, 190, 40);
		lbl2.setPreferredSize(new Dimension(190, 40));
		
		JLabel lbl3 = new JLabel("Add comment");
		lbl3.setFont(new Font(null, Font.PLAIN, 20));
		panel1.add(lbl3);
		lbl3.setBounds(10, 120, 190, 40);
		lbl3.setPreferredSize(new Dimension(190, 40));
		
		JTextField tf1 = new JTextField();
		panel1.add(tf1);
		tf1.setBounds(115, 80, 190, 30);
		tf1.setPreferredSize(new Dimension(190, 30));
		
		JTextArea ta = new JTextArea();
		ta.setFont(new Font("맑은 고딕", 1, 15));
		ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
		ta.setBorder(null);
		
		JScrollPane scrollPane = new JScrollPane(ta);
		scrollPane.setVerticalScrollBar(new ProjStyleScrollBar());
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        panel1.add(scrollPane);
        scrollPane.setBounds(30, 165, 600, 200);
        scrollPane.setPreferredSize(new Dimension(600, 200));
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		
		add(panel1);
		
		setVisible(true);
	}
}

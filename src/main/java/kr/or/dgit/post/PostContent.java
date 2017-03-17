package kr.or.dgit.post;

import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PostContent extends JFrame implements ActionListener {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel panel;
	private JButton btn1;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JButton btn2;
	private JLabel lblNewLabel_2;
	private Postsearch postsearch;

	public PostContent() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JLabel lblNewLabel = new JLabel("우편번호");
		panel.add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("");
		panel.add(lblNewLabel_2);
		
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		btn1 = new JButton("우편번호검색");
		btn1.addActionListener(this);
		panel.add(btn1);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 2, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("주소");
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lab= new JLabel("세부주소");
		panel_2.add(lab);
		textField = new JTextField();
		panel_2.add(textField);
		
		panel_3 = new JPanel();
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		JLabel empt= new JLabel("");
		btn2= new JButton("등록");
		panel_3.add(empt);
		panel_3.add(btn2);
		contentPane.add(panel_3);
		
	}
	public JTextField getTextField() {
		return textField;
	}
	public void setTextField(String t) {
		this.textField.setText(t);
	}
	public JTextField getTextField_1() {
		return textField_1;
	}
	public void setTextField_1(String t) {
		this.textField.setText(t);
	}

	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			actionPerformedBtn1(e);
		}
	}
	protected void actionPerformedBtn1(ActionEvent e) {
		JFrame j= new JFrame();
		j.setBounds(200, 200, 400, 200);
		j.add(postsearch);
		j.setVisible(true);
	}
}

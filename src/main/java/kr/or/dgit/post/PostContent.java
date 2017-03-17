package kr.or.dgit.post;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PostContent extends JPanel implements ActionListener {
	private JTextField textField;
	private JTextField tfaddress2;
	private JTextField tfNum;
	private JTextField tfaddress;
	private JButton btn1;
	private JButton btn2;
	private JLabel lblNewLabel_2;
	private Postsearch postsearch = new Postsearch();

	
	public PostContent() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JLabel lblNewLabel = new JLabel("우편번호");
		panel.add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("");
		panel.add(lblNewLabel_2);
		
		
		tfNum = new JTextField();
		panel.add(tfNum);
		tfNum.setColumns(10);
		
		btn1 = new JButton("우편번호검색");
		btn1.addActionListener(this);
		panel.add(btn1);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new GridLayout(1, 2, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("주소");
		panel_1.add(lblNewLabel_1);
		
		tfaddress = new JTextField();
		panel_1.add(tfaddress);
		tfaddress.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lab= new JLabel("세부주소");
		panel_2.add(lab);
		tfaddress2 = new JTextField();
		panel_2.add(tfaddress2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		JLabel empt= new JLabel("");
		btn2= new JButton("등록");
		btn2.addActionListener(this);
		panel_3.add(empt);
		panel_3.add(btn2);
		add(panel_3);
		postsearch.setObj(PostContent.this);
	}
	
	
	
	
	
	public JTextField getTfaddress2() {
		return tfaddress2;
	}



	public void setTfaddress2(String t) {
		this.tfaddress2.setText(t);
	}



	public JTextField getTfNum() {
		return tfNum;
	}



	public void setTfNum(String t) {
		this.tfNum.setText(t);
	
	}



	public JTextField getTfaddress() {
		return tfaddress;
	}





	public void setTfaddress(String t) {
		this.tfaddress.setText(t);;
	}


	


	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn2) {
			btn2ActionPerformed(e);
		}
		if (e.getSource() == btn1) {
			actionPerformedBtn1(e);
		}
	}
	protected void actionPerformedBtn1(ActionEvent e) {
		JFrame j= new JFrame();
		j.setBounds(700, 100, 400, 200);
		j.getContentPane().add(postsearch);
		j.setVisible(true);
	}
	
	protected void btn2ActionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, String.format("%s %s, %s", tfNum.getText(),tfaddress.getText(),tfaddress2.getText()));
	}
}

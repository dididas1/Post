package kr.or.dgit.post;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import kr.or.dgit.post.dto.Post;
import kr.or.dgit.post.service.PostService;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class Postsearch extends JPanel implements ActionListener {
	private JTable table;
	private JTextField textField;
	private JComboBox comboBox;
	private JButton btnNewButton;
	private PostContent postContent;	

	/**
	 * Create the panel.
	 */
	
	public Postsearch() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("시도");
		panel_1.add(lblNewLabel);

		comboBox = new JComboBox();
		comboBox.addItem("강원도");
		comboBox.addItem("경기도");
		comboBox.addItem("경상남도");
		comboBox.addItem("경상북도");
		comboBox.addItem("광주광역시");
		comboBox.addItem("대구광역시");
		comboBox.addItem("대전광역시");
		comboBox.addItem("부산광역시");
		comboBox.addItem("서울특별시");
		comboBox.addItem("세종특별자치시");
		comboBox.addItem("울산광역시");
		comboBox.addItem("인천광역시");
		comboBox.addItem("전라남도");
		comboBox.addItem("전라북도");
		comboBox.addItem("제주특별자치도");
		comboBox.addItem("충청남도");
		comboBox.addItem("충청북도");
		panel_1.add(comboBox);

		JLabel lblNewLabel_1 = new JLabel("도로명");
		panel_1.add(lblNewLabel_1);

		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);

		btnNewButton = new JButton("검색");
		btnNewButton.addActionListener(this);
		panel_1.add(btnNewButton);

		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				setObject(getSelectedObject());
				super.mouseClicked(e);
			}
			
		});
		scrollPane.setViewportView(table);
		

	}
	public void setObj(PostContent postcon){
		this.postContent= postcon;
	}
	public Object[][] getRowData(){
		List<Post> post=PostService.getInstence().serchSido(getObj());
		Object[][] items= new Object[post.size()][];
		for(int i=0;i<items.length;i++){
			items[i]= post.get(i).toarray();
		}
		return items;
	}

	public Object[] getColumn() {
		return new String[]{"우편번호","주소"};

	}
	

	
	public Post getObj(){
		String sido= comboBox.getSelectedItem().toString();
		String doro= textField.getText();
		return new Post(sido, doro);
		
	}
	public String[] getSelectedObject() {
		int selectedidx= table.getSelectedRow();
		if(selectedidx==-1)return null;
		String zipcode= table.getValueAt(selectedidx, 0).toString();
		String sido= table.getValueAt(selectedidx, 1).toString();
		return new String[]{zipcode,sido};
	}
	
	public void setObject(String[] t){
		postContent.setTfNum(t[0].toString());
		postContent.setTfaddress(t[1].toString());
	}

	public boolean isEmpty(){
		if(textField.getText().equals("")){
			return false;
		}else{
			return true;
		}
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		if(isEmpty()){
			table.setModel(new DefaultTableModel(getRowData(),getColumn()));
		}else{
			JOptionPane.showMessageDialog(null, "도로명을 입력해주세요");
		}
		
		
	}
}

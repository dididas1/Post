package kr.or.dgit.post;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class PostMain extends JFrame {


	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PostContent psc= new PostContent();
					PostMain frame = new PostMain();
					psc.setVisible(true);
					
					/*InitSettingService init = new InitSettingService();
					init.initSetting();*/
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PostMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
	}
	
	

}

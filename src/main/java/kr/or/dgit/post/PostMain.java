package kr.or.dgit.post;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;

import kr.or.dgit.post.dto.Post;
import kr.or.dgit.post.service.InitSettingService;
import kr.or.dgit.post.service.PostService;

public class PostMain extends JFrame {


	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PostMain frame = new PostMain();
					PostContent pc= new PostContent();
					frame.add(pc);
					frame.setVisible(true);
					List<Post> list= PostService.getInstence().serchSido(new Post("대구광역시", "상화로"));
					for(Post s:list){
						System.out.println(s);
					}
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

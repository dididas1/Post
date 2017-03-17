package kr.or.dgit.post.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.post.dto.Post;
import kr.or.dgit.post.util.MybatisSqlSessionFactory;
import kr.or.dgit.post.util.PostImpl;

public class PostService {
	public static final PostService instence= new PostService();
	
	
	public static PostService getInstence() {
		return instence;
	}


	public List<Post> serchSido(Post post){
		try(SqlSession sqlsession = MybatisSqlSessionFactory.opensesstion();){
			PostImpl postimpl= new PostImpl(sqlsession);
			return postimpl.serchSido(post);
		}
	}
}

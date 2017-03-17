package kr.or.dgit.post.util;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.post.dto.Post;
import kr.or.digt.post.dao.PostMapper;

public class PostImpl implements PostMapper{
	private static final Log log = LogFactory.getLog(Post.class);
	private SqlSession sqlsession;
	private String namespace ="kr.or.digt.post.dao.PostMapper.";
	
	public PostImpl(SqlSession sqlsession) {
		super();
		this.sqlsession = sqlsession;
	}

	@Override
	public List<Post> serchSido(Post post ) {
		log.debug("serchSido()");
		return sqlsession.selectList(namespace + "serchSido", post);
		
	}

}

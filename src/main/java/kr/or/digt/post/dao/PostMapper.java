package kr.or.digt.post.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.post.dto.Post;

public interface PostMapper {
	List<Post> serchSido(Post param);
}

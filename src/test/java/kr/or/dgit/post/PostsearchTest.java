package kr.or.dgit.post;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.post.dto.Post;
import kr.or.dgit.post.service.PostService;

public class PostsearchTest {
	private static PostService postService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		postService = new PostService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		postService= null;
	}

	@Test
	public void atestSearch() {
		Post post= new Post();
		post.setSido("대구");
		post.setDoro("상화로");
		List<Post> list= postService.serchSido(post);
	
		List<Post> emplist = Collections.emptyList();
		Assert.assertNotEquals(emplist, list);
	}

}

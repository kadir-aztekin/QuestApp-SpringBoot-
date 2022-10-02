package com.project.questapp.response;

import java.util.List;

import com.project.questapp.entites.Like;
import com.project.questapp.entites.Post;

import lombok.Data;

@Data
public class PostResponse {
	Long id;
	Long userId;
	String userName;
	String title;
	String text;
	
	List<LikeResponse> postLikes;
	
	public PostResponse(Post entity, List<LikeResponse> likes) {
		this.id=entity.getId();
		this.userId=entity.getUser().getId();
		this.userName=entity.getUser().getUserName();
		this.text=entity.getText();
		this.title=entity.getTitle();
		this.postLikes = likes;
	}
	
}

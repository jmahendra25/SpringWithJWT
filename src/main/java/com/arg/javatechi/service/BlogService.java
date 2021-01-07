package com.arg.javatechi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arg.javatechi.entity.Blog;
import com.arg.javatechi.repository.BlogRepository;

@Service
public class BlogService {
	
	
	@Autowired
	private BlogRepository _blogRepository;
	
	public String createBlog(Blog blog) {
		
		try {
			System.out.println("title : "+blog.getTitle());
			System.out.println("getIsFeatured : "+blog.getIsFeatured());
			_blogRepository.save(blog);
		 return "Success";
		}catch(Exception e) {
			System.out.println("Exception : "+e.getMessage());
			return "failed";
		}
		
	}
	
	
	public List<Blog> getAllBolgs(){
		
		List <Blog> blogDetails  = _blogRepository.findAll();
		return blogDetails;
		
	}

}

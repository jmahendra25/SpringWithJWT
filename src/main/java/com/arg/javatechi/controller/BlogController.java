package com.arg.javatechi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arg.javatechi.entity.Blog;
import com.arg.javatechi.service.BlogService;

@CrossOrigin("*")
@RestController
public class BlogController {
	
	
	@Autowired
	private BlogService _blogService;
	
	@PostMapping("/create")
	public String createBlog(@RequestBody Blog blog) {
		System.out.println("createBlog...called");
		System.out.println("blog ..."+blog);
		System.out.println("Description ..."+blog.getDescription());
		return _blogService.createBlog(blog);
	}
	
	
	/*@GetMapping()
	public List<Blog> getAllBolgs(){
		System.out.println("called getAllBolgs...");
		return _blogService.getAllBolgs();
	}*/
	
	@GetMapping("/admin/blogs")
	public List<Blog>  getAllBolgs(){
		System.out.println("called getAllBolgs!!...");
		return _blogService.getAllBolgs();
		//return "getAllBolgs";
	}

}

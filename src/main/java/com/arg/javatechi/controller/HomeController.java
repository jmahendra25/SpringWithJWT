package com.arg.javatechi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arg.javatechi.dto.AuthRequest;
import com.arg.javatechi.entity.Blog;
import com.arg.javatechi.service.BlogService;
import com.arg.javatechi.util.JwtUtil;


@CrossOrigin("*")
@RestController
public class HomeController {

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private BlogService _blogService;
	

	@GetMapping("/")
	public String home() {
		System.out.println("Home controller calling ....");
		return "Welcome to spring security with encripted password and JWT !!";
	}

	@PostMapping("/authenticate")
	public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
		try {
			System.out.println("generateToken called...");
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword()));
		} catch (Exception ex) {
			throw new Exception("inavalid username/password");
		}
		return jwtUtil.generateToken(authRequest.getUserName());
	}
	
	/*@GetMapping("/blogs")
	public List<Blog>  getAllBolgs(){
		System.out.println("called getAllBolgs...");
		return _blogService.getAllBolgs();
		//return "getAllBolgs";
	}*/
	
	
}

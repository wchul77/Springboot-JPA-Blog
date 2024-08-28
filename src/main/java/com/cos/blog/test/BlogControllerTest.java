package com.cos.blog.test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링이 com.cos.blog 패키지 이하를 스캔해서 모든파일을 
@RestController
public class BlogControllerTest {
	
	@GetMapping("/test/hello")	
	public String hello()
	{
		return "<h1>hello spring boot</h1>";
	}
}

package com.rest.learning.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.rest.learning.bean.User;

public class TestSpringMVCRest {

	public static void main(String args[]){
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
        //List<MediaType> ls = new ArrayList<MediaType>();
        //ls.add(MediaType.APPLICATION_JSON);
        //headers.setAccept(ls);
        HttpEntity<String> request= new HttpEntity<String>(headers);
		
        //Either request or request1 would work
        //With MediaType or without MediaType would work
        //HttpEntity request1= new HttpEntity(headers);
        
        System.out.println("Executing and Testing method one using RestTemplate");
        User user = restTemplate.getForObject
        		("http://localhost:8080/RestMavenSpringMVC/UserController/user/4", User.class, request);
        System.out.println("Values are:" + user.getName() + " " + user.getSalary());
 	}
	
}

package com.project.onthego;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.onthego.DTO.UserSignInDto;
import com.project.onthego.controller.UserController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OnthegoApplication.class)
@EnableWebMvc
@AutoConfigureMockMvc
class OnthegoApplicationTests {
	@Autowired
	private MockMvc mvc;

	private UserSignInDto userinfo;

	private String Autherizationheader;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void Logincontroltest() throws Exception {
		userinfo = new UserSignInDto();
		userinfo.setEmail("nidhin@gmail.com");
		userinfo.setPassword("test");

		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writeValueAsString(userinfo);

		MvcResult result=mvc.perform(post("/authenticate").contentType(MediaType.APPLICATION_JSON).content(jsonString))
				.andExpect(status().isOk()).andReturn(); 
		Autherizationheader="Bearer " +result.getResponse().getContentAsString();

	}



}

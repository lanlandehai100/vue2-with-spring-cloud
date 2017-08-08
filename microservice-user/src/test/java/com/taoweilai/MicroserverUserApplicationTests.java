package com.taoweilai;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.taoweilai.user.modules.base.dao.UserDao;
import com.taoweilai.user.modules.base.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MicroserverUserApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void test(){
		User u = new User();
		u.setId("1");
		User user = u.selectById();
		
		assertThat(user.getPhone());
		
		user.setPhone("15080316664");
		user.updateById();
		
		User user2 = user.selectById();
		
		assertThat(user2.getPhone());
		
		User user3 = user.selectById();
		assertThat(user3.getPhone());
		
		
	}

}

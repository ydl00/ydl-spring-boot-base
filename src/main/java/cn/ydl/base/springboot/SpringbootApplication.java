package cn.ydl.base.springboot;

import cn.ydl.base.springboot.domain.User;
import cn.ydl.base.springboot.mapper.UserMapper;
import cn.ydl.base.springboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication

public class SpringbootApplication {




	public static void main(String[] args) {



		SpringApplication.run(SpringbootApplication.class, args);




	}
}

package cn.wit.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		
		return new RestTemplate();
		
	}

}


//@Bean
//public UserServcie getUserServcie()
//{
//	return new UserServcieImpl();
//}
//applicationContext.xml == ConfigBean(@Configuration)
//<bean id="userServcie" class="com.atguigu.tmall.UserServiceImpl">
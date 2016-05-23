package du.core;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestServiceTests {

	@Test
	public void test1(){
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
 
        TestService testService = (TestService)context.getBean("testService"); // 获取远程服务代理
        String hello = testService.service(0, "ok");// 执行远程方法
 
        System.out.println( hello ); // 显示调用结果
	}
}

package com.jingyunbank.demo.dubbo.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jingyunbank.demo.dubbo.api.IOrderService;
import com.jingyunbank.demo.dubbo.api.Order;

public class OrderService implements IOrderService {

	public void order(Order order) {
		System.out.println("order done!");
		System.out.println(order);
	}
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"/META-INF/spring/dubbo-demo-provider.xml"});  
        context.start();  
   
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟  
	}

}

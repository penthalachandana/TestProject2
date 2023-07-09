package com.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.chandu.bean.Employee;

public class TestClient
{
   public static void main(String args[])
   {
	   Resource resource=new FileSystemResource("MyConfig.xml");
	   BeanFactory beanFactory=new XmlBeanFactory(resource);
	   
	   Employee emp=(Employee) beanFactory.getBean("e");
	   System.out.println(emp);
	   // 1. emp.setAge(22);
	  //1&2. emp.show();
   }
}
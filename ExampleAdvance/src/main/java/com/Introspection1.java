package com;

import java.beans.BeanDescriptor;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class Introspection1 {

	class Mybean{
		private String name;
		private int age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
	}
	public static void main(String[] args) throws Exception {
		
		BeanInfo beanInfo = Introspector.getBeanInfo(Mybean.class);
		
		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
		
		for(PropertyDescriptor descriptors:propertyDescriptors)
		{
			System.out.println("property :"+descriptors.getName());
			System.out.println("type:"+descriptors.getPropertyType());
			System.out.println("read method:"+descriptors.getReadMethod());
			System.out.println("write method:"+descriptors.getWriteMethod());
			System.out.println("short descriptors:"+descriptors.getShortDescription());
		}
		

	}

}

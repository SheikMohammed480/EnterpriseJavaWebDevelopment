package com.becoder.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config1.xml");

		Student st = context.getBean("student", Student.class);
		System.out.println(st.sum);
		
		System.out.println(st.sub);
		System.out.println(st.equalvalid);
		System.out.println("terinary:"+st.terinaryCheck);
		System.out.println(st.checkStatus);
		System.out.println(st.div);
		//System.out.println(st.num);
		
		
		SpelExpressionParser parser=new SpelExpressionParser();
		Expression ex=parser.parseExpression("'Hello world'");
		Expression maths=parser.parseExpression("10*5+4");
		Expression bool=parser.parseExpression("10>5");
		System.out.println(ex.getValue());
		System.out.println(maths.getValue());
		System.out.println(bool.getValue());
		
	}

}

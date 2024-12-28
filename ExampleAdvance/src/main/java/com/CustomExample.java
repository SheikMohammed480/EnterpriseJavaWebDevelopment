package com;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.Tag;

public class CustomExample extends SimpleTagSupport {
	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		JspWriter out = getJspContext().getOut();
		out.println("this is my custom tags");
	}
//	public void doAfterBody() throws JspException {
//		System.out.println("I am after body");
//		doAfterBody();
//			}
//	
//	public void doEndTag() {
//		System.out.println("I am end body");
//		doEndTag();
//		// TODO Auto-generated method stub
//
//	}
//	public void doStartTag() throws JspException {
//			System.out.println("I am start tag");
//			JspWriter out = getJspContext().getOut();
//		try {
//			out.println("<h1>i am the first custom tag</h1>");
//		} catch (Exception e) {
//		}
				
		
	

	public static void main(String[] args) {
		

	}

}

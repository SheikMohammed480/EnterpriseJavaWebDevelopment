<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="u" class="com.JavaBean"/>
<%--setters --%>
<jsp:setProperty property="name" name="u"/>
<jsp:setProperty property="password" name="u"/>
<jsp:setProperty property="email" name="u"/>

<%--getters --%>

<jsp:getProperty property="name" name="u"/>
<jsp:getProperty property="password" name="u"/>
<jsp:getProperty property="email" name="u"/>


<%-- 
<jsp:setProperty property="*" name="u"/>
--%>

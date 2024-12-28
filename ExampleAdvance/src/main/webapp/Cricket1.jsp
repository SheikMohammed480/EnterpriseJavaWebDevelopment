<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.Cricket, com.CricketPojo" %>
<%
    String userToss = request.getParameter("usertoss");
    CricketPojo pojo = new CricketPojo();
    Cricket cricket = new Cricket();
    pojo.setUserToss(userToss);

    // Simulate the toss
    String tossResult = Math.random() > 0.5 ? "Heads" : "Tails";
    pojo.setOpDec(tossResult);

    if (userToss.equalsIgnoreCase(tossResult)) {
        request.setAttribute("result", "won");
        request.getRequestDispatcher("BatBowlDecision.jsp").forward(request, response);
    } else {
        request.setAttribute("result", "lost");
        request.getRequestDispatcher("ComputerDecision.jsp").forward(request, response);
    }
%>

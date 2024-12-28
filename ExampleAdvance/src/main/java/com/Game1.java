package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.games.Game3;

/**
 * Servlet implementation class Game1
 */
@WebServlet("/Game1")
public class Game1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Game1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	public Game3 game = new Game3();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        String action = request.getParameter("action");
        
        if ("toss".equals(action)) {
            String userToss = request.getParameter("userToss");
            String tossResult = game.getTossResult(userToss);
            out.println("<p>" + tossResult + "</p>");
        } else if ("start".equals(action)) {
            String decision = request.getParameter("decision");
            game.initializeGame(decision);
            out.println("<p>Game started. You chose to " + decision + " first.</p>");
        } else if ("play".equals(action)) {
            int playerMove = Integer.parseInt(request.getParameter("move"));
            String result = game.playTurn(playerMove);
            out.println("<p>" + result + "</p>");
        } else if ("status".equals(action)) {
            out.println("<p>Player Score: " + game.getPlayerScore() + "</p>");
            out.println("<p>Computer Score: " + game.getComputerScore() + "</p>");
        }
        
        
    }
}

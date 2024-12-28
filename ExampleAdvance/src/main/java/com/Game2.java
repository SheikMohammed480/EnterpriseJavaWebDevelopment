package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.games.Game;

/**
 * Servlet implementation class Game2
 */
@WebServlet("/Game2")
public class Game2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Game2() {
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	    
	    public Game game = new Game();  // Create an instance of the Game class

	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String playerMove = request.getParameter("playerMove");  // Get the player's move
	        
	        String roundResult = game.playRound(playerMove);  // Play a round of the game
	        String finalResult = game.getFinalResult();  // Get the final result
	        
	        request.setAttribute("roundResult", roundResult);  // Set the round result to be forwarded to the JSP
	        request.setAttribute("finalResult", finalResult);  // Set the final result
	        
	        // Forward to the JSP to display the results
	        request.getRequestDispatcher("Game 2.jsp").forward(request, response);
	    }
	}



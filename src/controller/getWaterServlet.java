package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CoffeeConverter;

/**
 * Servlet implementation class getWaterServlet
 */
@WebServlet("/getWaterServlet")
public class getWaterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getWaterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userCoffee = request.getParameter("userCoffee");
		CoffeeConverter userWater = new CoffeeConverter(Integer.parseInt(userCoffee));
		request.setAttribute("userWaterResult", userWater);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		//PrintWriter writer = response.getWriter();
		//writer.println(userCoffee.toString());
		//writer.close();
	}

}

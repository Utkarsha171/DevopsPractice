import COM.LTI.*;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import COM.LTI.Results;
import COM.LTI.Movie;
import COM.LTI.MovieDAO;

@WebServlet("/InsertController")
public class InsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public InsertController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession();
		int id=Integer.parseInt(request.getParameter("id"));
		String moviename=request.getParameter("name");
		String actor=request.getParameter("actor");
		String actress=request.getParameter("actress");
		String director=request.getParameter("director");
		int collection=Integer.parseInt(request.getParameter("collection"));
		String dor=request.getParameter("dor");
		
		Movie m=new Movie();
		m.setId(id);
		m.setMname(moviename);
		m.setActor(actor);
		m.setActress(actress);
		m.setDirector(director);
		m.setCollection(collection);
		m.setDor(dor);
		
		MovieDAO movieDao=new MovieDAO();
		String result=movieDao.addMovie(m);
		
		if(result.equals(Results.SUCCESS))
		{
			session.setAttribute("moviename",m.getMname());
			System.out.println("Movie inserted");
			RequestDispatcher rd=request.getRequestDispatcher("/Success.jsp");
			rd.forward(request, response);
			
		}
		
		
	}

}

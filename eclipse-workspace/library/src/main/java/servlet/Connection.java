package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import library.User;

/**
 * Servlet implementation class Connection
 */
@WebServlet("/register")
public class Connection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connection() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
		String ename=request.getParameter("ename");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String pass=request.getParameter("pass");
		//System.out.print(uname+" "+ pass);
		User u= new User();
		u.setName(ename);
		u.setPassword(pass);
		u.setEmail(email);
		u.setPassword(pass);
		System.out.println("pproject started");
    	Configuration cfg =new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	System.out.println(factory);
    	
    	Session session= factory.openSession();
    	Transaction tx=session.beginTransaction();
    	session.save(u);
    	tx.commit();
    	session.close();

		}
		catch(Exception e) {
			System.out.print(e);
		}
			
		
	}

}

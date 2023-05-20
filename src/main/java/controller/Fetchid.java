package controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.Studentdao;
import dto.Student;

@WebServlet("/Fetchid")
public class Fetchid extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String id = req.getParameter("id");
		int Id = Integer.parseInt(id);
		
		Studentdao dao=new Studentdao();
		Student student = dao.fetch(Id);
		//res.getWriter().print("<h1>"+list+"</h1>");
		
		if(student==null){
			res.getWriter().print("<h1>Data not found</h1>");
		}
		else{
		 res.getWriter().print("<html><body><table border='1'>");
	      res.getWriter().print("<tr>"
		      		+ "<th>id<th>"
		      		+ "<th>Name<th>"
		      		+ "<th>Mobile<th>"
		      		+ "<th>Email<th>"
		      		+ "<th>Gender<th>"
		      		+ "<th>DOB<th>"
		      		+ "<th>Address<th>"
		      		+ "<th>Skills<th>"
		      		+ "<th>Country<th>"
		      		+ "<tr>");

		      res.getWriter().print("<tr>"
			      		+ "<th>"+student.getId()+"<th>"
			      		+ "<th>"+student.getName()+"<th>"
			      		+ "<th>"+student.getMobile()+"<th>"
			      		+ "<th>"+student.getEmail()+"<th>"
			      		+ "<th>"+student.getGender()+"<th>"
			      		+ "<th>"+student.getDob()+"<th>"
			      		+ "<th>"+student.getAddress()+"<th>"
			      		+ "<th>"+Arrays.toString(student.getSkills())+"<th>"
			      		+ "<th>"+student.getCountry()+"<th>"
			      		+ "<tr>");

	      
	      res.getWriter().print("</html></body></table>");
		}
	}

}

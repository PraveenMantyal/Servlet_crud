package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.Studentdao;

import dto.Student;

@WebServlet("/Save")
public class SaveStudent extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String mobile = req.getParameter("mobileno");
		String mail = req.getParameter("mail");
		String date = req.getParameter("date");
		String gender = req.getParameter("gender");
		String address = req.getParameter("address");
		String[] skill = req.getParameterValues("skill");
		String country = req.getParameter("country");
		
//		res.getWriter().println("<h1> Name: "+name+"</h1>");
//		res.getWriter().println("<h1> Mobile no: "+mobile+"</h1>");
//		res.getWriter().println("<h1> Email: "+mail+"</h1>");
//		res.getWriter().println("<h1> Date of Birth: "+date+"</h1>");
//		res.getWriter().println("<h1> Gender: "+gender+"</h1>");
//		res.getWriter().println("<h1> Address: "+address+"</h1>");
//		res.getWriter().println("<h1> Skill: "+Arrays.toString(skill)+"</h1>");
//		res.getWriter().println("<h1> Country: "+country+"</h1>");
		
		Student student=new Student();
		student.setName(name);
		student.setMobile(Long.parseLong(mobile));
		student.setEmail(mail);
		student.setDob(Date.valueOf(date));
		student.setGender(gender);
		student.setAddress(address);
		student.setSkills(skill);
		student.setCountry(country);
		
		Studentdao dao=new Studentdao();
		dao.save(student);
		 
		
		res.getWriter().print("<h1>ADDED SUCESSFULLY......</h1>");
		
	}

}

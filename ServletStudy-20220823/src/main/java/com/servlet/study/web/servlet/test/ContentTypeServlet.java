package com.servlet.study.web.servlet.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/content/type")
public class ContentTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("요청 URL: " + " request.getRequestURL()");
		System.out.println("요청 Method: " + " request.getMethod()");
		System.out.println("요청 param(id): " + request.getParameter("id"));
		System.out.println("요청 param(pw): " + request.getParameter("password"));
		System.out.println("요청 param(email): " + request.getParameter("email"));
		
		request.getRequestDispatcher("/WEB-INF/dispatcher-test.html").forward(request, response);  
		// getRequestDispatcher : 클라이언트로부터 최초에 들어온 요청을 JSP/Servlet 내에서 원하는 자원으로 요청을 넘기는(보내는) 역할을 수행하거나,
		// 특정 자원에 처리를 요청하고 처리 결과를 얻어오는 기능을 수행하는 클래스
		// forward : 응답을 위임
		
//		response.setContentType("application/json; charset=utf-8");   // 파일 형식과 언어 설정
//		
//		response.getWriter().print("{\"name\":\"준일\"}");   // 보여줄 내용 작성
		
		
//		response.getWriter().print("<html>");    // html형식 작성 가능
//		response.getWriter().print("<head>");
//		response.getWriter().print("<title>contentType</title>");
//		response.getWriter().print("</head>");
//		response.getWriter().print("<body>");
//		response.getWriter().print("<h1>ContentType Test!</h1>");
//		response.getWriter().print("</body>");
//		response.getWriter().print("</html>");
	}

}

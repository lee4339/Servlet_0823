package com.servlet.study.web.servlet.board.api;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/api/v1/board/addition")
public class BoardInsertApi extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public BoardInsertApi() {
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("title: ");
		System.out.println(request.getParameter("boardTitle"));
		System.out.println("writer: ");
		System.out.println(request.getParameter("boardWriter"));
		System.out.println("content: ");
		System.out.println(request.getParameter("boardContent"));
	}

}

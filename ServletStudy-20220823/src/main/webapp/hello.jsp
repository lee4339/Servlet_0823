<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%!
	// 선언식 
	String name = "김준일";
%>

<%
	// 스크립틀릿
	List<String> nameList = new ArrayList<String>();
	nameList.add("김준일");
	nameList.add("조문기");
	nameList.add("박소영");
	nameList.add("서재효");
	nameList.add("신승환");
	nameList.add("이승환");
	nameList.add("최연호");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
	table {
		border: 1px solid #000;
		border-collapse: collapse;
	}
	
	td, th {
		border: 1px solid #000;
		width: 80px;
		height: 40px;
		text-align: center;
	}
</style>

</head>
<body>
	<h1>hello jsp!</h1>
	<label>이름: </label><%=name %><br>
	
	<table>
		<tr>
			<th>번호</th>
			<th>이름</th>
		</tr>
<%
		for(int i = 0; i < nameList.size(); i++) {
%>
		<tr>
			<th><%=i + 1 %></th>
			<th><%=nameList.get(i) %></th>
		</tr>
<%
		}
%>
	</table>
</body>
</html>
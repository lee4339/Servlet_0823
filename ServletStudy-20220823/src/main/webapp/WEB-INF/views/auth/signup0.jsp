<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입 model1</title>
		
		<style type="text/css">		
			table {
				margin: 100px auto;
			
				border: 1px solid #121212;
				border-collapse: collapse;
			}
			
			th, td {
				border: 1px solid #121212;
				padding: 10px; 
				text-align: center;
			}
		</style>
	</head>
	
	<body>
		<form method="post" action="/auth/signup">
		<!--  action이라는 태그를 통해 form안에 정보들을 지정 페이지에 요청을 날림 -->
			<table>
				<thead>
					<tr>
						<th colspan="2">회원가입</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>아이디: </td>
						<td><input type="text" name="user_id"></td>
					</tr>
					<tr>
						<td>비밀번호: </td>
						<td><input type="password" name="user_password"></td>
					</tr>
					<tr>
						<td>이름: </td>
						<td><input type="text" name="user_name"></td>
					</tr>
					<tr>
						<td>이메일: </td>
						<td><input type="text" name="user_email"></td>
					</tr>
				</tbody>
				<tfoot>
					<tr>
						<td colspan="2">
							<button type="submit">회원가입</button>
							<button type="reset">다시작성</button>
						</td>
					</tr>
				</tfoot>
			</table>
		</form>
	</body>
</html>
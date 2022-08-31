package com.servlet.study.web.domain.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Types;

import com.servlet.study.web.domain.db.DBConnectionMgr;

public class UserDBTest {
	
	public static void main(String[] args) {
		DBConnectionMgr pool = DBConnectionMgr.getInstance();  // 싱글턴 : 하나의 인스턴스만 가지고 공유해서 쓰는 패턴
		
//		try {
//			Connection con = pool.getConnection();  // 연결
//			
//			String sql = "select * from user_mst";
//			
//			PreparedStatement pstmt = con.prepareStatement(sql);   // 쿼리의 내용을 동적으로 생성해야 할 때 값을 가독성이 좋은 형태로 넣을 수 있음.
//			
//			ResultSet rs = pstmt.executeQuery();  //수행결과로 Boolean 타입의 값을 반환, 리턴값이 ResultSet 일 경우에는 true, 이 외의 경우에는 false 로 출력
//			
//			while(rs.next()) {   // 현재 줄 
//				System.out.println("코드: ");
//				System.out.println(rs.getInt(1)); // 첫번째
//				System.out.println("아이디: ");
//				System.out.println(rs.getString(2));
//				System.out.println("비밀번호: ");
//				System.out.println(rs.getString(3));
//				System.out.println("이름: ");
//				System.out.println(rs.getString(4));
//				System.out.println("이메일: ");
//				System.out.println(rs.getString(5));
//				System.out.println();
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		try {
			Connection con = pool.getConnection();
			String sqi = "SELECT\r\n"
					+ "	om.order_code,\r\n"
					+ "	om.order_user,\r\n"
					+ "	um.user_id,\r\n"
					+ "	om.order_product,\r\n"
					+ "	pm.product_name,\r\n"
					+ "	pm.product_category,\r\n"
					+ "	cm.category_name,\r\n"
					+ "	pm.product_price,\r\n"
					+ "	om.order_datetime\r\n"
					+ "FROM\r\n"
					+ "	order_mst om\r\n"
					+ "	LEFT OUTER JOIN user_mst um ON(um.user_code = om.order_user)\r\n"
					+ "	LEFT OUTER JOIN product_mst pm ON(pm.product_code = om.order_product)\r\n"
					+ "	LEFT OUTER JOIN category_mst cm ON(cm.category_code = pm.product_category);";
			PreparedStatement pstmt = con.prepareStatement(sqi);
			ResultSet rs = pstmt.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int colCount = metaData.getColumnCount(); //컬럼의 현재 갯수
			
			for(int i = 0; i < colCount; i++) {
				System.out.printf("%-50s", metaData.getColumnName(i + 1)); // %-50s 글자를 표현할 수 있는 크기(공간) // - : 왼쪽정렬, 없으면 오른쪽 // s: 문자열, d: 부호 있는 10진 정수
			}
			System.out.println();
			
			
			while(rs.next()) {
				for(int i = 0; i <colCount; i++) {
					int index = i + 1;
					
					int scale = metaData.getScale(index);  // 컬럼의 스케일 값을 리턴
					int colType = metaData.getColumnType(index);
					
					if(colType == Types.INTEGER && scale == 0) { // 0 정수 1 실수
						System.out.printf("%-50d", rs.getInt(index));
					} else if(colType == Types.VARCHAR) {
						System.out.printf("%-50s", rs.getString(index));
					} else if(colType == Types.TIMESTAMP) {
						System.out.printf("%-50s", rs.getTimestamp(index).toString());
					}
				}
				System.out.println();
//				System.out.print("주문코드: ");
//				System.out.println(rs.getInt(1));
//				System.out.print("주문유저: ");
//				System.out.println(rs.getInt(2));
//				System.out.print("아이디: ");
//				System.out.println(rs.getString(3));
//				System.out.print("주문제품: ");
//				System.out.println(rs.getInt(4));
//				System.out.print("제품이름: ");
//				System.out.println(rs.getString(5));
//				System.out.print("제품카테고리: ");
//				System.out.println(rs.getInt(6));
//				System.out.print("카테고리이름: ");
//				System.out.println(rs.getString(7));
//				System.out.print("제품가격: ");
//				System.out.println(rs.getInt(8));
//				System.out.print("주문시간: ");
//				System.out.println(rs.getString(9));
//				System.out.println();
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
	}
}

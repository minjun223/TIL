<%@page import="DBPKG.Util"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("UTF-8");
String resvno(함수명)=request.getParameter("resvno");
String name=request.getParameter("name");
String votenum=request.getParameter("votenum");
String votetime=request.getParameter("votetime");
String votewhere=request.getParameter("votewhere");

try{
	Connection conn = Util.getConnection();
	String sql = "INSERT INTO tbl_resv_202108 VALUES(?,?,?,?)";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	
	pstmt.setString(1, resvno);
	pstmt.setString(2, name);
	pstmt.setString(3, votenum);
	pstmt.setString(4, votetime);
	pstmt.setString(5, votewhere);
	
	pstmt.executeUpdate();
	
%>
<jsp:forward page="vote.jsp"></jsp:forward>	
<%
}
catch(Exception e){
	e.printStackTrace();
}
    %>

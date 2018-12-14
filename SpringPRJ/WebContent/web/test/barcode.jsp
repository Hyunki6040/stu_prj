<%@page import="poly.util.CmmUtil"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
int user_no =  1;//CmmUtil.nvl((String)session.getAttribute("id"));
String barcode = CmmUtil.nvl((String)request.getAttribute("barcode"));
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td>
			<img src='https://barcode.tec-it.com/barcode.ashx?data=<%=barcode%>&code=Code128&dpi=96&dataseparator=' alt='Barcode Generator TEC-IT'/>
		</td>
	</tr>
</table>
</body>
</html>
<%@page import="jxl.Sheet"%>
<%@page import="jxl.Workbook"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="UTF-8"%>
<%
	String strGrpName, strUserID, strName, strAge;
	
	//엑셀파일 업로드
	String savePath = request.getRealPath("/")+"uploaddata/temp";
	
	int sizeLimit = 30 * 1024 * 1024;
	String formName = "";
	String fileName = "";
	long fileSize = 0;
	
	MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "euc-kr",
			new DefaultFileRenamePolicy());
	Enumeration formNames = multi.getFileNames();
	
	while(formNames.hasMoreElements()){
		formName = (String)formNames.nextElement();
		fileName = multi.getFilesystemName(formName);
		
		if(fileName != null){
			fileSize = multi.getFile(formName).length();
		}
		
		
		
		
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
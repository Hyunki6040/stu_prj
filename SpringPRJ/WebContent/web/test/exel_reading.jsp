<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	//등록
	function goInsert(){
		var f = document.frm1;
		
		if(f.file1.value == ""){
			alert("파일을 선택해 주세요.");
			return;
		}
		
		var fileNameLen = f.file1.value.length;
		
		if(f.file1.value.substring(fileNameLen-3, fileNameLen) != "xls"){
			alert("확장자가 .xls인 엑셀파일을 선택해 주세요.");
			return;
		}
		
		f.submit();
	}
</script>
</head>
<body>
	<form name="frm1" method="post" action="/excel.do" enctype="multipart/form-data">
		<table border="0">
			<tr><td colspan="2"><b>**주의사항**</b></td></tr>
			<tr><td colspan="2">* 엑셀파일만 업로드 가능합니다.</td></tr>
			<tr><td colspan="2">* 첫번째 시트에 데이터가 있어야 합니다. [시트명:Sheet1]</td></tr>
			<tr><td colspan="2">* 엑셀작성 시 중간에 빈 줄이 없어야 합니다.</td></tr>
			<tr>
				<td colspan="2">
					<a href="Template/ExcelTemplate.xls">
						양식 다운로드
					</a>
			</tr>
			<tr height="5"><td></td></tr>
			<tr>
				<td>파일명</td>
				<td><label for="find">찾아보기</label><input type="file" id="find" name="file1" size=40"></td>
			</tr>
			<tr height="5"><td></td></tr>
			<tr>
				<td colspan="2" align="center">
					<a href="javascript:goInsert();">
						등록
					</a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
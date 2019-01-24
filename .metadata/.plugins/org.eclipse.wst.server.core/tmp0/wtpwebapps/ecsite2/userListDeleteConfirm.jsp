<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE htm>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<title>UserListDeleteConfirm画面</title>
<style type="text/css">
body{
	margin:0;
	padding:0;
	line-height:1.6;
	letter-spacing;1px;
	font-family:Verdana,Helvetica,sans-serif;
	font-size:12px;
	color:#333;
	background:#fff;
}
table{
	text-align:center;
	margin:0 auto;
}

#top{
	width:780px;
	margin:30px auto;
	border:1px solid #333;
}

#header{
	width:100%;
	height:80px;
	background-color:black;
}

#main{
	width:100%;
	height:500px;
	text-align:center;
}
#footer{
	width:100%;
	height:80px;
	background-color:black;
	clear:both;
}


</style>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>削除確認</p>
		</div>
		<div>
			<s:form>
				<h3>すべてのユーザーを削除します。よろしいですか？</h3>
				<tr>
					<td><input type="button" value="ＯＫ" onClick="location.href='http://localhost:8080/ecsite2/userListDeleteComplete.jsp'"/></td>
					<td><input type="button" value="キャンセル" onClick="location.href='http://localhost:8080/ecsite2/userList.jsp'"/></td>
				</tr>
			</s:form>
		</div>	
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    <!--     タグの頭に"s"をつければstruts2の機能を使えます、という意味。 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>INDEX</title>
</head>
<body>
	<s:form action="HelloStrutsAction">
	<!-- 	ボタンを押したら｢HelloStrutsAction｣という -->
<!-- 	アクションを起こしてくれ！と書いてある -->
		<s:submit value="HelloStruts"/>
	</s:form>
	<!-- 	頭に"s:"がついてる。struts2の機能を使うよ！の合図 -->

	<s:form action="WelcomeAction">
		<s:submit value="Welcome"/>
	</s:form>

	<s:form action="InquiryAction">
		<s:submit value="問い合わせ"/>
	</s:form>

	<br>
	GET通信
	<s:form method="get" action="TestAction">
	<s:textfield name="username"/>
	<s:password name="password"/>
	<s:submit value="送信"/>
	</s:form>
	POST通信
	<s:form method="post" action="TestAction">
	<s:textfield name="username"/>
	<s:password name="password"/>
	<s:submit value="送信"/>
	</s:form>

</body>
</html>
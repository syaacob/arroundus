<%@page import="hellograils.oo.core.NewsType"%>
<%@ page contentType="text/html;charset=ISO-8859-1" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<meta name="layout" content="main"/>
<title>Insert title here</title>
<geolocation:resources></geolocation:resources>
</head>
<body>
  <div class="body">
  <geolocation:locateMe></geolocation:locateMe>
  	<g:renderErrors bean="${newsType}" as="list">
  	</g:renderErrors>
  	<g:form action="doSave">
  		Code<g:textField name="code" type="text"/>
  		<g:submitButton name="doSave" value="save"/>
  	</g:form>
  </div>
</body>
</html>
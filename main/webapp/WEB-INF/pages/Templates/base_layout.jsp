<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
<spring:url var="resourceUrl" value="/resources"/>
<html>

<head>
<tiles:insertAttribute name="html_head" />
<meta http-equiv="Content-Type" contentType="text/html; charset=ISO-8859-1" >
<title><tiles:insertAttribute name="title" ignore="true" /></title>

<link href="${resourceUrl}/bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="${resourceUrl}/bootstrap/css/bootstrap-select.css" rel="stylesheet">
<script type="text/javascript" src="${resourceUrl}/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="${resourceUrl}/bootstrap/js/bootstrap-select.js"></script>

</head>
<body>
 <div class="container">
 	<div class="navigation">
 		<tiles:insertAttribute name="header" />
 	</div>
 	<div class="pagecontent">
		<table  cellpadding="2" cellspacing="2" align="left" width="100%"><tr>
		        <td height="30" colspan="2"></td>
		    </tr>
		    <tr>
		        <td width="35%" height="500" >
				<tiles:insertAttribute name="left_column" />
		         
		 
		        </td>
		        <td width="65%" >
					<tiles:insertAttribute name="right_column" />
		         </td>
		    </tr>
		    <tr>
		        <td height="20" colspan="2" width="100%">
		 
		         <tiles:insertAttribute name="footer" />
		 
		        </td>
		    </tr>
		</table>
	</div>
</div>
</body>


</html>
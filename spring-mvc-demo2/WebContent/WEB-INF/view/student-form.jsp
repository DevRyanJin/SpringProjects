<!--  need to import to make use of Spring form tag -->
<%@ taglib prefix ="form" uri ="http://www.springframework.org/tags/form" %>


<html>
<head><title>student login form</title>


<style>
	.error{color:red}
</style>

</head>

<body>
<form:form action ="processForm" modelAttribute ="student">

First Name: <form:input path ="firstName"/> 
<br><br>
Last Name:  <form:input path="lastName"/>
<br><br>

<form:select path ="country">
	<form:options items ="${student.countryOptions }"/>
</form:select> 

<br><br>

<%-- Java <form:radiobutton path ="favoriteLanguage" value ="Java"/>
C# <form:radiobutton path ="favoriteLanguage" value ="C#"/>
Python <form:radiobutton path ="favoriteLanguage" value ="Python"/>
Ruby <form:radiobutton path ="favoriteLanguage" value ="Ruby"/>
 --%>
 Favorite Language: 
 <form:radiobuttons path ="favoriteLanguage" items="${student.favoriteLanguages}"/>
<br><br>
Operating Systems:
<br> 
Linux<form:checkbox path = "operatingSystems" value ="Linux" />
Mac OS<form:checkbox path = "operatingSystems" value ="Mac OS" />
Windows<form:checkbox path = "operatingSystems" value ="Windows" />

<br><br>

Course Code: <form:input path="courseCode"/>
<form:errors path="courseCode" cssClass ="error"/>

<br><br>
<input type ="submit" value ="Submit"/> 

</form:form>

</body>
</html>
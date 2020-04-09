<%@ taglib prefix ="form" uri ="http://www.springframework.org/tags/form" %>


<html>
<head>
<title>customer form</title>

<style>
	.error{color:red}
</style>

</head>
<body>
Customer Registration Form 
<hr>

<br><br>
<i>Fill out the form Asterisk(*) means required</i> 
<br><br>

<form:form action ="processForm" modelAttribute ="customer">

First name: <form:input path ="firstName"/>
<br><br>

Last name(*): <form:input path ="lastName"/>
<form:errors path ="lastName" cssClass = "error"/> <!-- need to add css code to make code better -->


<br><br>
Free press: <form:input path="freePress"/>
<form:errors path="freePress" cssClass ="error"/>

<br><br>
Postal code: <form:input path ="postalCode"/>
<form:errors path="postalCode" cssClass = "error"/>

<br><br>
<input type ="submit" value = "Submit"/> 
</form:form>

</body>
</html>
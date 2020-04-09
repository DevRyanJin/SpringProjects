<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head><title>Student Confirmation page</title></head>

<body> 

Welcome! ${student.firstName}  ${student.lastName} <!--  add parameter received from StudentController class  to show the student name-->
<br><br>
You are from ${student.country} right? 
<br><br>

Your favorite language is ${student.favoriteLanguage} right? 
<br><br>

Operating Systems:

<ul> 
	<c:forEach var ="temp" items="${student.operatingSystems }" >
	
		<li> ${temp}</li>
	
	</c:forEach>
</ul>

<br><br>
course code:  ${student.courseCode} 



</body>
</html>
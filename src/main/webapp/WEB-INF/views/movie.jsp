<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

   <html>
    <body>
        <div>
            <form:form method="POST" action="/SpringMVC/saveMovie" modelAttribute="movie" enctype="multipart/form-data">
				<table>
        			<tr>
        				<td>MovieId</td>
        				<td><form:input type="text" path="movieId"></form:input></td>
        			</tr>
        			<tr>
        				<td>MovieName</td>
        				<td><form:input type="text" path="movieName"></form:input> </td>
        			</tr>
					<tr>
        				<td>MoviePrice</td>
        				<td><form:input type="text" path="moviePrice"></form:input> </td>
        			</tr>
        			<tr>
        				<td colspan=2><input type="submit" value="Save"> </td>
        			</tr>
        		</table>
			</form:form>
        </div>

    </body>
   </html>
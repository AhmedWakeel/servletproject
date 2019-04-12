<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1> Hi How are you</h1>
 
 <form action="SimpleServlet1" method="get">  
 
 <br> User ID  : <input type="text" name = "name"/><br>
 <br> Password : <input type="password" name="password"/> <br>
 <br> <input type="submit" />
 </form>
 
 
<%--  <form action="SimpleServlet1">
 Please Enter Your Name :  <input type="text" name="name">
 Profession : 
 <input type="radio" name = "prof" value ="java">Java</input>
 <input type="radio" name = "prof" value ="Android">Android</input>
 Select :
 <select name="sel" multiple size="3">
   <option value="mumbai">mumbai</option>
   <option value="sakinaka">sakinak</option>
   <option value="pune">pune</option>
   <option value="goa">goa</option>
 
 </select>
 
                    <input type="submit" value="click">
 </form>


<%
    int i = 39; 
%>

The square value of i is = <%= mk(10) %>
<%!
public int mk(int i)
{
	return i*i;
}
%>
 --%>
 
 
 <!-- <form:form action="SimpleServlet1">
 Please Enter Your Name : <formElement:formInputBox idKey="name" labelKey="name" path="name" mandatory="false"/>
  <input type="submit" value="click">
 </form:form> -->



</body>

</html>
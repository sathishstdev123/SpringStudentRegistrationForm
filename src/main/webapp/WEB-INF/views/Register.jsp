<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<style type="text/css">
 .err{
   color:blue;
 } 
</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome To  Student Registration Form</h2>
<h3>Full the Registration form Carefully</h3>
<form:form action="save" modelAttribute="student">
<pre>
Student-Id:<form:input path="stdId"/><br>
<form:errors path="stdId" cssClass="err"/>
StudentName:<form:input path="stdName"/><br>
<form:errors path="stdName" cssClass="err"/>
Date Of Birth:<form:select path="month">
<form:option value="">Month</form:option>
<form:option value="jan">January</form:option>
<form:option value="feb">February</form:option>
<form:option value="mar">March</form:option>
<form:option value="apr">April</form:option>
<form:option value="may">May</form:option>
<form:option value="jun">June</form:option>
<form:option value="jl">July</form:option>
<form:option value="aug">August</form:option>
<form:option value="sep">September</form:option>
<form:option value="oct">October</form:option>
<form:option value="nov">November</form:option>
<form:option value="dec">December</form:option>
</form:select><form:errors path="month" cssClass="err"/><form:select path="day">
<form:option value="">Day</form:option>
<form:option value="1">1</form:option><form:option value="bsc1">2</form:option>
<form:option value="bsc2">3</form:option><form:option value="bsc3">4</form:option><form:option value="bzc">5</form:option>
<form:option value="bcom">6</form:option><form:option value="bcom1">7</form:option>
<form:option value="bsc4">8</form:option><form:option value="bsc5">9</form:option>
<form:option value="bsc5">10</form:option><form:option value="bsc5">11</form:option>
<form:option value="bsc5">12</form:option><form:option value="13">13</form:option>
<form:option value="14">14</form:option><form:option value="15">15</form:option>
<form:option value="16">16</form:option><form:option value="17">17</form:option>
<form:option value="18">18</form:option><form:option value="19">19</form:option>
<form:option value="20">20</form:option><form:option value="21">21</form:option>
<form:option value="22">22</form:option><form:option value="23">23</form:option>
<form:option value="24">24</form:option><form:option value="25">25</form:option>
</form:select><form:errors path="day" cssClass="err"/><form:select path="Year">
<form:option value="">Year</form:option>
<form:option value="1995">1995</form:option>
<form:option value="1996">1996</form:option><form:option value="1997">1997</form:option>
<form:option value="1998">1998</form:option><form:option value="1999">1999</form:option>
<form:option value="2000">2000</form:option><form:option value="2001">2001</form:option>
<form:option value="2002">2002</form:option><form:option value="2003">2003</form:option>
<form:option value="2004">2004</form:option><form:option value="2005">2005</form:option>
<form:option value="2006">2006</form:option><form:option value="207">2007</form:option>
<form:option value="2008">2008</form:option><form:option value="209">2009</form:option>
<form:option value="2010">2010</form:option><form:option value="211">2011</form:option>
<form:option value="2012">2012</form:option><form:option value="213">2013</form:option>
<form:option value="2014">2014</form:option><form:option value="215">2015</form:option>
<form:option value="2016">2016</form:option><form:option value="217">2017</form:option>
<form:option value="2018">2018</form:option><form:option value="219">2019</form:option>
<form:option value="2020">2020</form:option>
</form:select><form:errors path="year" cssClass="err"/><br><br>
Gender:<form:radiobutton path="stdGen" value="male"/>Male<form:radiobutton path="stdGen" value="female"/>Female<br>
<form:errors path="stdGen" cssClass="err"/>
StudentAddress<form:textarea path="stdAddr"/><br>
<form:errors path="stdAddr" cssClass="err"/>
City:<form:input path="stdCity"/>  State:<form:input path="stdState"/>
<form:errors path="stdCity" cssClass="err"/><form:errors path="stdState" cssClass="err"/>
StudentMobile:<form:input path="stdMobile"/>
<form:errors path="stdMobile" cssClass="err"/>
Student Email-Id:<form:input path="stdEmail"/>
<form:errors path="stdEmail" cssClass="err"/>
Course:<form:select path="stdCourse">
<form:option value="">--SELECT--</form:option>
<form:option value="bsc">BSc(ComputerScience)</form:option>
<form:option value="bsc1">BSc(Math)</form:option>
<form:option value="bsc2">BSc(Physics)</form:option>
<form:option value="bsc3">BSc(Chemistry)</form:option>
<form:option value="bzc">BZC</form:option>
<form:option value="bcom">BCom(General)</form:option>
<form:option value="bcom1">BCom(Computer)</form:option>
<form:option value="bsc4">BSc(Electrons)</form:option>
<form:option value="bsc5">BSc(Statics)</form:option>
</form:select>
<form:errors path="stdCourse" cssClass="err"/>
COUNTRY:<form:select path="stdCntry">
<form:option value="">--SELECT--</form:option>
<form:option value="IND">INDIA</form:option>
<form:option value="AUS">AUSTRALIA</form:option>
<form:option value="US">USA</form:option>
<form:option value="ENG">ENGLAND</form:option>
</form:select>
<form:errors path="stdCntry" cssClass="err"/>
<input type="submit" value="REGISTER"/><input type="reset" value="CLEAR"/>
</pre>
</form:form>
</body>
</html>
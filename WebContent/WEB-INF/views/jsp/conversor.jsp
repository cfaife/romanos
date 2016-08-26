<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<h4>Numero para Romanos</h4>
	<form action="conversor">
		<label>Numero </label> 
		<input type="text" name= "numero" id = "numero"/> <br/>
		<input type="hidden" name= "p" value="ConverteRomanoControler"/> <br/>
		<input type="submit" value="converter"/> <br />
		<label>Numero convertido</label> 
		<input type="text" name= "resultado" id = "resultado" readonly="readonly" value="${requestScope.numeroRomano}"/>
	</form>

</body>
</html>
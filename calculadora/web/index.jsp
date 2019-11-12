<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Calculadora de Um Servlet</title>
</head>
<body>
<h1>CALCULADORA DE UM SERVLET</h1>
<br/>

<fieldset>
  <legend>Calculadora de Operações Básicas da Matemática</legend>
  <br/><br/>
<form action="calculadora" method="get">

  Número 1: <input type="text" name="num1" placeholder="Digite o 1º nº"/>

  <select name="oper">
    <option value="+">+</option>
    <option value="-">-</option>
    <option value="*">*</option>
    <option value="/">/</option>
  </select>

  Número 2: <input type="text" name="num2" placeholder="Digite o 2º nº"/>

  <input type="submit" value="Calcular"/>
</form>
</fieldset>
</body>
</html>


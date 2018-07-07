<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistemas distribuidos</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body style ='background-color: #c9ebec;'>
<br>
<br>

<center><form style="" action="Controlador" method="Post">
  <div class="form-group" style="width: 500px" >
    <br>
	<h1>PRIMER LABORATORIO</h1>
	<p>
	La finalidad de este laboratorio es lograr la implementación de un pagina web utilizando la tecnología GoogleCloud.
	</p>
	<p>
	Extraemos información del base de datos del Banco Mundial, de su sección de estadisticas sobre salud y nutrición.
	</p>
	<p>
	Según la consulta que usted seleccione se le mostrara las estadisticas relacionadas a los países de Argentina, Brasil, Colombia, Chile,Bolivia, Ecuador, Perú, Paraguay, Uruguay y Venezuelo para los años del 2005 al 2013. Esta información esta complementanda con un gráfico relacionada a la misma.
	</p>
	<br>
    <br>
	<h2>Seleccione su consulta</h2>
	<br>
    <select class="form-control" id="serie" name="serie">
      <option value="1">Personas mayores de 15 años, viviendo con VIH</option>    
      <option value="2">Edad promedio de hombres, en su primer matrimonio</option>
      <option value="3">Edad promedio de mujeres, en su primer matrimonio</option>
      <option value="4">Prevalencia de diabetes ( Porcentaje de poblacion entre 25 y 79 años)</option>
      <option value="5">Camas de hospital (por cada 1000 personas)</option>
      <option value="6">Incidencia de TBC (por cada 1000 personas)</option>
      <option value="7">Expectativa de vida al nacer (en años)</option>
    </select>
  </div>

<button type="button submit" class="btn btn-success" >Mostrar</button>
<a href="/index.jsp" class="btn btn-success">Menú principal</a>
</form></center>

</body>
</html>
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
<div>
<center><form style="" action="../Controlador" method="Post">
	<br>
	<br>
  <div class="form-group" style="width: 500px" >
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
<a href="../index.jsp"><button type="button" class="btn btn btn-warning" >Regresar</button></a>

</form></center>
</div>
<div >
	<br>
	<%String variable=null;
		variable=(String)request.getAttribute("RutaImagen");
		if(variable==null){
			variable="No recupero";
		}
		String Serie=null;
		Serie=(String)request.getAttribute("SerieActual");
		if(Serie==null){
			Serie="No recupero";
		}			
	%>
	<center>Serie Actual: <%=Serie%>
	<br>
	</center>
</div>
<div  >
	<br>
	<center><img src="../Imagenes/<%=variable%>" border="10px" /></center>
</div>

<div>
<br>
<br>
</div>

<div>
<center><table class="table table-dark" style="width: 60%">
  <thead>
    <tr>
      <th class="success" scope="col"><center>N°</center></th>
      <th class="success" scope="col"><center>Pais</center></th>
      <th class="success" scope="col"><center>Año 2005</center></th>
      <th class="success" scope="col"><center>Año 2006</center></th>
      <th class="success" scope="col"><center>Año 2007</center></th>
      <th class="success" scope="col"><center>Año 2008</center></th>
      <th class="success" scope="col"><center>Año 2009</center></th>
      <th class="success" scope="col"><center>Año 2010</center></th>
      <th class="success" scope="col"><center>Año 2011</center></th>
      <th class="success" scope="col"><center>Año 2012</center></th>
      <th class="success" scope="col"><center>Año 2013</center></th>
    </tr>
  </thead>
  <%
  	String Tabla=null;
	Tabla=(String)request.getAttribute("Tabla");
  %>
  <%=Tabla%>

</table></center>
</div>

<div >
	<br>
	<br>
	<center><p>Sistemas distribuidos</p></center>
	<br>
	<br>
</div>

</body>
</html>
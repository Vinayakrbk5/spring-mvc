<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Information of Natural Calamities</h1>

<h3 style="color:red">${valid}</h3>

<h3>Fill the following Details</h3>

<form action="welcome.do" method="post">
<pre>
Place : <input type="text" name="place">
Date : <input type="date" name="date">
Captured By : <input type="text" name="capturedBy">
Calamity Type : <select name="calamityType">
					<option value="">----none selected----</option>
					<option value="Flood">Flood</option>
					<option value="Rain">Rain</option>
					<option value="Cyclone">Cyclone</option>
					<option value="Earth quake">Earth quake</option>
                </select>
                
Area : <input type="number" name="area">
Average Loss : <input type="text" name="averageLoss">
No Of Deaths : <input type="number" name="noOfDeaths">
No Of Injured : <input type="number" name="noOfInjured">

<button type="submit">Register</button>
</pre>
</form>



</body>
</html>
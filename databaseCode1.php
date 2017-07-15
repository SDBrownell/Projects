<html>
<h1> This is a database checking script</h1>

<?php
require "pDatabaseConnection.php";
$query="SELECT * FROM `Data`;
$result=$dbc->query($query);
while($row=$result->fetch_assoc()){
	echo "Latitude: ".$row['CoorLat']." : ".$row['CoorLong']."<br>";
}


?>
</html>

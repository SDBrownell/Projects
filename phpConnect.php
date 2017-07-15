<html>
<h1> Data Science Query</h1>

<?php
require "pDatabaseConnection.php";
$query="select positionIndustry, skillName from positionsF inner join skillsF on positionsF.positionID=skillsF.skillID group by positionID";
$result=$dbc->query($query);
$ftimes=array();
while($row=$result->fetch_assoc()){
	echo "Position Industry: ".$row['positionIndustry']."<br>";
	echo "Skill Name: ".$row['skillName']."<br>";
}
var_dump($ftimes);
?>
</html>

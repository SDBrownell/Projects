<html>
<body>
  <?php
  $mytext=$_POST["mytext"];
  $mytext = trim($mytext); # remove training spaces
  $mytext = stripslashes($mytext); #remove backslashes
  $mytext = htmlspecialchars($mytext);
  print $mytext."<br>";

  require "pDatabaseConnection.php";
  //insert query here
  $query="select positionIndustry, skillName from positionsF inner join skillsF on positionsF.positionID=skillsF.skillID group by positionID";
  $result=$dbc->query($query);
  $ftimes=array();
  while($row=$result->fetch_assoc()){
  	//put what you would like to print here after the echo statments
  	//quotes-printed works; brackets-printed varaible values
  	echo "Position Industry: ".$row['positionIndustry']."<br>";
  	echo "Skill Name: ".$row['skillName']."<br>";
  }
  var_dump($ftimes);
   ?>
</body>
</html>

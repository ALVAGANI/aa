<?php
	
	if($_SERVER["REQUEST_METHOD"] == "POST") {
		require 'koneksi.php';
		showPerangkat();
	}

	function showPerangkat() {
		global $con;

		$query = "select * from perangkat;";

		$result = mysqli_query($con, $query);
		$number_of_row = mysqli_num_rows($result);

		$temp_array = array();

		if($number_of_row > 0) {
			while ($row = mysqli_fetch_assoc($result)) {
				$temp_array[] = $row;
			}
		}

		header('Content-Type: application/json');
		echo json_encode(array("perangkat"=>$temp_array));
		mysqli_close($con);
	}







?>
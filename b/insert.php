<?php
	
	if($_SERVER["REQUEST_METHOD"] == "POST") {
		require 'koneksi.php';
		createPerangkat();
	}

	function createPerangkat() {
		global $con;

		$nama = $_POST["nama"];
		$email = $_POST["email"];
		$no_kartu = $_POST["no_kartu"];
		$no_perangkat = $_POST["no_perangkat"];
		$username = $_POST["username"];
		$password = $_POST["password"];

		$query = "insert into perangkat(nama,email,no_kartu,no_perangkat,username,password) values
		 ('$nama','$email','$no_kartu','$no_perangkat','$username','$password');";

		 mysqli_query($con, $query) or die(mysqli_error($con));
		 mysqli_close($con);
	}
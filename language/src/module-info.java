module language {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens Language to javafx.graphics, javafx.fxml;
}

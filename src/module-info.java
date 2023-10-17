module linguistic {
	opens application to javafx.fxml;
	exports application;

	requires java.sql;
	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
}
package application;



import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
/**
* Klasa służąca do obsługi okienek alertów.
* @author Krzysztof Jagodziński
*/
public class AlertBox  {
	private AlertBox() {}
	public static Optional<ButtonType> showAndWait(
			AlertType alertType, 
			String title,
			String content) {
		Alert alert = new Alert(alertType);
		alert.setTitle(title);
		alert.setHeaderText(null);
		alert.setContentText(content);
		return alert.showAndWait();			
	}
}

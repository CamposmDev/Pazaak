package stage;

import app.App;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;
import layout.MainMenu;
import util.ImgUtil;

public class MainStage extends Stage {
	public MainStage() {
		getIcons().add(ImgUtil.loadImg(ImgUtil.ICON_PAZAAK));
		setTitle(App.TITLE);
		setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
		setFullScreen(true);
		setScene(new Scene(new MainMenu()));
	}
}

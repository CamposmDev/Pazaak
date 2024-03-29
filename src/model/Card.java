package model;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import util.FXUtil;

public class Card extends StackPane {
	public static final int WIDTH_OF_CARD = 120;
	public static final int HEIGHT_OF_CARD = 180;
	public static final int ARC_SIZE = 20;
	protected Rectangle r;

	public Card() {
		r = new Rectangle(WIDTH_OF_CARD, HEIGHT_OF_CARD, FXUtil.loadLg(null));
		r.setStroke(Color.BLACK);
		r.setStrokeWidth(1.5);
		r.setArcWidth(ARC_SIZE);
		r.setArcHeight(ARC_SIZE);
		getChildren().add(r); // Add Background of Card
	}
}

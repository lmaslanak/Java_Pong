package lab;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import lab.Game;

public class DrawingThread extends AnimationTimer {

	private final Canvas canvas;
	private final GraphicsContext gc;

	public DrawingThread(Canvas canvas) {
		this.canvas = canvas;
		this.gc = canvas.getGraphicsContext2D();
	}

	/**
	  * Draws objects into the canvas. Put you code here. 
	 */
	@Override
	public void handle(long now) {
		// vykresleni herni plochy
		gc.setFill(Color.BLACK);
		gc.fillRect(0, 0, Game.PLAYGROUND_WIDTH, Game.PLAYGROUND_HEIGHT);
		gc.setStroke(Color.LIGHTGRAY);
		gc.setFill(Color.LIGHTGRAY);
        gc.setLineWidth(20);
        
        // vykrelseni horni a spodni sede cary
        gc.strokeLine(0 , 10 , Game.PLAYGROUND_WIDTH, 10);
        gc.strokeLine(0, Game.PLAYGROUND_HEIGHT - 10, Game.PLAYGROUND_WIDTH, Game.PLAYGROUND_HEIGHT - 10);
        gc.setLineWidth(20);
        
        // vykresleni prerusovane cary
        int y1=60;
        int y2=40;
        for (int i = 40; i < Game.PLAYGROUND_HEIGHT;  i++) {
        	  gc.strokeLine(Game.PLAYGROUND_WIDTH / 2, y1, Game.PLAYGROUND_WIDTH / 2, y2);
        	 i = i + 70;
        	 y1 = y1 + 70;
        	 y2 = y2 + 70;        	 
        	}
  		
		// vykresleni palek, micku, score
		gc.fillRect(Bat.PLAYER1_POSX, Bat.PLAYER_POSY1, Bat.PLAYER_WIDTH, Bat.PLAYER_HEIGHT);
		gc.fillRect(Bat.PLAYER2_POSX, Bat.PLAYER_POSY2, Bat.PLAYER_WIDTH, Bat.PLAYER_HEIGHT);
		gc.fillRect(Ball.BALL_POSX, Ball.BALL_POSY, Ball.BALL_R, Ball.BALL_R);
		
		//vykresleni score
        gc.setFont(Font.font(100));
        gc.setTextAlign(TextAlignment.CENTER);
		gc.fillText(Game.SCORE1 + "\t" + Game.SCORE2, Game.PLAYGROUND_WIDTH /2, 200);

	}

	public Canvas getCanvas() {
		return canvas;
	}

	public GraphicsContext getGc() {
		return gc;
	}

}

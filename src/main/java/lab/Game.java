package lab;



public class Game  {
	static final int PLAYGROUND_WIDTH = 800;
	static final int PLAYGROUND_HEIGHT = 600;
	///score
	 static int SCORE1 = 0;
	 static int SCORE2 = 0;


	public void game () {
		


		
		// odraz micku od zdi		
		if(Ball.BALL_POSY > PLAYGROUND_HEIGHT-30 || Ball.BALL_POSY < 20) 
			{
			Ball.BALL_SPEEDY = Ball.BALL_SPEEDY * -1;
			}
		
		if(Ball.BALL_POSX > PLAYGROUND_WIDTH -10 || Ball.BALL_POSX < 0)
			{
			Ball.BALL_SPEEDX = Ball.BALL_SPEEDX * -1;
			}
		
		// odraz micku o palku
		if( ((Ball.BALL_POSX + Ball.BALL_R > Bat.PLAYER2_POSX) && Ball.BALL_POSY >= Bat.PLAYER_POSY2 && Ball.BALL_POSY <= Bat.PLAYER_POSY2 + Bat.PLAYER_HEIGHT) || 
				((Ball.BALL_POSX < Bat.PLAYER1_POSX + Bat.PLAYER_WIDTH) && Ball.BALL_POSY >= Bat.PLAYER_POSY1 && Ball.BALL_POSY <= Bat.PLAYER_POSY1 + Bat.PLAYER_HEIGHT))
			{
			Ball.BALL_SPEEDX = Ball.BALL_SPEEDX * -1;
			}



	}
}

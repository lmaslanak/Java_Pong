package lab;
import lab.Game;


public class Ball  {
	
	// výchozi pozice mice
	static int BALL_POSX = Game.PLAYGROUND_WIDTH / 3;
	static int BALL_POSY = Game.PLAYGROUND_HEIGHT / 2;
	//prumer mice
	static final double BALL_R = 15;
	// nastaveni rychlosti mice
	static int BALL_SPEEDY = 5;
	static int BALL_SPEEDX = 5;




	public void ball () {
		

		BALL_POSX = BALL_POSX + BALL_SPEEDX;
		BALL_POSY = BALL_POSY + BALL_SPEEDY;
		
		// odraz micku od zdi		
		if(BALL_POSY > Game.PLAYGROUND_HEIGHT-30 || BALL_POSY < 20) 
			{
			BALL_SPEEDY = BALL_SPEEDY * -1;
			}
		
		if(BALL_POSX > Game.PLAYGROUND_WIDTH -10 || BALL_POSX < 0)
			{
			BALL_SPEEDX = BALL_SPEEDX * -1;
			}
		
		// odraz micku o palku
		if( ((BALL_POSX + BALL_R > Bat.PLAYER2_POSX) && BALL_POSY >= Bat.PLAYER_POSY2 && BALL_POSY <= Bat.PLAYER_POSY2 + Bat.PLAYER_HEIGHT) || 
				((BALL_POSX < Bat.PLAYER1_POSX + Bat.PLAYER_WIDTH) && BALL_POSY >= Bat.PLAYER_POSY1 && BALL_POSY <= Bat.PLAYER_POSY1 + Bat.PLAYER_HEIGHT))
			{
			BALL_SPEEDX = BALL_SPEEDX * -1;
			}

		


	}
}

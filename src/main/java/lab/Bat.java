package lab;



public class Bat  {
	
	// velikost palky
	final static int PLAYER_HEIGHT = 150;
	final static int PLAYER_WIDTH = 20;
	
	// výchozi pozice hracu
	 static int PLAYER1_POSX = PLAYER_WIDTH;
	 static int PLAYER2_POSX = Game.PLAYGROUND_WIDTH - (2 * PLAYER_WIDTH);	
	static double PLAYER_POSY1 = Game.PLAYGROUND_HEIGHT / 3;
	static double PLAYER_POSY2 = Game.PLAYGROUND_HEIGHT / 3;




	public void bat () {
		


		
		// odraz micku od zdi		
		if(Ball.BALL_POSY > Game.PLAYGROUND_HEIGHT-30 || Ball.BALL_POSY < 20) 
			{
			Ball.BALL_SPEEDY = Ball.BALL_SPEEDY * -1;
			}
		
		if(Ball.BALL_POSX > Game.PLAYGROUND_WIDTH -10 || Ball.BALL_POSX < 0)
			{
			Ball.BALL_SPEEDX = Ball.BALL_SPEEDX * -1;
			}
		
		
		// sledovani micku druhou palkou
		PLAYER_POSY2 = Ball.BALL_POSY - PLAYER_HEIGHT / 2;
		PLAYER_POSY1 = Ball.BALL_POSY - PLAYER_HEIGHT / 2;
		
		


	}
}

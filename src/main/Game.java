package main;

import java.util.Random;

import gameLogic.CheckIfPossible;
import gameLogic.ScoreManager;
import display.Display;
import display.Textures;

public class Game {
	public static volatile int key=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Textures.initialize();
		int Mat[][];
		Mat = new int[4][4];
		ScoreManager scoreManager = new ScoreManager();
		Display d=new Display();
		Random r = new Random();
		Mat[Math.abs(r.nextInt())%4][Math.abs(r.nextInt())%4] = 2;
		Mat[Math.abs(r.nextInt())%4][Math.abs(r.nextInt())%4] = 2;
		d.Update(Mat);
		while(true)
		{
		
			if(key > 0)
			{
			int deltaScore=0;
			if(key==1)
				deltaScore=gameLogic.OnMovement.onUp(Mat);
			if(key==2)
				deltaScore=gameLogic.OnMovement.onDown(Mat);
			if(key==3)
				deltaScore=gameLogic.OnMovement.onRight(Mat);
			if(key==4)
				deltaScore=gameLogic.OnMovement.onLeft(Mat);
			if(deltaScore == -1)
			{
				key=0;
				continue;
			}
			scoreManager.UpdateScore(d, deltaScore);
			if(CheckIfPossible.Possible(Mat))
			{
				int counter = 0;
				for(int i=0;i<4;++i)
					for(int j=0;j<4;++j)
					{
						if(Mat[i][j]==0)
						{
							counter++;
						}
					}
				int position = Math.abs(r.nextInt())%(counter);
				if(counter > 0 )
				{
					for(int i=0;i<4;++i)
						for(int j=0;j<4&&position>=0;++j)
						{
							if(Mat[i][j]==0)
							{
								if(position == 0)
								{Mat[i][j] = (Math.abs(r.nextInt())%100)>90?4:2;
								position--;
								break;
								} 
								position--;
								
								
									
							}
						}
				}

				if(!CheckIfPossible.Possible(Mat))
				{
					System.out.println("Game Over !!");
				}
				
					
			}
			else 
				{

				System.out.println("Game Over !!");
				}
			d.Update(Mat);
			key = 0;
			}
			

			
		}
		
	}

}

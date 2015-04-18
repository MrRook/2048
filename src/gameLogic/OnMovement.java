package gameLogic;

public class OnMovement {
	public static int onLeft(int Mat[][])
	{
		int deltaScore = 0;
		boolean somethingHappened = false;
		for(int i=0;i<4;++i) //row
		{
			for(int j=0;j<4;++j) // column
			{
				if(Mat[i][j]!=0)
				{
					
					int k;
					for( k=j+1;k<4;++k)
					{
						if(Mat[i][k]!=0)
						{
							break;
						}
							
					}
					if(k==4)
						continue;
					if(Mat[i][k]!=Mat[i][j])
						continue;

						somethingHappened=true;
						Mat[i][j] *=2;
						deltaScore+=Mat[i][j];
						Mat[i][k] = 0;
								
				     
					
				}
				else
				{
					int k;
					for( k=j+1;k<4;++k)
					{
						if(Mat[i][k]>0)
						{
							break;
						}
							
					}
					if(k==4)
						break;
					somethingHappened=true;
					Mat[i][j] = Mat[i][k];
					Mat[i][k] = 0;
					j--;
					continue;

					
				}
			}
			// adjusting the paddings
			
		}
		if(somethingHappened==true)
		    return deltaScore;
		else 
			return -1;
		
	}
	public static int onRight(int Mat[][])
	{
		int deltaScore = 0;
		boolean somethingHappened = false;
		for(int i=0;i<4;++i) //row
		{
			for(int j=3;j>=0;--j) // column
			{
				if(Mat[i][j]!=0)
				{
					
					int k;
					for( k=j-1;k>=0;--k)
					{
						if(Mat[i][k]!=0)
						{
							break;
						}
							
					}
					if(k==-1)
						continue;
					if(Mat[i][k]!=Mat[i][j])
						continue;

						somethingHappened=true;
						Mat[i][j] *=2;
						deltaScore+=Mat[i][j];
						Mat[i][k] = 0;
								
				     
					
				}
				else
				{
					int k;
					for( k=j-1;k>=0;--k)
					{
						if(Mat[i][k]>0)
						{
							break;
						}
							
					}
					if(k==-1)
						break;
					somethingHappened=true;
					Mat[i][j] = Mat[i][k];
					Mat[i][k] = 0;
					j++;
					continue;

					
				}
			}
			// adjusting the paddings
			
		}
		if(somethingHappened==true)
		    return deltaScore;
		else 
			return -1;
		
	}
	public static int onDown(int Mat[][])
	{
		int deltaScore = 0;
		boolean somethingHappened = false;
		for(int i=0;i<4;++i) //column
		{
			for(int j=3;j>=0;--j) // row
			{
				if(Mat[j][i]!=0)
				{
					
					int k;
					for( k=j-1;k>=0;--k)
					{
						if(Mat[k][i]!=0)
						{
							break;
						}
							
					}
					if(k==-1)
						continue;
					if(Mat[k][i]!=Mat[j][i])
						continue;
					//System.out.println("j = "+j+" i="+i+" k="+k);
						somethingHappened=true;
						Mat[j][i] *=2;
						deltaScore+=Mat[j][i];
						Mat[k][i] = 0;
								
				     
					
				}
				else
				{
					int k;
					for( k=j-1;k>=0;--k)
					{
						if(Mat[k][i]>0)
						{
							break;
						}
							
					}
					if(k==-1)
						break;
					somethingHappened=true;
					Mat[j][i] = Mat[k][i];
					Mat[k][i] = 0;
					j++;
					continue;

					
				}
			}
			// adjusting the paddings
			
		}
		if(somethingHappened==true)
		    return deltaScore;
		else 
			return -1;
		
	}
	public static int onUp(int Mat[][])
	{
		int deltaScore = 0;
		boolean somethingHappened = false;
		for(int i=0;i<4;++i) //column
		{
			for(int j=0;j<4;++j) // row
			{
				if(Mat[j][i]!=0)
				{
					
					int k;
					for( k=j+1;k<4;++k)
					{
						if(Mat[k][i]!=0)
						{
							break;
						}
							
					}
					if(k==4)
						continue;
					if(Mat[k][i]!=Mat[j][i])
						continue;

						somethingHappened=true;
						Mat[j][i] *=2;
						deltaScore+=Mat[j][i];
						Mat[k][i] = 0;
								
				     
					
				}
				else
				{
					int k;
					for( k=j+1;k<4;++k)
					{
						if(Mat[k][i]>0)
						{
							break;
						}
							
					}
					if(k==4)
						break;
					somethingHappened=true;
					Mat[j][i] = Mat[k][i];
					Mat[k][i] = 0;
					j--;
					continue;

					
				}
			}
			// adjusting the paddings
			
		}
		if(somethingHappened==true)
		    return deltaScore;
		else 
			return -1;

		
	}

}

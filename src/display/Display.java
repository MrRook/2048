package display;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Display {
	public JFrame MainWindow;
	public JPanel GridArea;
	public JPanel MainPanel;
	public Grid[][] DisplayBlocks;
	public JLabel Score;
	public Display(){

		DisplayBlocks = new Grid[4][4];
		for(int i=0;i<4;++i)
		{
			for(int j=0;j<4;++j)
			{
			DisplayBlocks[j][i] = new Grid();			
			DisplayBlocks[j][i].setSize(100,100);
			DisplayBlocks[j][i].img = Textures.getTexture(0);
			DisplayBlocks[j][i].setBounds(i*100 +5*i , j*100 +5*j+30, 100,100);
			}
		}
		MainWindow = new JFrame();
		MainWindow.setSize(420, 520);
		MainPanel = new JPanel();
		MainWindow.setLayout(new BorderLayout());
		MainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridArea = new JPanel();
		GridArea.setSize(400,400);
		GridArea.setLayout(null);
		for(int i=0;i<4;++i)
		{
			for(int j=0;j<4;++j)
			{
				GridArea.add(DisplayBlocks[i][j]);
			}
			
		}
		Score = new JLabel("     Score : 0");
		Score.setFont(new Font("", Font.BOLD, 20));
		MainPanel.add(new JLabel("          "));
		MainPanel.add(Score);
		
	
		MainPanel.setLayout(new BoxLayout(MainPanel, BoxLayout.Y_AXIS));
		MainWindow.addKeyListener(new handlers.InputHandler());
		MainPanel.add(GridArea);
		MainWindow.setResizable(false);
		MainWindow.add(MainPanel);
		MainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainWindow.setVisible(true);
	        
		
		
		
	}
	public void Update(int Mat[][])
	{
		for(int i=0;i<4;++i)
			for(int j=0;j<4;++j)
			{
	
				DisplayBlocks[i][j].img = Textures.getTexture(Mat[i][j]);
				DisplayBlocks[i][j].repaint();
			
				
			}
		
	}

}

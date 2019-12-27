import java.awt.Color;
import java.awt.color.*;
public class Loopy {
	public static void main(String[] args)
	{
		World w = new World(1000,1000);
		Turtle gerald = new Turtle(w);
		Picture p = new Picture("SWAGDADDY.png");
		gerald.penUp();
		gerald.forward(100);
		gerald.hide();
		int pWidth = 10;
		for(int c=0; c<1000000000; c++)
		{
			int random = 1 + (int)(Math.random() * ((100 - 1) + 1));
			int color = 1 + (int)(Math.random() * ((8 - 1) + 1));
			gerald.setPenWidth(pWidth);
			gerald.forward(1);
			pWidth--;
			if(pWidth >= 0)
			{
				gerald.setPenWidth(pWidth);
			}else{
				pWidth = 10;
				gerald.turn(1);
				gerald.backward(1);
				gerald.drop(p);
			}
			if(color == 1)
			{
				gerald.setPenColor(Color.MAGENTA);
			}else{
				if(color == 2){
					gerald.setPenColor(Color.BLUE);
				}else{
					if(color == 3){
						gerald.setPenColor(Color.RED);
					}else{
						if(color == 4){
							gerald.setPenColor(Color.GREEN);
						}else{
							if(color == 5){
								gerald.setPenColor(Color.CYAN);
							}else{
								if(color == 6){
									gerald.setPenColor(Color.PINK);
								}
									if(color == 7){
										gerald.setPenColor(Color.YELLOW);
										}else{
											if(color == 8){
											gerald.setPenColor(Color.ORANGE);
									}
								}
							}
						}
					}
				}
			}
			
		}
		
	}
}

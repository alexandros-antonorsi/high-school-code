//Alexandros Antonorsi
//August 28th 2015
//Period 3
import java.awt.Color;
import java.awt.color.*;
public class TurtleDesign {
	public static void main(String[] args)
	{
		World w = new World(1000,1000);
		Turtle gerald = new Turtle(w);
		Picture a = new Picture("A.png");
		Picture l = new Picture("L.png");
		Picture e = new Picture("E.png");
		Picture x = new Picture("X.png");
		Picture a2 = new Picture("A2.png");
		Picture n = new Picture("N.png");
		Picture d = new Picture("D.png");
		Picture r = new Picture("R.png");
		Picture o = new Picture("O.png");
		Picture s = new Picture("S.png");
		int picture = 1;
		for(int c=0; c<10; c++)
		{
			
			int random = 1 + (int)(Math.random() * ((30 - 20) + 1));
			int color = 1 + (int)(Math.random() * ((8 - 1) + 1));	
			gerald.setPenWidth(random);
			gerald.forward(150);
			if(picture == 1){
				gerald.drop(a);
			}else{
				if(picture == 2){
					gerald.drop(l);
				}else{
					if(picture == 3){
						gerald.drop(e);
					}else{
						if(picture == 4){
							gerald.drop(x);
						}else{
							if(picture == 5){
								gerald.drop(a2);
							}else{
								if(picture == 6){
									gerald.drop(n);
								}else{
									if(picture == 7){
										gerald.drop(d);
									}else{
										if(picture == 8){
											gerald.drop(r);
										}else{
											if(picture == 9){
												gerald.drop(o);
											}else{
												if(picture == 10){
													gerald.drop(s);
												}else{
													
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
			gerald.turn(36);
			gerald.backward(50);
			picture++;
			
			
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
									}else{
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
		gerald.penUp();
		gerald.backward(100);
		gerald.penDown();
		for(int z=0; z<100; z++){
			
			int random = 1 + (int)(Math.random() * ((30 - 20) + 1));
			int color = 1 + (int)(Math.random() * ((8 - 1) + 1));
			gerald.setPenWidth(random);
			gerald.forward(400);
			gerald.turn(100);
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
									}else{
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
			gerald.hide();
			
		}
		
	}


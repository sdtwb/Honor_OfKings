package honorOfKings;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
 * 
 * @author 谭文彪
 *用于打印地图与改变英雄的位置
 */
public class Maps {
	/**
	 * 地图的存储
	 */
      StringBuffer [] maps= new StringBuffer[50]; 
//函数区	------------------------------------------------------------------------------
	
//地图框架	----------------------------地图的框架
   /**
    * 地图的框架
    */
	public void Mapsconstruct() {
		
		        for(int i= 0; i< 50; i++)
		        	 maps[i]= new StringBuffer("");
		        String path= "./src/images/微信截图_20181022122547.png";
		        try {
		            BufferedImage bufferedImage = null;
					//获取图像资源，转成BufferedImage对象
		        	//Graphics2D gs = bufferedImage.createGraphics();
		            BufferedImage bimg = ImageIO.read(new File(path));
		            //创建一个二维数组，用来存放图像每一个像素位置的颜色值
		          int[][] data = new int[bimg.getWidth()][bimg.getHeight()];
		            //String [] data= new String[bimg.getWidth()];
		            //以高度为范围，逐列扫描图像，存进数组对应位置
		            for (int i = 0; i < bimg.getWidth(); i++) {
		                for (int j = 0; j < bimg.getHeight(); j++) {
		                    data[i][j] = bimg.getRGB(i, j);//得到的是sRGB值，4字节
		                }
		       
		            }
		            //将数组旋转90°输出，实现逐行输出图像
		            for (int i = 0; i < bimg.getHeight(); i++) {
		                for (int j = 0; j < bimg.getWidth(); j++) {
		                    if (data[j][i] != -1) {//有颜色输出
		                        //System.out.print("**");
		                        maps[i].append("**");
		                    	
		                    } else {            //无颜色输出
		                       // System.out.print("  ");
		                    	maps[i].append("  ");
		                    }
		                }
		               
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    

	}

	

	
//改变英雄的位置----------------------改变英雄的位置
	/**
	 * 改变英雄的位置
	 * @param operate 操作命令
	 * @param herro 操作的英雄
	 * @param x 英雄的X坐标
	 * @param y 英雄的Y坐标
	 */
	public void changPosition(String operate, char herro, int x, int y) {
		
    	if(operate.equals("Up")){
    		maps[x].setCharAt(y, ' ');
    		maps[x-1].setCharAt(y, herro);
    	}
    	else if(operate.equals("Down")){
    		maps[x].setCharAt(y, ' ');
    		maps[x+1].setCharAt(y, herro);
    		//System.out.print("herro");
    	}
    	else if(operate.equals("Right")){
    		maps[x].setCharAt(y, ' ');
    		maps[x].setCharAt(y+ 1, herro);
    	}
    	else if(operate.equals("Left")){
    		
    		maps[x].setCharAt(y, ' ');
    		maps[x].setCharAt(y- 1, herro);
    	}
	}
	
//初始英雄位置------------------------初始英雄位置
	/**
	 * 初始英雄的位置
	 * @param x 英雄的X坐标
	 * @param y 英雄的Y坐标
	 * @param herroName 英雄的名字
	 */
	public void initPosition(int x, int y, char herroName) {

		maps[x].setCharAt(y, herroName);

	}
	
//输出地图现在的状态----------------------输出地图现在的状态
	/**
	 * 输出地图的现在的状态
	 */
	public void displayMaps() {
		
		//-------------------------------地图
        for(int i= 0; i<= 35; i++) {
        	System.out.println(maps[i]);
        }
        
	}
	
//--------------------------------------------清空屏幕
	/**
	 * 清空屏幕
	 */
	public void MapsClear() {

		   try {
				
				
					Robot r = new Robot();
					r.mousePress(InputEvent.BUTTON3_DOWN_MASK);		//按下鼠标右键
					r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);	//释放鼠标右键
					r.keyPress(KeyEvent.VK_CONTROL);				//按下Ctrl键
					r.keyPress(KeyEvent.VK_R);						//按下R键
					r.keyRelease(KeyEvent.VK_R);					//释放R键
					r.keyRelease(KeyEvent.VK_CONTROL);				//释放Ctrl键
					r.delay(100);
				
	
		   }
		   catch (AWTException e) {
			   e.printStackTrace();
			 }

	}
	/**
	 * 英雄发出攻击
	 * @param operate 操作命令
	 * @param x 英雄的X坐标
	 * @param y 英雄的Y坐标
	 */
	public void MapsAttack(String operate, int x, int y) {
		   if(operate.contains("Up")) {
			   
			   
			  
			   if(maps[x- 1].charAt(y)== ' ') {

				   int posX= x;
				   int flag= 0;
				   while(maps[posX- 1].charAt(y)== ' ') {
					   
					  if(flag!= 0)
					   maps[posX].setCharAt(y, ' ');
					   maps[posX- 1].setCharAt(y, '@');
					   posX--;
					  flag++;
					   //MapsClear();
					   try {
						   Thread.sleep(500);
					   }
					   catch(Exception e) {
						   
					   }
					   displayMaps();
				   }
				   maps[posX].setCharAt(y, ' ');
			   }
		   }
		   else if(operate.contains("Down")) {
			   
			   if(maps[x+ 1].charAt(y)== ' ') {
				  
				   int posX= x;
				   int flag= 0;
				   while(maps[posX+ 1].charAt(y)== ' ') {
					   
					   if(flag!= 0)
					   maps[posX].setCharAt(y, ' ');
					   maps[posX+ 1].setCharAt(y, '@');
					   posX++;
					   flag++;
					   //MapsClear();
					   try {
						   Thread.sleep(500);
					   }
					   catch(Exception e) {
						   
					   }
					   displayMaps();
				   }
				   maps[posX].setCharAt(y, ' ');
			   }
		   }
		   else if(operate.contains("Left")) {
			  
			   if(maps[x].charAt(y- 1)== ' ') {

				   int posY= y;
				   int flag= 0;
				   while(maps[x].charAt(posY- 1)== ' ') {
					   if(flag!= 0)
					   maps[x].setCharAt(posY, ' ');
					   maps[x].setCharAt(posY- 1, '@');
					   posY--;
					   flag++;
					   //MapsClear();
					   try {
						   Thread.sleep(200);
					   }
					   catch(Exception e) {
						   
					   }
					   displayMaps();
				   }
				   maps[x].setCharAt(posY, ' ');
			   }			   
		   }
		   else if(operate.contains("Right")) {
			   
			   int posY= y;
			   int flag= 0;
			   while(maps[x].charAt(posY+ 1)== ' ') {
				   if(flag!= 0)
				   maps[x].setCharAt(posY, ' ');
				   maps[x].setCharAt(posY+ 1, '@');
				   posY++;
				   flag++;
				   //MapsClear();
				   try {
					   Thread.sleep(500);
				   }
				   catch(Exception e) {
					   
				   }
				   displayMaps();
			   }
			   maps[x].setCharAt(posY, ' ');
		   }
	}
//函数区----------------------------------------------------------------------------
	
//------------------------------------------------------地图控制区
	/**
	 * 地图控制函数
	 */
    public void Mapsmain() {
    	
    	
    	Mapsconstruct();
    	
    }


}

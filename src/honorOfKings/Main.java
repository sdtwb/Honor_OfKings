package honorOfKings;

import java.util.Scanner;
import java.io.*;
//import javax.imageio.*;
import java.awt.*;
import java.awt.AWTException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.JComponent;
import javax.imageio.ImageIO;
//import java.awt.Graphics2D;
/**
 * 
 * @author Tanwenbiao
 *
 */
public class Main extends JFrame{

	
	
//---------------------------------------------------------------函数区


	//--------------------------------清空屏幕
	   void clear() {

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
//----------------------------------------------------------------函数区
	/**
	 * 王者荣耀辣鸡版
	 * @param args  无说明
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
       Scanner scanner= new Scanner(System.in);
       Main main= new Main();
       Battle battle= new Battle();
       battle.battleMain();
       
       System.out.println("请输入连续的命令集：\n");

       while(true){
    	  
    	   //------------------------延迟输入
    	   try {
    		   Thread.sleep(200);
    		   
    		   } 
    	   catch (Exception e) { 
    		   
    	   }
    		   
       
    	   String operate= scanner.next();//输入命令名字
    	   int herro= scanner.nextInt();//输入英雄的编号
    	   int attack= scanner.nextInt();//输入英雄的攻击力
    	   
    	   //main.clear();
    	   battle.recieveImput(operate, herro);
    	   battle.displayMaps();
    	   
    	   
       }

	}

}

package honorOfKings;

import java.util.*;
import java.io.*;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
/**
 * 
 * @author Tanwenbiao
 *
 */
public class Main {

	
	
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
       
       
       while(true){
    	  
    	   //------------------------延迟输入
    	   try {
    		   Thread.sleep(500);
    		   //System.out.println("love");
    		   } 
    	   catch (InterruptedException e) { 
    		   
    	   }
    		   
       
    	   String operate= scanner.next();
    	   int herro= scanner.nextInt();
    	   int attack= scanner.nextInt();
    	    main.clear();
    	   battle.recieveImput(operate, herro);
    	   battle.displayMaps();
    	   
    	   
       }

	}

}

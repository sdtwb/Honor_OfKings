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

	
	
//---------------------------------------------------------------������

	//--------------------------------�����Ļ
	   void clear() {

		   try {
				
				
					Robot r = new Robot();
					r.mousePress(InputEvent.BUTTON3_DOWN_MASK);		//��������Ҽ�
					r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);	//�ͷ�����Ҽ�
					r.keyPress(KeyEvent.VK_CONTROL);				//����Ctrl��
					r.keyPress(KeyEvent.VK_R);						//����R��
					r.keyRelease(KeyEvent.VK_R);					//�ͷ�R��
					r.keyRelease(KeyEvent.VK_CONTROL);				//�ͷ�Ctrl��
					r.delay(100);
				
	
		   }
		   catch (AWTException e) {
			   e.printStackTrace();
			 }

	}
//----------------------------------------------------------------������
	/**
	 * ������ҫ������
	 * @param args  ��˵��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
       Scanner scanner= new Scanner(System.in);
       Main main= new Main();
       Battle battle= new Battle();
       battle.battleMain();
       
       
       while(true){
    	  
    	   //------------------------�ӳ�����
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

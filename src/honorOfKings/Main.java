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
       
       System.out.println("�����������������\n");

       while(true){
    	  
    	   //------------------------�ӳ�����
    	   try {
    		   Thread.sleep(200);
    		   
    		   } 
    	   catch (Exception e) { 
    		   
    	   }
    		   
       
    	   String operate= scanner.next();//������������
    	   int herro= scanner.nextInt();//����Ӣ�۵ı��
    	   int attack= scanner.nextInt();//����Ӣ�۵Ĺ�����
    	   
    	   //main.clear();
    	   battle.recieveImput(operate, herro);
    	   battle.displayMaps();
    	   
    	   
       }

	}

}

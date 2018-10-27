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
 * @author ̷�ı�
 *���ڴ�ӡ��ͼ��ı�Ӣ�۵�λ��
 */
public class Maps {
	/**
	 * ��ͼ�Ĵ洢
	 */
      StringBuffer [] maps= new StringBuffer[50]; 
//������	------------------------------------------------------------------------------
	
//��ͼ���	----------------------------��ͼ�Ŀ��
   /**
    * ��ͼ�Ŀ��
    */
	public void Mapsconstruct() {
		
		        for(int i= 0; i< 50; i++)
		        	 maps[i]= new StringBuffer("");
		        String path= "./src/images/΢�Ž�ͼ_20181022122547.png";
		        try {
		            BufferedImage bufferedImage = null;
					//��ȡͼ����Դ��ת��BufferedImage����
		        	//Graphics2D gs = bufferedImage.createGraphics();
		            BufferedImage bimg = ImageIO.read(new File(path));
		            //����һ����ά���飬�������ͼ��ÿһ������λ�õ���ɫֵ
		          int[][] data = new int[bimg.getWidth()][bimg.getHeight()];
		            //String [] data= new String[bimg.getWidth()];
		            //�Ը߶�Ϊ��Χ������ɨ��ͼ�񣬴�������Ӧλ��
		            for (int i = 0; i < bimg.getWidth(); i++) {
		                for (int j = 0; j < bimg.getHeight(); j++) {
		                    data[i][j] = bimg.getRGB(i, j);//�õ�����sRGBֵ��4�ֽ�
		                }
		       
		            }
		            //��������ת90�������ʵ���������ͼ��
		            for (int i = 0; i < bimg.getHeight(); i++) {
		                for (int j = 0; j < bimg.getWidth(); j++) {
		                    if (data[j][i] != -1) {//����ɫ���
		                        //System.out.print("**");
		                        maps[i].append("**");
		                    	
		                    } else {            //����ɫ���
		                       // System.out.print("  ");
		                    	maps[i].append("  ");
		                    }
		                }
		               
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    

	}

	

	
//�ı�Ӣ�۵�λ��----------------------�ı�Ӣ�۵�λ��
	/**
	 * �ı�Ӣ�۵�λ��
	 * @param operate ��������
	 * @param herro ������Ӣ��
	 * @param x Ӣ�۵�X����
	 * @param y Ӣ�۵�Y����
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
	
//��ʼӢ��λ��------------------------��ʼӢ��λ��
	/**
	 * ��ʼӢ�۵�λ��
	 * @param x Ӣ�۵�X����
	 * @param y Ӣ�۵�Y����
	 * @param herroName Ӣ�۵�����
	 */
	public void initPosition(int x, int y, char herroName) {

		maps[x].setCharAt(y, herroName);

	}
	
//�����ͼ���ڵ�״̬----------------------�����ͼ���ڵ�״̬
	/**
	 * �����ͼ�����ڵ�״̬
	 */
	public void displayMaps() {
		
		//-------------------------------��ͼ
        for(int i= 0; i<= 35; i++) {
        	System.out.println(maps[i]);
        }
        
	}
	
//--------------------------------------------�����Ļ
	/**
	 * �����Ļ
	 */
	public void MapsClear() {

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
	/**
	 * Ӣ�۷�������
	 * @param operate ��������
	 * @param x Ӣ�۵�X����
	 * @param y Ӣ�۵�Y����
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
//������----------------------------------------------------------------------------
	
//------------------------------------------------------��ͼ������
	/**
	 * ��ͼ���ƺ���
	 */
    public void Mapsmain() {
    	
    	
    	Mapsconstruct();
    	
    }


}

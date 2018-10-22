package honorOfKings;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Maps {
	
      StringBuffer [] maps= new StringBuffer[50]; 
//������	------------------------------------------------------------------------------
	
//��ͼ���	----------------------------��ͼ�Ŀ��
      /**
       * ����ͼ
       */
//	public void constructMaps() {
//
//	    //---------------------��ͼԪ�صĳ�ʼ��
//		maps[0]= new StringBuffer("-----------------------------------------------------------------------------------------------------------------------------");
//        maps[35]= new StringBuffer("-----------------------------------------------------------------------------------------------------------------------------"); 
//        for(int i= 1; i< 35; i++) {
//        	maps[i]= new StringBuffer("|                                                                                                                           |");
//        }
//        
//        //----------------------��ʼ��Ӣ�۵ĳ�����
//        paintBirthPlace();
//        
//        //----------------------��ʼ���ϰ���--��ߵ�
//        paintBlock(5, 45);
//        paintBlock(14, 25);
//        paintBlock(23, 15);
//        
//        //----------------------��ʼ���ϰ���--�ұߵ�
//        paintBlock(5,92);
//        paintBlock(14,80);
//        paintBlock(23,60);
//        
//       
//        
//	}
	
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
	
//��Ӣ�۵ĳ�������-------------------------��Ӣ�۵ĳ�������
//	public void paintBirthPlace() {
//
//		//----------------���Ϸ�Ӣ�۵ĳ�����
//		for(int i= 1; i< 4; i++)
//		  maps[i].setCharAt(14, '|');
//		for(int i= 1; i<= 14; i++)
//			maps[4].setCharAt(i, '-');
//	   
//		//-----------------���Ϸ�Ӣ�۵ĳ�����
//		for(int i= 32; i< 35; i++)
//			 maps[i].setCharAt(110, '|');
//		for(int i= 110; i< 124; i++)
//			 maps[31].setCharAt(i, '-');
//
//	}
	
//���ϰ���-----------------------------------���ϰ���
	void paintBlock(int x, int y) {
		
		//---------------���ϰ���Ŀ� '|'
		 for(int i= x; i< x+ 6; i++)  {
			 maps[i].setCharAt(y, '|'); 
			 maps[i].setCharAt(y+15, '|');
		 }
		 
		 //--------------���ϰ���ĳ� '-'
		 for(int i= y; i<= y+ 15; i++) {
			 maps[x].setCharAt(i, '-');
			 maps[x+ 6].setCharAt(i, '-');
		 }
			
	}
	
//�ı�Ӣ�۵�λ��----------------------�ı�Ӣ�۵�λ��
	
	void changPosition(String operate, char herro, int x, int y) {
		
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
	void initPosition(int x, int y, char herroName) {

		maps[x].setCharAt(y, herroName);

	}
	
//�����ͼ���ڵ�״̬----------------------�����ͼ���ڵ�״̬
	void displayMaps() {
		
		//-------------------------------��ͼ
        for(int i= 0; i<= 35; i++) {
        	System.out.println(maps[i]);
        }
        
	}
	
//--------------------------------------------�����Ļ
	void MapsClear() {

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
	
	void MapsAttack(String operate, int x, int y) {
		   if(operate.contains("Up")) {
			   
			   
			  
			   if(maps[x- 1].charAt(y)== ' ') {
//				   maps[x- 1].setCharAt(y, '@');
//				   displayMaps();
				   
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
//				   maps[x+ 1].setCharAt(y, '@');
//				  displayMaps();
				  
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
//				   maps[x].setCharAt(y- 1, '@');
//				   System.out.println("aaaaaaaaaaaaaaa");
				   
				   
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
    public void Mapsmain() {
    	
    	
    	Mapsconstruct();
    	
    }


}

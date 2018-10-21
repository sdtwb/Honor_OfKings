package honorOfKings;

public class Maps {
	
      StringBuffer [] maps= new StringBuffer[40]; 
//������	------------------------------------------------------------------------------
	
//��ͼ���	----------------------------��ͼ�Ŀ��
      /**
       * ����ͼ
       */
	public void constructMaps() {

	    //---------------------��ͼԪ�صĳ�ʼ��
		maps[0]= new StringBuffer("-----------------------------------------------------------------------------------------------------------------------------");
        maps[35]= new StringBuffer("-----------------------------------------------------------------------------------------------------------------------------"); 
        for(int i= 1; i< 35; i++) {
        	maps[i]= new StringBuffer("|                                                                                                                           |");
        }
        
        //----------------------��ʼ��Ӣ�۵ĳ�����
        paintBirthPlace();
        
        //----------------------��ʼ���ϰ���--��ߵ�
        paintBlock(5, 45);
        paintBlock(14, 25);
        paintBlock(23, 15);
        
        //----------------------��ʼ���ϰ���--�ұߵ�
        paintBlock(5,92);
        paintBlock(14,80);
        paintBlock(23,60);
        
       
        
	}
	
//��Ӣ�۵ĳ�������-------------------------��Ӣ�۵ĳ�������
	public void paintBirthPlace() {

		//----------------���Ϸ�Ӣ�۵ĳ�����
		for(int i= 1; i< 4; i++)
		  maps[i].setCharAt(14, '|');
		for(int i= 1; i<= 14; i++)
			maps[4].setCharAt(i, '-');
	   
		//-----------------���Ϸ�Ӣ�۵ĳ�����
		for(int i= 32; i< 35; i++)
			 maps[i].setCharAt(110, '|');
		for(int i= 110; i< 124; i++)
			 maps[31].setCharAt(i, '-');

	}
	
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
		//System.out.println("\n"+ "                                          Maps"+"\n");
		//-------------------------------��ͼ
        for(int i= 0; i<= 35; i++) {
        	System.out.println(maps[i]);
        }
        
	}
	
//������----------------------------------------------------------------------------
	
//------------------------------------------------------��ͼ������
    public void Mapsmain() {
    	
    	constructMaps();
    	//displayMaps();
    }


}

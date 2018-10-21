package honorOfKings;

public class Maps {
	
      StringBuffer [] maps= new StringBuffer[40]; 
//函数区	------------------------------------------------------------------------------
	
//地图框架	----------------------------地图的框架
      /**
       * 画地图
       */
	public void constructMaps() {

	    //---------------------地图元素的初始化
		maps[0]= new StringBuffer("-----------------------------------------------------------------------------------------------------------------------------");
        maps[35]= new StringBuffer("-----------------------------------------------------------------------------------------------------------------------------"); 
        for(int i= 1; i< 35; i++) {
        	maps[i]= new StringBuffer("|                                                                                                                           |");
        }
        
        //----------------------初始化英雄的出生地
        paintBirthPlace();
        
        //----------------------初始化障碍物--左边的
        paintBlock(5, 45);
        paintBlock(14, 25);
        paintBlock(23, 15);
        
        //----------------------初始化障碍物--右边的
        paintBlock(5,92);
        paintBlock(14,80);
        paintBlock(23,60);
        
       
        
	}
	
//画英雄的出生地区-------------------------画英雄的出生地区
	public void paintBirthPlace() {

		//----------------左上方英雄的出生地
		for(int i= 1; i< 4; i++)
		  maps[i].setCharAt(14, '|');
		for(int i= 1; i<= 14; i++)
			maps[4].setCharAt(i, '-');
	   
		//-----------------右上方英雄的出生地
		for(int i= 32; i< 35; i++)
			 maps[i].setCharAt(110, '|');
		for(int i= 110; i< 124; i++)
			 maps[31].setCharAt(i, '-');

	}
	
//画障碍物-----------------------------------画障碍物
	void paintBlock(int x, int y) {
		
		//---------------画障碍物的宽 '|'
		 for(int i= x; i< x+ 6; i++)  {
			 maps[i].setCharAt(y, '|'); 
			 maps[i].setCharAt(y+15, '|');
		 }
		 
		 //--------------画障碍物的长 '-'
		 for(int i= y; i<= y+ 15; i++) {
			 maps[x].setCharAt(i, '-');
			 maps[x+ 6].setCharAt(i, '-');
		 }
			
	}
	
//改变英雄的位置----------------------改变英雄的位置
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
	
//初始英雄位置------------------------初始英雄位置
	void initPosition(int x, int y, char herroName) {

		maps[x].setCharAt(y, herroName);

	}
	
//输出地图现在的状态----------------------输出地图现在的状态
	void displayMaps() {
		//System.out.println("\n"+ "                                          Maps"+"\n");
		//-------------------------------地图
        for(int i= 0; i<= 35; i++) {
        	System.out.println(maps[i]);
        }
        
	}
	
//函数区----------------------------------------------------------------------------
	
//------------------------------------------------------地图控制区
    public void Mapsmain() {
    	
    	constructMaps();
    	//displayMaps();
    }


}

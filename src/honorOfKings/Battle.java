package honorOfKings;

public class Battle {

		//-------------------------定义英雄--Mp, Hp, Exp, X, Y, Name
	    public PartPerson [] person= new PartPerson[15];
		
		//---------------------------------定义地图
	    Maps map= new Maps();
	
//-----------------------------------------------------------------------函数区
	 
    //-----------------------展现地图
	public void displayMaps() {
		
		map.displayMaps();

	}

	//----------------------初始英雄位置
    public void initHerroPosition(int x, int y, char name) {
    	map.initPosition(x, y, name);
    }
	
    //------------------接受用户输入
    public void recieveImput(String operate, int herro1){
    	
    	char herro= '0';
    	herro+= herro1;
    	
    	if(operate.equals("Up")){
    		map.changPosition(operate, herro, person[herro1].positionX, person[herro1].positionY);
    		person[herro1].positionX--;
    	}
    	else if(operate.equals("Down")){
    		map.changPosition(operate, herro, person[herro1].positionX, person[herro1].positionY);
    		person[herro1].positionX++;
    	}
    	else if(operate.equals("Right")){
    		map.changPosition(operate, herro, person[herro1].positionX, person[herro1].positionY);
    		person[herro1].positionY++;
    	}
    	else if(operate.equals("Left")){
    		map.changPosition(operate, herro, person[herro1].positionX, person[herro1].positionY);
    		person[herro1].positionY--;
    	}
    	else if(operate.contains("Attack")) {
    		//System.out.println("bbbbbbbbbbbbbbbbbbbbb");
    		map.MapsAttack(operate, person[herro1].positionX, person[herro1].positionY);
    	}
    }
    
    
//-------------------------------------------------------------------------主控制函数
    /**
     * 战场控制主函数
     */
	public void battleMain() {
		
		//-----------游戏开始时的地图
		map.Mapsmain();
      
		
		//--------------英雄初始
		person[0]= new PartPerson(100, 100, 100, 31, 4, '0', 10);
		person[1]= new PartPerson(100, 100, 100, 32, 4, '1', 10);
		person[2]= new PartPerson(100, 100, 100, 33, 4, '2', 10);
		person[3]= new PartPerson(100, 100, 100, 31, 7, '3', 10);
		person[4]= new PartPerson(100, 100, 100, 32, 7, '4', 10);
		person[5]= new PartPerson(100, 100, 100, 1, 175, '5', 10);
		person[6]= new PartPerson(100, 100, 100, 3, 175, '6', 10);
		person[7]= new PartPerson(100, 100, 100, 4, 175, '7', 10);
		person[8]= new PartPerson(100, 100, 100, 2, 173, '8', 10);
		person[9]= new PartPerson(100, 100, 100, 3, 173, '9', 10);
		
		//person[10]= new PartPerson(100, 100, 100, 20, 50, '0');
		
		//------------英雄位置初始
		for(int i= 0; i< 10; i++)
			initHerroPosition(person[i].positionX, person[i].positionY, person[i].personName);
		
		//initHerroPosition(person[10].positionX, person[10].positionY, person[10].personName);
		
//        Main main= new Main();
//        main.clear();

		displayMaps();
		
	}
	
}

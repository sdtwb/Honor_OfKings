package honorOfKings;

public class Battle {

		//-------------------------����Ӣ��--Mp, Hp, Exp, X, Y, Name
	    public PartPerson [] person= new PartPerson[15];

//		PartPerson person1= new PartPerson(100, 100, 100, 1, 4, '1');
//		PartPerson person2= new PartPerson(100, 100, 100, 2, 4, '2');
//		PartPerson person3= new PartPerson(100, 100, 100, 3, 4, '3');
//		PartPerson person4= new PartPerson(100, 100, 100, 1, 8, '4');
//		PartPerson person5= new PartPerson(100, 100, 100, 2, 8, '5');
//		PartPerson person6= new PartPerson(100, 100, 100, 32, 118, '6');
//		PartPerson person7= new PartPerson(100, 100, 100, 33, 118, '7');
//		PartPerson person8= new PartPerson(100, 100, 100, 34, 118, '8');
//		PartPerson person9= new PartPerson(100, 100, 100, 32, 115, '9');
//		PartPerson person10= new PartPerson(100, 100, 100, 33, 115, '*');
		
		//---------------------------------�����ͼ
	    Maps map= new Maps();
	
//-----------------------------------------------------------------------������
	 
    //-----------------------չ�ֵ�ͼ
	public void displayMaps() {
		
		map.displayMaps();

	}

	//----------------------��ʼӢ��λ��
    public void initHerroPosition(int x, int y, char name) {
    	map.initPosition(x, y, name);
    }
	
    //------------------�����û�����
    public void recieveImput(String operate, int herro1){
    	
    	char herro= '0';
    	herro+= herro1;
    	System.out.println(herro);
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
    }
    
    
//-------------------------------------------------------------------------�����ƺ���
    /**
     * ս������������
     */
	public void battleMain() {
		
		//-----------��Ϸ��ʼʱ�ĵ�ͼ
		map.Mapsmain();

		
		//--------------Ӣ�۳�ʼ
		person[0]= new PartPerson(100, 100, 100, 20, 50, '0', 10);
		person[1]= new PartPerson(100, 100, 100, 2, 4, '1', 10);
		person[2]= new PartPerson(100, 100, 100, 3, 4, '2', 10);
		person[3]= new PartPerson(100, 100, 100, 1, 8, '3', 10);
		person[4]= new PartPerson(100, 100, 100, 2, 8, '4', 10);
		person[5]= new PartPerson(100, 100, 100, 32, 118, '5', 10);
		person[6]= new PartPerson(100, 100, 100, 33, 118, '6', 10);
		person[7]= new PartPerson(100, 100, 100, 34, 118, '7', 10);
		person[8]= new PartPerson(100, 100, 100, 32, 115, '8', 10);
		person[9]= new PartPerson(100, 100, 100, 33, 115, '9', 10);
		
		//person[10]= new PartPerson(100, 100, 100, 20, 50, '0');
		
		//------------Ӣ��λ�ó�ʼ
		for(int i= 0; i< 10; i++)
			initHerroPosition(person[i].positionX, person[i].positionY, person[i].personName);
		
		//initHerroPosition(person[10].positionX, person[10].positionY, person[10].personName);
		
//        Main main= new Main();
//        main.clear();

		displayMaps();
		
	}
	
}

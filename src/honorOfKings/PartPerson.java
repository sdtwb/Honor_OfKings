package honorOfKings;

public class PartPerson {
     public int Mp;
     public int Hp;
     public int Exp;
     public char personName;
     public int positionX;
     public int positionY;
     public int attack;
    
//--------------------------------------------------------------------------------------------������
     //---------------------------------------------------------------------���캯��
     PartPerson(int mp, int hp, int exp, int x, int y, char name, int att){
    	 Mp= mp;
    	 Hp= hp;
    	 Exp= exp;
    	 positionX= x;
    	 positionY= y;
    	 personName= name;
    	 attack= att;
     }
     

     //--------------------------------------------------------------------��ɫ����������
     int activeAbility() {
    	 
    	 return attack;
     }
     
     void passiveAbility() {
    	 Hp+= 10;
     }
}

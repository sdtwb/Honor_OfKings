package honorOfKings;
/**
 * 
 * @author ̷�ı�
 *������ҫ�и���Ӣ�۵ĸ���
 */
public class PartPerson {
     public int Mp;
     public int Hp;
     public int Exp;
     public char personName;
     public int positionX;
     public int positionY;
     public int attack= 20;
    
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
     /**
      * ��ɫ����������
      * @return Ӣ�۵Ĺ�����
      */
     public int activeAbility() {
    	 
    	 return attack;
     }
     
     /**
      * Ӣ�۵ı�������
      */
     public void passiveAbility() {
    	 
     }
}

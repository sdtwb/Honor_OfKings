package honorOfKings;
/**
 * 
 * @author ̷�ı�
 *������ҫ�еĴ̿���
 */
public class Assassin extends PartPerson{
	   Assassin(int assassinMp, int assassinHp, int assassinExp, int x, int y, char name, int attack){
    	super(assassinMp, assassinHp, assassinExp, x, y, name, attack);
       }
	   /**
	    * Ӣ�۵���������
	    */
	   public int activeAbility() {
		   return attack;
	   }
	   /**
	    * Ӣ�۵ı�������
	    */
	   public void passiveAbility() {
		   attack+= 0.2;
	   }
	   void print() {
		   
	   }
}

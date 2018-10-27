package honorOfKings;
/**
 * 
 * @author 谭文彪
 *王者荣耀中的刺客类
 */
public class Assassin extends PartPerson{
	   Assassin(int assassinMp, int assassinHp, int assassinExp, int x, int y, char name, int attack){
    	super(assassinMp, assassinHp, assassinExp, x, y, name, attack);
       }
	   /**
	    * 英雄的主动技能
	    */
	   public int activeAbility() {
		   return attack;
	   }
	   /**
	    * 英雄的被动技能
	    */
	   public void passiveAbility() {
		   attack+= 0.2;
	   }
	   void print() {
		   
	   }
}

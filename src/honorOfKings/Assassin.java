package honorOfKings;

public class Assassin extends PartPerson{
	   Assassin(int assassinMp, int assassinHp, int assassinExp, int x, int y, char name, int attack){
    	super(assassinMp, assassinHp, assassinExp, x, y, name, attack);
       }
	   int activeAbility() {
		   return attack;
	   }
	   void passiveAbility() {
		   attack+= 0.2;
	   }
	   void print() {
		   
	   }
}

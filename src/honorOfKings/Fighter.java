package honorOfKings;

public class Fighter extends PartPerson {
   Fighter(int fighterMp, int fighterHp, int fighterExp, int x, int y, char name, int attack){
    	super(fighterMp, fighterHp, fighterExp, x, y, name, attack);
    }
   int activeAbility() {
	   return attack;
   }
   void passiveAbility() {
	   Mp+= 10;
   }
}

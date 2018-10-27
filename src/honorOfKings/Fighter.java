package honorOfKings;
/**
 * 
 * @author 谭文彪
 *王者荣耀中的战士类
 */
public class Fighter extends PartPerson {
	/**
	 * 
	 * @param fighterMp 战士的生命值
	 * @param fighterHp  战士的魔法值
	 * @param fighterExp 战士的经验值
	 * @param x 战士的X坐标
	 * @param y 战士的Y坐标
	 * @param name 战士的名字
	 * @param attack 战士的攻击力
	 */
   Fighter(int fighterMp, int fighterHp, int fighterExp, int x, int y, char name, int attack){
    	super(fighterMp, fighterHp, fighterExp, x, y, name, attack);
    }
   /**
    * 战士进行攻击
    */
   public int activeAbility() {
	   return attack;
   }
   /**
    * 战士的被动技能：生命值加10
    */
   public void passiveAbility() {
	   Mp+= 10;
   }
}

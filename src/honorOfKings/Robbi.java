package honorOfKings;
/**
 * 
 * @author 谭文彪
 *王者荣耀中的法师类
 */
public class Robbi extends PartPerson{
        Robbi(int robbiMp, int robbiHp, int robbiExp, int x, int y, char name, int attack){
        	super(robbiMp, robbiHp, robbiExp, x, y, name, attack);
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
        	Hp+= 10;
        }
}

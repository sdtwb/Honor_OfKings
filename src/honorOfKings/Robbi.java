package honorOfKings;
/**
 * 
 * @author ̷�ı�
 *������ҫ�еķ�ʦ��
 */
public class Robbi extends PartPerson{
        Robbi(int robbiMp, int robbiHp, int robbiExp, int x, int y, char name, int attack){
        	super(robbiMp, robbiHp, robbiExp, x, y, name, attack);
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
        	Hp+= 10;
        }
}

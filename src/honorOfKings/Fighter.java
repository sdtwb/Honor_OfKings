package honorOfKings;
/**
 * 
 * @author ̷�ı�
 *������ҫ�е�սʿ��
 */
public class Fighter extends PartPerson {
	/**
	 * 
	 * @param fighterMp սʿ������ֵ
	 * @param fighterHp  սʿ��ħ��ֵ
	 * @param fighterExp սʿ�ľ���ֵ
	 * @param x սʿ��X����
	 * @param y սʿ��Y����
	 * @param name սʿ������
	 * @param attack սʿ�Ĺ�����
	 */
   Fighter(int fighterMp, int fighterHp, int fighterExp, int x, int y, char name, int attack){
    	super(fighterMp, fighterHp, fighterExp, x, y, name, attack);
    }
   /**
    * սʿ���й���
    */
   public int activeAbility() {
	   return attack;
   }
   /**
    * սʿ�ı������ܣ�����ֵ��10
    */
   public void passiveAbility() {
	   Mp+= 10;
   }
}

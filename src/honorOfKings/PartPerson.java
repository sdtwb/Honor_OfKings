package honorOfKings;
/**
 * 
 * @author 谭文彪
 *王者荣耀中各种英雄的父类
 */
public class PartPerson {
     public int Mp;
     public int Hp;
     public int Exp;
     public char personName;
     public int positionX;
     public int positionY;
     public int attack= 20;
    
//--------------------------------------------------------------------------------------------函数区
     //---------------------------------------------------------------------构造函数
     PartPerson(int mp, int hp, int exp, int x, int y, char name, int att){
    	 Mp= mp;
    	 Hp= hp;
    	 Exp= exp;
    	 positionX= x;
    	 positionY= y;
    	 personName= name;
    	 attack= att;
     }
     

     //--------------------------------------------------------------------角色的主动进攻
     /**
      * 角色的主动进攻
      * @return 英雄的攻击力
      */
     public int activeAbility() {
    	 
    	 return attack;
     }
     
     /**
      * 英雄的被动技能
      */
     public void passiveAbility() {
    	 
     }
}

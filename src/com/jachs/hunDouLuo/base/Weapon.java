 package com.jachs.hunDouLuo.base;
 
 import java.util.List;

import com.jachs.hunDouLuo.ui.FloatPoint;
import com.jachs.hunDouLuo.ui.Bullet;
 /***
  * 武器对象父类
  * @author zhanchaohan
  *
  */
public abstract class Weapon
 {
   public int type;
 
   public Weapon(int type)
   {
     this.type = type;
   }
 
   public abstract List<Bullet> shot(FloatPoint paramFloatPoint, int paramInt1, int paramInt2);
 
   public abstract List<Bullet> shot(FloatPoint paramFloatPoint1, FloatPoint paramFloatPoint2, int paramInt1, int paramInt2);
 }

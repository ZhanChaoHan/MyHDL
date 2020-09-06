 package com.jachs.hunDouLuo.base;
 
 import java.awt.Graphics2D;

import com.jachs.hunDouLuo.ui.FloatPoint;
 
 /***
  * 子弹父类
  * @author zhanchaohan
  *
  */
 public abstract class Bullet
 {
   public FloatPoint position;//子弹方向
   public boolean isAlive = true;//子弹状态
   public float size;//子弹大小
   public int energy;
 
   public Bullet(FloatPoint position, boolean isAlive, int energy)
   {
     this.position = position;
     this.isAlive = isAlive;
     this.energy = energy;
   }
 
   public abstract void drawBubblet(Graphics2D paramGraphics2D, float paramFloat);
 }


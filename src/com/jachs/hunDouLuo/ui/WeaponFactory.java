 package com.jachs.hunDouLuo.ui;

import com.jachs.hunDouLuo.base.Weapon;
import com.jachs.hunDouLuo.weapon.NunLinerWeapon;
import com.jachs.hunDouLuo.weapon.ShotWeapon;
import com.jachs.hunDouLuo.weapon.SimpleBossWeapon;
import com.jachs.hunDouLuo.weapon.SimpleWeapon;
import com.jachs.hunDouLuo.weapon.StrongWeapon;

public class WeaponFactory
 {
   static Weapon weapon;
 
   public static Weapon getWeapon(int type)
   {
     switch (type) {
     case 1:
       weapon = new SimpleWeapon(1);//默认白色枪
       break;
     case 2:
       weapon = new StrongWeapon(1);//加强版枪红色大子弹枪
       break;
     case 3:
       weapon = new ShotWeapon(1);//加强版散弹枪
       break;
     case 4:
       weapon = new NunLinerWeapon(1);//圈圈弹
       break;
     case 5://没想好怎么写算法
         weapon = new SimpleBossWeapon(1);//Boos Gun
         break;
     default:
       weapon = new SimpleWeapon(1);
     }
 
     return weapon;
   }
 }

package com.jachs.hunDouLuo.base;

import java.awt.Graphics2D;
import java.awt.Point;

/*****
 * 人物对象父类
 * @author zhanchaohan
 *
 */
public abstract class Player
{
  public Point position;//记录认为位置
  public int direction;//记录方位
  public int state;//记录状态
  public Weapon weapon;//记录武器

  public abstract void drawPlayer(Graphics2D paramGraphics2D, float paramFloat);
}

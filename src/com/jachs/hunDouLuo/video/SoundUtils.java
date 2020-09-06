 package com.jachs.hunDouLuo.video;
 
 import sun.audio.AudioPlayer;
 import sun.audio.AudioStream;
 
 /****
   * 播放音频文件
  * @author zhanchaohan
  *
  */
 public class SoundUtils
 {
   public static void playSound(String str)
   {
     try
     {
       AudioStream as = Audios.getAudio(str);
       AudioPlayer.player.start(as);
     } catch (Exception e1) {
       e1.printStackTrace();
     }
   }
 }

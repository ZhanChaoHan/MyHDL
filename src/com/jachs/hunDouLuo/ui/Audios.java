 package com.jachs.hunDouLuo.ui;
 
 import java.io.FileInputStream;
 import sun.audio.AudioStream;
 
 /****
   * 音频初始化
  * @author zhanchaohan
  *
  */
 public class Audios
 {
   public static AudioStream getAudio(String str)
     throws Exception
   {
     AudioStream as = new AudioStream(new FileInputStream(str));
     return as;
   }
 }

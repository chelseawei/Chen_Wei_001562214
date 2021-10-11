/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author chen.wei
 */
public class TimeUtil {
     public String getTime(){
         SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
         Date date = new Date();
         String s = df.format(date);
         return s;
    }
    
}

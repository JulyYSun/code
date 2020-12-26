package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YS
 * 2020/11/23 16:16
 */
public class No_6 {
    public static String convert(String s, int numRows) {
        if(numRows==1)
            return s;
        String result="";
        //每个分割的字符串长度
        int str_length=2*numRows-2;
        //count有多少组字符串
        int count= (int) Math.ceil(s.length()*1.0/(str_length));
        String[] strings=new String[count];
        for(int i=0;i<count-1;i++){
            strings[i]=s.substring(i*str_length,(i+1)*str_length);
        }
        strings[count-1]=s.substring((count-1)*str_length,s.length());
        for(int i=0;i<numRows;i++){
            for(int j=0;j<count;j++){
                if(i==0){
                    result+=strings[j].charAt(i);
                } else if(i==numRows-1){
                    if(strings[j].length()>numRows-1)
                        result+=strings[j].charAt(i);
                }else {
                    if(strings[j].length()>i)
                        result+=strings[j].charAt(i);
                    if(strings[j].length()>(str_length-i))
                        result+=strings[j].charAt(str_length-i);
                }
            }

        }
        return result;
    }

    public String convert2(String s, int numRows) {
        if(s.length()<2)
            return s;
        String result="";
        List<StringBuilder> strings=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            strings.add(new StringBuilder());
        }
        int flag=-1;
        int index=0;
        for(char c :s.toCharArray()){
            strings.get(index).append(c);
            if(index==0 || index==numRows-1)
                flag=-flag;
            index+=flag;
        }
        for(StringBuilder stringBuilder:strings){
            result+=stringBuilder.toString();
        }
        return result;
    }
}

package bigdata_task;
/*
    Created by YS
    2020/10/7 10:42
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String str="";
        String filename="";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            String s="";
            while ((s=bufferedReader.readLine())!=null){
                str=str+" "+s;
            }
            bufferedReader.close();
        }catch (Exception e){
            System.out.println(e);
        }
        Map<String,Integer> wordCounts=new HashMap<>();







    }
}

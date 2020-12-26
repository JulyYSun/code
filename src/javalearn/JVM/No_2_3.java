package javalearn.JVM;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YS
 * 2020/11/24 21:11
 */
public class No_2_3 {
    static class OOMObiect{

    }

    public static void main(String[] args) {
        List<OOMObiect> list=new ArrayList<OOMObiect>();
        while (true)
            list.add(new OOMObiect());
    }
}

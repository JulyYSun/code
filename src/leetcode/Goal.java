package leetcode;

import java.util.*;

/**
 * Created by YS
 * 2020/12/6 10:55
 */

public class Goal {
    public String interpret(String command) {
        return command.replace("()","o").replace("(al)","al");
    }


    public static void main(String[] args) {


    }
}

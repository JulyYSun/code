package leetcode;
/*
    Created by YS
    2020/6/10 16:42
*/

import java.util.ArrayList;
import java.util.List;

public class No_1472 {
    List<String> pages=new ArrayList<>();
    static int currentPage;
    public No_1472(String homepage) {
        pages.add(homepage);
        currentPage=1;
    }

    public void visit(String url) {
        for(int i=currentPage;i<pages.size();i++){
            pages.remove(i);
        }
        if(!pages.get(currentPage).equals(url)){
            pages.add(url);
        }
        currentPage=pages.size();
    }

    public String back(int steps) {
        int tempPage=currentPage;
        currentPage=currentPage-steps<=0 ? 1:currentPage-steps;
        return pages.get(tempPage-steps>0 ? tempPage-steps-1:0);
    }

    public String forward(int steps) {
        int tempPage=currentPage;
        currentPage=currentPage+steps>=pages.size() ? pages.size():currentPage+steps;
        return pages.get(tempPage+steps>pages.size() ? pages.size()-1:tempPage+steps-1);
    }
}

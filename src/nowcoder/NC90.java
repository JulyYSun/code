package nowcoder;

import java.util.ArrayList;
import java.util.List;

public class NC90 {
	public int[] getMinStack (int[][] op) {
		List<Integer> list=new ArrayList<>();
		List<Integer> res=new ArrayList<>();
		for (int i = 0; i < op.length; i++) {
			if(op[i][0]==1){
				list.add(op[i][1]);
			}else if(op[i][0]==2){
				list.remove(list.size()-1);
			}else {
				res.add(min(list));
			}
		}
		int[] resArr=new int[res.size()];
		for (int i = 0; i < resArr.length; i++) {
			resArr[i]=res.get(i);
		}
		return resArr;
	}
	public int min(List<Integer> list){
		int min=Integer.MAX_VALUE;
		for (Integer integer : list) {
			if(integer<min)
				min=integer;
		}
		return min;
	}
}

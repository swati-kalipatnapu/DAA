package day2Assignment;

import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Iterator;
public class Prg8HighFive {

	public static void main(String[] args) {
		int[][] arr = highFive(new int[][]{{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}});
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			System.out.println(arr[i][j]);
			}
		}
	}
	public static int[][] highFive(int[][] arr) {
		Map<Integer,ArrayList<Integer>> items = new HashMap<Integer,ArrayList<Integer>>(); 
		
		ArrayList<Integer> student1 = new ArrayList<Integer>();
		ArrayList<Integer> student2 = new ArrayList<Integer>();
		int number = 1;
		for(int i=0,j=0;i<arr.length;i++) {
			if(arr[i][j]==number) {
				student1.add(arr[i][j+1]);
				
			}
			else {
				student2.add(arr[i][j+1]);
				
			}
		
		}
		
		
		System.out.println(student1);
		items.put(1,student1);
		items.put(2,student2);
		
		int[][] resultArr = new int[items.size()][2];
		for(Map.Entry<Integer, ArrayList<Integer>> entry: items.entrySet()) {
			int key = entry.getKey()-1;
			int sum = 0;
			ArrayList<Integer> marks = entry.getValue();
			Collections.sort(marks);
			for(int i=marks.size()-1;i>0;i--) {
				sum += marks.get(i);
			}
			resultArr[key][1] = sum/5;
		}
		
		return resultArr;
	}

}	
		
		

package Exam4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Random r = new Random();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 50; i++) {
			list.add(r.nextInt(101));
		}
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();
        List<Integer> list4 = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
        	if(list.get(i)/10==1){
        		list1.add(list.get(i));
        	}
        	if(list.get(i)/10==2){
        		list2.add(list.get(i));
        	}
        	if(list.get(i)/10==3){
        		list3.add(list.get(i));
        	}
        	if(list.get(i)/10==4){
        		list4.add(list.get(i));
        	}
				
		}
    }
}

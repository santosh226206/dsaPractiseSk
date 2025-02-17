package stack;

import java.util.ArrayList;
import java.util.Stack;

public class NGR {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> temp=new ArrayList<Integer>(arr.length);
        for(int i=0;i<arr.length;i++){
            temp.add(-1);
        }
        Stack<Integer> helper=new Stack<Integer>();
        for(int ele=0;ele<arr.length;ele++){
                while(!helper.isEmpty() && arr[ele]>arr[helper.peek()]){
                    temp.set(helper.peek(), arr[ele]);
                    helper.pop();
                }
                helper.push(ele);
        }
        while (!helper.isEmpty()){
            temp.set(helper.peek(),-1);
            helper.pop();
        }
        return temp;
    }
    public static void main(String[] args) {
         //int[] arr={1,3,2,4};
        //int[] arr={6,8,0,1,3};
        int[] arr={10,20,30,50};
         NGR ngr=new NGR();
         ArrayList<Integer> ans=ngr.nextLargerElement(arr);
        for (Integer an : ans) {
            System.out.println(an);
        }
    }
}

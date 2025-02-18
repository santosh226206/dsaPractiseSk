package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> que=new LinkedList<>();
        if (root == null) {
            return result;
        }
        que.add(root);
        while(!que.isEmpty()){
            int s=que.size();
            ArrayList<Integer> sub=new ArrayList<>();
            for(int i=0;i<s;i++){
                assert que.peek() != null;
                if(que.peek().left!=null){
                    que.add(que.peek().left);
                }
                if(que.peek().right!=null){
                    que.add(que.peek().right);
                }
                sub.add(que.poll().val);
            }
            result.add(sub);
        }
        return result;
    }
}

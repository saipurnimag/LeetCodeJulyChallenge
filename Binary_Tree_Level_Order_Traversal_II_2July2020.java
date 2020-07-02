class Solution {
      public List<List<Integer>> levelOrderBottom(TreeNode root) {
          
          ArrayList<List<Integer>> op =  new ArrayList<>();
          
          Queue<TreeNode> queue = new LinkedList<>();
          if(root!=null){
              queue.add(root);
          }
          while(!queue.isEmpty()){
              int k = queue.size();
              ArrayList<Integer> level_list = new ArrayList<Integer>();
              while(k-->0){
                  TreeNode x = queue.remove();
                  level_list.add(x.val);
                  if(x.left!=null){
                      queue.add(x.left);
                  }
                  if(x.right!=null){
                      queue.add(x.right);
                  }
              }
              op.add(0,level_list);
          }
          
       }
      return op;
}

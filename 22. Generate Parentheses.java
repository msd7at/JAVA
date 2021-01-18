class Solution {
    public static void para(int n,int op, int cl,List<String> ans,String res){
        if (op==n && cl==n){
            ans.add(res);
            return ;
        }
        
        if (op<n){
            para(n,op+1,cl,ans,res+"(");
        }
        if (cl<op){
            para(n,op,cl+1,ans,res+")");
        }
        
    }
    public List<String> generateParenthesis(int n) {
            List<String> l = new ArrayList<String>();
            para(n,0,0,l,"");
            return l;
    }
}

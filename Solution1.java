class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res=new ArrayList<>();
        int start=0,end=0,i;
        Set<Character> st=new HashSet<>();
        for(i=0;i<s.length();i++)
        {
            if(i>end)
            {
                res.add(end-start+1);
                start=i;
                end=i;
            }
            char c=s.charAt(i);
            if(!st.contains(c))
            {
                end=Math.max(end,s.lastIndexOf(c));
                st.add(c);
            }
        }
        if(i>end)
        {
            res.add(end-start+1);
            start=i;
            end=i;
        }
        return res;
    }
}
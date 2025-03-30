# march30_2025
The problem that i solved today in leetcode

1.You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part. For example, the string "ababcc" can be partitioned into ["abab", "cc"], but partitions such as ["aba", "bcc"] or ["ab", "ab", "cc"] are invalid.

Note that the partition is done so that after concatenating all the parts in order, the resultant string should be s.

Return a list of integers representing the size of these parts.

Code:
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

class Solution {
    int fun(int[] g, int[] s,int i,int j,int count){
    Arrays.sort(g);
    Arrays.sort(s);

    while(i<g.length && j<s.length){
        if(s[j]>=g[i]){
            count++;
            i++;
            j++;
        }else{
            j++;
        }
        
    }
    return count;
}
    public int findContentChildren(int[] g, int[] s) {
        
        return fun(g,s,0,0,0);
    }
}
int fun(vector<int>& g, vector<int>& s,int i,int j,int count){
   sort(g.begin(), g.end());
    sort(s.begin(), s.end());

    while(i<g.size() && j<s.size()){
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
class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        return fun(g,s,0,0,0);
    }
};
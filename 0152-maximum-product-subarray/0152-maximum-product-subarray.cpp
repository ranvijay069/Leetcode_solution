class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int n = nums.size();

        int maxPro = nums[0];
        for(int i =0;i<n;i++){
            int pro =1;

            for(int j =i;j<n;j++){
                pro = pro*nums[j];

                maxPro = max(maxPro,pro);
            }
        }
        return maxPro;
    }
};
class Solution {
    public int climbStairs(int n) {
       int one = 1;
       int two = 1;

       for(int i = 0; i < n - 1; i++){
        int temp = one;
        one =   one + two;
        two = temp;

       }
       return one;


    }
}
// for n = 5
// Ways = (n - 1) + (n - 2) -- Ways: 1,2,3
// i = 0, one = 2, two = 1
// i = 1, one = 3, two = 2
// i = 2, one = 4, two = 3
// i = 3, one = 5, two = 4
//we need temp for storing the old ones value, because after that one will updated

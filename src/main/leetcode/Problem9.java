package main.leetcode;

public class Problem9 {

    private int testVal;

    public Problem9(int testVal) {
        this.testVal = testVal;
        System.out.println("Leetcode problem 9: input: " + testVal + " output: " + sol(testVal));
    }

    //Determine whether an integer is a palindrome. Do this without extra space.
    private boolean sol(int x) {
        int reverse = 0;
        if(x<0)
            return false;
        while(x > 0){
            if(reverse + x == 0)
                return true;
            reverse = reverse*10 - (x%10);
            x /= 10;
        }
        return false;
    }

}

//-21474 21474

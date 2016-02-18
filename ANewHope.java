/*
From https://arena.topcoder.com/#/u/practiceCode/16656/45873/13585/1/327836
By Caroline Lee, 02-18-2016

Under Construction
*/

public class ANewHope{
    public static void main(String[] args){
        System.out.println("Test");
        
        /*
        int test0 = minWeeks({1,2,3,4}, {4,3,2,1}, 3);
        int test1 = minWeeks({8,5,4,1,7,6,3,2}, {2,4,6,8,1,3,5,7}, 3);
        int test2 = minWeeks({1,2,3,4}, {1,2,3,4}, 3);
        */
    }
    
    public int minWeeks(int[] firstWeek, int[] lastWeek, int D){
        //days in the week, and exactly how many shirts that luke has 
        int N = firstWeek.length;
        
        //for each shirt in one week, calculate the earliest he can next wear it the next week 
        int[] tempshirtperm = new int[N];
        for (int i = 0; i < firstWeek.length; i++){
            boolean[] usedShirts = new boolean[N];
            //fill each element with the permutation of which shirts could fit
            //then use recursion to return the minimum number of days (possibly a min comparison?) 
            for (int j = 0; j < (D - j)%N; j++){
                
               	//TODO
            }
        }
        return 0;
    }
}
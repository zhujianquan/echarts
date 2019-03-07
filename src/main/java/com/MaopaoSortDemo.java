package com;

public class MaopaoSortDemo {
    public static void main(String[] args) {
//        sort();
        test1();
    }

    public static void sort() {

        int[] nums = {15,14, 13, 12, 11};
        boolean flag ;
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            flag = true;
            for (int j = 0; j < nums.length-1-i; j++) {
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    flag=false;
                }
            }
            for (int num : nums) {
                System.out.print(num + "  ");
            }
            System.out.println();
            if (flag) {
                break;
            }


        }
//        for (int num : nums) {
//            System.out.print(num + "  ");
//        }
//        System.out.println();
//        System.out.println(count);

    }

    public static  void test1(){
        String a = "abc";
        String b = new String("abc");
        String c = "a"+"bc";
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(c==b);

        System.out.println("------------------------");
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(c.equals(b));
    }

    public static  int  test1(int i){
//        String a = "abc";

//        String b = new String("abc");
//        String c = "a"+"bc";
//        System.out.println(a==b);
//        System.out.println(a==c);
//        System.out.println(c==b);
//
//        System.out.println("------------------------");
//        System.out.println(a.equals(b));
//        System.out.println(a.equals(c));
//        System.out.println(c.equals(b));
        return 1;
    }

}

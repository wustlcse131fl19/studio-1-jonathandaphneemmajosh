package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args){
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("What is the first integer?");
        int n2 = ap.nextInt ("What is the second integer?");
        double m1 = n1;
        double m2 =n2;
        double average = (m1 + m2)/2;
        System.out.println(average);
    }
}

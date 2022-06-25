package com.company;

public class Ch6_ArraysV27 {
    public static void main(String[] args) {
        int [] marks = {98,100,55,58};
        //float [] marks = {98.4f,100.0f,55.8f,58.3f};
        String [] students = {"ritu", "neha", "raman","sneha" };
        System.out.println(marks [0]);
        System.out.println(marks.length);
        System.out.println(students.length);
        System.out.println(students[3]);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("in decreasing order");
        for(int i = marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
        System.out.println("simple syntax(for each loop)");
        for(int element: marks){
            System.out.println(element);
        }
    }
}

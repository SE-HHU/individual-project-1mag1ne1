package Software_work01;

import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class operation {
    public static void main(String[] args) throws Exception {
        int count  ;//生成题目的个数
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        count = sc.nextInt();
        Random rand = new Random();
        int x,y,z,time;//运算的数字 和出现的加减次数
        int operator01 ;//运算符号
        int operator02 ;//运算符号
        int [][] arr1 = new int [count][3];
        int [][] arr2 = new int [count][4];
        int c1=0;
        int c2=0;
        int m;
        PrintWriter fw = new PrintWriter("C:\\Users\\86158\\IdeaProjects\\untitled\\src\\Software_work01\\Exercises.txt");
        PrintWriter wd = new PrintWriter("C:\\\\Users\\\\86158\\\\IdeaProjects\\\\untitled\\\\src\\\\Software_work01\\\\Answers.txt");
 //       OutputStream fw = new FileOutputStream("C:\\Users\\86158\\IdeaProjects\\untitled\\src\\Software_work01\\Exercises.txt", true);
 //       OutputStream wd = new FileOutputStream("C:\\Users\\86158\\IdeaProjects\\untitled\\src\\Software_work01\\Answers.txt", true);
        for (int i = 0; i <count; i++) {
            m=i+1;
            time = rand.nextInt(2) ;
            operator01 = rand.nextInt(2) ; // 0为加 1为减法
            operator02 = rand.nextInt(4) ;
            x = rand.nextInt(100);
            y = rand.nextInt(100);
            z = rand.nextInt(100);
            if(time==0){
                 if(operator01 == 0){
                     int answer = x+y;
                     for (int j = 0; j < count; j++) {
                         if(arr1[i][0]==x&&arr1[i][1]==operator01&&arr1[i][2]==y){
                             i--;
                             break;
                         }
                         if(j==count-1){
                             System.out.println(x+" + "+y+" = ");
                             arr1[c1][0] = x;
                             arr1[c1][1] = operator01;
                             arr1[c1][2] = y;
                             c1++;
                             fw.println(m+": "+x+" + "+y+" = ");
                             wd.println(m+": "+answer);
                         }
                     }
                 }
                 else{
                     int answer = x-y;
                     for (int j = 0; j < count; j++) {
                         if (arr1[i][0] == x && arr1[i][1] == operator01 && arr1[i][2] == y) {
                             i--;
                             break;
                         }
                         if (j == count - 1) {
                             System.out.println(x + " - " + y + " = ");
                             arr1[c1][0] = x;
                             arr1[c1][1] = operator01;
                             arr1[c1][2] = y;
                             c1++;
                             fw.println(m+": "+x + " - " + y + " = ");
                             wd.println(m+": "+answer);
                         }
                     }
                 }
            }
            else{
                 switch(operator02){
                     case 0:
                         int answer0= x+y+z;
                         for (int j = 0; j < count; j++) {
                             if(arr2[i][0]==x&&arr2[i][1]==operator01&&arr2[i][2]==y&&arr2[i][3]==z){
                                 i--;
                                 break;
                             }
                             if(j==count-1){
                                 System.out.println(x+" + "+y+" + "+z+" = ");
                                 arr2[c2][0] = x;
                                 arr2[c2][1] = operator02;
                                 arr2[c2][2] = y;
                                 arr2[c2][3] = z;
                                 c2++;
                                 fw.println(m+": "+x+" + "+y+" + "+z+" = ");
                                 wd.println(m+": "+answer0);
                             }
                         }
                         break;
                     case 1 :
                         int answer1 = x+y-z;
                         for (int j = 0; j < count; j++) {
                             if(arr2[i][0]==x&&arr2[i][1]==operator01&&arr2[i][2]==y&&arr2[i][3]==z){
                                 i--;
                                 break;
                             }
                             if(j==count-1){
                                 System.out.println(x+" + "+y+" - "+z+" = ");
                                 arr2[c2][0] = x;
                                 arr2[c2][1] = operator02;
                                 arr2[c2][2] = y;
                                 arr2[c2][3] = z;
                                 c2++;
                                 fw.println(m+": "+x+" + "+y+" - "+z+" = ");
                                 wd.println(m+": "+answer1);
                             }
                         }
                         break;
                     case 2 :
                         int answer2 = x-y+z;
                         for (int j = 0; j < count; j++) {
                             if(arr2[i][0]==x&&arr2[i][1]==operator01&&arr2[i][2]==y&&arr2[i][3]==z){
                                 i--;
                                 break;
                             }
                             if(j==count-1){
                                 System.out.println(x+" - "+y+" + "+z+" = ");
                                 arr2[c2][0] = x;
                                 arr2[c2][1] = operator02;
                                 arr2[c2][2] = y;
                                 arr2[c2][3] = z;
                                 c2++;
                                 fw.println(m+": "+x+" - "+y+" + "+z+" = ");
                                 wd.println(m+": "+answer2);
                             }
                         }
                         break;
                     case 3 :
                         int answer3 = x-y-z;
                         for (int j = 0; j < count; j++) {
                             if(arr2[i][0]==x&&arr2[i][1]==operator01&&arr2[i][2]==y&&arr2[i][3]==z){
                                 i--;
                                 break;
                             }
                             if(j==count-1){
                                 System.out.println(x+" - "+y+" - "+z+" = ");
                                 arr2[c2][0] = x;
                                 arr2[c2][1] = operator02;
                                 arr2[c2][2] = y;
                                 arr2[c2][3] = z;
                                 c2++;
                                 fw.println(m+": "+x+" - "+y+" - "+z+" = ");
                                 wd.println(m+" "+answer3);
                             }
                         }
                         break;
                 }
            }
        }
        fw.close();
        wd.close();
    }
}

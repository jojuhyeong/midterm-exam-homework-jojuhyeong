package kr.ac.sahmyook.home.func;
import java.util.*;
public class ForSample {
    Scanner sc = new Scanner(System.in);

    public void sum1to10(){
        System.out.println("1~10까지의 합계를 구하겠습니다.");
        int i = 1;
        int result = 0;
        while(i <= 10){
            i++;
            result += i;

        }
        System.out.println("1부터 100까지 모두 더하면" + result +"입니다.");

    }
    public void sum1to100(){
        System.out.println("1~100까지의 합계를 구하겠습니다.");
        int i = 1;
        int result = 0;
        while(i <= 100){
            i++;
            result += i;

        }
        System.out.println("1부터 100까지 모두 더하면" + result +"입니다.");


    }
    public void oneGugudan(){
        System.out.println("oneGugudan() 실행");
    }
    public void sumMintoMax(){
        System.out.println("sumMintoMax() 실행");
    }
    public void printStar(){
        System.out.println("printStar() 실행");
    }
    public void printNumberStar(){
        System.out.println("printNumberStar() 실행");
    }
    public void printTriangleStar(){
        System.out.println("printTriangleStar() 실행");
    }
    public void guguDan(){
        System.out.println("gugudan() 실행");
    }
}

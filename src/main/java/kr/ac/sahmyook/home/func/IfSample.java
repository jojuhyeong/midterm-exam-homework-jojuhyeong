package kr.ac.sahmyook.home.func;
import java.sql.SQLOutput;
import java.util.*;
public class IfSample {

    Scanner sc = new Scanner(System.in);

    public void maxNumber(){
        System.out.println("첫 번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.println("두 번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("두 수중에 더 큰 수는 " + num1 + "입니다.");
        }else if(num2 > num1){
            System.out.println("두 수중에 더 큰 수는 " + num2 + "입니다.");
        } else {
            System.out.println("두 수는 같습니다.");
        }

        return;
    }
    public void minNumber(){
        System.out.println("첫 번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.println("두 번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("두 수중에 더 작은 수는 " + num2 + "입니다.");
        }else if(num2 > num1){
            System.out.println("두 수중에 더 작은 수는 " + num1 + "입니다.");
        } else {
            System.out.println("두 수는 같습니다.");
        }

        return;
    }
    public void threeMaxMin(){
        System.out.println("첫 번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.println("두 번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();
        System.out.println("세 번째 정수를 입력하세요 : ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            int max = num1;
            if(num2 > num3){
                int min = num3;
                System.out.println("가장 큰 수는"+max+"이고, 가장 작은수는"+min+"입니다.");
            }
            else if(num2 < num3){
                int min = num2;
                System.out.println("가장 큰 수는"+max+"이고, 가장 작은수는"+min+"입니다.");
            }else{
                System.out.println("가장 큰 수는"+max+"이고, 나머지 두 수는 같습니다.");
            }

        }
        else if(num2 > num3 && num2 > num1){
            int max = num2;
            if(num1 > num3){
                int min = num3;
                System.out.println("가장 큰 수는"+max+"이고, 가장 작은수는"+min+"입니다.");
            }
            else if(num1 > num3){
                int min = num1;
                System.out.println("가장 큰 수는"+max+"이고, 가장 작은수는"+min+"입니다.");
            }else{
                System.out.println("가장 큰 수는"+max+"이고, 나머지 두 수는 같습니다.");
            }
        }
        else if(num3 > num1 && num3 > num2){
            int max = num3;
            if(num1 > num2){
                int min = num2;
                System.out.println("가장 큰 수는"+max+"이고, 가장 작은수는"+min+"입니다.");
            }
            else if(num1 < num2){
                int min = num1;
                System.out.println("가장 큰 수는"+max+"이고, 가장 작은수는"+min+"입니다.");
            }else{
                System.out.println("가장 큰 수는"+max+"이고, 나머지 두 수는 같습니다.");
            }
        }
            return;
        }
    public void checkEven(){
        System.out.println("checkEven() 실행");

    }
    public void isPassFail(){
        System.out.println("isPassFail() 실행");

    }
    public void scoreGrade(){
        System.out.println("scoreGrade() 실행");

    }
    public void checkPlusMinusZero(){
        System.out.println("checkPlusMinusZero() 실행");

    }
    public void whatCharacter(){
        System.out.println("whatCharacter() 실행");
    }
}

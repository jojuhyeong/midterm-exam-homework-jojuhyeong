package kr.ac.sahmyook.home.func;
import java.util.*;
public class SwitchSample {
    Scanner sc = new Scanner(System.in);
    public void caculator(){
        System.out.println("첫 번째 정수를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.println("두 번째 정수를 입력해주세요 : ");
        int num2 = sc.nextInt();
        int result = 0;
        System.out.println("원하시는 연산을 입력해주세요 : ");
        sc.nextLine();
        String cac = sc.nextLine();

        if(cac.equals("+")){
            result = num1 + num2;
            System.out.println("계산결과는 "+result+"입니다.");
            return;
        }
        else if(cac.equals("-")){
            result = num1 - num2;
            System.out.println("계산결과는 "+result+"입니다.");
            return;
        }
        else if(cac.equals("*")){
            result = num1 * num2;
            System.out.println("계산결과는 "+result+"입니다.");
            return;
        }
        else if(cac.equals("/")){
            result = num1 / num2;
            System.out.println("계산결과는 "+result+"입니다.");
            return;
        }
        else if(cac.equals("%")){
            result = num1 % num2;
            System.out.println("계산결과는 "+result+"입니다.");
            return;
        }else{
            System.out.println("올바른 연산자를 입력해주세요.");
            return;
        }
    }
    public void fruitPrice(){
        System.out.println("원하시는 과일을 입력해주세요");
        String fruit = sc.nextLine();


        if(fruit.equals("사과")){
            System.out.println("사과는 2000원입니다.");
        }
        else if(fruit.equals("망고")){
            System.out.println("망고는 3000원입니다.");
        }
        else if(fruit.equals("자몽")){
            System.out.println("자몽은 4000원입니다.");
        }else{
            System.out.println("준비되지 않은 상품입니다.");
        }
        return;
    }
}


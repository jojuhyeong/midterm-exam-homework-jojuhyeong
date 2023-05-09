package kr.ac.sahmyook.home.func;
import java.util.*;
public class WhileSample {
    Scanner sc = new Scanner(System.in);

    public void printUniCode() {
        System.out.println("문자를 입력해주세요. : ");
        String unicode = sc.nextLine();
        if (unicode == "0") {
            return;
        } else {
            char c = unicode.charAt(0);
            System.out.println((int) c);
        }
    }

    public void sum1to100() {

        int i = 1;
        int result = 0;
        while (i <= 100) {
            i++;
            result += i;

        }
        System.out.println("1부터 100까지 모두 더하면" + result + "입니다.");
    }
    public void numberGame(){
        System.out.println("numberGame() 실행");
    }
    public void countCharacter(){
        System.out.println("countCharacter() 실행");
    }
    public void countInChar(){
        System.out.println("countInchar() 실행");
    }
}

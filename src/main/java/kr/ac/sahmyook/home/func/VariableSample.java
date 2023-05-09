package kr.ac.sahmyook.home.func;
import kr.ac.sahmyook.home.view.Menu;

import java.util.*;

public class VariableSample {

    int choice;



    public void VarSample(){
        do{
            Scanner sc = new Scanner(System.in);

            System.out.println("--------------------------------");
            System.out.println("1. 내 신상정보 변수에 담아 출력하기");
            System.out.println("2. 사원정보를 키보드로 입력받아 출력하기");
            System.out.println("3. 이전 메뉴로 가기");
            System.out.println("원하시는 메뉴 번호를 입력해주세요. :");
            choice =sc.nextInt();

            switch(choice){
                case 1:
                    sc.nextLine();
                    System.out.println("이름을 입력해주세요. : ");
                    String name = sc.nextLine();
                    System.out.println("나이를 입력해주세요. : ");
                    String age = sc.nextLine();
                    System.out.println("주소를 입력해주세요. : ");
                    String addr = sc.nextLine();
                    System.out.println("원하시는 메뉴 번호를 입력해주세요. :");

                    System.out.println("이름 : " + name);
                    System.out.println("나이 : " + age);
                    System.out.println("주소 : " + addr);

                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("사원의 이름을 입력해주세요. : ");
                    String sname = sc.nextLine();
                    System.out.println("사원의 나이를 입력해주세요 : ");
                    int sage = sc.nextInt();
                    sc.nextLine();
                    System.out.println("사원의 사원번호를 입력해주세요. : ");
                    String snum = sc.nextLine();
                    System.out.println("원하시는 메뉴 번호를 입력해주세요 :");

                    System.out.println("사원이름 : " + sname);
                    System.out.println("사원나이 : " + sage);
                    System.out.println("사원번호 : " + snum);

                    break;
                case 3:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;

                default:
                    break;
            }
        }while(choice != 3);
    }
}
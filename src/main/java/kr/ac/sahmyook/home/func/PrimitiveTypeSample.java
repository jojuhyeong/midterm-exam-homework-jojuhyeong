package kr.ac.sahmyook.home.func;
import kr.ac.sahmyook.home.view.Menu;

import java.util.*;

public class PrimitiveTypeSample {
    public void PtypeSample(){

        int choice;
        String dataType;
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("--------------------------------");
            System.out.println("1. 기본자료형 메모리 크기(byte) 출력하기");
            System.out.println("2. 이전 메뉴로 가기");
            System.out.println("원하시는 메뉴 번호를 입력해주세요 :");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    sc.nextLine();
                    System.out.println("원하시는 자료형을 입력해주세요. :");
                    dataType = sc.nextLine();
                    if(dataType.equals("int")){
                        System.out.print(dataType+"의 크기는"+Integer.SIZE +"byte입니다.\n");
                        break;
                    }
                    else if(dataType.equals("double")){
                        System.out.print(dataType+"의 크기는"+Double.SIZE +"byte입니다.\n");
                        break;
                    }
                    else if(dataType.equals("string")){
                        System.out.print(dataType+"의 크기는 유동적입니다!.\n");
                        break;
                    }
                    else if(dataType.equals("char")){
                        System.out.print(dataType+"의 크기는"+Character.SIZE +"byte입니다.\n");
                        break;
                    }



                case 2:
                    System.out.println("메인 메뉴로 돌아갑니다.");

                    return;

                default:
                    System.out.println("잘못된 값을 입력했습니다.");

            }
        }while(choice != 2);
    }
}

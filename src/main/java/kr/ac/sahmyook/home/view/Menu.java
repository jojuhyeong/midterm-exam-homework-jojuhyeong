package kr.ac.sahmyook.home.view;
import kr.ac.sahmyook.home.func.*;
import java.util.*;
public class Menu {

    public void mainMenu(){
        int choice;

        do{
            Scanner sc = new Scanner(System.in);

            System.out.println("***** 프로그래밍 기본 기능 테스트 프로그램 *****");
            System.out.println("1번. 변수 테스트");
            System.out.println("2번. 기본 자료형 테스트");
            System.out.println("3번. if문 테스트");
            System.out.println("4번. switch문 테스트");
            System.out.println("5번. for문 테스트");
            System.out.println("6번. while문 테스트");
            System.out.println("7번. do~while문 테스트");
            System.out.println("8번. break문 테스트");
            System.out.println("9번. continue문 테스트");
            System.out.println("10번. static 메소드 사용 테스트");
            System.out.println("11번. non-static 메소드 사용 테스트");
            System.out.println("12번. 프로그램 종료");
            System.out.println("원하시는 메뉴 번호를 입력해주세요 :");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                   subVarMenu();
                    break;
                case 2:
                    subPTypeMenu();
                    break;
                case 3:
                    subIfMenu();
                    break;
                case 4:
                    subSwitchMenu();
                    break;

                case 5:
                    subForMenu();
                    break;

                case 6:
                    subWhileMenu();
                    break;

                case 7:
                    subDoWhileMenu();
                    break;

                case 8:
                    subBreakMenu();
                    break;

                case 9:
                    subContinueMenu();
                    break;

                case 10:
                    subStaticMethodMenu();
                    break;

                case 11:
                    subNonStaticMethodMenu();

                    break;

                case 12:


                    System.out.println("정말로 종료하겠습니까? (예:Y/아니오:N)");
                    sc.nextLine();
                    String yn = sc.nextLine();
                    if(yn.equals("y")){
                    //주성이한테 물어보기
                    }
                    else if(yn.equals("n")){
                        choice = 0;
                    }
                    break;
            }

        }while(choice != 12);


    }
    public void subVarMenu(){
        VariableSample vs = new VariableSample();
        vs.VarSample();
    }
    public void subPTypeMenu(){
        PrimitiveTypeSample ps = new PrimitiveTypeSample();
        ps.PtypeSample();
    }
    public void subIfMenu(){
        int choice;

        do{
            IfSample is = new IfSample();
            Scanner sc = new Scanner(System.in);
            System.out.println("================= if문 테스트 메뉴 =================");
            System.out.println("1. 두 개의 정수를 입력받아, 두 수중 큰 값 출력하기");
            System.out.println("2. 두 개의 정수를 입력받아, 두 수중 작은 값 출력하기");
            System.out.println("3. 세 개의 정수를 입력받아, 세 수중 가장 큰수와 가장 작은수 출력하기");
            System.out.println("4. 한 개의 정수를 입력받아, 짝수인지 홀수인지 출력하기");
            System.out.println("5. 국,영,수 세 과목의 점수를 입력받아, 합격/불합격 확인하기");
            System.out.println("6. 점수를 입력받아, 학점 확인하기");
            System.out.println("7. 한 개의 정수를 입력받아, 양수인지 0인지 음수인지 확인하기");
            System.out.println("8. 문자 하나를 입력받아, 영어대문자인지 소문자인지 숫자문자인지 기타문자인지 확인하기");
            System.out.println("9. 이전 메뉴로 가기");
            System.out.println("메뉴 번호를 입력해주세요 : ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    is.maxNumber();
                    break;
                case 2:
                    is.minNumber();
                    break;
                case 3:
                    is.threeMaxMin();
                    break;
                case 4:
                    is.checkEven();
                    break;
                case 5:
                    is.isPassFail();
                    break;
                case 6:
                    is.scoreGrade();
                    break;
                case 7:
                    is.checkPlusMinusZero();
                    break;
                case 8:
                    is.whatCharacter();
                    break;
                case 9:
                    System.out.println("메인메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("올바른 메뉴 번호를 입력하세요");
                    return;

            }


        }while(choice != 9);
    }
    public void subSwitchMenu(){
        int choice;
        do{
            SwitchSample ss = new SwitchSample();
            Scanner sc = new Scanner(System.in);
            System.out.println("1. 두 개의 정수와 한 개의 연산문자를 입력받아 계산한 결과 확인하기");
            System.out.println("2. 과일이름을 문자열로 입력받아, 그 과일의 가격 출력하기");
            System.out.println("3. 이전 메뉴로 가기");
            System.out.println("메뉴 번호를 입력해주세요 : ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    ss.caculator();
                    break;
                case 2:
                    ss.fruitPrice();
                    break;
                case 3:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("올바른 메뉴 번호를 입력해주세요");
            }
        }while(choice != 3);
    }
    public void subForMenu(){

        int choice;

        do{
            Scanner sc = new Scanner(System.in);
            ForSample fs = new ForSample();

            System.out.println("1. 1~10까지 정수들의 합계 구하기");
            System.out.println("2. 1~100사이의 짝수들의 합게 구하기");
            System.out.println("3. 정수 하나 입력받아, 그 수의 구구단 출력하기");
            System.out.println("4. 두 개의 정수를 입력받아, 두 수중 작은 값에서 큰 값까지의 합계 구하기");
            System.out.println("5. 줄수와 칸수 입력받아, 입력된 줄수/칸수만큼 별표문자 출력하기");
            System.out.println("6. 7줄에 7칸에 별표문자 출력하되, 각 줄에 줄번호와 같은 칸에 숫자 출력하기");
            System.out.println("7. 줄수를 입력받아, 삼각형 모양으로 별표문자 출력하기(양수:직각삼각형, 음수:역삼각형)");
            System.out.println("8. 구구단 2단부터 9단까지 출력하기");
            System.out.println("9. 이전 메뉴로 가기");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    fs.sum1to10();
                    break;
                case 2:
                    fs.sum1to100();
                    break;
                case 3:
                    fs.oneGugudan();
                    break;
                case 4:
                    fs.sumMintoMax();
                    break;
                case 5:
                    fs.printStar();
                    break;
                case 6:
                    fs.printNumberStar();
                    break;
                case 7:
                    fs.printTriangleStar();
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("올바른 메뉴 번호를 입력하세요");
                    return;
            }
        }while(choice != 9);

    }

    public void subWhileMenu(){
        int choice;
        do{
            WhileSample ws = new WhileSample();
            Scanner sc = new Scanner(System.in);
            System.out.println("1. 문자 하나 입력받아, 그 문자의 유니코드 출력 반복('0' 입력되면 반복종료)");
            System.out.println("2. 1~100까지 정수들의 합계 출력하기(while 문으로 작성");
            System.out.println("3. 1~100사이의 임의의 정수를 발생시켜, 숫자 알아맞추기");
            System.out.println("4. 문자열을 입력받아, 글자 갯수 알아내어 출력하기");
            System.out.println("5. 문자열값과 문자 하나를 입력받아, 문자열에 문자가 몇 개 있는지 확인하기");
            System.out.println("6. 이전 메뉴로 가기");
            System.out.println("메뉴 번호를 입력해주세요 : ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    ws.printUniCode();
                    break;
                case 2:
                    ws.sum1to100();
                    break;

                case 3:
                    ws.numberGame();
                    break;
                case 4:
                    ws.countCharacter();
                    break;
                case 5:
                    ws.countInChar();
                    break;
                case 6:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("올바른 메뉴 번호를 입력하세요");
                    return;

            }
        }while(choice != 6);
    }


    public void subDoWhileMenu(){
        int choice;
        do{
            DoWhileSample dws = new DoWhileSample();
            Scanner sc = new Scanner(System.in);
            System.out.println("1. 문자열값 입력받아, 문자 사이에 '-' 끼워넣어 출력하기");
            System.out.println("2. 버거킹 메뉴 주문 테스트");
            System.out.println("3. 문자열 입력받아 영문자인지 아닌지 출력하기");
            System.out.println("4. 이전 메뉴로 가기");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    dws.addDashToken();
                    break;
                case 2:
                    dws.burgerKingMenu();
                    break;
                case 3:
                    dws.isStringAlphabet();
                    break;
                case 4:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("올바른 메뉴 번호를 입력하세요");
                    return;
            }
        }while(choice != 4);
    }
    public void subBreakMenu(){
        int choice;
        do{
            BreakSample bs = new BreakSample();
            Scanner sc = new Scanner(System.in);
            System.out.println("1. 1~100 정수들의 합계 출력하기");
            System.out.println("2. 구구단 1~9단까지 출력하기");
            System.out.println("3. 이전 메뉴로 가기");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    bs.sumBreak();
                    break;
                case 2:
                    bs.guguDanBreak();
                    break;
                case 3:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("올바른 메뉴 번호를 입력하세요");
                    return;
            }
        }while(choice != 3);
    }


    public void subContinueMenu(){
        int choice;
        do{
            ContinueSample cs = new ContinueSample();
            Scanner sc = new Scanner(System.in);
            System.out.println("1. 1~100까지의 정수 중 3의 배수를 뺀 정수들의 합계 출력하기");
            System.out.println("2. 3행 5열의 행열값 출력하되, 1행 3열부터 1행 5열까지 생략하고 출력하기");
            System.out.println("3. 이전 메뉴로 가기");

            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    cs.sumJumpThree();
                    break;
                case 2:
                    cs.rowColJump();
                    break;
                case 3:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("올바른 메뉴 번호를 입력하세요");
                    return;
            }
        }while(choice != 3);
    }

    public void subStaticMethodMenu(){
        int choice;
        do{
            StaticMethodSample sms = new StaticMethodSample();
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Math 클래스의 랜덤값 구하는 메소드 : 1~45사이의 임의의 정수 출력");
            System.out.println("2. Math 클래스의 실수값에 대한 절대값 구하는 메소드 : -12.77 절대값 출력하기");
            System.out.println("3. Math 클래스의 두 정수중 큰값 구하는 메소드 : 120, 54 중 큰값 출력하기");
            System.out.println("4. 이전 메뉴로 가기");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    sms.testMathRandom();
                    break;
                case 2:
                    sms.testMathAbs();
                    break;
                case 3:
                    sms.testMathMax();
                    break;
                case 4:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("올바른 메뉴 번호를 입력하세요");
                    return;
            }
        }while(choice != 4);
    }
    public void subNonStaticMethodMenu(){
        int choice;
        do{
            NonStaticMethodSample nss = new NonStaticMethodSample();
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Math 클래스의 랜덤값 구하는 메소드 : 1~45사이의 임의의 정수 출력");
            System.out.println("2. Math 클래스의 실수값에 대한 절대값 구하는 메소드 : -12.77 절대값 출력하기");
            System.out.println("3. 이전 메뉴로 가기");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    nss.testScanner();
                    break;
                case 2:
                    nss.testRandom();
                    break;
                case 3:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("올바른 메뉴 번호를 입력하세요");
                    return;
            }
        }while(choice != 4);
    }
}


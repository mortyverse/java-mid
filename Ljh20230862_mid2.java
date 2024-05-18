import java.util.Scanner;

public class Ljh20230862_mid2 {

	public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int userHp = 100, computerHp = 100;

        while(true) {
            //사용자 가위, 바위, 보 생성
            System.out.println("묵찌빠 게임을 시작합니다. 현재 체력은 컴퓨터 : " + computerHp + ", 당신 : " + userHp + "입니다.");
            System.out.println("먼저 묵 찌 빠 중 하나를 입력하세요.");
            String firstUser = c.next();


            // 컴퓨터 가위, 바위, 보 생성
            int firstRandInt = (int)(Math.random()*3);
            String computerFirst = switch (firstRandInt) {
                case 0 -> "찌";
                case 1 -> "묵";
                case 2 -> "빠";
                default -> "코드를 새로고침 해주세요";
            };

            System.out.println();
            System.out.println("당신은 " + firstUser + " 을/를 냈고, 컴퓨터는 " + computerFirst + " 을/를 냈습니다.");
            System.out.println();
            
            // 비겨서 묵찌빠 시작이 안되는 경우
            if (firstUser.equals(computerFirst)) {
                System.out.println("비겼습니다. 가위 바위 보 부터 다시 시작합니다.");
                continue;
            }

            System.out.println("묵찌빠 기회는 5번이고, 5번 같은 패를 내면 가위바위보부터 다시 시작합니다.");
            
            // 묵찌빠 변형게임 시작
            for (int i=0; i<5; i++) {
            	System.out.println(firstUser + "에 " + firstUser + "에 ~ ?");
            	
                String secondUser = c.next();
                
                int secondRandInt = (int)(Math.random()*3);
                String computerSecond = switch (secondRandInt) {
                    case 0 -> "찌";
                    case 1 -> "빠";
                    case 2 -> "묵";
                    default -> "코드를 새로고침 해 주세요.";
                };

                if (secondUser.equals(computerSecond)) {
                    System.out.println("비겼습니다.");
                    continue;
                } else if ((secondUser.equals("찌") && computerSecond.equals("묵")) || (secondUser.equals("묵") && computerSecond.equals("빠")) || (secondUser.equals("빠") && computerSecond.equals("찌"))) {
                    System.out.println("아쉽게도 당신이 졌습니다 ㅠㅠ");
                    userHp -= 10;
                } else {
                    System.out.println("축하드립니다! 이겼습니다.");
                    computerHp -= 10;
                }

                System.out.println("당신의 패는 " + secondUser + ", 컴퓨터의 패는 " + computerSecond + " 입니다.");
                break;
            }
            
            // 컴퓨터 또는 사용자 둘중 하나의 체력이 0이 되면 종료함
            if (userHp == 0) {
                System.out.println("현재 체력은 컴퓨터 : " + computerHp + ", 당신 : " + userHp + "입니다.");
                System.out.println("당신 체력이 0이 되어서 졌습니다. 유감입니다. 게임을 종료합니다.");
                break;
            } else if (computerHp == 0) {
                System.out.println("현재 체력은 컴퓨터 : " + computerHp + ", 당신 : " + userHp + "입니다.");
                System.out.println("컴퓨터의 체력이 0이 되어서 당신이 이겼습니다. 축하합니다. 게임을 종료합니다.");
                break;
            }
        }
        c.close();
	}

}

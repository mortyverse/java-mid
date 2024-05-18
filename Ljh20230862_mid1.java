import java.util.Scanner;

public class Ljh20230862_mid1 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(true) {
            //사용자 가위, 바위, 보 생성
            System.out.println("가위 바위 보 게임을 시작합니다. 가위/바위/보 중 하나를 입력하세요 : ");
            String user = s.next();
            
            // 컴퓨터 가위, 바위, 보 생성
            int randInt = (int)(Math.random()*3);
            String computer = switch (randInt) {
                case 0 -> "가위";
                case 1 -> "바위";
                case 2 -> "보";
                default -> "코드를 새로고침 해주세요";
            };
            
            // 게임 시작
            if (user.equals(computer)) {
                System.out.println("비겼습니다.");
            } else if ((user.equals("가위") && computer.equals("바위")) || (user.equals("바위") && computer.equals("보")) || (user.equals("보") && computer.equals("가위"))) {
                System.out.println("아쉽게도 당신이 졌습니다 ㅠㅠ");
            } else {
                System.out.println("축하드립니다! 이겼습니다.");
            }
            System.out.println("당신의 패는 " + user + ", 컴퓨터의 패는 " + computer + " 입니다.");
            
            // 그만하기 선택
            System.out.println("그만하시겠습니까? y 를 입력하면 종료합니다 : ");
            String stop = s.next();
            if (stop.equals("y") || stop.equals("Y")) {
                break;
            }
        }
        s.close();
	}
}
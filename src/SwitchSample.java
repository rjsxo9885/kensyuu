import java.util.Scanner;
public class SwitchSample {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
         Scanner sc = new Scanner(System.in);
        int rank;
        System.out.println("점수를 입력하세요");
        int score = sc.nextInt();

        if(score >=90) {
            rank = 1;

        }else if(score>=80) {
            rank =2;
        }else if(score>=70) {
            rank =3;
        }else if(score>=60) {
            rank =4;
        }else {
            rank=5;
        }

        switch(rank) {

        case 1:System.out.println("1등급입니다"); break;
        case 2:System.out.println("2등급입니다"); break;
        case 3:System.out.println("3등급입니다"); break;
        case 4:System.out.println("4등급입니다"); break;
        case 5:System.out.println("낙제입니다 좀더 분발합시다"); break;

        }

    }

}

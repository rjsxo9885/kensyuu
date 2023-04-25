import java.util.Scanner;

public class IfSample {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
       /* System.out.println("점수를 입력하세요");
        int score = sc.nextInt();
        
       
        if(score>=70) {
            
            System.out.println("합격입니다");
        }else {
            System.out.println("불합격입니다");
        }
        */
        
        System.out.println("점수를 입력하세요");
        int score =sc.nextInt();
        
        if(score >= 80) {
            System.out.println("수");
        }else if(score >=70) {
            System.out.println("우");
        }else if(score >=60) {
            System.out.println("미");
        }else if(score >=50) {
            System.out.println("양");
        }else {
            System.out.println("가");
        }
    }

}

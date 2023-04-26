package JavaImport;

public class StringComparison1 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ



        String abc = new String("abc");
        String abc1 = new String("abc");


        if(abc==abc1) {

            System.out.println("이건 동일합니다");
        }else {
            System.out.println("동일하지 않습니다");
        }

        if(abc.equals(abc1)) {
            System.out.println("문자가 일치합니다");
        }else {
            System.out.println("문자열이 일치하지 않습니다");
        }


        String str = "아이우에오";
        String sub = str.substring(1, 3);
        System.out.println(sub);                //문자열 자르기


        if(str.substring(1,3).equals("이우")) {
            System.out.println("일치");
        }else {
            System.out.println("일치하지 않습니다");
        }
        String dol = "100ドル";
        String str1 = dol.replaceAll("ドル", "円");  //문자 재배치
        System.out.println(str1);

        
        
    }

}

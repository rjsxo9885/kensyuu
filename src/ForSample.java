
public class ForSample {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

       /* for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }*/
        
        
        
        int [] i = {10,20,30,40,50};
        
        int sum = 0;
        double average = 0;
        for(int data:i) {
            sum= sum+data;
            
        }
        
        average = sum/i.length;
        
        System.out.println("평균점은 "+(int)average+"입니다");
        
        
    }

}

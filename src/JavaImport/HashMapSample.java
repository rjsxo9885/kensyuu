package JavaImport;
import java.util.HashMap;

public class HashMapSample {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        HashMap<String, String> hm = new HashMap<String, String>();

        // HashMapにキーと値を追加
        hm.put("GK", "中村");
        hm.put("DF", "岩波");
        hm.put("MF", "南野");
        hm.put("FW", "浅野");

        // キーを指定して値を取得
        String member = hm.get("FW");
        System.out.println(member);

        // サイズを確認する
        int size = hm.size();
        System.out.println(size);

        // 全部出力する
        for (String key : hm.keySet()) {
          //  System.out.println(key + ":" + hm.get(key));
            System.out.printf("key의 값은 %s 입니다 \n",hm.get(key));
        }

    }

}

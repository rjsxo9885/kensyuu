package SuperSample;

import Object.Character;
public class Hero extends Character{

    private int weapon; // 武器の強さ

    // getter
    public int getWeapon() {
        return weapon;
    }

    // setter
    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    // 引数なしのコンストラクタ
    public Hero() {
    }

    // 引数ありのコンストラクタ
    public Hero(String name, int hp, int offense, int defense, int weapon) {
        super(name, hp, offense, defense); // スーパークラス(Character)のコンストラクタを呼び出し
        this.weapon = weapon;
    }

    public void attack(Character opponent) {

        int damage = super.getOffense()+this.getWeapon() - opponent.getDefense();

        if(damage >0) {

            opponent.setHp(opponent.getHp() - damage);
            System.out.printf("%s는%s에게 %d의 데미지를 주었다",super.getName(),opponent.getName(),damage);
        }else {
            System.out.printf("미스! %s는 %s에게 데미지를 주지 못하였어!",super.getName(),opponent.getName());
        }
    }
    public void magic_attack(Character opponent) {
     // 固定で5のダメージを与える
        int damage = 5;
        opponent.setHp(opponent.getHp() - damage);
        System.out.println(this.getName() + " は魔法で " + opponent.getName() + " に " + damage + " のダメージを与えた！");
    }

}

import java.util.Scanner; //ユーザーからの入力を受け取るためのクラス
import java.util.Random; //ランダムな値を生成するためのクラス

public class JankenGame { //クラス名はファイル名と一致させる必要がある
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); //キーボードで入力できるようにする
        Random random = new Random(); //ランダムな手を生成する準備

        System.out.println("あなたの名前を入力してください");
        String name = scanner.nextLine(); //入力された1行のテキストを取得
        System.out.println("こんにちは" + name + "さん"); //ゲーム前の挨拶
        System.out.println("じゃんけんしよう！");
        System.out.println("0: グー, 1: チョキ, 2: パー");

        System.out.println("あなたの手を入力してください（0〜2）");
        int playerHand = scanner.nextInt(); // ユーザーが入力した数値を取得

        //入力が正しいかチェック
        if (playerHand < 0 || playerHand > 2) {
            System.out.println("無効な入力です。0〜2を入力してください。");
            return;
        }

        //コンピューターの手をランダムで決める(0〜2)
        int computerHand = random.nextInt(3);

         // 手の名前を文字列で表示するための配列
         String[] hands = {"グー", "チョキ", "パー"};

         //両者の手を表示
         System.out.println("あなたの手: " + hands[playerHand]);
         System.out.println("コンピューターの手: " + hands[computerHand]);

         //勝敗判定

         if (playerHand == computerHand) {
            System.out.println("あいこです！");
         } else if ((playerHand == 0 && computerHand == 1) ||
                    (playerHand == 1 && computerHand == 2) ||
                    (playerHand == 2 && computerHand == 0)) {
            System.out.println("あなたの勝ちです！");
         } else {
            System.out.println("あなたの負けです！");
         }
         scanner.close();
    }
}

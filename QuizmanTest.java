 public class QuizmanTest{
       public static void main(String[] args){
         // Quizmanインスタンスを新規作成する
         Quizman qm = new Quizman();
           
         // メソッドを実行して、動作を確認する
         if(qm.hantei(17)){
           System.out.println("あたり");
         } else {
           System.out.println("hazure");
         }
       }
     }
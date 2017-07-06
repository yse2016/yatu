class InterfaceMan{
      private String msgInput = "数を入力してください >";
      private String msgAtari = "あたり";
      private String msgHazure = "はずれ";
      private int uAnswer;
      
    
      public void kazu(){
            System.out.println(msgInput);
            uAnswer = new java.util.Scanner(System.in).nextInt();
            return uAnswer;
      }
      public void showMsgInput(){
      
      }
      public int getUserAnswer(){
      }

      public void showMsgAtari(){
      }
      public void showMsgHazure(){
      }
    }

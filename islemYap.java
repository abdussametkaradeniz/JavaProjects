public class islemYap {
    public class DahiliUyeSinifi{

        public void OrnekMetot1(){
            System.out.println("ornek metot 1 calisti");
        }
        public void OrnekMetot2(int a, int b){
            System.out.println(a+b);
        }

    }

    public static void main(String[] args) {
        islemYap.DahiliUyeSinifi m1 = new islemYap().new DahiliUyeSinifi();

        m1.OrnekMetot1();
        m1.OrnekMetot2(3 , 4);

    }

}

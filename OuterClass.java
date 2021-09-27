public class OuterClass {
    
    private String sinifDeg = "abdussamet karadeniz";

    public static void main(String[] args) {
        OuterClass o1 = new OuterClass();
        o1.dahiliSinifNesneOlustur();
    }

    private void dahiliSinifNesneOlustur(){
        InnerClass i1 = new InnerClass();
        i1.EkranaYaz();
    }

    private class InnerClass{

        public void EkranaYaz(){
            System.out.println("outer sinif degiskeni " + sinifDeg);
        }

    }


}

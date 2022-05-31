package inFlearn;

public class Samaple11 {
    public static void main(String[] args) {
//        for(int i=2; i<10;i++){
//            for(int j=1; j<10;j++) {
//                System.out.println("구구단은 " + i + '*' + j + '=' + (i * j));
//            }
//        }
//        for(int i=0;i<10;i++){
//            int random = (int)(Math.random()*10);
//            System.out.println("random " + random);
//        }

        StringBuilder sbPlus = new StringBuilder();
        String[] arrstr = new String[]{"가","나","다","라"};

        for(int i=0;i<10;i++){
            int mathRandom = (int)(Math.random()*4);
            System.out.println(arrstr[mathRandom]);
            sbPlus.append(arrstr[mathRandom]);
        }
        System.out.println(sbPlus.toString());
    }
}

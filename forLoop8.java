package inFlearn;

import java.util.ArrayList;

public class forLoop8 {
    public static void main(String[] args) {
//        for(int i =0;i<6;i++){
//            System.out.println("i는 " + i + " 입니다");
//        }
        ArrayList<String> strList = new ArrayList<>();
        strList.add("총부무");
        strList.add("회계무");
        strList.add("재무무");
        strList.add("기획무");
        strList.add("인사무");

        for(String str : strList){
            System.out.println("부서는: " + str);
        }

        for(int i=2; i<10;i++){
            for(int j=1; j<10;j++){
                System.out.println("구구단은 " + i +'*'+ j + '=' +(i*j));
            }
        }
    }
}

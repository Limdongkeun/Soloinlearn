package inFlearn.Prtice1;

public class ObjClass01 {
    public static void main(String[] args) {

        ProcureItemVO procureItemVo = new ProcureItemVO();

        System.out.println("아무것도 셋팅하지 않은 객체 :::"  + procureItemVo.toString());

        procureItemVo.setId(1);
        procureItemVo.setName("옥수수");
        procureItemVo.setPrice(10000);
        procureItemVo.setQuantity(2);

        System.out.println(procureItemVo.toString());
    }
}

package inFlearn.Pratice3.jth.world.main;

import inFlearn.Pratice3.jth.world.vo.chemical.Hcc;
import inFlearn.Pratice3.jth.world.vo.chemical.LGChem;

public class MainMethod {
    public static void main(String[] args) {

        //기업정보 셋팅
        //한화솔루션 케미칼

        Hcc hcc = Hcc.getInstance();
        String hccName = String.valueOf("한화솔루션케미칼");
        String hccCompanyProperty = String.valueOf("화학");
        String hccHeadOfficeAddress = String.valueOf("서울 특별시 중구 청계천로");
        int hccTotalEmployee = 5730;
        int hccSalesAmount = 34493;
        int hccPropertyAmount = 82446;
        int hccDebAmount = 32289;

        hcc.setCompanyName(hccName);
        hcc.setCompanyProperty(hccCompanyProperty);
        hcc.setHeadOfficeAddress(hccHeadOfficeAddress);
        hcc.setTotalEmployee(hccTotalEmployee);
        hcc.setSalesAmount(hccSalesAmount);
        hcc.setPropertyAmount(hccPropertyAmount);
        hcc.setDebtAmount(hccDebAmount);
        hcc.setCapitalAmount(hccPropertyAmount, hccDebAmount);

        //엘지화학
        LGChem lgChem = LGChem.getInstance();
            String lgChemName = String.valueOf("엘지화학");
        String lgChemCompanyProperty = String.valueOf("화학");
        String lgChemHeadOfficeAddress = String.valueOf("서울 영등포구 여의대로");
        int lgChemTotalEmployee = 20073;
        int lgChemSalesAmount = 286250;
        int lgChemPropertyAmount = 340244;
        int lgChemDebAmount = 166406;

        lgChem.setCompanyName(lgChemName);
        lgChem.setCompanyProperty(lgChemCompanyProperty);
        lgChem.setHeadOfficeAddress(lgChemHeadOfficeAddress);
        lgChem.setTotalEmployee(lgChemTotalEmployee);
        lgChem.setSalesAmount(lgChemSalesAmount);
        lgChem.setPropertyAmount(lgChemPropertyAmount);
        lgChem.setDebtAmount(lgChemDebAmount);
        lgChem.setCapitalAmount(lgChemPropertyAmount, lgChemDebAmount);

        System.out.println(hcc.toString());
        System.out.println(lgChem.toString());

    }
}

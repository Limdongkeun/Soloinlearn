package inFlearn.Prtice1;

public class ObjClass02 {
    public static void main(String[] args) {

        ProcurementDocument procurementDocument = new ProcurementDocument();

        procurementDocument.procureRequestDocumentQty = 10;
        procurementDocument.orderRequestDocumentQty = 5;
        procurementDocument.orderDocumentQty = 3;
        procurementDocument.contractDocumentQty = 20;
        procurementDocument.estimateDocumentQty = 25;

        System.out.println(procurementDocument.procureRequestDocumentQty);
        System.out.println(procurementDocument.orderRequestDocumentQty);
        System.out.println(procurementDocument.orderDocumentQty);
        System.out.println(procurementDocument.contractDocumentQty);
        System.out.println(procurementDocument.estimateDocumentQty);

        int getTotalDocuQty = procurementDocument.totalDocumentQtyDailyMake();
        System.out.println("getTotalDocuQty :::" + getTotalDocuQty);

        int getStatictotalDocuQty = procurementDocument.staticValueCalculateDailyDocument();
        System.out.println("getStaictotalDocuQty :::" + getStatictotalDocuQty);
    }
}

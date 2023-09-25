// Source code is decompiled from a .class file using FernFlower decompiler.
public class StudentC extends Student{
    private String khoiC;
    public StudentC(String sbd, String name, String priority, String khoiC){
        super(sbd, name, priority);
        this.khoiC = khoiC;
    }
    public void setKhoiB(String khoiB) {
        this.khoiC = khoiB;
    }
    public String getKhoiB() {
        return khoiC;
    }
    @Override
    public String toString(){
        return "Khoi C: {" +
                "So bao danh: " + sbd +'\''+
                "Ho ten: "+ name+'\''+
                "Muc uu tien: "+priority+'\''+
                "Khoi "+khoiC + " thi mon: Van, Su, Dia" + '\''+'}';
    }
}
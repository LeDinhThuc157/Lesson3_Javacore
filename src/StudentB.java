public class StudentB extends Student{
    private String khoiB;
    public StudentB(String sbd, String name, String priority, String khoiB){
        super(sbd, name, priority);
        this.khoiB = khoiB;
    }
    public void setKhoiA(String khoiA) {
        this.khoiB = khoiA;
    }
    public String getKhoiA() {
        return khoiB;
    }
    @Override
    public String toString(){
        return "Khoi B: {" +
                "So bao danh: " + sbd +'\''+
                "Ho ten: "+ name+'\''+
                "Muc uu tien: "+priority+'\''+
                "Khoi "+khoiB + " thi mon: Toan, Hoa, Sinh" + '\''+'}';
    }
}
public class StudentA extends Student{
    private String khoiA;
    public StudentA(String sbd, String name, String priority, String khoiA){
        super(sbd, name, priority);
        this.khoiA = khoiA;
    }
    public void setKhoiA(String khoiA) {
        this.khoiA = khoiA;
    }
    public String getKhoiA() {
        return khoiA;
    }
    @Override
    public String toString(){
        return "Khoi A: {" +
                "So bao danh: " + sbd +'\''+
                "Ho ten: "+ name+'\''+
                "Muc uu tien: "+priority+'\''+
                "Khoi "+khoiA + " thi mon: Toan, Ly, Hoa" + '\''+'}';
    }
}

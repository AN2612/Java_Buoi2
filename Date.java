import java.time.LocalDate;

public class Date {
    private int ngay;
    private int thang;
    private int nam;
    public Date(){};
    public Date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    public void hienThi(){
        System.out.println("the day is "+ ngay);
    }
    public boolean hopLe(){
        
    }
    
}

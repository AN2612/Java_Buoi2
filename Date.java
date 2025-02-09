import java.util.Scanner;

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
        System.out.println("The day is "+ ngay + "/" + thang + "/" + nam);
    }
    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ngay: ");
        this.ngay = scanner.nextInt();
        System.out.println("Nhap thang: ");
        this.thang = scanner.nextInt();
        System.out.println("Nhap nam: ");
        this.nam = scanner.nextInt();
        if(!hopLe()){
            System.out.println(" Vui long nhap lai! Thong tin khong hop le.");
            nhapThongTin();
        }
    }
    public int ngayTrongThang(){
        if(thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12){
            return 31;
        } else if(thang == 4 || thang == 6 || thang == 9 || thang == 11){
            return 30;
        } else {
            if(nam % 4 == 0){
                if(nam % 100 == 0){
                    if(nam % 400 == 0){
                        return 29;
                    } else {
                        return 28;
                    }
                } else {
                    return 29;
                }
            } else {
                return 28;
            }
        }
    }
    public boolean hopLe(){
        if(this.thang>0 && this.thang <=12){
            if(this.ngay > 0 && this.ngay <= ngayTrongThang()){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    public Date ngayHomSau(){
        int plus_day;
        int plus_month;
        if(this.ngay < ngayTrongThang()){
             plus_day = this.ngay + 1;
            return new Date(plus_day,this.thang,this.nam);
            
        }else if(this.ngay == ngayTrongThang() && this.thang <12 ){
                 plus_day = 1;
                 plus_month = this.thang + 1;
                 return new Date(plus_day,plus_month,this.nam);
                
        }
        return new Date(1,1,this.nam+1);
        
    }
    public Date congNgay(int n) {
        int sum_day = this.ngay + n;
        int thangHienTai = this.thang;
        int namHienTai = this.nam;
        
        while (sum_day > ngayTrongThang()) {
            sum_day -= ngayTrongThang();
            thangHienTai++;
            if (thangHienTai > 12) {
                thangHienTai = 1;
                namHienTai++;
            }
        }
        
        return new Date(sum_day, thangHienTai, namHienTai);
    }
}

public class SDDate {
    public static void main(String[] args) {
        Date date = new Date();
        date.nhapThongTin();
        date.hienThi();
        Date ngayHomSau = date.ngayHomSau();
        ngayHomSau.hienThi();
        Date ngayCong =  date.congNgay(20);
        ngayCong.hienThi();
    }
    
}

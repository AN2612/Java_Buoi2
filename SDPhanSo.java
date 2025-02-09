import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SDPhanSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhanSo a = new PhanSo(3,7);
        PhanSo b = new PhanSo(4,9);
        a.hienThi();
        b.hienThi();

        PhanSo x = new PhanSo();
        PhanSo y = new PhanSo();
        x.nhap();
        y.nhap();
        System.out.printf("Phan so x: ");
        x.hienThi();
        System.out.printf("Phan so y: ");
        y.hienThi();
        PhanSo nghichDao_x = x.giaTriNghichDao();
        System.out.printf("Nghich dao phan so x: ");
        nghichDao_x.hienThi();
        PhanSo tong_x_y= x.cong(y);
        System.out.printf("Tong x va y: ");
        tong_x_y.hienThi();
        List<PhanSo> danhsach = new ArrayList<>();
        System.out.println("nhap mot so nguyen n");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap nhung phan so theo dinh dang sao (a/b)!");
        for(int i = 0 ; i < n ; i++){
             try{
                String fraction = scanner.nextLine();
                String[] parts = fraction.split("/");
                int Tu_So = Integer.parseInt(parts[0]);
                 int Mau_So = Integer.parseInt(parts[1]);
                PhanSo PhanSo_from_user = new PhanSo(Tu_So,Mau_So); 
                danhsach.add(i, PhanSo_from_user);
             }catch(Exception e){
                System.out.println("ban da nhap sai dinh dang vui long nhap lai");
             }
        }
        double sum_danhsach = 0;
        for(int i = 0 ; i < n ; i++){
            sum_danhsach += danhsach.get(i).giaTriThuc();
        }
        System.out.println("Sum of the fractions: " + sum_danhsach);
        Collections.sort(danhsach, new Comparator<PhanSo>() {
            @Override
            public int compare(PhanSo p1, PhanSo p2) {
                return Double.compare(p1.giaTriThuc(), p2.giaTriThuc());
            }
        });
        System.out.println("Gia tri phan so tang dan: ");
        for(PhanSo e: danhsach){
            e.hienThi();
        }
           
    }
}

import java.util.Scanner;

public class PhanSo {
    private int tu;
    private int mau;

    public PhanSo() {
        this.tu = 0;
        this.mau = 1;
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau; 
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        this.tu = scanner.nextInt();
        System.out.print("Nhap tu mau: ");
        while(true){
        this.mau = scanner.nextInt();
        if(this.mau == 0 ){
            System.out.println("Mau so phai khac 0");
            this.mau = scanner.nextInt();
        }else{
            break;
        }
    }
}

    public void hienThi() {
        if (tu == 0) {
            System.out.println(0);
        } else if (mau == 1) {
            System.out.println(tu);
        } else {
            if(tu*mau < 0){
                int a = (tu>0 && mau < 0)?-tu:tu;
                int b = (tu>0 && mau < 0)?-mau:mau;
                System.out.println(a + "/" + b);
            }else{
                int m = (tu<0 && mau < 0)?-tu:tu;
                int n = (tu<0 && mau < 0)?-mau:mau;
                System.out.println(m + "/" + n);
            }
        }
    }
    public void nghichDao() {
        int temp = this.tu;
        this.tu = this.mau;
        this.mau = temp;
    }

    public PhanSo giaTriNghichDao() {
        return new PhanSo(this.mau, this.tu);
    }

    public double giaTriThuc() {
        return (double) tu / mau;
    }

    public boolean lonHon(PhanSo a) {
        return this.giaTriThuc() > a.giaTriThuc();
    }

    public PhanSo cong(PhanSo a) {
        int tuSo = this.tu * a.mau + a.tu * this.mau;
        int mauSo = this.mau * a.mau;
        return new PhanSo(tuSo, mauSo);
    }

    public PhanSo tru(PhanSo a) {
        int tuSo = this.tu * a.mau - a.tu * this.mau;
        int mauSo = this.mau * a.mau;
        return new PhanSo(tuSo, mauSo);
    }

    public PhanSo nhan(PhanSo a) {
        int tuSo = this.tu * a.tu;
        int mauSo = this.mau * a.mau;
        return new PhanSo(tuSo, mauSo);
    }

    public PhanSo chia(PhanSo a) {
        return this.nhan(a.giaTriNghichDao());
    }

    public PhanSo cong(int x) {
        return new PhanSo(this.tu + x * this.mau, this.mau);
    }

    public PhanSo tru(int x) {
        return new PhanSo(this.tu - x * this.mau, this.mau);
    }

    public PhanSo nhan(int x) {
        return new PhanSo(this.tu * x, this.mau);
    }

    public PhanSo chia(int x) {
        return new PhanSo(this.tu, this.mau * x);
    }


    
}

public class SDDiem {
    public static void main(String[] args) {
        Diem A = new Diem(3,4);
        A.hienThi();
        Diem B = new Diem();
        B.nhapDiem();
        B.hienThi();
        Diem C = new Diem(-(B.getX()),-(B.getY()));
        C.hienThi();
        System.out.println("Khoang cach tu B den O " + B.khoangCach() );
        System.out.println("Khoang cach tu A den B " + A.khoangCach(B));
    }
}

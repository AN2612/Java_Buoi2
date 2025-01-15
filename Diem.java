import java.util.Scanner;

public class Diem {
    private int x;
    private int y;
    public Diem(){};
    public Diem(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void nhapDiem(){
        Scanner scanner = new Scanner(System.in);
        this.x = scanner.nextInt();
        this.y = scanner.nextInt();
    }
    public void hienThi(){
        System.out.printf("(%d,%d)",x,y);
        System.out.println();
    }
    public void doiDiem(int dx, int dy){
        x = x + dx;
        y = y + dy;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public float khoangCach(){
        return (float)Math.sqrt(Math.pow(x, 2)+Math.pow(y,2));
    }
    public float khoangCach(Diem d){
        return (float)Math.sqrt(Math.pow((x-d.getX()),2)+ Math.pow((y-d.getY()),2));
    }

}

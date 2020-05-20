
public class Tuong {
    private int x;
    private int y;
    private int dx;
    private int dy;
    private BanCo banCo = new BanCo();

    public void viTri(int x, String y) {
        for (int i = 0; i < banCo.tx.length; i++){
            if (x == banCo.tx[i]){
                this.x = --x;
            }
        };
        for (int j = 0; j < banCo.ty.length; j++) {
            if (y.equals(banCo.ty[j])) {
                this.y = j;
            }
        }
        System.out.println(this.x);
        System.out.println(this.y);
    }

    public void diChuyen(int x, String y) {
        for (int i = 0; i < banCo.tx.length; i++){
            if (x == banCo.tx[i]){
                this.dx = --x;
            }
        };
        for (int j = 0; j < banCo.ty.length; j++) {
            if (y.equals(banCo.ty[j])) {
                this.dy = j;
            }
        }
        System.out.println(this.dx);
        System.out.println(this.dy);
    }

    public boolean check(){
        if (this.x - this.dx == this.y - this.dy || this.dx - this.x == this.dy - this.y || this.dy - this.y == this.x - this.dx || this.dx - this.x == this.y - this.dy){
            System.out.println("nước đi đúng");
            return true;
        }else {
            System.out.println("nước đi sai");
            return false;
        }
    }

}

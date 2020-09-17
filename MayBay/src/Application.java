public class Application {
    public static void main(String[] args ){
        KhachHang khachHang =new KhachHang();
        Ve ve= new Ve();

        khachHang.setHoTen("Binh");
        khachHang.setGioiTinh("Nam");
        khachHang.setTuoi(22);
        khachHang.ShowKhachHang();

        ve.setTenCHuyenBay("VnEline");
        ve.setThoiGianBay("22h");
        ve.setSoVe(2);
        ve.ShowVe();
    }



}

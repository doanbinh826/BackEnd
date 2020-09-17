

public class KhachHang {
    private String HoTen;
    private String GioiTinh;
    private Integer Tuoi;

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public Integer getTuoi() {
        return Tuoi;
    }

    public void setTuoi(Integer tuoi) {
        Tuoi = tuoi;
    }
    public void ShowKhachHang(){
        System.out.println("Show khach hang: ");
        System.out.println("ho ten: "+ this.HoTen);
        System.out.println("gioi tinh: "+ this.GioiTinh);
        System.out.println("tuoi: "+ this.Tuoi);


    }
}


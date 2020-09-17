

public class Ve {
    private String TenCHuyenBay;
    private String ThoiGianBay;
    private Integer SoVe;
    private Integer TienVe;

    public String getTenCHuyenBay() {
        return TenCHuyenBay;
    }

    public void setTenCHuyenBay(String tenCHuyenBay) {
        TenCHuyenBay = tenCHuyenBay;
    }

    public String getThoiGianBay() {
        return ThoiGianBay;
    }

    public void setThoiGianBay(String thoiGianBay) {
        ThoiGianBay = thoiGianBay;
    }

    public Integer getSoVe() {
        return SoVe;
    }

    public void setSoVe(Integer soVe) {
        SoVe = soVe;
    }

    public Integer getTienVe() {
        return TienVe;
    }

    public void setTienVe(Integer tienVe) {
        TienVe = tienVe;
    }

    public void ShowVe(){
        System.out.println("ten chuyen bay : "+ this.TenCHuyenBay);
        System.out.println("thoi gian bay : "+ this.ThoiGianBay);
        System.out.println("So ve da mua : "+ this.SoVe);


    }
}

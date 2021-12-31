gói  ThiCuoiKi ;

nhập  java.text.SimpleDateFormat ;
nhập  java.util.Date ;

public  class  HangHoa {
    int iD, soLuong;
    String tenHangHoa, loai =  null ;
    float giaHang;
    static  int autoId;
    Ngày ngayNhap =  new  Date ();
    SimpleDateFormat df =  new  SimpleDateFormat ( " dd / MM / yyyy " );
    Chuỗi strDate = df . format (ngayNhap);
    public  HangHoa () {}
    
    public  int  getiD () {
        trả lại iD;
    }
    public  void  setiD ( int  iD ) {
        cái này . iD = iD;
    }
    public  int  getSoLuong () {
        return soLuong;
    }
    public  void  setSoLuong ( int  soLuong ) {
        cái này . soLuong = soLuong;
    }
    public  String  getTenHangHoa () {
        return tenHangHoa;
    }
    public  void  setTenHangHoa ( String  tenHangHoa ) {
        cái này . tenHangHoa = tenHangHoa;
    }
    public  String  getLoai () {
        return loai;
    }
    public  void  setLoai ( String  loai ) {
        cái này . loai = loai;
    }
    public  float  getGiaHang () {
        return giaHang;
    }
    public  void  setGiaHang ( float  giaHang ) {
        cái này . giaHang = giaHang;
    }
    public  Date  getNgayNhap () {
        return ngayNhap;
    }
    public  void  setNgayNhap ( Date  ngayNhap ) {
        cái này . ngayNhap = ngayNhap;
    }
    public  HangHoa ( int  soLuong , String  tenHangHoa , String  loai , float  giaHang , Date  ngayNhap ) {
        cái này . iD = autoId ++ ;
        cái này . soLuong = soLuong;
        cái này . tenHangHoa = tenHangHoa;
        cái này . loai = loai;
        cái này . giaHang = giaHang;
        cái này . ngayNhap = ngayNhap;
    }
}

gói  ThiCuoiKi ;

nhập  java.text.SimpleDateFormat ;
nhập  java.util.Date ;
nhập  java.util.Scanner ;

public  class  ListHangHoa {
     đầu, đuôi Node riêng ;
    HangHoa hangHoa =  new  HangHoa ();
    SimpleDateFormat df =  new  SimpleDateFormat ( " dd / MM / yyyy " );
    Ngày ngayNhap =  new  Date ();
    Máy quét sc =  Máy quét mới  ( Hệ thống . In);
    public  ListHangHoa ()
    {
        hangHoa . autoId =  1 ;
        cái này . đầu =  null ;
        cái này . tail =  null ;
    }
    public  boolean  isEmpty ()
    {
        trả lại  cái này . đầu ==  null ;
    }
    public  void  ThemHangHoa ( HangHoa  hangHoa )
    {
        if (isEmpty ())
        {
            cái này . đầu =  cái này . tail =  new  Node (hangHoa);
            trở lại ;
        }
        Node newNode =  new  Node (hangHoa);
        cái này . cái đuôi . setNext (newNode);
        cái này . tail = newNode;

    }
    public  void  HienThiHangHoa ()
    {
        Hệ thống . ra ngoài . println ( " ------------------------------------------ THÔNG TIN HÀNG HOÁ- ------------------------------------------ " );
        Hệ thống . ra ngoài . printf ( " % -20S% -20S% -20S% -20S% -20S% -20S \ n " , " ma treo " , " tên treo " , " Số lượng " , " gia treo " , " Loại treo " , " day nhập kho " );
        Node nút =  cái này . cái đầu;
        trong khi (nút ! =  null ) {
            Hệ thống . ra ngoài . printf ( " % -20d% -20S% -15d% -7.3fVNĐ% 20S% 20S \ n " , node . getHangHoa () . iD, node . getHangHoa () . tenHangHoa, node . getHangHoa () . soLuong, node . getHangHoa () . giaHang, node . getHangHoa () . getLoai (), df . format (node . getHangHoa () . ngayNhap));
            node = nút . getNext ();
        }
    }
    public  void  ThemNhieuHangHoa ( HangHoa ... hangHoas )
    {
        cho ( HangHoa hangHoa : hangHoas)
        {
            ThemHangHoa (hangHoa);
        }
    }
    public  boolean  XoaHangHoa ( int  id )
    {
        Node nút =  cái này . cái đầu;
        if ( this . head . getHangHoa () . getiD () == id) {
            cái này . đầu =  cái này . cái đầu . getNext ();
            trả về  true ;
        }
        khác {
            Hệ thống . ra ngoài . println ( " Doi Tuong Da Duoc Xoa " );
        }
        trong khi (nút ! =  null )
        {
            if (node . getNext () . getHangHoa () . getiD () == id) {
                nút . setNext (nút . getNext () . getNext ());
                Hệ thống . ra ngoài . println ( " Xoa Thanh Cong " );
                trả về  true ;
            }
            khác {
                Hệ thống . ra ngoài . println ( " Mat Hang Khong Co " );
            }
            node = nút . getNext ();
        }
        Hệ thống . ra ngoài . println ( " Xoa Khong Thanh Cong " );
        trả về  sai ;
    }
    public  boolean  SuaThongTin ( int  id ) {
        Node nút =  cái này . cái đầu;
        trong khi (nút ! =  null )
        {
            if (node . getHangHoa () . getiD () == id)
            {
                String loaiHh =  null ;
                Hệ thống . ra ngoài . println ( " Nhập Tên Hàng: " );
                Chuỗi ten = sc . hàng tiếp theo();
                Hệ thống . ra ngoài . println ( " Nhập Số Lượng: " );
                int soLuong = sc . nextInt ();
                Hệ thống . ra ngoài . println ( " Nhập Giá: " );
                float gia = sc . nextFloat ();
                Hệ thống . ra ngoài . println ( " Nhập Loại Hàng [1: Thực Phẩm; 2: Sành Sứ; 3: Điện Máy] " );
                int l = sc . nextInt ();
                chuyển đổi (l)
                {
                    case  1 : loaiHh =  " Thuc Pham " ;
                    phá vỡ ;
                    case  2 : loaiHh =  " Sanh Su " ;
                    phá vỡ ;
                    case  3 : loaiHh =  " Dien May " ;
                    phá vỡ ;
                    default :  Hệ thống . ra ngoài . println ( " Khong Hop Le " );
                    phá vỡ ;
                }
                sc . hàng tiếp theo();
                thử {
                    Hệ thống . ra ngoài . println ( " Nhap Ngay Vao Kho [dd / MM / yyyy] " );
                    ngayNhap = df . phân tích cú pháp (sc . nextLine ());
                } catch ( Ngoại lệ e) {
                    Hệ thống . ra ngoài . println ( " Ngay Khong Hop Le " );
                }
                nút . getHangHoa () . setTenHangHoa (ten);
                nút . getHangHoa () . setSoLuong (soLuong);
                nút . getHangHoa () . setGiaHang (gia);
                nút . getHangHoa () . setLoai (loaiHh);
                nút . getHangHoa () . setNgayNhap (ngayNhap);
                trả về  true ;
            }
            node = nút . getNext ();
        }
        Hệ thống . ra ngoài . println ( " Khong the sua " );
        trả về  sai ;
    }  
    public  void  SapXepTangDan () {
        Node nút =  cái này . head, node2 =  null ;
        HangHoa tempHangHoa;
        if (head ==  null )
        trở lại ;
        khác {
            trong khi (nút ! =  null ) {
                node2 = nút . tiếp theo;
                trong khi (node2 ! =  null ) {
                    if (node . hangHoa . giaHang < node2 . hangHoa . giaHang) {
                        tempHangHoa = nút . hangHoa;
                        nút . hangHoa = node2 . hangHoa;
                        nút2 . hangHoa = tempHangHoa;
                    }
                    node2 = node2 . tiếp theo;
                }
                node = nút . tiếp theo;
            }
        }
        HienThiHangHoa ();
    }
    
    public  void  SapXepGiamDan () {
        Node nút =  cái này . head, node2 =  null ;
        HangHoa tempHangHoa;
        if (head ==  null )
        trở lại ;
        khác {
            trong khi (nút ! =  null ) {
                node2 = nút . tiếp theo;
                trong khi (node2 ! =  null ) {
                    if (node . hangHoa . giaHang > node2 . hangHoa . giaHang) {
                        tempHangHoa = nút . hangHoa;
                        nút . hangHoa = node2 . hangHoa;
                        nút2 . hangHoa = tempHangHoa;
                    }
                    node2 = node2 . tiếp theo;
                }
                node = nút . tiếp theo;
            }
        }
        HienThiHangHoa ();
    }

    
    public  void  ThongKe () {
        Node nút =  cái này . cái đầu;
        int sLtemp =  0 ;
        float gTtemp =  0 ;
        trong khi (nút ! =  null ) {
            sLtemp + = nút . getHangHoa () . getSoLuong ();
            gTtemp + = nút . getHangHoa () . getGiaHang ();
            node = nút . getNext ();
        }
        Hệ thống . ra ngoài . println ( " Thong tin thong ke " );
        Hệ thống . ra ngoài . printf ( " % -30S% -30S \ n " , " tổng số lượng " , " tổng giá trị " );
        Hệ thống . ra ngoài . printf ( " % -30d% -30.3fVNĐ \ n " , sLtemp, gTtemp);
    }
    công khai  boolean  TimKiemTheoLoai ( Chuỗi  l ) {
        Hệ thống . ra ngoài . println ( " THÔNG TIN " );
        Hệ thống . ra ngoài . printf ( " % -20S% -20S% -20S% -20S% -20S% -20S \ n " , " ma treo " , " tên treo " , " Số lượng " , " gia treo " , " Loại treo " , " day nhập kho " );
        boolean isFound =  false ;
        Node nút =  cái này . cái đầu;
        trong khi (nút ! =  null )
        {
            if (nút . getHangHoa () . getLoai () . chứa (l))
            {
                Hệ thống . ra ngoài . printf ( " % -20d% -20S% -15d% -7.3fVND% 20S% 20S \ n " , node . getHangHoa () . iD, node . getHangHoa () . tenHangHoa, node . getHangHoa () . soLuong, node . getHangHoa () . giaHang, node . getHangHoa () . getLoai (), df . format (node . getHangHoa () . ngayNhap));
                isFound =  true ;
            }
            node = nút . getNext ();
        }
        if ( ! isFound)
        {
            Hệ thống . ra ngoài . println ( " Loai Muon Tim Khong Hop Le " );
            trả về  sai ;
        }
        trả về  true ;
    }
    public  void  DuLieuMacDinh () {
        thử {
            Chuỗi sDate1 =  " 1999/01/02 " ;  
            Chuỗi sDate2 =  " 01/06/1997 " ;  
            Chuỗi sDate3 =  " 08/05/1999 " ;  
            Chuỗi sDate4 =  " 07/07/1997 " ;  
            Chuỗi sDate5 =  " 21/12/2021 " ;  
            Chuỗi sDate6 =  " 12/12/2012 " ;  
            SimpleDateFormat formatter1 =  new  SimpleDateFormat ( " dd / MM / yyyy " );  
            Ngày date1 = formatter1 . phân tích cú pháp (sDate1);  
            Ngày date2 = formatter1 . phân tích cú pháp (sDate2);  
            Ngày date3 = formatter1 . phân tích cú pháp (sDate3);  
            Ngày date4 = formatter1 . phân tích cú pháp (sDate4);  
            Ngày date5 = formatter1 . phân tích cú pháp (sDate5);  
            Ngày date6 = formatter1 . phân tích cú pháp (sDate6);
            HangHoa hangHoa1 =  new  HangHoa ( 50 , " binh " , " Sanh Su " , 200 , date4);
            HangHoa hangHoa2 =  new  HangHoa ( 10 , " cai xanh " , " Thuc Pham " , 500 , date5);
            HangHoa hangHoa3 =  new  HangHoa ( 20 , " quat " , " Dien May " , 500 , date3);
            HangHoa hangHoa4 =  new  HangHoa ( 56 , " dien thoai " , " Dien May " , 10 , date3);
            HangHoa hangHoa5 =  new  HangHoa ( 45 , " rau muong " , " Thuc Pham " , 5000 , date2);
            HangHoa hangHoa6 =  new  HangHoa ( 78 , " bi dao " , " Thuc Pham " , 300 , date5);
            HangHoa hangHoa7 =  new  HangHoa ( 97 , " may giat " , " Dien May " , 100 , date4);
            HangHoa hangHoa8 =  new  HangHoa ( 152 , " my ly " , " Thuc Pham " , 600 , date1);
            HangHoa hangHoa9 =  new  HangHoa ( 150 , " chen " , " Sanh Su " , 150 , date3);
            HangHoa hangHoa10 =  new  HangHoa ( 15500 , " bep dien " , " Dien May " , 200 , date5);
            ThemHangHoa (hangHoa1);
            ThemHangHoa (hangHoa2);
            ThemHangHoa (hangHoa3);
            ThemHangHoa (hangHoa4);
            ThemHangHoa (hangHoa5);
            ThemHangHoa (hangHoa6);
            ThemHangHoa (hangHoa7);
            ThemHangHoa (hangHoa8);
            ThemHangHoa (hangHoa9);
            ThemHangHoa (hangHoa10);
        } catch ( Ngoại lệ e) {
            e . getCause ();
        }
    }
}

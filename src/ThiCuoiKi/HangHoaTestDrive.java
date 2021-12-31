gói  ThiCuoiKi ;

nhập  java.text.SimpleDateFormat ;
nhập  java.util.Date ;
nhập  java.util.Scanner ;

 lớp  công khai HangHoaTestDrive {
    public  static  void  main ( String [] args ) {
        Máy quét sc =  Máy quét mới  ( Hệ thống . In);
        Ngày ngayNhap =  new  Date ();
        SimpleDateFormat df =  new  SimpleDateFormat ( " dd / MM / yyyy " );
        ListHangHoa listHangHoa =  new  ListHangHoa ();
        listHangHoa . DuLieuMacDinh ();
        làm {
            Hệ thống . ra ngoài . println ( " | -------------------------- MENU ------------------- ------- | " );
            Hệ thống . ra ngoài . println ( " | 1 Them Hang Hoa | " );
            Hệ thống . ra ngoài . println ( " | 2 Xoa Hang Hoa | " );
            Hệ thống . ra ngoài . println ( " | 3 Sua Hang Hoa | " );
            Hệ thống . ra ngoài . println ( " | 4 Sap Xep Hang Hoa | " );
            Hệ thống . ra ngoài . println ( " | 5 Thong Ke Hang Hoa | " );
            Hệ thống . ra ngoài . println ( " | 6 Xem Danh Sach Hang Hoa | " );
            Hệ thống . ra ngoài . println ( " | 7 Tim Kiem Hang Hoa | " );
            Hệ thống . ra ngoài . println ( " | 9 THOAT | " );
            Hệ thống . ra ngoài . println ( " | ---------------------------------------------- ---------- | " );
            Hệ thống . ra ngoài . println ( " Lua chon cua ban: " );
            int lc = sc . nextInt ();
            công tắc (lc)
            {
                trường hợp  1 :
                String loaiHh =  null ;
                sc . hàng tiếp theo();
                Hệ thống . ra ngoài . println ( " Nhập Tên Hàng: " );
                Chuỗi ten = sc . hàng tiếp theo();
                Hệ thống . ra ngoài . println ( " Nhập Số Lượng: " );
                int soLuong = sc . nextInt ();
                Hệ thống . ra ngoài . println ( " Nhập Giá: " );
                float gia = sc . nextFloat ();
                Hệ thống . ra ngoài . println ( " Nhập Loại Hàng [1: Thuc Pham; 2: Sanh Su; 3: Dien May] " );
                int l = sc . nextInt ();
                chuyển đổi (l)
                {
                    case  1 : loaiHh =  " Thuc Pham " ;
                    phá vỡ ;
                    case  2 : loaiHh =  " Sanh Su " ;
                    phá vỡ ;
                    case  3 : loaiHh =  " Dien May " ;
                    phá vỡ ;
                    default :  Hệ thống . ra ngoài . println ( " Loai Khong Hop Le! " );
                    phá vỡ ;
                }
                sc . hàng tiếp theo();
                thử {
                    Hệ thống . ra ngoài . println ( " Nhap Ngay Vao Kho [dd / MM / yyyy] " );
                    ngayNhap = df . phân tích cú pháp (sc . nextLine ());
                } catch ( Ngoại lệ e) {
                    Hệ thống . ra ngoài . println ( " Ngày Khong Dung !! " );
                }
                HangHoa hangHoa =  new  HangHoa (soLuong, ten, loaiHh, gia, ngayNhap);
                listHangHoa . ThemHangHoa (hangHoa);
                    phá vỡ ;
                trường hợp  2 :
                Hệ thống . ra ngoài . println ( " Nhap loai can xoa: " );
                int id1 = sc . nextInt ();
                listHangHoa . XoaHangHoa (id1);
                    phá vỡ ;
                trường hợp  3 :
                Hệ thống . ra ngoài . println ( " Nhap ID can sua: " );
                int id = sc . nextInt ();
                listHangHoa . SuaThongTin (id);
                    phá vỡ ;
                trường hợp  4 :
                Hệ thống . ra ngoài . println ( " Muon sap xep [1: Tang Dan]; [2: Giam Dan] " );
                    int llll_ = sc . nextInt ();
                    chuyển đổi (llll _) {
                        trường hợp  1 :
                        listHangHoa . SapXepTangDan ();
                        phá vỡ ;
                        trường hợp  2 :
                        listHangHoa . SapXepGiamDan ();
                        phá vỡ ;
                        default :  Hệ thống . ra ngoài . println ( " Lua chon khong dung " );
                    }
                    phá vỡ ;
                trường hợp  5 :
                listHangHoa . ThongKe ();
                    phá vỡ ;
                trường hợp  6 :
                listHangHoa . HienThiHangHoa ();
                    phá vỡ ;
                trường hợp  7 :
                Hệ thống . ra ngoài . println ( " Muon tim theo loai [1] " );
                int lll = sc . nextInt ();
                chuyển đổi (lll)
                {
                    trường hợp  1 :
                    Hệ thống . ra ngoài . println ( " Nhập Loại Muốn Tìm [1: Thực Phẩm; 2: Sành Sứ; 3: Điện Máy] " );
                    Hệ thống . ra ngoài . println ( " Nhập Loại Muốn Tìm: " );
                    int l1 = sc . nextInt ();
                    Chuỗi ll =  null ;
                    chuyển đổi (l1) {
                        case  1 : ll =  " Thuc Pham " ;
                        phá vỡ ;
                        case  2 : ll =  " Sanh Su " ;
                        phá vỡ ;
                        case  3 : ll =  " Dien May " ;
                        phá vỡ ;
                        default :  Hệ thống . ra ngoài . println ( " Loai khong hop le " );
                        phá vỡ ;
                    }
                    listHangHoa . TimKiemTheoLoai (ll);
                    phá vỡ ;
                       
                }
                phá vỡ ;
            }
           
        } while ( true );
    }
}

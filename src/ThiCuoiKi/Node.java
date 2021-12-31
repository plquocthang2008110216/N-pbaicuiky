gói  ThiCuoiKi ;

 Node lớp  công khai {
    public   HangHoa hangHoa;
    công khai   Node tiếp theo;
     Node công cộng ()
    {

    }
    public  Node ( HangHoa  hangHoa )
    {
        cái này . hangHoa = hangHoa;
        cái này . tiếp theo =  null ;
    }
    public  HangHoa  getHangHoa () {
        return hangHoa;
    }
    public  void  setHangHoa ( HangHoa  hangHoa ) {
        cái này . hangHoa = hangHoa;
    }
    public  Node  getNext () {
        trở lại tiếp theo;
    }
    public  void  setNext ( Node  next ) {
        cái này . next = tiếp theo;
    }
    public  Node ( HangHoa  hangHoa , Node  next ) {
        cái này . hangHoa = hangHoa;
        cái này . next = tiếp theo;
    }
}

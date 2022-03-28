package session5lab2;

import java.util.ArrayList;

public class DSKNN{
    ArrayList<Double> danhsachkhnuocngoai = new ArrayList<Double>();
    double trungbinh;

    public void themKHNN(double thanhTien){
        danhsachkhnuocngoai.add(thanhTien);
    }

    public double trungBinh(){
        double tong=0;
        if(danhsachkhnuocngoai.size()==0) return trungbinh=0;
        else {
            for (Double thanhTien:danhsachkhnuocngoai) {
                tong += thanhTien;
            }
            return trungbinh = tong/danhsachkhnuocngoai.size();
        }
    }
}

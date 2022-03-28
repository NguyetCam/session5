package session5lab2;

import java.util.ArrayList;

public class DSKH{
    ArrayList<infor> DSKH = new ArrayList<infor>();
//    String date;
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }

    public void themKH(String date, String id, String name, String doituong, int soluong, double thanhTien){
            DSKH.add(new infor(date,id,name,doituong,soluong,thanhTien));
    }

    public void hienThi(String date){
        System.out.println("\nDanh sách người dùng tháng " + date);
        System.out.println("| ID |      Họ và tên     |  Đối tượng  | Số lượng | Tổng tiền điện |");
        for(infor i:DSKH){
            if(i.date.equals(date)){
                System.out.format("|%4s|%20s|%13s|%10d|%16.2f|\n",i.id,i.name,i.doituong,i.soluong,i.thanhTien);
            }
        }
    }
}

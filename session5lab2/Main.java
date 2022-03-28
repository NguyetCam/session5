package session5lab2;

public class Main {
    public static void main(String[] args){
        KhachHangVietNam khvn1 = new KhachHangVietNam();
        khvn1.setId("D01");
        khvn1.setName("Vũ Châu Nguyệt Cầm");
        khvn1.setDate("1/2019");
        khvn1.setDoituong(khvn1.danhsachdoituong[0]);
        khvn1.setSoluong(70);
        khvn1.tinhTien();
        khvn1.hienThi();

        KhachHangVietNam khvn2 = new KhachHangVietNam();
        khvn2.setId("D02");
        khvn2.setName("Đỗ Hà Linh");
        khvn2.setDate("1/2019");
        khvn2.setDoituong(khvn1.danhsachdoituong[1]);
        khvn2.setSoluong(2000);
        khvn2.tinhTien();
        khvn2.hienThi();

        KhachHangNuocNgoai khnn1 = new KhachHangNuocNgoai("D03","Leonardo da Vinci");
        khnn1.setDate("1/2019");
        khnn1.setQuoctich("Italian");
        khnn1.setSoluong(230);
        khnn1.tinhTien();
        khnn1.hienThi();

        KhachHangNuocNgoai khnn2 = new KhachHangNuocNgoai("D04","La Lisa");
        khnn2.setDate("1/2019");
        khnn2.setQuoctich("Thai");
        khnn2.setSoluong(140);
        khnn2.tinhTien();
        khnn2.hienThi();

        KhachHangNuocNgoai khnn3 = new KhachHangNuocNgoai("D05","Triệu Lộ Tư");
        khnn3.setDate("1/2019");
        khnn3.setQuoctich("Chinese");
        khnn3.setSoluong(186);
        khnn3.tinhTien();
        khnn3.hienThi();

        DSKNN dsknn1 = new DSKNN();
        dsknn1.themKHNN(khnn1.getThanhTien());
        dsknn1.themKHNN(khnn2.getThanhTien());
        dsknn1.themKHNN(khnn3.getThanhTien());
        dsknn1.trungBinh();
        System.out.format("Tiền điện trung bình của người nước ngoài: %.3f", dsknn1.trungbinh);
    }
}

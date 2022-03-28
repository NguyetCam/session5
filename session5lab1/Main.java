package session5lab1;

public class Main {
    public static void main(String[] args){
        News news1 = new News();
        news1.setTitle("Cập nhật tình hình thế sự tại Ukraine");
        news1.setAuthor("Nguyệt Cầm");
        news1.setPublishDate("28/3/2022");
        news1.setContent("Putin cắt tóc Zelensky ngâm xăng mời Biden dùng thay dầu");
        news1.rateList[0] = 5;
        news1.rateList[1] = 4;
        news1.rateList[2] = 5;
        news1.calculate();
        news1.display();
    }
}

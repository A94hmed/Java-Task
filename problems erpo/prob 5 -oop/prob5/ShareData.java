package prob5;

public class ShareData extends BaseEntity {
private Integer phone;


    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return this.phone;
    }

    void printShareData(){
        System.out.println("phone :"+phone);
    }
}

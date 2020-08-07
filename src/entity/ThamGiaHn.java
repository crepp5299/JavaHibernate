package entity;
// Generated Jul 31, 2020 10:02:53 AM by Hibernate Tools 4.3.1

import javafx.scene.control.Button;




/**
 * ThamGiaHn generated by hbm2java
 */
public class ThamGiaHn  implements java.io.Serializable {


     private ThamGiaHnId id;
     private DsHoiNghi dsHoiNghi;
     private User user;
     private String trangThai;
     String tenHoiNghi;
     String username;
     Button button;

    public ThamGiaHn() {
    }

    public ThamGiaHn(ThamGiaHnId id, DsHoiNghi dsHoiNghi, User user, String trangThai) {
       this.id = id;
       this.dsHoiNghi = dsHoiNghi;
       this.user = user;
       this.trangThai = trangThai;
    }
    
   
    public ThamGiaHnId getId() {
        return this.id;
    }
    
    public void setId(ThamGiaHnId id) {
        this.id = id;
    }
    public DsHoiNghi getDsHoiNghi() {
        return this.dsHoiNghi;
    }
    
    public void setDsHoiNghi(DsHoiNghi dsHoiNghi) {
        this.dsHoiNghi = dsHoiNghi;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getTrangThai() {
        return this.trangThai;
    }
    
    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public Button getButton(){
        return this.button;
    }
    
    public void setButton(){
        this.button = new Button("Duyệt");
    }
    
    public String getTenHoiNghi(){
        return this.tenHoiNghi;
    }
    
    public void setTenHoiNghi(String ten){
        this.tenHoiNghi = ten;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public void setUsername(String ten){
        this.username = ten;
    }


}


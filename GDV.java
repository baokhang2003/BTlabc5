/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gd;

/**
 *
 * @author TH
 */
class GiaoDichVang extends GiaoDich
{
private String LoaiVang;
public GiaoDichVang()
{
super();
this.LoaiVang="";
}
public GiaoDichVang(int ma, int sl, String ngay, double dgia, double ttien,
String lvang)
{
super(ma, sl, ngay, dgia, ttien);
this.LoaiVang=lvang;
}
public String getLoaiVang() {
return LoaiVang;
}
public void setLoaiVang(String loaiVang) {
LoaiVang = loaiVang;
}
public void nhap()
{
super.nhap();
System.out.println("Loai Vang: ");
LoaiVang = in.next();
}
public double TTien()
{
return this.ThanhTien=this.DonGia*this.SoLuong;
}
public String toString()
{
return "Giao Dich Vang: " + super.toString() + ", LoaiVang: " +
LoaiVang
+ ", ThanhTien: " + ThanhTien + "]";
}
}


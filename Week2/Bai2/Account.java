package Bai2;

public class Account {
   private String TenTaiKhoan;
   private double SoDu;
   

   public String getTenTaiKhoan() {
	   return TenTaiKhoan;
   }

   public void setTenTaiKhoan(String tenTaiKhoan) {
	   this.TenTaiKhoan = tenTaiKhoan;
   }

   public double getSoDu() {
	   return SoDu;
   }

   public void setSoDu(double soDu) {
	   this.SoDu = soDu;
   }

   public Account(String tenTaiKhoan, double soDu) {
	   super();
	   this.TenTaiKhoan = tenTaiKhoan;
	   this.SoDu = soDu;
   }
   
   public void ThongTin() {
	   System.out.println("Ten tai khoan la: "+ TenTaiKhoan +" "+ "So du la: "+ SoDu +"$");
   }
   
   public void RutTien(double rutTien) {
	   if(rutTien <= SoDu) {
		   SoDu -= rutTien;
		   System.out.println("So tien rut: "+ rutTien +"$");
		   System.out.println("So tien con lai la: "+ SoDu + "$");
	   }
	   else {
		   System.out.println("So tien trong tai khoan be hon so tien can rut");
	        }
       
	   }
   
   public void ThemTien(double themTien) {
	    SoDu += themTien;
	    System.out.println("So tien duoc them: " + themTien + "$");
	    System.out.println("So tien sau khi duoc them: "+ SoDu+"$");
   }
 }
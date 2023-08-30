package com.poly.test;

import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;

import com.bgear.ui.TrangChu;
public class testTimKiemHoaDon {
	TrangChu trangChu;
	 @Before
	 public void init() {
		 trangChu = new TrangChu("NV003", "Võ Hoàng Yến", "CV002");
	 }
	 @Test
	 public void test1() {
		 boolean result = true;
		 trangChu.txtMaHoaDonTimKiem.setText("HD001");
		 int count = trangChu.tblHD.getRowCount();
		 if(count<=0) {
			 result=false;
		 }
		 Assert.assertTrue(result);
	 }
}

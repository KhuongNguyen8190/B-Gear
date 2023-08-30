package com.poly.test;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;

import com.bgear.ui.TrangChu;
public class testLamMoiHD {
	TrangChu trangChu;
	 @Before
	 public void init() {
		 trangChu = new TrangChu("NV003", "Võ Hoàng Yến", "CV002");
	 }
	 @Test
	 public void test1() {
		 trangChu.txtMaHoaDonTimKiem.setText("HD008");
		 trangChu.LamMoiHD();
		 boolean result = false;
		 if(trangChu.txtMaHoaDonTimKiem.getText().equals("")) {
			 result = true;
		 }
		 Assert.assertTrue(result);
	 }
}

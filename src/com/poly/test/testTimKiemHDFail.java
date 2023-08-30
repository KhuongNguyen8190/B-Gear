package com.poly.test;

import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;

import com.bgear.ui.TrangChu;
public class testTimKiemHDFail {
	TrangChu trangChu;
	 @Before
	 public void init() {
		 trangChu = new TrangChu("NV003", "Võ Hoàng Yến", "CV002");
	 }
	 @Test
	 public void test1() {
		 trangChu.txtMaHoaDonTimKiem.setText("HD001");
		 trangChu.timHDTheoMa();
	 }
}

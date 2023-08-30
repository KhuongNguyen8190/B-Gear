package com.poly.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;
import com.bgear.dao.HoaDonDAO;
import com.bgear.entity.HoaDon;

import com.bgear.ui.TrangChu;

public class testHienThiTatCaHoaDon {
	TrangChu trangChu;

	@Before
	public void init() {
		trangChu = new TrangChu("NV003", "Võ Hoàng Yến", "CV002");
	}

	@Test
	 public void test1() {
		 boolean result = false;
		 trangChu.txtMaHoaDonTimKiem.setText("HD001");
		 trangChu.fillTableHoaDon();
		 int count = trangChu.tblHD.getRowCount();
		 HoaDonDAO hd = new HoaDonDAO();
		 HoaDon hoaDon = new HoaDon();
		 
		 List<HoaDon> list = hd.selectAll();
		 
		 if(count == list.size()) {
			 result=true;
		 }
		 Assert.assertTrue(result);
}}

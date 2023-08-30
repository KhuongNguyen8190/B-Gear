package com.poly.test;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;
import com.bgear.dao.HoaDonDAO;
import com.bgear.entity.HoaDon;

import com.bgear.ui.TrangChu;

public class testXoaHoaDon {
	TrangChu trangChu;

	@Before
	public void init() {
		trangChu = new TrangChu("NV003", "Võ Hoàng Yến", "CV002");
	}

	@Test
	public void test1() {
		boolean result = true;
		trangChu.xoaHD("HD001");
		HoaDonDAO hd = new HoaDonDAO();

		List<HoaDon> list = hd.selectAll();
		for (HoaDon h : list) {
			if (h.getMaHd().equals("HD001")) {
				result = false;
			}
		}
	}
}

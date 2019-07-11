package com.hsmonkey.weijifen.web.common.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;

import com.hsmonkey.weijifen.biz.bean.DeviceBean;
import com.hsmonkey.weijifen.biz.bean.DeviceDataBean;
import com.hsmonkey.weijifen.util.CollectionUtils;

/**
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>版权: lsb</p>
 * <p>创建时间: 2017年2月17日  下午1:14:15</p>
 * <p>作者：niepeng</p>
 */
public class ExcelUtil {
	
	/*
	 * 生成excel文件，格式如下：
	 * 
	 * 成前云平台——历史数据
	 * 
	 * 用户选择时间间隔xx分钟 用户选择开始时间	用户选择结束时间
	 * 	区域设备名称
	 * NO 记录时间 温度(℃)   湿度(%RH)
	 * 1 2014-09-18 19:41:00 26.62 0.00
	 * 2 2014-09-18 19:42:00 26.62 0.00
	 * 3 2014-09-18 19:43:00 26.62 0.00
	 * .......
	 */
	@SuppressWarnings("deprecation")
	public static HSSFWorkbook genExcel(DeviceBean deviceBean) {
		// 第一步，创建一个webbook，对应一个Excel文件
		HSSFWorkbook wb = new HSSFWorkbook();
		// 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
		HSSFSheet sheet = wb.createSheet("导出数据");
		// 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
		HSSFRow row1 = sheet.createRow((int) 0);
		sheet.setDefaultColumnWidth(36);

		// 第四步，创建单元格，并设置值表头 设置表头居中
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式

		int rowIndex = 0;
		
		HSSFCell cell = row1.createCell((short) rowIndex++);
		cell.setCellValue("成前云平台――历史数据");
		cell.setCellStyle(style);
		cell = row1.createCell((short) 1);
		// cell.setCellValue(String.valueOf(address));
		// cell.setCellStyle(style);

		HSSFRow row2 = sheet.createRow((int) rowIndex++);
		HSSFCell cell21 = row2.createCell((short) 0);
		cell21.setCellValue("时间间隔:" + deviceBean.getDataBean().getRangeTime() + "分钟");
		cell21.setCellStyle(style);
		
		HSSFCell cell22 = row2.createCell((short) 1);
		cell22.setCellValue("时间段：");
		cell22.setCellStyle(style);
		
		HSSFCell cell23 = row2.createCell((short) 2);
		cell23.setCellValue(deviceBean.getDataBean().getStartTime());
		cell23.setCellStyle(style);
		
		HSSFCell cell24 = row2.createCell((short) 3);
		cell24.setCellValue(deviceBean.getDataBean().getEndTime());
		cell24.setCellStyle(style);

		
		// 设定合并的单元格
		sheet.addMergedRegion(new CellRangeAddress(rowIndex, rowIndex, 0, 3));
		HSSFRow row3 = sheet.createRow((int) rowIndex++);
		HSSFCell cell3 = row3.createCell((short) 0);
		cell3.setCellValue(deviceBean.getShowValue());
		cell3.setCellStyle(style);
		HSSFRow row4 = sheet.createRow((int) rowIndex++);
		HSSFCell cell4 = row4.createCell((short) 0);
		cell4.setCellValue("NO");
		cell4.setCellStyle(style);
		cell4 = row4.createCell((short) 1);
		cell4.setCellValue("记录时间");
		cell4.setCellStyle(style);

		short rowCell = (short)1;
		boolean hasTemp = deviceBean.hasTemp();
		boolean hasHumi = deviceBean.hasHumi();

		if(hasTemp) {
			cell4 = row4.createCell((short) ++rowCell);
			cell4.setCellValue("温度(℃)");
			cell4.setCellStyle(style);
		}

		if(hasHumi) {
			cell4 = row4.createCell((short) ++rowCell);
			cell4.setCellValue("湿度(%RH)");
			cell4.setCellStyle(style);
		}

		
		int startCell = 0;
		if (deviceBean.getDeviceDataBeanList() != null) {
			for (int k = 0, size = deviceBean.getDeviceDataBeanList().size(); k < size; k++) {
				DeviceDataBean bean = deviceBean.getDeviceDataBeanList().get(k);
				HSSFRow tmpRow = sheet.createRow((int) rowIndex++);
				HSSFCell tmpCell = tmpRow.createCell((short) 0);
				tmpCell.setCellValue(String.valueOf(k + 1));
				tmpCell.setCellStyle(style);
				tmpCell = tmpRow.createCell((short) 1);
				tmpCell.setCellValue(bean.getTime());
				tmpCell.setCellStyle(style);
				startCell = 2;
				if(hasTemp) {
					tmpCell = tmpRow.createCell((short) startCell++);
					tmpCell.setCellValue(bean.getTemp());
					tmpCell.setCellStyle(style);
				}

				if(hasHumi) {
					tmpCell = tmpRow.createCell((short) startCell++);
					tmpCell.setCellValue(bean.getHumi());
					tmpCell.setCellStyle(style);
				}
			}
		}
		return wb;
	}
	

	public static void main(String[] args) {
		DeviceBean bean = new DeviceBean();
		bean.setArea("区域w");
		bean.setDevName("我是name");
		
		List<DeviceDataBean> dataList = CollectionUtils.newArrayList();
		DeviceDataBean dataBean1 = new DeviceDataBean();
		dataBean1.setTemp("12.21");
		dataBean1.setHumi("78.21");
		dataBean1.setTime("2016-01-01 12:00:01");
		
		DeviceDataBean dataBean2 = new DeviceDataBean();
		dataBean2.setTemp("12.22");
		dataBean2.setHumi("78.22");
		dataBean2.setTime("2016-01-01 12:00:02");
		
		dataList.add(dataBean1);
		dataList.add(dataBean2);
		bean.setDeviceDataBeanList(dataList);
		
		File file = new File("b.xls");
		System.out.println(file.getAbsolutePath());
		HSSFWorkbook wb = genExcel(bean);
		try {
			wb.write(new FileOutputStream(file));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

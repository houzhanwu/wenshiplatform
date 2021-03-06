package com.hsmonkey.weijifen.biz.bean;

import java.util.Date;

import com.hsmonkey.weijifen.util.DateUtil;

/**
 * <p>标题: 报警信息</p>
 * <p>描述: </p>
 * <p>版权: lsb</p>
 * <p>创建时间: 2017年1月19日  下午8:26:09</p>
 * <p>作者：niepeng</p>
 */
public class AlarmBean {

	private String msg;
	
	// 1:温度过高;2:温度过低;3:湿度过高;4:湿度过低;5:开关报警;6:设备离线;7:传感器异常;8:传感器未连接
	private String type;
	
	private String alarmTime;
	
	private String beginEndMark;
	
	// -------------- extend attribute --------------------

	// -------------- normal method -----------------------
	
	public boolean isBegin() {
		return "0".equals(beginEndMark);
	}
	
	public boolean isDateAfter(Date time) {
		if (alarmTime == null) {
			return false;
		}
		Date alarmDate = DateUtil.parseNoException(alarmTime);
		if (alarmDate == null) {
			return false;
		}
		return DateUtil.isDateAfter(alarmDate, time);
	}

	
	// -------------- setter/getter -----------------------

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAlarmTime() {
		return alarmTime;
	}

	public void setAlarmTime(String alarmTime) {
		this.alarmTime = alarmTime;
	}

	public String getBeginEndMark() {
		return beginEndMark;
	}

	public void setBeginEndMark(String beginEndMark) {
		this.beginEndMark = beginEndMark;
	}
	
}

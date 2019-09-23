package com.hsmonkey.weijifen.biz.bean;

/**
 * <p>标题: 设备普通数据</p>
 * <p>描述: </p>
 * <p>版权: lsb</p>
 * <p>创建时间: 2017年1月19日  下午3:42:15</p>
 * <p>作者：niepeng</p>
 */
public class DeviceDataBean {

	private String snaddr;
	
	// 湿度
	private String humi;
	
	// -1为低于阈值下限，0为正常处于阈值内，1超出最高阈值
	private int humiStatus;
	
	// 温度
	private String temp;
	
	// -1为低于阈值下限，0为正常处于阈值内，1超出最高阈值
	private int tempStatus;

	// 大气压
	private String press;

	// 大气压的状态
	private int pressStatus;

	// 开关量
	private String in1;
	
	private String time;


	// 门磁：1报警，F未接入，0 正常
	private String door;
	// 停电：1报警，F未接入，0 正常
	private String pow;
	// 水浸：1报警，F未接入，0 正常
	private String water;
	// 烟雾：1报警，F未接入，0 正常
	private String smoke;

	
	/*
	 * 0 -- 无异常; 
	 * 1 -- 备离线（优先级最高） 
	 * 2 -- 传感器异常（优先级第二高，一旦传感器异常，无视下列所有异常，损坏） 
	 * 3 -- 传感器未连接
	 * 4 -- 四路开关量有一路或多路处于触发状态
	 */
	private String abnormal;
	
	// -------------- extend attribute --------------------
	
	private String startTime;
	
	private String endTime;
	
	private String rangeTime;

	private String deviceTypes;

	// -------------- normal method -----------------------
	
	public boolean isSuccess() {
		return "0".equals(abnormal);
	}

	public boolean isKaiguan()  {
		return "4".equals(abnormal);
	}

	
	public boolean isNotConnection() {
		return "3".equals(abnormal);
	}
	
	// -------------- setter/getter -----------------------
	
	public String getSnaddr() {
		return snaddr;
	}

	public void setSnaddr(String snaddr) {
		this.snaddr = snaddr;
	}

	public String getHumi() {
		return humi;
	}

	public void setHumi(String humi) {
		this.humi = humi;
	}

	public int getHumiStatus() {
		return humiStatus;
	}

	public void setHumiStatus(int humiStatus) {
		this.humiStatus = humiStatus;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public int getTempStatus() {
		return tempStatus;
	}

	public void setTempStatus(int tempStatus) {
		this.tempStatus = tempStatus;
	}

	public String getIn1() {
		return in1;
	}

	public void setIn1(String in1) {
		this.in1 = in1;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAbnormal() {
		return abnormal;
	}

	public void setAbnormal(String abnormal) {
		this.abnormal = abnormal;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getRangeTime() {
		return rangeTime;
	}

	public void setRangeTime(String rangeTime) {
		this.rangeTime = rangeTime;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public int getPressStatus() {
		return pressStatus;
	}

	public void setPressStatus(int pressStatus) {
		this.pressStatus = pressStatus;
	}

	public String getDeviceTypes() {
		return deviceTypes;
	}

	public void setDeviceTypes(String deviceTypes) {
		this.deviceTypes = deviceTypes;
	}

	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
		this.door = door;
	}

	public String getPow() {
		return pow;
	}

	public void setPow(String pow) {
		this.pow = pow;
	}

	public String getWater() {
		return water;
	}

	public void setWater(String water) {
		this.water = water;
	}

	public String getSmoke() {
		return smoke;
	}

	public void setSmoke(String smoke) {
		this.smoke = smoke;
	}
}

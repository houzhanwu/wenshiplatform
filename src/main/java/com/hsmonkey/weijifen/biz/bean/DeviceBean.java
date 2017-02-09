package com.hsmonkey.weijifen.biz.bean;

import java.util.List;

/**
 * <p>标题: 设备</p>
 * <p>描述: </p>
 * <p>版权: lsb</p>
 * <p>创建时间: 2017年1月19日  下午3:37:28</p>
 * <p>作者：niepeng</p>
 */
public class DeviceBean {

	// 设备唯一标识
	private String snaddr;
	
	// 权限,暂不使用
	private int authority;
	
	// 设备名称
	private String devName;
	
	// 分组区域
	private String area;
	
	// 上传间隔时间
	private String devGap;
	
	// 曲线,固定暂时没有使用
	private String curve = "allLast";
	
	// -------------- extend attribute --------------------
	
	private DeviceExtendBean deviceExtendBean;
	
	private DeviceDataBean dataBean;
	
	private List<AlarmBean> alarmBeanList;

	// -------------- normal method -----------------------

	// -------------- setter/getter -----------------------

	

	public String getSnaddr() {
		return snaddr;
	}

	public void setSnaddr(String snaddr) {
		this.snaddr = snaddr;
	}

	public int getAuthority() {
		return authority;
	}

	public void setAuthority(int authority) {
		this.authority = authority;
	}

	public String getDevName() {
		return devName;
	}

	public void setDevName(String devName) {
		this.devName = devName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCurve() {
		return curve;
	}

	public void setCurve(String curve) {
		this.curve = curve;
	}

	public DeviceDataBean getDataBean() {
		return dataBean;
	}

	public void setDataBean(DeviceDataBean dataBean) {
		this.dataBean = dataBean;
	}

	public List<AlarmBean> getAlarmBeanList() {
		return alarmBeanList;
	}

	public void setAlarmBeanList(List<AlarmBean> alarmBeanList) {
		this.alarmBeanList = alarmBeanList;
	}

	public DeviceExtendBean getDeviceExtendBean() {
		return deviceExtendBean;
	}

	public void setDeviceExtendBean(DeviceExtendBean deviceExtendBean) {
		this.deviceExtendBean = deviceExtendBean;
	}

	public String getDevGap() {
		return devGap;
	}

	public void setDevGap(String devGap) {
		this.devGap = devGap;
	}
	
}

package com.hq.pojo;

import java.util.HashMap;
import java.util.List;

import com.hq.pojo.Node;

public class Node {
	//节点的 id
	private Integer id;
	//显示的节点文字。
	private String text;
	//节点状态， 'open' 或 'closed'，默认是 'open'
	private String state;
	//自定义属性对象
	private HashMap<String,Object> attributes;

	//指示节点是否被选中
	private boolean checked;
	//定义了一些子节点的节点数组
	private List<Node> children;
	//父节点
	private Integer parentId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public HashMap<String, Object> getAttributes() {
		return attributes;
	}
	public void setAttributes(HashMap<String, Object> attributes) {
		this.attributes = attributes;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public List<Node> getChildren() {
		return children;
	}
	public void setChildren(List<Node> children) {
		this.children = children;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
}

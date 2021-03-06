package net.oschina.gitapp.bean;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 设置通知为已读结果实体类
 * @created 2014-07-09
 * @author 火蚁（http://my.oschina.net/LittleDY）
 *
 */
@SuppressWarnings("serial")
public class NotificationReadResult extends Entity {
	
	@JsonProperty("created_at")
	private Date _created_at;
	
	@JsonProperty("mute")
	private boolean _mute;
	
	@JsonProperty("participating")
	private boolean _participating;
	
	@JsonProperty("project_id")
	private String _project_id;
	
	@JsonProperty("read")
	private boolean _read;
	
	@JsonProperty("target_id")
	private String _target_id;
	
	@JsonProperty("target_type")
	private String _target_type;
	
	@JsonProperty("updated_at")
	private Date _updated_at;
	
	@JsonProperty("user_id")
	private String _user_id;

	public Date getCreated_at() {
		return _created_at;
	}

	public void setCreated_at(Date created_at) {
		this._created_at = created_at;
	}

	public boolean isMute() {
		return _mute;
	}

	public void setMute(boolean mute) {
		this._mute = mute;
	}

	public boolean isParticipating() {
		return _participating;
	}

	public void setParticipating(boolean participating) {
		this._participating = participating;
	}

	public String getProject_id() {
		return _project_id;
	}

	public void setProject_id(String project_id) {
		this._project_id = project_id;
	}

	public boolean isRead() {
		return _read;
	}

	public void setRead(boolean read) {
		this._read = read;
	}

	public String getTarget_id() {
		return _target_id;
	}

	public void setTarget_id(String target_id) {
		this._target_id = target_id;
	}

	public String getTarget_type() {
		return _target_type;
	}

	public void setTarget_type(String target_type) {
		this._target_type = target_type;
	}

	public Date getUpdated_at() {
		return _updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this._updated_at = updated_at;
	}

	public String getUser_id() {
		return _user_id;
	}

	public void setUser_id(String user_id) {
		this._user_id = user_id;
	}
}

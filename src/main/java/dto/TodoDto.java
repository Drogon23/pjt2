package dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

/**
 * todolist 데이터를 담기 위한 객체
 * 
 * @author 문기선
 *
 */
public class TodoDto {
	
	private long id;
	private String name;
	private String regdate;
	private int sequence;
	private String title;
	private String type;
		
	public TodoDto() {
		
	}
		
	/**
	 * 데이터베이스 조회 결과값으로 TodoDto 변수 값 설정
	 * 
	 * @param rs 데이터베이스 결과값
	 */
	public TodoDto(ResultSet rs) {
		
		try {
			this.id = rs.getLong("id");
			this.name = rs.getString("name");
			this.regdate = rs.getString("regdate");
			this.sequence = rs.getInt("sequence");
			this.title = rs.getString("title");
			this.type = rs.getString("type");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "TodoDto [id=" + id + ", name=" + name + ", regdate=" + regdate + ", sequence=" + sequence + ", title="
				+ title + ", type=" + type + "]";
	}
	
}

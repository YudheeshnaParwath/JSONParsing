package S1;

import com.google.gson.annotations.SerializedName;

public class S1Tags {
	
	@SerializedName("id")
	private int tid;
	
	private int value;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Tags [tid=" + tid + ", value=" + value + "]";
	}
	
	

}

package year_2020.semester_b.period_a.exam.question_1;

public class SurfBoard {
	
	public enum BoardType{ShortBoard, Fish, Fun, LongBoard, Hybrid, Gun, Sup};
	private String color;
	private float length;
	private int serialNumber;
	private BoardType boardType;
	
	public SurfBoard(String color, float length, BoardType boardType) {
		setColor(color);
		this.length = length;
		this.boardType = boardType;
		

	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("color: " + color + ", ");
		sb.append("length: " + length + ", ");
		sb.append("Serial Number: " + serialNumber + ", ");
		sb.append("Board Type: " + boardType.toString());
		
		return sb.toString();
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public float getLength() {
		return length;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public BoardType getBoardType() {
		return boardType;
	}
}

package stackAndHeap;

public class TestHashCode {

	private int id;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestHashCode other = (TestHashCode) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public static void main(String[] args) {
		TestHashCode hashCode = new TestHashCode();
		TestHashCode hashCode2 = new TestHashCode();
		System.out.println(hashCode.hashCode());
		System.out.println(hashCode2.hashCode());
		System.out.println(hashCode.equals(hashCode2));
	}

}

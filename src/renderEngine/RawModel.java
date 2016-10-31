package renderEngine;

public class RawModel {
	private int vaoID;
	private int vertextCount;
	
	public RawModel(int vaoID, int vertexCount) {
		this.vaoID = vaoID;
		this.vertextCount = vertexCount;
	}

	public int getVaoID() {
		return vaoID;
	}

	public int getVertextCount() {
		return vertextCount;
	}	
}

package taxibeat;

/**
 * A class representing a client in the map using its longitude x, its latitude y and the
 * street that is closest to him.
*/

public class Client extends Point {
	private Node closestNode;

	/**
	 * @param x
	 * @param y
	 */
	public Client(double x, double y) {
		super(x, y);
		this.closestNode = closestNodeByPoint();
	}

	/**
	 * @return the closestStreet
	 */
	public Node getClosestNode() {
		return closestNode;
	}

	/**
	 * @param closestStreet the closestStreet to set
	 */
	public void setClosestNode(Node closestNode) {
		this.closestNode = closestNode;
	}

	@Override
	public String toString() {
		return "Client with  = " + closestNode.toString() + " x = " + getX() + " y = " + getY() + "]";
	}	
}

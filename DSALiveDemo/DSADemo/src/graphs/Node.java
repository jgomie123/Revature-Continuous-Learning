package graphs;

import java.util.ArrayList;
import java.util.List;

/*A graph is a non-linear data structure that consists of nodes (vertices) and edges (edges can be known as 
 * lines or arcs). 
 * We use graphs to solve real-world problems usually having to do with networks, because we use the graph
 * to represent the network. For example we can use graphs to model networks such as telephone networksa, 
 * circuit networks, 
 * neighborhoods (how the roads in a city connect), etc. 
 * Graphs are also used in social networks such as Facebook, LinkedIn, etc. For example: each person is represented 
 * as a node (vertex), and each node structure can contain info such as their id, name, locale, etc. 
 * A graph can be cyclic or acyclic 
 * 
 * */

public class Node {
	int data;
	boolean visited;
	List<Node> neighbors;
	
	public Node(int data) {
		this.data = data;
		this.neighbors = new ArrayList<Node>(); //each node will have a list of neighbor nodes
	}
	
	//1 node can take in another node and add it to the list of neighbor nodes
	public void addNeighbors(Node neighborNode) {
		this.neighbors.add(neighborNode);
	}
	
	public List<Node> getNeighbors(){
		return neighbors;
	}
	
	public void setNeighbors(List<Node> neighbors) {
		this.neighbors = neighbors;
	}
	
	
	
	
}

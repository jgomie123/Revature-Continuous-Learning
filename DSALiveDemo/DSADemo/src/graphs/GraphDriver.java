package graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphDriver {
	
	/*Breadth first search is a graph traversal algorithm 
	 * In this searching algorithm we look at the data structure level by level
	 * 
	 * In this case, we will be using a queue to tarverse the graph
	 * The queue should repeatedly extract the node and put its neighbors in the queue.
	 * The only real difference between how we wil implement breadth first search with this graph vs how we 
	 * did so with our binary tree, is that with our graph we shouldkeep track of whether or not the 
	 * node has been "visited" or not
	 * */
	
	//private Queue<Node> queue;
	
	
	public static void BreadthFirstSearch(Node node) {
		Queue<Node> queue = new LinkedList<Node>();
		
		//insert the root node into the queue
		queue.add(node);
		//set the node passed through as visited
		node.visited = true;
		
		while(!queue.isEmpty()) {
			Node element = queue.remove();
			System.out.println(element.data);
			
			List<Node> neighbors = element.getNeighbors();
			
			for(int i = 0; i < neighbors.size(); i++) {
				Node n = neighbors.get(i);
				
				//checking to see if it is null or visited
				if(n != null && !n.visited) {
					queue.add(n);
					n.visited = true;
				}
			}
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node node40 = new Node(40);
		Node node50 = new Node(50);
		Node node60 = new Node(60);
		Node node70 = new Node(70);
		Node node80 = new Node(80);
		Node node90 = new Node(90);
		Node node100 = new Node(100);
		Node node15 = new Node(15);
		Node node200 = new Node(200);
		Node node115 = new Node(115);
		
		node40.addNeighbors(node50);
		node40.addNeighbors(node60);
		node50.addNeighbors(node100);
		node60.addNeighbors(node70);
		node70.addNeighbors(node90);
		node70.addNeighbors(node80);
		node50.addNeighbors(node200);
		node50.addNeighbors(node15);
		node70.addNeighbors(node115);

		GraphDriver.BreadthFirstSearch(node40);
		
	}

}

package mypack;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(5);
		g.addEdge(0, 1);
//		g.addEdge(0, 3);
//		g.addEdge(1, 4);
//		g.addEdge(1, 3);
//		g.addEdge(2, 3);
//		
//		g.BFS(2);
//		Graph g = new Graph(4);
//
//		g.addEdge(4, 1);
//		g.addEdge(4, 0);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		int n = 0;
//
		System.out.println("Following is Breadth First Traversal " + "(starting from vertex " + n + " )");
		g.BFS(n);

		System.out.println("\nFollowing is Depth First Traversal " + "(starting from vertex " + n + " )");

		g.DFS(n);
		System.out.println("");
		for(int i = 0; i < g.novert; i++) {
			System.out.println("\nVertex "+i);
			g.BFS(i);
			System.out.println("\n");
			g.DFS(i);
		}

	}

}

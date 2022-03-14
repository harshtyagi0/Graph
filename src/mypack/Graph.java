package mypack;
import java.util.*;

public class Graph {
	int novert;
	LinkedList<Integer> va[];

	public Graph(int novert) {
		this.novert = novert;
		va = new LinkedList[novert];
		for(int i = 0; i < novert; i++) {
			va[i]= new LinkedList<Integer>();
		}
		// TODO Auto-generated constructor stub
	}
	void addEdge(int o, int d) {
		va[o].add(d);
	}
	
	void BFS(int s) {
		boolean visited[] = new boolean[novert];
		LinkedList<Integer> queue = new LinkedList<Integer>();
	    visited[s]=true;
	    queue.add(s);
	    while (queue.size() != 0)
	    {
	    	s = queue.poll();
	        System.out.print(s+" ");
	        Iterator<Integer> i = va[s].listIterator();
	        while (i.hasNext())
	        {
	        	int n = i.next();
	            if (!visited[n])
	            {
	            	visited[n] = true;
	                queue.add(n);
	            }
	        }
	    }
	 }
	void DFSUtil(int v, boolean visited[])
    {
        visited[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> i = va[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
	
	void DFS(int v)
    {
        
        boolean visited[] = new boolean[novert];
        DFSUtil(v, visited);
    }
    
	
	void disp(int v) {
		Iterator<Integer> i = va[v].iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}

import junit.framework.TestCase;

public class GraphTest extends TestCase {
	public void testGraph() {
		Graph graph = new Graph(9);
		graph.add("v0");
		graph.add("v1");
		graph.add("v2");
		graph.add("v3");
		graph.add("v4");
		graph.add("v5");
		graph.add("v6");
		graph.add("v7");
		graph.add("v8");
		graph.addEdge(0, 1, 6);
		graph.addEdge(0, 2, 4);
		graph.addEdge(0, 3, 5);
		graph.addEdge(1, 4, 1);
		graph.addEdge(2, 4, 1);
		graph.addEdge(3, 5, 2);
		graph.addEdge(4, 6, 9);
		graph.addEdge(4, 7, 7);
		graph.addEdge(5, 7, 4);
		graph.addEdge(6, 8, 2);
		graph.addEdge(7, 8, 5);
		if (graph.topo()) {
			graph.calculate();

			int[] e = graph.getE();
			int[] l = graph.getL();
			int[] key = graph.getKey();
			int[] ve = graph.getVE();
			int[] vl = graph.getVl();
			int[] weight = graph.getEdgeWeight();
			int sum = 0;

			System.out.println("事件的最早发生时间：");
			for (int w = 0; w < ve.length; w++) {
				System.out.print(ve[w] + "      ");
			}
			System.out.println();

			System.out.println("事件的最晚发生时间：");
			for (int w = 0; w < vl.length; w++) {
				System.out.print(vl[w] + "      ");
			}
			System.out.println();

			System.out.println("活动的最早发生时间：");
			for (int w = 0; w < e.length; w++) {
				System.out.print(e[w] + "      ");
			}

			System.out.println();
			System.out.println("活动的最迟发生时间：");
			for (int w = 0; w < l.length; w++) {
				System.out.print(l[w] + "      ");
			}

			System.out.println();

			System.out.println("关键活动有：");
			for (int w = 0; w < graph.getKNum(); w++) {
				System.out.print(key[w] + "      ");
			}
			System.out.println();
			System.out.println("关键活动的权值是 ：");
			for (int w = 0; w < graph.getKNum(); w++) {
				System.out.print(weight[key[w]]+ "      ");
			}
			System.out.println();
			System.out.println("关键活动的求和 ：");
			for (int w = 0; w < graph.getKNum(); w++) {
				sum = sum + weight[key[w]];
			}
			System.out.print(sum);
			System.out.println();
		}
	}
}

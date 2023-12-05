import java.util.*;

class Graph {
    private int vertices;
    private Map<Integer, List<Node>> adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new HashMap<>();
        for (int i = 1; i <= vertices; i++) {
            adjacencyList.put(i, new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination, int weight) {
        adjacencyList.get(source).add(new Node(destination, weight));
        adjacencyList.get(destination).add(new Node(source, weight));
    }

    public int[] dijkstra(int startVertex) {
        int[] distances = new int[vertices + 1];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[startVertex] = 0;

        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(node -> node.weight));
        priorityQueue.add(new Node(startVertex, 0));

        while (!priorityQueue.isEmpty()) {
            int currentVertex = priorityQueue.poll().vertex;

            for (Node neighbor : adjacencyList.get(currentVertex)) {
                int newDistance = distances[currentVertex] + neighbor.weight;

                if (newDistance < distances[neighbor.vertex]) {
                    distances[neighbor.vertex] = newDistance;
                    priorityQueue.add(new Node(neighbor.vertex, newDistance));
                }
            }
        }

        return distances;
    }

    static class Node {
        int vertex;
        int weight;

        public Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }
}

public class dijkstraStudyCase {
    public static void main(String[] args) {
        int vertices = 5;
        Graph graph = new Graph(vertices);

        int totalCities = 4;
        Graph flightGraph = new Graph(totalCities);

        flightGraph.addEdge(1, 2, 500); // A to B
        flightGraph.addEdge(1, 3, 300); // A to C
        flightGraph.addEdge(2, 3, 150); // B to C
        flightGraph.addEdge(2, 4, 200); // B to D
        flightGraph.addEdge(3, 4, 100); // C to D

        int startCity = 1; // Starting from City A
        int[] shortestDistances = flightGraph.dijkstra(startCity);

        System.out.println("Shortest distances from City " + startCity + ":");
        for (int i = 1; i <= totalCities; i++) {
            System.out.println("To City " + i + ": " + shortestDistances[i] + " km");
        }
    }
}

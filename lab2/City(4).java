import java.util.ArrayList;

public class City {
    private String name;

    private static class Path {
        City to;
        int cost;

        Path(City to, int cost) {
            this.to = to;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return to.getName() + ":" + cost;
        }
    }

    private ArrayList<Path> paths = new ArrayList<>();

    public City(String name) {
        this.name = name;
    }

    public City(String name, City[] connectedCities, int[] costs) {
        this.name = name;
        if (connectedCities != null && costs != null && connectedCities.length == costs.length) {
            for (int i = 0; i < connectedCities.length; i++) {
                paths.add(new Path(connectedCities[i], costs[i]));
            }
        }
    }

    public void addPath(City to, int cost) {
        paths.add(new Path(to, cost));
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (paths.isEmpty())
            return name + " -> (нет путей)";

        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" -> (");

        for (int i = 0; i < paths.size(); i++) {
            sb.append(paths.get(i));
            if (i != paths.size() - 1) sb.append(", ");
        }

        sb.append(")");
        return sb.toString();
    }
}
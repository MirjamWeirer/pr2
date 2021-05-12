package uebungsbeispiele.uebung01;

public class CrazyLabyrinthApp {
    public static void main(String[] args) {
        LabyrinthTile tile1 = new LabyrinthTile(Direction.DOWN,Direction.UP);
        LabyrinthTile tile2 = new LabyrinthTile(Direction.DOWN,Direction.RIGHT);
        LabyrinthTile tile3 = new LabyrinthTile(Direction.UP,Direction.DOWN);
        LabyrinthTile tile4 = new LabyrinthTile(Direction.LEFT,Direction.RIGHT);
        LabyrinthTile tile5 = new LabyrinthTile(Direction.RIGHT,Direction.LEFT);

        LabyrinthTile[] path = new LabyrinthTile[5];
        path[0]=tile1;
        path[1]=tile2;
        path[2]=tile3;
        path[3]=tile4;
        path[4]=tile5;

        CrazyLabyrinth labyrinth = new CrazyLabyrinth();

        System.out.println(labyrinth.checkPathConsistency(path));
    }
}

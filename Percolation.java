import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;




public class Percolation {

    
   public Percolation(int n);                // create n-by-n grid, with all sites blocked
/*   public    void open(int row, int col);    // open site (row, col) if it is not open already
   public boolean isOpen(int row, int col);  // is site (row, col) open?
   public boolean isFull(int row, int col);  // is site (row, col) full?
   public     int numberOfOpenSites();       // number of open sites
   public boolean percolates();              // does the system percolate?

   public static void main(String[] args);   // test client (optional)
*/
}


  public Percolation(int n){

    double width = GridMaker.SCREEN_SIZE/n;
    Pane p = new Pane();

    Rectangle [][] rec = new Rectangle [n][n];

    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            rec[i][j] = new Rectangle();
            rec[i][j].setX(i * width);
            rec[i][j].setY(j * width);
            rec[i][j].setWidth(width);
            rec[i][j].setHeight(width);
            rec[i][j].setFill(null);
            rec[i][j].setStroke(Color.BLACK);
            p.getChildren().add(rec[i][j]);

        }
    }

    return p;
}
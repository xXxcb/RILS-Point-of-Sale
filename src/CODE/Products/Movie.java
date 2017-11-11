/*
 * @author Carlos Burke - 1400681
 */
package CODE.Products;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Movie {

    //Attribute Declaration
    private String Title;
    private String DateReleased; 
    private String Rating;
    private String Genre;
    private String DateAcquired;
    private int RentalId;
    private int NoOfItems;
    private double DailyCost;

    ArrayList<Movie> aM = new ArrayList<>();
    Movie mvi;

    //
    public Movie(String Title, String DateReleased, String Rating, String Genre, String DateAcquired, int RentalId, int NoOfItems, double DailyCost) {
        this.Title = Title;
        this.DateReleased = DateReleased;
        this.Rating = Rating;
        this.Genre = Genre;
        this.DateAcquired = DateAcquired;
        this.RentalId = RentalId;
        this.NoOfItems = NoOfItems;
        this.DailyCost = DailyCost;
    }

    //
    public Movie() {
        Title = "";
        DateReleased = "";
        Rating = "";
        Genre = "";
        DateAcquired = "";
        RentalId = 0;
        NoOfItems = 0;
        DailyCost = 0.0;
    }

    //
    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getDateReleased() {
        return DateReleased;
    }

    public void setDateReleased(String DateReleased) {
        this.DateReleased = DateReleased;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String Rating) {
        this.Rating = Rating;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public String getDateAcquired() {
        return DateAcquired;
    }

    public void setDateAcquired(String DateAcquired) {
        this.DateAcquired = DateAcquired;
    }

    public int getRentalId() {
        return RentalId;
    }

    public void setRentalId(int RentalId) {
        this.RentalId = RentalId;
    }

    public int getNoOfItems() {
        return NoOfItems;
    }

    public void setNoOfItems(int NoOfItems) {
        this.NoOfItems = NoOfItems;
    }

    public double getDailyCost() {
        return DailyCost;
    }

    public void setDailyCost(double DailyCost) {
        this.DailyCost = DailyCost;
    }

    public void addMovie(ArrayList<Movie> newMviz) {
        try {
            File fp = new File("./DB/MovieRecords.txt");
            Scanner in = new Scanner(fp);
            while (in.hasNext()) {
                mvi = new Movie();
                mvi.setTitle(in.next());
                mvi.setGenre(in.next());
                mvi.setDateReleased(in.next());
                mvi.setRating(in.next());
                mvi.setDateAcquired(in.next());
                mvi.setRentalId(in.nextInt());
                mvi.setNoOfItems(in.nextInt());
                mvi.setDailyCost(in.nextDouble());
                aM.add(mvi);
            }
            in.close();

            //ADDS NEW DATA TO END OF ARRAYLIST
            for (Movie m : newMviz) {
                mvi = new Movie();
                mvi.setTitle(m.getTitle());
                mvi.setGenre(m.getGenre());
                mvi.setDateReleased(m.getDateReleased());
                mvi.setRating(m.getRating());
                mvi.setDateAcquired(m.getDateAcquired());
                mvi.setRentalId(m.getRentalId());
                mvi.setNoOfItems(m.getNoOfItems());
                mvi.setDailyCost(m.getDailyCost());
                aM.add(mvi);
            }
            FileWriter fOut = new FileWriter("./DB/MovieRecords.txt");
            for (Movie m : aM) {
                mvi = new Movie();

                fOut.write(m.getTitle() + " ");
                fOut.write(m.getGenre() + " ");
                fOut.write(m.getDateReleased() + " ");
                fOut.write(m.getRating() + " ");
                fOut.write(m.getDateAcquired() + " ");
                fOut.write(m.getRentalId() + " ");
                fOut.write(m.getNoOfItems() + " ");
                fOut.write(m.getDailyCost() + " \n");
            }
            fOut.close();
        } catch (FileNotFoundException ex) {     
        } catch (IOException ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Object[][] DispMovies() throws FileNotFoundException {
        File inFile = new File("./DB/MovieRecords.txt");
        Scanner inf = new Scanner(inFile);
        int cnt = 0;

        Object[][] MovieInfo = new Object[15][8];

        while (inf.hasNext()) {
            MovieInfo[cnt][0] = inf.next();
            MovieInfo[cnt][1] = inf.next();
            MovieInfo[cnt][2] = inf.next();
            MovieInfo[cnt][3] = inf.next();
            MovieInfo[cnt][4] = inf.next();
            MovieInfo[cnt][5] = inf.next();
            MovieInfo[cnt][6] = inf.next();
            MovieInfo[cnt][7] = inf.next();
            cnt++;
        }
        return MovieInfo;
    }
}

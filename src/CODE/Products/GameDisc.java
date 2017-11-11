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

public class GameDisc {
    //
    private String Manufacture;
    private String GameTitle; //look fro date class
    private String PlayerMode;
    private int SerialNumber;
    private String Genre;
    private String DateAcquired;
    private int RentalId;
    private int NoOfItems;
    private double DailyCost;
    
    ArrayList<GameDisc> localList = new ArrayList<>();
    GameDisc objLocal;
    
    //
    public GameDisc() {
        Manufacture = "";
        GameTitle = ""; 
        PlayerMode = "";
        SerialNumber = 0;
        Genre = "";
        DateAcquired = "";
        RentalId = 0;
        NoOfItems = 0;
        DailyCost = 0.0;
    }
    
    //
    public GameDisc(String Manufacture, String GameTitle, String PlayerMode, int SerialNumber, String Genre, String DateAcquired, int RentalId, int NoOfItems, double DailyCost) {
        this.Manufacture = Manufacture;
        this.GameTitle = GameTitle;
        this.PlayerMode = PlayerMode;
        this.SerialNumber = SerialNumber;
        this.Genre = Genre;
        this.DateAcquired = DateAcquired;
        this.RentalId = RentalId;
        this.NoOfItems = NoOfItems;
        this.DailyCost = DailyCost;
    }
    
    //
    public String getManufacture() {
        return Manufacture;
    }

    public void setManufacture(String Manufacture) {
        this.Manufacture = Manufacture;
    }

    public String getGameTitle() {
        return GameTitle;
    }

    public void setGameTitle(String GameTitle) {
        this.GameTitle = GameTitle;
    }

    public String getPlayerMode() {
        return PlayerMode;
    }

    public void setPlayerMode(String PlayerMode) {
        this.PlayerMode = PlayerMode;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(int SerialNumber) {
        this.SerialNumber = SerialNumber;
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
    
    public void addGamesDisc(ArrayList<GameDisc> GD) {
        try {
            File fp = new File("./DB/GameDiscRecords.txt");
            Scanner in = new Scanner(fp);
            while(in.hasNext()) {
                objLocal = new GameDisc();
                
                objLocal.setGameTitle(in.next());
                objLocal.setManufacture(in.next());
                objLocal.setGenre(in.next());
                objLocal.setSerialNumber(in.nextInt());
                objLocal.setPlayerMode(in.next());
                objLocal.setDateAcquired(in.next());
                objLocal.setRentalId(in.nextInt());
                objLocal.setNoOfItems(in.nextInt());
                objLocal.setDailyCost(in.nextDouble());
                
                localList.add(objLocal);                
            }
            in.close();
            
            for (GameDisc g : GD) {
                objLocal = new GameDisc();
                
                objLocal.setGameTitle(g.getGameTitle());
                objLocal.setManufacture(g.getManufacture());
                objLocal.setGenre(g.getGenre());
                objLocal.setSerialNumber(g.getSerialNumber());
                objLocal.setPlayerMode(g.getPlayerMode());
                objLocal.setDateAcquired(g.getDateAcquired());
                objLocal.setRentalId(g.getRentalId());
                objLocal.setNoOfItems(g.getNoOfItems());
                objLocal.setDailyCost(g.getDailyCost());
                
                localList.add(objLocal);
            }
            
            FileWriter fOut = new FileWriter("./DB/GameDiscRecords.txt");
            for (GameDisc g : localList) {
                objLocal = new GameDisc();
                
                fOut.write(g.getGameTitle() + " ");
                fOut.write(g.getManufacture()+ " ");
                fOut.write(g.getGenre() + " ");
                fOut.write(g.getSerialNumber() + " ");
                fOut.write(g.getPlayerMode() + " ");
                fOut.write(g.getDateAcquired() + " ");
                fOut.write(g.getRentalId() + " ");
                fOut.write(g.getNoOfItems() + " ");
                fOut.write(g.getDailyCost() + " \n");
            }
            fOut.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GameDisc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GameDisc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public Object[][] DispDisc() throws FileNotFoundException {
        File inFile = new File("./DB/GameDiscRecords.txt");
        Scanner inf = new Scanner(inFile);
        int cnt = 0;

        Object[][] DiscInfo = new Object[15][9];

        while (inf.hasNext()) {
            DiscInfo[cnt][0] = inf.next();
            DiscInfo[cnt][1] = inf.next();
            DiscInfo[cnt][2] = inf.next();
            DiscInfo[cnt][3] = inf.next();
            DiscInfo[cnt][4] = inf.next();
            DiscInfo[cnt][5] = inf.next();
            DiscInfo[cnt][6] = inf.next();
            DiscInfo[cnt][7] = inf.next();
            DiscInfo[cnt][8] = inf.next();
            cnt++;
        }
        return DiscInfo;
    }
}

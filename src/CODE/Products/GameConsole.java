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

public class GameConsole {
    
    //
    private String Manufacture;
    private String ConsoleName; 
    private String ConsoleColor;
    private int SerialNumber;
    private int NoOfControllers;
    private String DateAcquired;
    private int RentalId;
    private int NoOfItems;
    private double DailyCost;
    
    ArrayList<GameConsole> localList = new ArrayList<>();
    GameConsole objLocal;
    
    //
    public GameConsole() {
        Manufacture = "";
        ConsoleName = ""; 
        ConsoleColor = "";
        SerialNumber = 0;
        NoOfControllers = 0;
        DateAcquired = "";
        RentalId = 0;
        NoOfItems = 0;
        DailyCost = 0.0;
    }

    public GameConsole(String Manufacture, String ConsoleName, String ConsoleColor, int SerialNumber, int NoOfControllers, String DateAcquired, int RentalId, int NoOfItems, double DailyCost, GameConsole objLocal) {
        this.Manufacture = Manufacture;
        this.ConsoleName = ConsoleName;
        this.ConsoleColor = ConsoleColor;
        this.SerialNumber = SerialNumber;
        this.NoOfControllers = NoOfControllers;
        this.DateAcquired = DateAcquired;
        this.RentalId = RentalId;
        this.NoOfItems = NoOfItems;
        this.DailyCost = DailyCost;
        this.objLocal = objLocal;
    }

    public String getManufacture() {
        return Manufacture;
    }

    public void setManufacture(String Manufacture) {
        this.Manufacture = Manufacture;
    }

    public String getConsoleName() {
        return ConsoleName;
    }

    public void setConsoleName(String ConsoleName) {
        this.ConsoleName = ConsoleName;
    }

    public String getConsoleColor() {
        return ConsoleColor;
    }

    public void setConsoleColor(String ConsoleColor) {
        this.ConsoleColor = ConsoleColor;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(int SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    public int getNoOfControllers() {
        return NoOfControllers;
    }

    public void setNoOfControllers(int NoOfControllers) {
        this.NoOfControllers = NoOfControllers;
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

    public ArrayList<GameConsole> getLocalList() {
        return localList;
    }

    public void setLocalList(ArrayList<GameConsole> localList) {
        this.localList = localList;
    }

    public GameConsole getObjLocal() {
        return objLocal;
    }

    public void setObjLocal(GameConsole objLocal) {
        this.objLocal = objLocal;
    }
    
    public void addGameConsole(ArrayList<GameConsole> GC) {
        try {
            File fp = new File("./DB/GameConsoleRecords.txt");
            Scanner in = new Scanner(fp);
            while(in.hasNext()) {
                objLocal = new GameConsole();                
                
                objLocal.setConsoleName(in.next());
                objLocal.setManufacture(in.next());             
                objLocal.setConsoleColor(in.next());
                objLocal.setSerialNumber(in.nextInt());
                objLocal.setNoOfControllers(in.nextInt());
                objLocal.setDateAcquired(in.next());                                
                objLocal.setRentalId(in.nextInt());
                objLocal.setNoOfItems(in.nextInt());
                objLocal.setDailyCost(in.nextDouble());                
                localList.add(objLocal);                
            }
            in.close();
            
            for (GameConsole c : GC) {
                objLocal = new GameConsole();
                
                objLocal.setConsoleName(c.getConsoleName());
                objLocal.setManufacture(c.getManufacture());                
                objLocal.setConsoleColor(c.getConsoleColor());
                objLocal.setSerialNumber(c.getSerialNumber());
                objLocal.setNoOfControllers(c.getNoOfControllers());
                objLocal.setDateAcquired(c.getDateAcquired());
                objLocal.setRentalId(c.getRentalId());
                objLocal.setNoOfItems(c.getNoOfItems());
                objLocal.setDailyCost(c.getDailyCost());                
                localList.add(objLocal);
            }
            
            FileWriter fOut = new FileWriter("./DB/GameConsoleRecords.txt");
            for (GameConsole c : localList) {
                objLocal = new GameConsole();
                
                fOut.write(c.getConsoleName() + " ");
                fOut.write(c.getManufacture()+ " ");
                fOut.write(c.getConsoleColor() + " ");
                fOut.write(c.getSerialNumber() + " ");
                fOut.write(c.getNoOfControllers() + " ");
                fOut.write(c.getDateAcquired() + " ");                       
                fOut.write(c.getRentalId() + " ");
                fOut.write(c.getNoOfItems() + " ");
                fOut.write(c.getDailyCost() + " \n");
            }
            fOut.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GameConsole.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GameConsole.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Object[][] DispConsole() throws FileNotFoundException {
        File inFile = new File("./DB/GameConsoleRecords.txt");
        Scanner inf = new Scanner(inFile);
        int cnt = 0;

        Object[][] ConsoleInfo = new Object[15][9];

        while (inf.hasNext()) {
            ConsoleInfo[cnt][0] = inf.next();
            ConsoleInfo[cnt][1] = inf.next();
            ConsoleInfo[cnt][2] = inf.next();
            ConsoleInfo[cnt][3] = inf.next();
            ConsoleInfo[cnt][4] = inf.next();
            ConsoleInfo[cnt][5] = inf.next();
            ConsoleInfo[cnt][6] = inf.next();
            ConsoleInfo[cnt][7] = inf.next();
            ConsoleInfo[cnt][8] = inf.next();
            cnt++;
        }
        return ConsoleInfo;
    }
    
}

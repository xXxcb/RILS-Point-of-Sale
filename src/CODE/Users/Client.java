/*
 * UserClass
 * @author Carlos Burke - 1400681
 */
package CODE.Users;

public class Client {
    
    //
    private String fName;
    private String lName;
    private int iD;
    private String prodName;
    private int prodRentId;
    private String rentStartDate;
    private String rentEndDate;
    private int numRentDays;
    private double totalCost;
    private double GCT;
    private int receiptNum;
    private double cost;
 
    //
    public Client() {
        fName = "";
        lName = "";
        iD = 0;
        prodName = "";
        prodRentId = 0;
        rentStartDate = "";
        rentEndDate = "";
        numRentDays = 0;
        totalCost = 0.0;
        GCT = 0.0;
        receiptNum = 0;
        cost = 0.0;
    }
    
    //
    public Client(String fName, String lName, int iD, String prodName, int prodRentId, String rentStartDate, String rentEndDate, int numRentDays, double totalCost, double GCT, int receiptNum) {
        this.fName = fName;
        this.lName = lName;
        this.iD = iD;
        this.prodName = prodName;
        this.prodRentId = prodRentId;
        this.rentStartDate = rentStartDate;
        this.rentEndDate = rentEndDate;
        this.numRentDays = numRentDays;
        this.totalCost = totalCost;
        this.GCT = GCT;
        this.receiptNum = receiptNum;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Client(double cost) {
        this.cost = cost;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdRentId() {
        return prodRentId;
    }

    public void setProdRentId(int prodRentId) {
        this.prodRentId = prodRentId;
    }

    public String getRentStartDate() {
        return rentStartDate;
    }

    public void setRentStartDate(String rentStartDate) {
        this.rentStartDate = rentStartDate;
    }

    public String getRentEndDate() {
        return rentEndDate;
    }

    public void setRentEndDate(String rentEndDate) {
        this.rentEndDate = rentEndDate;
    }

    public int getNumRentDays() {
        return numRentDays;
    }

    public void setNumRentDays(int numRentDays) {
        this.numRentDays = numRentDays;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getGCT() {
        return GCT;
    }

    public void setGCT(double GCT) {
        this.GCT = GCT;
    }

    public int getReceiptNum() {
        return receiptNum;
    }

    public void setReceiptNum(int receiptNum) {
        this.receiptNum = receiptNum;
    }
}
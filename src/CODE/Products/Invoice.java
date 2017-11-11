/*
 * @author Carlos Burke - 1400681
 */
package CODE.Products;

import CODE.Users.Client;

public class Invoice extends Client{
    //
    private int InvoiceNumber;
    
    //
    public Invoice() {
        InvoiceNumber = 0;
    }
    
    //Primary Constructors

    public Invoice(int InvoiceNumber) {
        this.InvoiceNumber = InvoiceNumber;
    }

    public Invoice(int InvoiceNumber, String fName, String lName, int iD, String prodName, int prodRentId, String rentStartDate, String rentEndDate, int numRentDays, double totalCost, double GCT, int receiptNum) {
        super(fName, lName, iD, prodName, prodRentId, rentStartDate, rentEndDate, numRentDays, totalCost, GCT, receiptNum);
        this.InvoiceNumber = InvoiceNumber;
    }

    
}

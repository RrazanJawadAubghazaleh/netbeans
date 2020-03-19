/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progressoft;

public class Snack {
  
    private int snackId;
    private String snackName;
    private double snackPrice;
    private int snackQuantity;
    private String snackType;
    
    
    public Snack() {
    }

    public int getSnackId() {
        return snackId;
    }

    public void setSnackId(int snackId) {
        this.snackId = snackId;
    }

    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public double getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(double snackPrice) {
        this.snackPrice = snackPrice;
    }

    public int getSnackQuantity() {
        return snackQuantity;
    }

    public void setSnackQuantity(int snackQuantity) {
        this.snackQuantity = snackQuantity;
    }

    public String getSnackType() {
        return snackType;
    }

    public void setSnackType(String snackType) {
        this.snackType = snackType;
    }

    @Override
    public String toString() {
        return "Snack{" + "snackId=" + snackId + ", snackName=" + snackName + ", snackPrice=" + snackPrice + ", snackQuantity=" + snackQuantity + ", snackType=" + snackType + '}';
    }

   

   
    
}

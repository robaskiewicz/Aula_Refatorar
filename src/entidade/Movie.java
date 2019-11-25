/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author Robaskiewicz
 */
public class Movie {

  public static final int  CHILDRENS = 2;
  public static final int  REGULAR = 0;
  public static final int  NEW_RELEASE = 1;

    private String _title;
    private Price _price;

   public Movie(String name, Price priceCode) {
      _title = name;
      setPriceCode(priceCode);
   }

    public int getPriceCode() {
      return _price.getPriceCode();
   }

    public String getTitle() {
        return _title;
    }

    public Price getPrice() {
        return _price;
    }

    public void setPriceCode(Price priceCode) {
        this._price = priceCode;
    }

    double getCharge(int daysRented) {
      return _price.getCharge(daysRented);
   }
    

     int getFrequentRenterPoints(int daysRented) {
         return _price.getFrequentRenterPoints(daysRented);
   }
}

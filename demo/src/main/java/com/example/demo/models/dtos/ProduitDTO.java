/**
 * 
 */
package com.example.demo.models.dtos;

/**
 * @author ISGA
 *
 */
public class ProduitDTO {

	
	String designation;
	double prix;
	String image;
	
	
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}
	/**
	 * @param prix the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}
	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "ProduitDTO [ designation=" + designation + ", prix=" + prix + ", image="
				+ image + "]";
	}
	/**
	 * @param designation
	 * @param prix
	 * @param image
	 */
	public ProduitDTO(String designation, double prix, String image) {
		super();
		this.designation = designation;
		this.prix = prix;
		this.image = image;
	}
	
	
}

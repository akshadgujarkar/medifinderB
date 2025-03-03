package com.medifinder.medicine;
import jakarta.persistence.*;
@Entity
@Table(name = "medicines")
public class Medicine {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String medicineName;
    private String medicineType;
    private int availableQuantity;
    private double pricePerUnit;
    private String manufacturingDate;
    private String expiryDate;
    private String stockStatus;
	private String batchNumber;
    private String category;
    private int reorderLevel;
    private String prescriptionRequired;
    
    public Medicine(Long id, String medicineName, String medicineType, int availableQuantity, double pricePerUnit,
			String manufacturingDate, String expiryDate, String stockStatus, String batchNumber, String category,
			int reorderLevel, String prescriptionRequired) {
		super();
		this.id = id;
		this.medicineName = medicineName;
		this.medicineType = medicineType;
		this.availableQuantity = availableQuantity;
		this.pricePerUnit = pricePerUnit;
		this.manufacturingDate = manufacturingDate;
		this.expiryDate = expiryDate;
		this.stockStatus = stockStatus;
		this.batchNumber = batchNumber;
		this.category = category;
		this.reorderLevel = reorderLevel;
		this.prescriptionRequired = prescriptionRequired;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getMedicineType() {
		return medicineType;
	}

	public void setMedicineType(String medicineType) {
		this.medicineType = medicineType;
	}

	public int getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public String getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getStockStatus() {
		return stockStatus;
	}

	public void setStockStatus(String stockStatus) {
		this.stockStatus = stockStatus;
	}

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReorderLevel() {
		return reorderLevel;
	}

	public void setReorderLevel(int reorderLevel) {
		this.reorderLevel = reorderLevel;
	}

	public String getPrescriptionRequired() {
		return prescriptionRequired;
	}

	public void setPrescriptionRequired(String prescriptionRequired) {
		this.prescriptionRequired = prescriptionRequired;
	}
    
}

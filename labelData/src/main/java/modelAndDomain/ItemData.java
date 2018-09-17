package modelAndDomain;
import java.io.Serializable;
public class ItemData {
	private static final long serialVersionUID=1L;
	private String ItemID;
	private String CommdityName;
	private String ItemDescription;
	private String CustomsDescription;
	private String UnitValue;
	private String ItemWeight;
	private String UnitOfItemWeight;
	private String Quantity;
	private String CountryOfOrigin;
	private String HTSNumber;
	private String MultiSourceFlag;
	private String OriginalImportCost;
	private String ImportCostCurrencyType;
	public String getItemID() {
		return ItemID;
	}
	public void setItemID(String itemID) {
		ItemID = itemID;
	}
	public String getCommdityName() {
		return CommdityName;
	}
	public void setCommdityName(String commdityName) {
		CommdityName = commdityName;
	}
	public String getItemDescription() {
		return ItemDescription;
	}
	public void setItemDescription(String itemDescription) {
		ItemDescription = itemDescription;
	}
	public String getCustomsDescription() {
		return CustomsDescription;
	}
	public void setCustomsDescription(String customsDescription) {
		CustomsDescription = customsDescription;
	}
	public String getUnitValue() {
		return UnitValue;
	}
	public void setUnitValue(String unitValue) {
		UnitValue = unitValue;
	}
	public String getItemWeight() {
		return ItemWeight;
	}
	public void setItemWeight(String itemWeight) {
		ItemWeight = itemWeight;
	}
	public String getUnitOfItemWeight() {
		return UnitOfItemWeight;
	}
	public void setUnitOfItemWeight(String unitOfItemWeight) {
		UnitOfItemWeight = unitOfItemWeight;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public String getCountryOfOrigin() {
		return CountryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		CountryOfOrigin = countryOfOrigin;
	}
	public String getHTSNumber() {
		return HTSNumber;
	}
	public void setHTSNumber(String hTSNumber) {
		HTSNumber = hTSNumber;
	}
	public String getMultiSourceFlag() {
		return MultiSourceFlag;
	}
	public void setMultiSourceFlag(String multiSourceFlag) {
		MultiSourceFlag = multiSourceFlag;
	}
	public String getOriginalImportCost() {
		return OriginalImportCost;
	}
	public void setOriginalImportCost(String originalImportCost) {
		OriginalImportCost = originalImportCost;
	}
	public String getImportCostCurrencyType() {
		return ImportCostCurrencyType;
	}
	public void setImportCostCurrencyType(String importCostCurrencyType) {
		ImportCostCurrencyType = importCostCurrencyType;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}

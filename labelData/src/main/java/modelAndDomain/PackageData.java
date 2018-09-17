package modelAndDomain;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class PackageData {
	private static final long serialVersionUID=1L;
    private String OrderID; 
    private String ItemValueCurrencyType;
    private String SenderName;
    private String SenderFirstName;
    private String SenderBusiessName;
    private String SenderAddress_Line_1;
    private String SenderCity;
    private String SenderProvice;
    private String SenderPostal_Code;
    private String SenderCountry_Code;
    private String SenderPhone;
    private String SenderEmail;
    private String SenderSignature;
    private String RecipientFirstName;
    private String RecipientLastName;
    private String RecipientAddress_Line_1;
    private String RecipientCity;
    private String RecipientProvince;
    private String RecipientPostal_Code;
    private String RecipientCountry_Code;
    private String RecipientPhone;
    private String RecipientEmail;
 
	private String SenderMiddleInitial;
	private String SenderLastName;
	private String SenderBusinessName;
	private String SenderAddress_Line_2;
	private String SenderAddress_Line_3;
	private String SenderAddress_IsPOBox;
	private String SenderProvince;
	private String RecipientMiddleInitial;
	private String RecipientBusinessName;
	private String RecipientAddress_Line_2;
	private String RecipientAddress_Line_3;
	private String RecipientInLineTransLationAddressLine1;
	private String RecipientInLineTransLationAddressLine2;
	private String RecipientAddress_IsPOBox;
	   private String PackageType;
	    private String PackageShape;
	    private String PackageID;
	    private String PackageWeight;
	    private String WeightUnit;
	    private String UnitOfMeasurement;
	    private String ServiceType;
	    private String RateType;
	    private String PackagePhysicalCount;
	    private String MailingAgentID;
	    private String ValueLoaded;
	    private String PFCorEEL;
	    

	private String ShippingandHandling;
	private String ShippingCurrencyType;
	private String PackageLength;
	private String PackageWidth;
	private String PackageHeight;
	private String PostagePaid;
	private String PostagePaidCurrencyType;
	private String RestrictionType;
	private String RestrictionComments;
	private String ReturnAgentID;
	private String LicenseNumber;
	private String CertificateNumber;
	private String InvoiceNumber;
	private String PaymentAndDeliveryTerms;
	private String ReturnServiceRequested;
	private String EntryFacilityZip;
	private String CustomerReferenceID;
	private String RedirectBusinessName;
	private String RedirectFirstName;
	private String RedirectLastName;
	private String RedirectAddress_Line_1;
	private String RedirectAddress_Line_2;
	private String RedirectAddress_Line_3;
	private String RedirectCity;
	private String RedirectProvince;
	private String RedirectPostal_Code;
	private String RedirectCountry_Code;
	private String RedirectPhone;
	private String RedirectEmail;
	private String ExporterReferenceType;
	private String ExporterReferenceValue;
	private String ExporterPhoneNo;
	private String ExporterEmail;
	private String ImporterReferenceType;
	private String ImporterReferenceValue;
	private String ImporterPhoneNo;
	private String ImporterEmail;
	private String DestinationLocation;
	private String PriceCategoryType;
	private String DestinationLocationID;
	private String RecipientFirstName_Foreign;
	private String RecipientLastName_Foreign;
	private String RecipientBusinessName_Foreign;
	private String RecipientAddress_Line_1_Foreign;
	private String RecipientAddress_Line_2_Foreign;
	private String RecipientAddress_Line_3_Foreign;
	private String RecipientCity_Foreign;
	private String RecipientProvince_Foreign;
	private String RecipientPostal_Code_Foreign;
	private String PackageOrderDate;
	private String InsuredAmount;
	private List<ItemData> list;
	public PackageData() {
		super();
	}
	public PackageData(JSONObject map) throws JSONException, JsonParseException, JsonMappingException, IOException {
		super();
		this.PackageID=(String) map.get("PackageID");
    	this.OrderID=(String) map.get("OrderID"); 
//    	this.PackageType=(String) map.get("PackageType");
    	this.PackageWeight=(String) map.get("PackageWeight");  
    	this.ItemValueCurrencyType=(String) map.get("ItemValueCurrencyType");
    	this.SenderName=(String)map.get("SenderName");
    	this.SenderFirstName=(String)map.get("SenderFirstName");
    	this.SenderMiddleInitial=(String)map.get("SenderMiddleInitial");
    	this.SenderLastName=(String)map.get("SenderLastName");
    	this.SenderBusinessName=(String)map.get("SenderBusinessName");
    	this.SenderAddress_Line_1=(String) map.get("SenderAddress_Line_1");
    	this.SenderAddress_Line_2=(String)map.get("SenderAddress_Line_2");
    	this.SenderAddress_Line_3=(String)map.get("SenderAddress_Line_3");
    	this.SenderAddress_IsPOBox=(String) map.get("SenderAddress_ISPOBox");
    	this.SenderCity=(String) map.get("SenderCity");
    	this.SenderProvince=(String) map.get("SenderProvince");
    	this.SenderPostal_Code=(String) map.get("SenderPostal_Code");
    	this.SenderCountry_Code=(String) map.get("SenderCountry_Code");
    	this.SenderCountry_Code=(String)map.get("SenderPhone");
    	this.SenderEmail=(String)map.get("SenderEmail");
    	this.SenderSignature=(String) map.get("SenderSignature");
    	this.RecipientFirstName=(String)map.get("RecipientName");
    	this.RecipientMiddleInitial=(String)map.get("RecipientMiddleInitial");
    	this.RecipientLastName=(String) map.get("RecipientLastName");
    	this.RecipientBusinessName=(String)map.get("RecipientBusinessName");
    	this.RecipientAddress_Line_1=(String)map.get("RecipientAddress_Line_1");
    	this.RecipientAddress_Line_2=(String)map.get("RecipientAddress_Line_2");
    	this.RecipientAddress_Line_3=(String)map.get("RecipientAddress_Line_3");
    	this.RecipientInLineTransLationAddressLine1=(String)map.get("RecipientInLineTranslatinAddressLine1");
    	this.RecipientInLineTransLationAddressLine2=(String)map.get("RecipientInLineTranslationAddressLine2");
    	this.RecipientAddress_IsPOBox=(String)map.get("RecipientAddress_IsPOBox");
    	this.RecipientCity=(String) map.get("RecipientCity");
    	this.RecipientProvince=(String)map.get("RecipientProvince");
    	this.RecipientPostal_Code=(String) map.get("RecipientPostal_Code"); 
    	this.RecipientCountry_Code=(String)map.get("RecipientCountry_Code"); 
    	this.RecipientPhone=(String)map.get("RecipientPhone");
    	this.PackageType=(String)map.get("PackageType");
    	this.PackageShape=(String)map.get("TaxpayerID");
    	this.ShippingandHandling=(String)map.get("ShippingandHandling");
    	this.ShippingCurrencyType=(String)map.get("ShippingCurrencyType");
    	this.WeightUnit=(String)map.get("WeightUnit");
    	this.PackageLength=(String)map.get("PackageLength");
    	this.PackageWidth=(String)map.get("PackageWidth");
    	this.PackageHeight=(String)map.get("PackageHeight");
    	this.UnitOfMeasurement=(String)map.get("UnitOfMeasurement");
    	this.ServiceType=(String)map.get("ServiceType");
    	this.RateType=(String)map.get("RateType");
    	this.PackagePhysicalCount=(String)map.get("PackagePhysicalCount");
    	this.PostagePaid=(String)map.get("PostagePaid");
    	this.PostagePaidCurrencyType=(String)map.get("PostagePaidCurrentyType");
    	this.RestrictionType=(String)map.get("RestrictionType");
    	this.RestrictionComments=(String)map.get("RestrictionComments");
    	this.MailingAgentID=(String)map.get("MailingAgenID");
    	this.ReturnAgentID=(String)map.get("ReturnAgentID");
    	this.ValueLoaded=(String)map.get("ValueLoaded");
    	this.LicenseNumber=(String)map.get("LicenseNumber");
    	this.CertificateNumber=(String)map.get("CertificateNumber");
    	this.InvoiceNumber=(String)map.get("InvoiceNumber");
    	this.PaymentAndDeliveryTerms=(String)map.get("PaymentAndDeliveryTerms");
    	this.PFCorEEL=(String)map.get("PFCorEEL");
    	this.ReturnServiceRequested=(String)map.get("ReturnServiceRequested");
    	this.EntryFacilityZip=(String)map.get("EntryFacilityZip");
    	this.CustomerReferenceID=(String)map.get("CustomerReferenceID");
    	this.RedirectBusinessName=(String)map.get("RedirectBusinessName");
    	this.RedirectFirstName=(String)map.get("RedirectFirstName");
    	this.RedirectLastName=(String)map.get("RedirectLastName");
    	this.RedirectAddress_Line_1=(String)map.get("RedirectAddress_Line_1");
    	this.RedirectAddress_Line_2=(String)map.get("RedirectAddress_Line_2");
    	this.RedirectAddress_Line_3=(String)map.get("RedirectAddress_Line_3");  
    	this.RedirectCity=(String)map.get("RedirectCity");
    	this.RedirectProvince=(String)map.get("RedirectProvice");
    	this.RedirectPostal_Code=(String)map.get("RedirectPostal_Code");
    	this.RedirectCountry_Code=(String)map.get("RedirectCountry_Code");
    	this.RedirectPhone=(String)map.get("RedirectPhone");
    	this.RedirectEmail=(String)map.get("RedirectEmail");
    	this.ExporterReferenceType=(String)map.get("ExporterReferenceValue");
    	this.ExporterReferenceValue=(String)map.get("ExporterReferenceValue");
    	this.ExporterPhoneNo=(String)map.get("ExporterPhoneNo");
    	this.ExporterEmail=(String)map.get("ExporterEmail");
    	this.ImporterReferenceType=(String)map.get("ImporterReferenceType");
    	this.ImporterReferenceValue=(String)map.get("ImporterReferenceValue");
    	this.ImporterPhoneNo=(String)map.get("ImporterPhoneNo");
    	this.ImporterEmail=(String)map.get("ImporterEmail");
    	this.DestinationLocationID=(String)map.get("DestionationLocationID");
    	this.PriceCategoryType=(String)map.get("PriceCategoryType");
    	this.RecipientFirstName_Foreign=(String)map.get("RecipientFirstName_Foreign");
    	this.RecipientLastName_Foreign=(String)map.get("RecipientLastName_Foreign");
    	this.RecipientBusinessName_Foreign=(String)map.get("RecipientBusinessName_Foreign");
    	this.RecipientAddress_Line_1_Foreign=(String)map.get("RecipientAddress_Line_1_Foreign");
    	this.RecipientAddress_Line_2_Foreign=(String)map.get("RecipientAddress_Line_2_Foreign");
    	this.RecipientAddress_Line_3_Foreign=(String)map.get("RecipientAddress_Line_3_Foreign");
    	this.RecipientCity_Foreign=(String)map.get("RecipientCity_Foreign");
    	this.RecipientProvince_Foreign=(String)map.get("RecipientProvince_Foreign");
    	this.RecipientPostal_Code_Foreign=(String)map.get("RecipientPostal_Code_Foreign");
    	this.PackageOrderDate=(String)map.get("PackageOrderDate");
    	this.InsuredAmount=(String)map.get("InsuredAmount");
    	ObjectMapper mapper=new ObjectMapper();
    	for(int i=0;i<map.getJSONArray("Item").length();i++) {
    		JSONObject temp=map.getJSONArray("Item").getJSONObject(i);
    	this.list.add(mapper.readValue(temp.toString(), ItemData.class));
    	
    	}	
    }
	
	
	public String getOrderID() {
		return OrderID;
	}
	public void setOrderID(String orderId) {
		OrderID = orderId;
	}
	public String getItemValueCurrencyType() {
		return ItemValueCurrencyType;
	}
	public void setItemValueCurrencyType(String itemValueCurrencyType) {
		ItemValueCurrencyType = itemValueCurrencyType;
	}
	public String getSenderName() {
		return SenderName;
	}
	public void setSenderName(String senderName) {
		SenderName = senderName;
	}
	public String getSenderFirstName() {
		return SenderFirstName;
	}
	public void setSenderFirstName(String senderFirstName) {
		SenderFirstName = senderFirstName;
	}
	public String getSenderBusiessName() {
		return SenderBusiessName;
	}
	public void setSenderBusiessName(String senderBusiessName) {
		SenderBusiessName = senderBusiessName;
	}
	public String getSenderAddress_Line_1() {
		return SenderAddress_Line_1;
	}
	public void setSenderAddress_Line_1(String senderAddress_Line_1) {
		SenderAddress_Line_1 = senderAddress_Line_1;
	}
	public String getSenderCity() {
		return SenderCity;
	}
	public void setSenderCity(String senderCity) {
		SenderCity = senderCity;
	}
	public String getSenderProvice() {
		return SenderProvice;
	}
	public void setSenderProvice(String senderProvice) {
		SenderProvice = senderProvice;
	}
	public String getSenderPostal_Code() {
		return SenderPostal_Code;
	}
	public void setSenderPostal_Code(String senderPostal_Code) {
		SenderPostal_Code = senderPostal_Code;
	}
	public String getSenderCountry_Code() {
		return SenderCountry_Code;
	}
	public void setSenderCountry_Code(String senderCountry_Code) {
		SenderCountry_Code = senderCountry_Code;
	}
	public String getSenderPhone() {
		return SenderPhone;
	}
	public void setSenderPhone(String senderPhone) {
		SenderPhone = senderPhone;
	}
	public String getSenderEmail() {
		return SenderEmail;
	}
	public void setSenderEmail(String senderEmail) {
		SenderEmail = senderEmail;
	}
	public String getSenderSignature() {
		return SenderSignature;
	}
	public void setSenderSignature(String senderSignature) {
		SenderSignature = senderSignature;
	}
	public String getRecipientFirstName() {
		return RecipientFirstName;
	}
	public void setRecipientFirstName(String recipientFirstName) {
		RecipientFirstName = recipientFirstName;
	}
	public String getRecipientLastName() {
		return RecipientLastName;
	}
	public void setRecipientLastName(String recipientLastName) {
		RecipientLastName = recipientLastName;
	}
	public String getRecipientAddress_Line_1() {
		return RecipientAddress_Line_1;
	}
	public void setRecipientAddress_Line_1(String recipientAddress_Line_1) {
		RecipientAddress_Line_1 = recipientAddress_Line_1;
	}
	public String getRecipientCity() {
		return RecipientCity;
	}
	public void setRecipientCity(String recipientCity) {
		RecipientCity = recipientCity;
	}
	public String getRecipientProvince() {
		return RecipientProvince;
	}
	public void setRecipientProvince(String recipientProvince) {
		RecipientProvince = recipientProvince;
	}
	public String getRecipientPostal_Code() {
		return RecipientPostal_Code;
	}
	public void setRecipientPostal_Code(String recipientPostal_Code) {
		RecipientPostal_Code = recipientPostal_Code;
	}
	public String getRecipientCountry_Code() {
		return RecipientCountry_Code;
	}
	public void setRecipientCountry_Code(String recipientCountry_Code) {
		RecipientCountry_Code = recipientCountry_Code;
	}
	public String getRecipientPhone() {
		return RecipientPhone;
	}
	public void setRecipientPhone(String recipientPhone) {
		RecipientPhone = recipientPhone;
	}
	public String getRecipientEmail() {
		return RecipientEmail;
	}
	public void setRecipientEmail(String recipientEmail) {
		RecipientEmail = recipientEmail;
	}
	public String getPackageType() {
		return PackageType;
	}
	public void setPackageType(String packageType) {
		PackageType = packageType;
	}
	public String getPackageID() {
		return PackageID;
	}
	public void setPackageID(String packageId) {
		PackageID = packageId;
	}
	public String getPackageWeight() {
		return PackageWeight;
	}
	public void setPackageWeight(String packageWeight) {
		PackageWeight = packageWeight;
	}
	public String getWeightUnit() {
		return WeightUnit;
	}
	public void setWeightUnit(String weightUnit) {
		WeightUnit = weightUnit;
	}
	public String getUnitOfMeasurement() {
		return UnitOfMeasurement;
	}
	public void setUnitOfMeasurement(String unitOfMeasurement) {
		UnitOfMeasurement = unitOfMeasurement;
	}
	public String getServiceType() {
		return ServiceType;
	}
	public void setServiceType(String serviceType) {
		ServiceType = serviceType;
	}
	public String getRateType() {
		return RateType;
	}
	public void setRateType(String rateType) {
		RateType = rateType;
	}
	public String getPackagePhysicalCount() {
		return PackagePhysicalCount;
	}
	public void setPackagePhysicalCount(String packagePhysicalCount) {
		PackagePhysicalCount = packagePhysicalCount;
	}
	public String getMailingAgentID() {
		return MailingAgentID;
	}
	public void setMailingAgentID(String mailingAgentID) {
		MailingAgentID = mailingAgentID;
	}
	public String getValueLoaded() {
		return ValueLoaded;
	}
	public void setValueLoaded(String valueLoaded) {
		ValueLoaded = valueLoaded;
	}
	public String getPFCorEEL() {
		return PFCorEEL;
	}
	public void setPFCorEEL(String pFCorEEL) {
		PFCorEEL = pFCorEEL;
	}
	
	public String getSenderMiddleInitial() {
		return SenderMiddleInitial;
	}
	public void setSenderMiddleInitial(String senderMiddleInitial) {
		SenderMiddleInitial = senderMiddleInitial;
	}
	public String getSenderLastName() {
		return SenderLastName;
	}
	public void setSenderLastName(String senderLastName) {
		SenderLastName = senderLastName;
	}
	public String getSenderBusinessName() {
		return SenderBusinessName;
	}
	public void setSenderBusinessName(String senderBusinessName) {
		SenderBusinessName = senderBusinessName;
	}
	public String getSenderAddress_Line_2() {
		return SenderAddress_Line_2;
	}
	public void setSenderAddress_Line_2(String senderAddress_Line_2) {
		SenderAddress_Line_2 = senderAddress_Line_2;
	}
	public String getSenderAddress_Line_3() {
		return SenderAddress_Line_3;
	}
	public void setSenderAddress_Line_3(String senderAddress_Line_3) {
		SenderAddress_Line_3 = senderAddress_Line_3;
	}
	public String getSenderAddress_IsPOBox() {
		return SenderAddress_IsPOBox;
	}
	public void setSenderAddress_IsPOBox(String senderAddress_IsPOBox) {
		SenderAddress_IsPOBox = senderAddress_IsPOBox;
	}
	public String getSenderProvince() {
		return SenderProvince;
	}
	public void setSenderProvince(String senderProvince) {
		SenderProvince = senderProvince;
	}
	public String getRecipientMiddleInitial() {
		return RecipientMiddleInitial;
	}
	public void setRecipientMiddleInitial(String recipientMiddleInitial) {
		RecipientMiddleInitial = recipientMiddleInitial;
	}
	public String getRecipientBusinessName() {
		return RecipientBusinessName;
	}
	public void setRecipientBusinessName(String recipientBusinessName) {
		RecipientBusinessName = recipientBusinessName;
	}
	public String getRecipientAddress_Line_2() {
		return RecipientAddress_Line_2;
	}
	public void setRecipientAddress_Line_2(String recipientAddress_Line_2) {
		RecipientAddress_Line_2 = recipientAddress_Line_2;
	}
	public String getRecipientAddress_Line_3() {
		return RecipientAddress_Line_3;
	}
	public void setRecipientAddress_Line_3(String recipientAddress_Line_3) {
		RecipientAddress_Line_3 = recipientAddress_Line_3;
	}
	public String getRecipientInLineTransLationAddressLine1() {
		return RecipientInLineTransLationAddressLine1;
	}
	public void setRecipientInLineTransLationAddressLine1(String recipientInLineTransLationAddressLine1) {
		RecipientInLineTransLationAddressLine1 = recipientInLineTransLationAddressLine1;
	}
	public String getRecipientInLineTransLationAddressLine2() {
		return RecipientInLineTransLationAddressLine2;
	}
	public void setRecipientInLineTransLationAddressLine2(String recipientInLineTransLationAddressLine2) {
		RecipientInLineTransLationAddressLine2 = recipientInLineTransLationAddressLine2;
	}
	public String getRecipientAddress_IsPOBox() {
		return RecipientAddress_IsPOBox;
	}
	public void setRecipientAddress_IsPOBox(String recipientAddress_IsPOBox) {
		RecipientAddress_IsPOBox = recipientAddress_IsPOBox;
	}
	public String getPackageShape() {
		return PackageShape;
	}
	public void setPackageShape(String packageShape) {
		PackageShape = packageShape;
	}
	public String getShippingandHandling() {
		return ShippingandHandling;
	}
	public void setShippingandHandling(String shippingandHandling) {
		ShippingandHandling = shippingandHandling;
	}
	public String getShippingCurrencyType() {
		return ShippingCurrencyType;
	}
	public void setShippingCurrencyType(String shippingCurrencyType) {
		ShippingCurrencyType = shippingCurrencyType;
	}
	public String getPackageLength() {
		return PackageLength;
	}
	public void setPackageLength(String packageLength) {
		PackageLength = packageLength;
	}
	public String getPackageWidth() {
		return PackageWidth;
	}
	public void setPackageWidth(String packageWidth) {
		PackageWidth = packageWidth;
	}
	public String getPackageHeight() {
		return PackageHeight;
	}
	public void setPackageHeight(String packageHeight) {
		PackageHeight = packageHeight;
	}
	public String getPostagePaid() {
		return PostagePaid;
	}
	public void setPostagePaid(String postagePaid) {
		PostagePaid = postagePaid;
	}
	public String getPostagePaidCurrencyType() {
		return PostagePaidCurrencyType;
	}
	public void setPostagePaidCurrencyType(String postagePaidCurrencyType) {
		PostagePaidCurrencyType = postagePaidCurrencyType;
	}
	public String getRestrictionType() {
		return RestrictionType;
	}
	public void setRestrictionType(String restrictionType) {
		RestrictionType = restrictionType;
	}
	public String getRestrictionComments() {
		return RestrictionComments;
	}
	public void setRestrictionComments(String restrictionComments) {
		RestrictionComments = restrictionComments;
	}
	public String getReturnAgentID() {
		return ReturnAgentID;
	}
	public void setReturnAgentID(String returnAgentID) {
		ReturnAgentID = returnAgentID;
	}
	public String getLicenseNumber() {
		return LicenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		LicenseNumber = licenseNumber;
	}
	public String getCertificateNumber() {
		return CertificateNumber;
	}
	public void setCertificateNumber(String certificateNumber) {
		CertificateNumber = certificateNumber;
	}
	public String getInvoiceNumber() {
		return InvoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		InvoiceNumber = invoiceNumber;
	}
	public String getPaymentAndDeliveryTerms() {
		return PaymentAndDeliveryTerms;
	}
	public void setPaymentAndDeliveryTerms(String paymentAndDeliveryTerms) {
		PaymentAndDeliveryTerms = paymentAndDeliveryTerms;
	}
	public String getReturnServiceRequested() {
		return ReturnServiceRequested;
	}
	public void setReturnServiceRequested(String returnServiceRequested) {
		ReturnServiceRequested = returnServiceRequested;
	}
	public String getEntryFacilityZip() {
		return EntryFacilityZip;
	}
	public void setEntryFacilityZip(String entryFacilityZip) {
		EntryFacilityZip = entryFacilityZip;
	}
	public String getCustomerReferenceID() {
		return CustomerReferenceID;
	}
	public void setCustomerReferenceID(String customerReferenceID) {
		CustomerReferenceID = customerReferenceID;
	}
	public String getRedirectBusinessName() {
		return RedirectBusinessName;
	}
	public void setRedirectBusinessName(String redirectBusinessName) {
		RedirectBusinessName = redirectBusinessName;
	}
	public String getRedirectFirstName() {
		return RedirectFirstName;
	}
	public void setRedirectFirstName(String redirectFirstName) {
		RedirectFirstName = redirectFirstName;
	}
	public String getRedirectLastName() {
		return RedirectLastName;
	}
	public void setRedirectLastName(String redirectLastName) {
		RedirectLastName = redirectLastName;
	}
	public String getRedirectAddress_Line_1() {
		return RedirectAddress_Line_1;
	}
	public void setRedirectAddress_Line_1(String redirectAddress_Line_1) {
		RedirectAddress_Line_1 = redirectAddress_Line_1;
	}
	public String getRedirectAddress_Line_2() {
		return RedirectAddress_Line_2;
	}
	public void setRedirectAddress_Line_2(String redirectAddress_Line_2) {
		RedirectAddress_Line_2 = redirectAddress_Line_2;
	}
	public String getRedirectAddress_Line_3() {
		return RedirectAddress_Line_3;
	}
	public void setRedirectAddress_Line_3(String redirectAddress_Line_3) {
		RedirectAddress_Line_3 = redirectAddress_Line_3;
	}
	public String getRedirectCity() {
		return RedirectCity;
	}
	public void setRedirectCity(String redirectCity) {
		RedirectCity = redirectCity;
	}
	public String getRedirectProvince() {
		return RedirectProvince;
	}
	public void setRedirectProvince(String redirectProvince) {
		RedirectProvince = redirectProvince;
	}
	public String getRedirectPostal_Code() {
		return RedirectPostal_Code;
	}
	public void setRedirectPostal_Code(String redirectPostal_Code) {
		RedirectPostal_Code = redirectPostal_Code;
	}
	public String getRedirectCountry_Code() {
		return RedirectCountry_Code;
	}
	public void setRedirectCountry_Code(String redirectCountry_Code) {
		RedirectCountry_Code = redirectCountry_Code;
	}
	public String getRedirectPhone() {
		return RedirectPhone;
	}
	public void setRedirectPhone(String redirectPhone) {
		RedirectPhone = redirectPhone;
	}
	public String getRedirectEmail() {
		return RedirectEmail;
	}
	public void setRedirectEmail(String redirectEmail) {
		RedirectEmail = redirectEmail;
	}
	public String getExporterReferenceType() {
		return ExporterReferenceType;
	}
	public void setExporterReferenceType(String exporterReferenceType) {
		ExporterReferenceType = exporterReferenceType;
	}
	public String getExporterReferenceValue() {
		return ExporterReferenceValue;
	}
	public void setExporterReferenceValue(String exporterReferenceValue) {
		ExporterReferenceValue = exporterReferenceValue;
	}
	public String getExporterPhoneNo() {
		return ExporterPhoneNo;
	}
	public void setExporterPhoneNo(String exporterPhoneNo) {
		ExporterPhoneNo = exporterPhoneNo;
	}
	public String getExporterEmail() {
		return ExporterEmail;
	}
	public void setExporterEmail(String exporterEmail) {
		ExporterEmail = exporterEmail;
	}
	public String getImporterReferenceType() {
		return ImporterReferenceType;
	}
	public void setImporterReferenceType(String importerReferenceType) {
		ImporterReferenceType = importerReferenceType;
	}
	public String getImporterReferenceValue() {
		return ImporterReferenceValue;
	}
	public void setImporterReferenceValue(String importerReferenceValue) {
		ImporterReferenceValue = importerReferenceValue;
	}
	public String getImporterPhoneNo() {
		return ImporterPhoneNo;
	}
	public void setImporterPhoneNo(String importerPhoneNo) {
		ImporterPhoneNo = importerPhoneNo;
	}
	public String getImporterEmail() {
		return ImporterEmail;
	}
	public void setImporterEmail(String importerEmail) {
		ImporterEmail = importerEmail;
	}
	public String getDestinationLocation() {
		return DestinationLocation;
	}
	public void setDestinationLocation(String destinationLocation) {
		DestinationLocation = destinationLocation;
	}
	public String getPriceCategoryType() {
		return PriceCategoryType;
	}
	public void setPriceCategoryType(String priceCategoryType) {
		PriceCategoryType = priceCategoryType;
	}
	public String getDestinationLocationID() {
		return DestinationLocationID;
	}
	public void setDestinationLocationID(String destinationLocationID) {
		DestinationLocationID = destinationLocationID;
	}
	public String getRecipientFirstName_Foreign() {
		return RecipientFirstName_Foreign;
	}
	public void setRecipientFirstName_Foreign(String recipientFirstName_Foreign) {
		RecipientFirstName_Foreign = recipientFirstName_Foreign;
	}
	public String getRecipientLastName_Foreign() {
		return RecipientLastName_Foreign;
	}
	public void setRecipientLastName_Foreign(String recipientLastName_Foreign) {
		RecipientLastName_Foreign = recipientLastName_Foreign;
	}
	public String getRecipientBusinessName_Foreign() {
		return RecipientBusinessName_Foreign;
	}
	public void setRecipientBusinessName_Foreign(String recipientBusinessName_Foreign) {
		RecipientBusinessName_Foreign = recipientBusinessName_Foreign;
	}
	public String getRecipientAddress_Line_1_Foreign() {
		return RecipientAddress_Line_1_Foreign;
	}
	public void setRecipientAddress_Line_1_Foreign(String recipientAddress_Line_1_Foreign) {
		RecipientAddress_Line_1_Foreign = recipientAddress_Line_1_Foreign;
	}
	public String getRecipientAddress_Line_2_Foreign() {
		return RecipientAddress_Line_2_Foreign;
	}
	public void setRecipientAddress_Line_2_Foreign(String recipientAddress_Line_2_Foreign) {
		RecipientAddress_Line_2_Foreign = recipientAddress_Line_2_Foreign;
	}
	public String getRecipientAddress_Line_3_Foreign() {
		return RecipientAddress_Line_3_Foreign;
	}
	public void setRecipientAddress_Line_3_Foreign(String recipientAddress_Line_3_Foreign) {
		RecipientAddress_Line_3_Foreign = recipientAddress_Line_3_Foreign;
	}
	public String getRecipientCity_Foreign() {
		return RecipientCity_Foreign;
	}
	public void setRecipientCity_Foreign(String recipientCity_Foreign) {
		RecipientCity_Foreign = recipientCity_Foreign;
	}
	public String getRecipientProvince_Foreign() {
		return RecipientProvince_Foreign;
	}
	public void setRecipientProvince_Foreign(String recipientProvince_Foreign) {
		RecipientProvince_Foreign = recipientProvince_Foreign;
	}
	public String getRecipientPostal_Code_Foreign() {
		return RecipientPostal_Code_Foreign;
	}
	public void setRecipientPostal_Code_Foreign(String recipientPostal_Code_Foreign) {
		RecipientPostal_Code_Foreign = recipientPostal_Code_Foreign;
	}
	public String getPackageOrderDate() {
		return PackageOrderDate;
	}
	public void setPackageOrderDate(String packageOrderDate) {
		PackageOrderDate = packageOrderDate;
	}
	public String getInsuredAmount() {
		return InsuredAmount;
	}
	public void setInsuredAmount(String insuredAmount) {
		InsuredAmount = insuredAmount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public List<ItemData> getList() {
		return list;
	}
	public void setList(List<ItemData> list) {
		this.list = list;
	}
	
}

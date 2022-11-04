package models;

public class AssetDetail {
	
	private String asset_code;
	private double value;
	private double salvage;
	private int wdv;
	private int createdBy;
	
	public AssetDetail( String asset_code, double value, double salvage, int wdv, int createdBy) {
		super();
		this.asset_code = asset_code;
		this.value = value;
		this.salvage = salvage;
		this.wdv = wdv;
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "AssetDetail [asset_code=" + asset_code + ", value=" + value + ", salvage=" + salvage + ", wdv=" + wdv
				+ ", createdBy=" + createdBy + "]";
	}
	
	public static AssetDetail createAsset(String[] attributes) {
		return new AssetDetail(attributes[0],
				Double.parseDouble(attributes[1]),
				Double.parseDouble(attributes[2]), 
				Integer.parseInt(attributes[3]), Integer.parseInt(attributes[4]));
	}
	
	
}

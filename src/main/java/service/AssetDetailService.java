package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import models.AssetDetail;

public class AssetDetailService {

	public List<AssetDetail> readAssetFromCsv(String inputFile) throws IOException{
		Path pathToFile = Paths.get(inputFile);
		List<AssetDetail> assetList = new ArrayList<>();
		try(BufferedReader br = Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII)){
			String line = br.readLine();
			while(line != null) {
				String[] attributes = line.split(",");
				AssetDetail assetDetail = AssetDetail.createAsset(attributes);
				assetList.add(assetDetail);
				line = br.readLine();
 			}
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		return assetList;
	}
	
	
}

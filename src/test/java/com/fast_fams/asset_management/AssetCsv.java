package com.fast_fams.asset_management;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import models.AssetDetail;
import service.AssetDetailService;

@SpringBootTest
class AssetCsv {

	@Test
	void shouldInsertValidAssetFromCSV() throws IOException {
		AssetDetailService assetService = new AssetDetailService();
		List<AssetDetail> list = assetService.readAssetFromCsv("asset_details.txt");
		assertEquals(list.size(), 3);
	}

	
	
}

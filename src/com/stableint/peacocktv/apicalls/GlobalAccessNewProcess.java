package com.stableint.peacocktv.apicalls;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class GlobalAccessNewProcess {

	public static void main(String[] args) {
		enableGlobalAccessNewProcess();
	}

	static String profID;

	public static String enableGlobalAccessNewProcess() {

//		String premiumbaseURL = "https://vor-user-create.dev.cosmic.sky/api/create-user?provider=SKYSHOWTIME&proposition=SKYSHOWTIME&territory=PL&paymentMethod=CARD&paymentPinEnabled=false&parentalPinEnabled=false&trialsUsed=&products=&devices=&daeVoucherCampaignId=&differentAddresses=true&noAddress=false&paymentAccount=true&skyIdOnly=false&emptyAddress=false&email=ss.test8%40sky.qa&homeTerritory=PL&spreedlyEnabled=true&threedSecure=false&elevatedSecurity=false&verified=true&clearLastValidationDate=false&signedInDevices=&withPersona=false";
		String premiumbaseURL = "";

		Response res = given()
//				.header("Host", "vor-user-create.dev.cosmic.sky")
//				.header("Connection","keep-alive")
//				.header("Accept","*/*")
//				.header("Referer","https://vor-user-create.dev.cosmic.sky/")
//				.header("Accept-Encoding","gzip, deflate, br")
//				.header("Sec-Fetch-Site","same-origin")
//				.header("Sec-Fetch-Mode","Mode:cors")
//				//.header("Sec-Fetch-Dest","empty")
//				.header("Accept-Language","en-US,en;q=0.9")
//				.header("sec-ch-ua-platform","PC")

//				.header("Host","<calculated when request is sent>")
//				.header("Accept","*/*")
//				.header("Accept-Encoding","gzip, deflate, br")
//				.header("Connection","keep-alive")
				.when().get(premiumbaseURL);

		// List<Map<String, String>> convertToMap = res.jsonPath().get("$");
		// profID = convertToMap.get(0).get("profileid");
		System.out.println(res.asString());

		return null;
	}
}

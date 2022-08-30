package com.stableint.peacocktv.apicalls;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GlobalAccess {

	static String email;

	static String profID;

	public String getProfileID(String email) {

		String profileIdUrl = "https://oogway-stable-int-external.dev.ce.us-east-2-aws.npskooniedc.com";
		String pathParameters = "/profiles/email/contact/";

		String fullUrl = profileIdUrl + pathParameters + email;

		Response res = given().auth().basic("testnotprod", "testnotprod").when().get(fullUrl);

		List<Map<String, String>> parent = res.jsonPath().getList("profilesummaries");

		profID = parent.get(0).get("profileid");
		System.out.println(profID);
		return profID;
	}

	public String enableGlobalAccess(String profileId) {

		String globalAccessUrl = "https://oogway-stable-int-external.dev.ce.us-east-2-aws.npskooniedc.com/profiles/profiles/id/";
		String pathParam2 = "/services/nbcuott-us";
		String fullUrl = globalAccessUrl + profileId + pathParam2;

		String payLoad = "{\r\n" + "\"globalaccessenddate\":\"31-12-2024\"\r\n" + "}";
		Response res =

				given().header("Content-Type", "application/vnd.oogway.v4+json").auth()
						.basic("testnotprod", "testnotprod").body(payLoad).post(fullUrl);

		if (res.statusCode() == 204) {
			System.out.println("Global Access Enabled");
			return "Yes";
		}
		return "No";

	}

//	public static void main(String[] args) {
//		enableGlobalAccess(getProfileID(email));
//	}
}

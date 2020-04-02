package functions;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.Map;

import org.json.simple.JSONObject;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class reusableFunctions {
	protected RequestSpecification req;
	protected Response resp;
	String endPoint, endPath;

	void setBaseURI(String uri) {
		baseURI = uri;
		//System.out.println(baseURI);
	}

	void newRequest() {
		req = given();
	}

	void sendEndPoint(String endPoint) {
		resp = req.when().get(endPoint);
		this.endPoint = endPoint;
		//System.out.println(endPoint);
	}

	void sendPath(String path) {
		basePath = path;
		endPath = baseURI + endPoint + path;
		resp = req.when().get(path);
		//System.out.println(path);
	}

	void validateStatusCode(int expectedCode) {
		System.out.println("Expecte Code : " + expectedCode);
		System.out.println("Actual Code : " + resp.getStatusCode());
		System.out.println();
	}

	private Object parse(String value) {
		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			return value;
		}
	}

	String showResponse() {
		return given().when().get(endPath).body().asString();
	}

	protected void jsonBuilder(Map<String, String> dataTable) {
		JSONObject json = new JSONObject();
		for (Map.Entry<String, String> entry : dataTable.entrySet()) {
			json.put(entry.getKey(), entry.getValue());
		}
		req.header("Content-Type", "application/json");
		req.body(json.toString());
	}

	protected void sendPost(String path) {
		//System.out.println(path);
		endPath = baseURI + endPoint + path;
		resp = req.post(endPath);
		
	}

}

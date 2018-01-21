package es.bussin.poisAndHotels;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class PoiAndHotelController {
	private String url = "http://papi.minube.com/pois?api_key=hBHf8J&lang=es&latitude=%s&longitude=%s";
	private String url2 = "http://sandbox.hotelscombined.com/api/2.0/hotels?destination=latlon:%s,%s&apiKey=B7CCA149-62C3-410D-A593-798877B6DCCA&sessionID=1";
	@RequestMapping("/poiandhotel")
		public List<Poi> poiAndHotel(@RequestParam(value = "lat") double lat, 
				@RequestParam(value = "longi") double longi) {
			RestTemplate restTemplate = new RestTemplate();
			String replacedUrl = String.format(url, lat, longi);
			Poi[] pois = restTemplate.getForObject(replacedUrl, Poi[].class);
			return Arrays.asList(pois);
	}

	@RequestMapping("/randompoi")
	public List<Poi> random() {		
		RestTemplate restTemplate = new RestTemplate();
		double lat = ThreadLocalRandom.current().nextDouble(-90, 91);
		double longi = ThreadLocalRandom.current().nextDouble(-180, 181);
		String replacedUrl = String.format(url, lat, longi);
		Poi[] pois = restTemplate.getForObject(replacedUrl, Poi[].class);
		return Arrays.asList(pois);

}
		
	@RequestMapping("/randomhotel")
	public List<HotelPayload> randomHotel() {		
		RestTemplate restTemplate = new RestTemplate();
		double lat = ThreadLocalRandom.current().nextDouble(-90, 91);
		double longi = ThreadLocalRandom.current().nextDouble(-180, 181);
		String replacedUrl = String.format(url2, lat, longi);
		System.out.println(replacedUrl);
		Hotel hotels = restTemplate.getForObject(replacedUrl, Hotel.class);
		return hotels.getResults();

}
	
}


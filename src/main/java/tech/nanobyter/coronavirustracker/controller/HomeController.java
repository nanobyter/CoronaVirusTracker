package tech.nanobyter.coronavirustracker.controller;

import java.text.DecimalFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import tech.nanobyter.coronavirustracker.models.LocationStats;
import tech.nanobyter.coronavirustracker.services.CoronaVirusDataService;

/**
 * @author {nanobyter} www.nanobyter.tech
 * 
 *         created: 2022-07-11
 */

@Controller
public class HomeController {

	@Autowired
	CoronaVirusDataService coronaVirusDataService;
	
	DecimalFormat df = new DecimalFormat("#,###.##");

	@GetMapping("/")
	public String home(Model model) {
		List<LocationStats> allStats = coronaVirusDataService.getAllStats();
		int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
		int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPreviousDay()).sum();

		model.addAttribute("locationStats", allStats);
		model.addAttribute("totalReportedCases", df.format(totalReportedCases));
		model.addAttribute("totalNewCases", df.format(totalNewCases));

		return "home";
	}

}

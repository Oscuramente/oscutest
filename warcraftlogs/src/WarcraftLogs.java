import java.util.ArrayList;
import java.util.List;

import com.jarlenai.wcl.WarcraftLogsApi;
import com.jarlenai.wcl.domain.fights.Fight;
import com.jarlenai.wcl.domain.reports.Report;

public class WarcraftLogs {

	ArrayList<Long> zones_to_parse = new ArrayList<Long>();

	public static void main(String[] args) {
		WarcraftLogs wl = new WarcraftLogs();
		wl.init();
		wl.start();
	}

	private void init() {
		zones_to_parse.add((long) 10);

	}

	private void start() {
		WarcraftLogsApi wla = WarcraftLogsApi.get("c1badab4cfee15ababc006b67c31c4b1");

		List<Report> user_reports = wla.getReportsForUser("Oscuramente", (long) 0, System.currentTimeMillis());

		for (Report user_report : user_reports) {
			if (zones_to_parse.contains(user_report.getZone())) {
				System.out.println(user_report.getId());
				parseFights(user_report.getTitle(), wla.getFightsForReport(user_report.getId()).getFights());
			}
		}
	}

	private void parseFights(String zone, List<Fight> fights) {
		for (Fight fight : fights) {
			if (fight.getBoss() != 0) {
				System.out.println(fight.getName());
				System.out.println(fight.getDifficulty());
			}
		}
	}
}

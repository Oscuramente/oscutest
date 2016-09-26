import java.util.ArrayList;
import java.util.List;

import com.jarlenai.wcl.WarcraftLogsApi;
import com.jarlenai.wcl.domain.reports.Report;

public class WarcraftLogs {

	ArrayList<Long> zones_to_parse = new ArrayList<Long>(10);

	public static void main(String[] args) {
		WarcraftLogs wl = new WarcraftLogs();
		wl.start();
	}

	private void start() {
		WarcraftLogsApi wla = WarcraftLogsApi.get("c1badab4cfee15ababc006b67c31c4b1");

		List<Report> user_reports = wla.getReportsForUser("Oscuramente", Long.valueOf("0"), Long.valueOf("0"));

		for (Report user_report : user_reports) {
			if (zones_to_parse.contains(user_report.getZone())) {

			}
		}

	}

}

package com.mihigo.main.controller;

import java.util.List;

//import org.hibernate.hql.internal.ast.InvalidPathException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mihigo.main.exception.InvalidParameters;
import com.mihigo.main.models.*;
import com.mihigo.main.payload.*;
import com.mihigo.main.services.DailyServices;
import com.mihigo.main.services.MonthlyServices;
import com.mihigo.main.services.YearService;

@RestController
@RequestMapping("/expenses")
public class Controller {

	@Autowired
	private DailyServices ds;

	@Autowired
	private MonthlyServices ms;
	
	@Autowired
	private YearService ys;

	@RequestMapping(path = "/create_daily", method = RequestMethod.POST, produces = { "application/json",
			"application/xml" })
	@CrossOrigin(origins = "*")
	public ResponseEntity<?> create_daily(@RequestBody DailyPayload daily) throws InvalidParameters {
		try {
			Daily dd = ds.createDaily(daily.getDetails(), daily.getAmount(), daily.getDate());
			return new ResponseEntity<Daily>(dd, HttpStatus.OK);
		} catch (Exception ex) {
			throw new InvalidParameters(ex.getMessage());
		}
	}

	@RequestMapping(path = "/allDaily", method = RequestMethod.GET, produces = { "application/json",
			"application/xml" })
	@CrossOrigin(origins = "*")

	public List<?> getAllDaily() throws InvalidParameters {
		try {
			return ds.get_All_Dailly();
		} catch (Exception ex) {
			throw new InvalidParameters(ex.getMessage());
		}
	}

	@RequestMapping(path = "/totalmonthly", method = RequestMethod.GET, produces = { "application/json",
			"application/xml" })
	@CrossOrigin(origins = "*")
	public ResponseEntity<?> getMonthlyExpense(@RequestParam("month") String month) throws InvalidParameters {
		try {
			int mm = Integer.parseInt(month);
			double r = ds.totalDailPerMonth(mm);
			return new ResponseEntity<Double>(r, HttpStatus.OK);
		} catch (Exception ex) {
			throw new InvalidParameters(ex.getMessage());
		}
	}

	@PostMapping("/createmonthly")
	@CrossOrigin(origins = "*")
	public ResponseEntity<?> createMonthly(@RequestBody MonthlyPayload mon) throws InvalidParameters {
		try {
			Monthly mmm=ms.createMonthly(mon.getOpeningBalance(), mon.getSalaryone(), mon.getSalaryTwo(), mon.getVat(),
					mon.getRssb(), mon.getElectricity(), mon.getMaintenance(), mon.getUmurenge(), mon.getTpr(),
					mon.getRent(), mon.getWater(), mon.getSecurity(), mon.getPatient(), mon.getmonth());
			return new ResponseEntity<Monthly>(mmm, HttpStatus.OK);
		} catch (Exception ex) {
			throw new InvalidParameters(ex.getMessage());
		}
	}

	@GetMapping("/getMonth")
	@CrossOrigin(origins = "*")
	public ResponseEntity<?> get_Month(@RequestParam(value = "month") int month) throws InvalidParameters {
		try {
			return new ResponseEntity<Monthly>(ms.searchMonthlybyMonth(month), HttpStatus.OK);
		} catch (Exception ex) {
			throw new InvalidParameters(ex.getMessage());
		}
	}
	
	@GetMapping("/getAnnual")
	@CrossOrigin(origins = "*")
	@ResponseStatus(value = HttpStatus.OK)
	public List<Yearly> get_Annual() throws InvalidParameters {
		try {
			return ys.getTotals();
		} catch (Exception ex) {
			throw new InvalidParameters(ex.getMessage());
		}
	}
}

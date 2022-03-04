package com.mihigo.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mihigo.main.exception.InvalidParameters;
import com.mihigo.main.models.*;
import com.mihigo.main.payload.*;
import com.mihigo.main.services.DailyServices;

@RestController
@RequestMapping("/expenses")
public class controller {

	@Autowired
	private DailyServices ds;

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

	@RequestMapping(path = "/allDaily", method = RequestMethod.GET)
	@CrossOrigin(origins = "*")

	public List<?> getAllDaily() throws InvalidParameters {
		try {
			return ds.get_All_Dailly();
		} catch (Exception ex) {
			throw new InvalidParameters(ex.getMessage());
		}
	}
}
